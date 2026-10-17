package io.grpc.okhttp.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends l {
    public final Method e;
    public final Method f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Method f163008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f163009h;
    public final Class i;

    public i(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.e = method;
        this.f = method2;
        this.f163008g = method3;
        this.f163009h = cls;
        this.i = cls2;
    }

    @Override // io.grpc.okhttp.internal.l
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f163008g.invoke(null, sSLSocket);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException e) {
            l.f163013b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e);
        }
    }

    @Override // io.grpc.okhttp.internal.l
    public final void c(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m mVar = (m) list.get(i);
            if (mVar != m.HTTP_1_0) {
                arrayList.add(mVar.toString());
            }
        }
        try {
            this.e.invoke(null, sSLSocket, Proxy.newProxyInstance(l.class.getClassLoader(), new Class[]{this.f163009h, this.i}, new j(arrayList)));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // io.grpc.okhttp.internal.l
    public final String d(SSLSocket sSLSocket) {
        try {
            j jVar = (j) Proxy.getInvocationHandler(this.f.invoke(null, sSLSocket));
            boolean z = jVar.f163011b;
            if (!z && jVar.f163012c == null) {
                l.f163013b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            if (z) {
                return null;
            }
            return jVar.f163012c;
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }

    @Override // io.grpc.okhttp.internal.l
    public final k e() {
        return k.ALPN_AND_NPN;
    }
}
