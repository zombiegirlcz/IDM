package ch.qos.logback.classic.net;

import ch.qos.logback.core.net.ssl.ConfigurableSSLSocketFactory;
import ch.qos.logback.core.net.ssl.SSLComponent;
import ch.qos.logback.core.net.ssl.SSLConfiguration;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;

/* JADX INFO: loaded from: classes16.dex */
public class SSLSocketReceiver extends SocketReceiver implements SSLComponent {
    private SocketFactory socketFactory;

    /* JADX INFO: renamed from: ssl, reason: collision with root package name */
    private SSLConfiguration f24058ssl;

    @Override // ch.qos.logback.classic.net.SocketReceiver
    public SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLComponent
    public SSLConfiguration getSsl() {
        if (this.f24058ssl == null) {
            this.f24058ssl = new SSLConfiguration();
        }
        return this.f24058ssl;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLComponent
    public void setSsl(SSLConfiguration sSLConfiguration) {
        this.f24058ssl = sSLConfiguration;
    }

    @Override // ch.qos.logback.classic.net.SocketReceiver, ch.qos.logback.classic.net.ReceiverBase
    public boolean shouldStart() {
        try {
            SSLContext sSLContextCreateContext = getSsl().createContext(this);
            SSLParametersConfiguration parameters = getSsl().getParameters();
            parameters.setContext(getContext());
            this.socketFactory = new ConfigurableSSLSocketFactory(parameters, sSLContextCreateContext.getSocketFactory());
            return super.shouldStart();
        } catch (Exception e) {
            addError(e.getMessage(), e);
            return false;
        }
    }
}
