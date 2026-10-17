package ch.qos.logback.core.net;

import ch.qos.logback.core.net.ssl.ConfigurableSSLSocketFactory;
import ch.qos.logback.core.net.ssl.SSLComponent;
import ch.qos.logback.core.net.ssl.SSLConfiguration;
import ch.qos.logback.core.net.ssl.SSLParametersConfiguration;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;

/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractSSLSocketAppender<E> extends AbstractSocketAppender<E> implements SSLComponent {
    private SocketFactory socketFactory;

    /* JADX INFO: renamed from: ssl, reason: collision with root package name */
    private SSLConfiguration f24070ssl;

    @Override // ch.qos.logback.core.net.AbstractSocketAppender
    public SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLComponent
    public SSLConfiguration getSsl() {
        if (this.f24070ssl == null) {
            this.f24070ssl = new SSLConfiguration();
        }
        return this.f24070ssl;
    }

    @Override // ch.qos.logback.core.net.ssl.SSLComponent
    public void setSsl(SSLConfiguration sSLConfiguration) {
        this.f24070ssl = sSLConfiguration;
    }

    @Override // ch.qos.logback.core.net.AbstractSocketAppender, ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        try {
            SSLContext sSLContextCreateContext = getSsl().createContext(this);
            SSLParametersConfiguration parameters = getSsl().getParameters();
            parameters.setContext(getContext());
            this.socketFactory = new ConfigurableSSLSocketFactory(parameters, sSLContextCreateContext.getSocketFactory());
            super.start();
        } catch (Exception e) {
            addError(e.getMessage(), e);
        }
    }
}
