package io.grpc.okhttp.internal;

import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes13.dex */
public class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f163013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f163014c;
    public static final l d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f163015a;

    static {
        Object obj2;
        Provider provider;
        Provider provider2;
        l lVar;
        k kVar;
        Logger logger = Logger.getLogger(l.class.getName());
        f163013b = logger;
        f163014c = new String[]{"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i = 0;
        loop0: while (true) {
            obj2 = null;
            if (i >= length) {
                logger.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider3 = providers[i];
            for (String str : f163014c) {
                if (str.equals(provider3.getClass().getName())) {
                    logger.log(Level.FINE, "Found registered provider {0}", str);
                    provider = provider3;
                    break loop0;
                }
            }
            i++;
        }
        if (provider != null) {
            jpf.a aVar = new jpf.a(obj2, "setUseSessionTickets", new Class[]{Boolean.TYPE});
            jpf.a aVar2 = new jpf.a(obj2, "setHostname", new Class[]{String.class});
            jpf.a aVar3 = new jpf.a(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            jpf.a aVar4 = new jpf.a(obj2, "setAlpnProtocols", new Class[]{byte[].class});
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (provider.getName().equals("GmsCore_OpenSSL") || provider.getName().equals("Conscrypt") || provider.getName().equals("Ssl_Guard")) {
                kVar = k.ALPN_AND_NPN;
            } else {
                try {
                    l.class.getClassLoader().loadClass("android.net.Network");
                    kVar = k.ALPN_AND_NPN;
                } catch (ClassNotFoundException e) {
                    logger.log(Level.FINE, "Can't find class", (Throwable) e);
                    try {
                        l.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        kVar = k.NPN;
                    } catch (ClassNotFoundException e2) {
                        logger.log(Level.FINE, "Can't find class", (Throwable) e2);
                        kVar = k.NONE;
                    }
                }
            }
            lVar = new g(aVar, aVar2, aVar3, aVar4, provider, kVar);
        } else {
            try {
                Provider provider4 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider4);
                        sSLContext.init(null, null, null);
                        SSLEngine.class.getMethod("getApplicationProtocol", null).invoke(sSLContext.createSSLEngine(), null);
                        lVar = new h(provider4, SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
                    } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                        provider2 = provider4;
                        lVar = new l(provider2);
                        d = lVar;
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException unused3) {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    try {
                        lVar = new i(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider4);
                    } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                        provider2 = provider4;
                        lVar = new l(provider2);
                    }
                }
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(e4);
            }
        }
        d = lVar;
    }

    public l(Provider provider) {
        this.f163015a = provider;
    }

    public static byte[] b(List list) {
        mmm.h hVar = new mmm.h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m mVar = (m) list.get(i);
            if (mVar != m.HTTP_1_0) {
                hVar.w(mVar.toString().length());
                hVar.D(mVar.toString());
            }
        }
        return hVar.o(hVar.f207266b);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
    }

    public String d(SSLSocket sSLSocket) {
        return null;
    }

    public k e() {
        return k.NONE;
    }
}
