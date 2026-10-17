package emm;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class d implements imm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f127694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f127695b;

    public d(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
        this.f127694a = trustManager;
        this.f127695b = findByIssuerAndSignatureMethod;
    }

    @Override // imm.g
    public final X509Certificate a(X509Certificate cert) {
        Intrinsics.checkNotNullParameter(cert, "cert");
        try {
            Object objInvoke = this.f127695b.invoke(this.f127694a, cert);
            Intrinsics.i(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f127694a, dVar.f127694a) && Intrinsics.f(this.f127695b, dVar.f127695b);
    }

    public final int hashCode() {
        return this.f127695b.hashCode() + (this.f127694a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f127694a + ", findByIssuerAndSignatureMethod=" + this.f127695b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
