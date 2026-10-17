package fmm;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class h implements q {

    @NotNull
    public static final g Companion = new g();
    public static final af.f e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f136489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f136490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f136491c;
    public final Method d;

    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", "packageName");
        e = new af.f(5);
    }

    public h(Class sslSocketClass) throws NoSuchMethodException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f136489a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
        this.f136490b = declaredMethod;
        sslSocketClass.getMethod("setHostname", String.class);
        this.f136491c = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.d = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // fmm.q
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f136489a.isInstance(sslSocket);
    }

    @Override // fmm.q
    public final String b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            try {
                byte[] bArr = (byte[]) this.f136491c.invoke(sslSocket, null);
                if (bArr != null) {
                    return new String(bArr, Charsets.UTF_8);
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (!(cause instanceof NullPointerException) || !Intrinsics.f(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e4);
                }
            }
        }
        return null;
    }

    @Override // fmm.q
    public final void c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f136490b.invoke(sslSocket, Boolean.TRUE);
                Method method = this.d;
                emm.h.Companion.getClass();
                method.invoke(sslSocket, emm.g.b(protocols));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    @Override // fmm.q
    public final boolean isSupported() {
        emm.e.Companion.getClass();
        return emm.c.b();
    }
}
