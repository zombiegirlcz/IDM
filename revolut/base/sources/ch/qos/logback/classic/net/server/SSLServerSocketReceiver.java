package ch.qos.logback.classic.net.server;

import ch.qos.logback.core.net.ssl.ConfigurableSSLServerSocketFactory;
import ch.qos.logback.core.net.ssl.SSLComponent;
import ch.qos.logback.core.net.ssl.SSLConfiguration;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;

/* JADX INFO: loaded from: classes16.dex */
public class SSLServerSocketReceiver extends ServerSocketReceiver implements SSLComponent {
    private ServerSocketFactory socketFactory;

    /* JADX INFO: renamed from: ssl, reason: collision with root package name */
    private SSLConfiguration f24062ssl;

    @Override // ch.qos.logback.classic.net.server.ServerSocketReceiver
    public ServerSocketFactory getServerSocketFactory() throws Exception {
        if (this.socketFactory == null) {
            SSLContext sSLContextCreateContext = getSsl().createContext(this);
            SSLParametersConfiguration parameters = getSsl().getParameters();
            parameters.setContext(getContext());
            this.socketFactory = new ConfigurableSSLServerSocketFactory(parameters, sSLContextCreateContext.getServerSocketFactory());
        }
        return this.socketFactory;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLComponent
    public SSLConfiguration getSsl() {
        if (this.f24062ssl == null) {
            this.f24062ssl = new SSLConfiguration();
        }
        return this.f24062ssl;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLComponent
    public void setSsl(SSLConfiguration sSLConfiguration) {
        this.f24062ssl = sSLConfiguration;
    }
}
