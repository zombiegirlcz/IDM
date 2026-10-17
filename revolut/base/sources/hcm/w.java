package hcm;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes13.dex */
public final class w extends x {
    public static final jpf.a d;
    public static final jpf.a e;
    public static final jpf.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final jpf.a f151327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final jpf.a f151328h;
    public static final jpf.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Method f151329j;
    public static final Method k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Method f151330l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Method f151331m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Method f151332n;
    public static final Method o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Constructor f151333p;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Class<?> cls;
        Logger logger = x.f151334b;
        Class cls2 = Boolean.TYPE;
        Constructor<?> constructor = null;
        d = new jpf.a(constructor, "setUseSessionTickets", new Class[]{cls2});
        e = new jpf.a(constructor, "setHostname", new Class[]{String.class});
        Class<byte[]> cls3 = byte[].class;
        f = new jpf.a(cls3, "getAlpnSelectedProtocol", new Class[0]);
        f151327g = new jpf.a(constructor, "setAlpnProtocols", new Class[]{byte[].class});
        f151328h = new jpf.a(cls3, "getNpnSelectedProtocol", new Class[0]);
        i = new jpf.a(constructor, "setNpnProtocols", new Class[]{byte[].class});
        try {
            method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            try {
                method2 = SSLParameters.class.getMethod("getApplicationProtocols", null);
            } catch (ClassNotFoundException e2) {
                e = e2;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f151330l = method;
                f151331m = method2;
                f151332n = method3;
                f151329j = method4;
                k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                o = method6;
                f151333p = constructor;
            } catch (NoSuchMethodException e4) {
                e = e4;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f151330l = method;
                f151331m = method2;
                f151332n = method3;
                f151329j = method4;
                k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                o = method6;
                f151333p = constructor;
            }
            try {
                method3 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                try {
                    cls = Class.forName("android.net.ssl.SSLSockets");
                    method4 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                } catch (ClassNotFoundException e5) {
                    e = e5;
                    method4 = null;
                } catch (NoSuchMethodException e6) {
                    e = e6;
                    method4 = null;
                }
            } catch (ClassNotFoundException e22) {
                e = e22;
                method3 = null;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f151330l = method;
                f151331m = method2;
                f151332n = method3;
                f151329j = method4;
                k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                o = method6;
                f151333p = constructor;
            } catch (NoSuchMethodException e33) {
                e = e33;
                method3 = null;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f151330l = method;
                f151331m = method2;
                f151332n = method3;
                f151329j = method4;
                k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                o = method6;
                f151333p = constructor;
            }
            try {
                method5 = cls.getMethod("setUseSessionTickets", SSLSocket.class, cls2);
            } catch (ClassNotFoundException e35) {
                e = e35;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
            } catch (NoSuchMethodException e41) {
                e = e41;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
            }
        } catch (ClassNotFoundException e45) {
            e = e45;
            method = null;
            method2 = null;
        } catch (NoSuchMethodException e47) {
            e = e47;
            method = null;
            method2 = null;
        }
        f151330l = method;
        f151331m = method2;
        f151332n = method3;
        f151329j = method4;
        k = method5;
        try {
            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
        } catch (ClassNotFoundException e70) {
            e = e70;
            method6 = null;
        } catch (NoSuchMethodException e74) {
            e = e74;
            method6 = null;
        }
        try {
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
        } catch (ClassNotFoundException e83) {
            e = e83;
            logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
        } catch (NoSuchMethodException e90) {
            e = e90;
            logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
        }
        o = method6;
        f151333p = constructor;
    }

    @Override // hcm.x
    public final void a(SSLSocket sSLSocket, String str, List list) {
        Constructor constructor;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((io.grpc.okhttp.internal.m) it8.next()).toString());
        }
        boolean z = false;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (x.c(str)) {
                        Method method2 = f151329j;
                        if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                            d.s(sSLSocket, Boolean.TRUE);
                        } else {
                            k.invoke(null, sSLSocket, Boolean.TRUE);
                        }
                        Method method3 = o;
                        if (method3 == null || (constructor = f151333p) == null) {
                            e.s(sSLSocket, str);
                        } else {
                            method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                        }
                    }
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (IllegalAccessException e4) {
                throw new RuntimeException(e4);
            } catch (InstantiationException e5) {
                throw new RuntimeException(e5);
            }
        }
        Method method4 = f151332n;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                f151330l.invoke(sSLParameters, strArr);
                z = true;
            } catch (InvocationTargetException e6) {
                if (!(e6.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e6;
                }
                x.f151334b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
            }
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z && (method = f151331m) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {io.grpc.okhttp.internal.l.b(list)};
        io.grpc.okhttp.internal.l lVar = this.f151336a;
        if (lVar.e() == io.grpc.okhttp.internal.k.ALPN_AND_NPN) {
            f151327g.t(sSLSocket, objArr);
        }
        if (lVar.e() == io.grpc.okhttp.internal.k.NONE) {
            throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
        i.t(sSLSocket, objArr);
    }

    @Override // hcm.x
    public final String b(SSLSocket sSLSocket) {
        Logger logger = x.f151334b;
        Method method = f151332n;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e4) {
                if (!(e4.getTargetException() instanceof UnsupportedOperationException)) {
                    throw new RuntimeException(e4);
                }
                logger.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        io.grpc.okhttp.internal.l lVar = this.f151336a;
        if (lVar.e() == io.grpc.okhttp.internal.k.ALPN_AND_NPN) {
            try {
                byte[] bArr = (byte[]) f.t(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, io.grpc.okhttp.internal.p.f163020b);
                }
            } catch (Exception e5) {
                logger.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e5);
            }
        }
        if (lVar.e() != io.grpc.okhttp.internal.k.NONE) {
            try {
                byte[] bArr2 = (byte[]) f151328h.t(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, io.grpc.okhttp.internal.p.f163020b);
                }
            } catch (Exception e6) {
                logger.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e6);
            }
        }
        return null;
    }

    @Override // hcm.x
    public final String d(SSLSocket sSLSocket, String str, List list) {
        String strB = b(sSLSocket);
        return strB == null ? super.d(sSLSocket, str, list) : strB;
    }
}
