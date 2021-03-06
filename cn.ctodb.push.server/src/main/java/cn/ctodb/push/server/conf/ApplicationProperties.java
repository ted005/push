package cn.ctodb.push.server.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * All rights Reserved, Designed By www.ctodb.cn
 *
 * @version V1.0
 * @author: lichaohn@163.com
 * @Copyright: 2018 www.ctodb.cn Inc. All rights reserved.
 */
@ConfigurationProperties(prefix = "application") // 接收application.yml中的myProps下面的属性
public class ApplicationProperties {

    private final Server server = new Server();

    public Server getServer() {
        return server;
    }

    public static class Server {
        private int port = -1;
        private String center = "";

        public int getPort() {
            return port;
        }

        public void setPort(int port) {
            this.port = port;
        }

        public String getCenter() {
            return center;
        }

        public void setCenter(String center) {
            this.center = center;
        }
    }

}