package ulm;

import ch.qos.logback.core.CoreConstants;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class r0 {

    @NotNull
    public static final q0 Companion = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f281127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f281128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f281129c;
    public final Lazy d;

    public r0(v1 tlsVersion, v cipherSuite, List localCertificates, Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f281127a = tlsVersion;
        this.f281128b = cipherSuite;
        this.f281129c = localCertificates;
        this.d = yhm.j.b(new ite.d(peerCertificatesFn, 29));
    }

    public final List a() {
        return (List) this.d.getValue();
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return r0Var.f281127a == this.f281127a && Intrinsics.f(r0Var.f281128b, this.f281128b) && Intrinsics.f(r0Var.a(), a()) && Intrinsics.f(r0Var.f281129c, this.f281129c);
    }

    public final int hashCode() {
        return this.f281129c.hashCode() + ((a().hashCode() + ((this.f281128b.hashCode() + ((this.f281127a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(zhm.w.t(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb6 = new StringBuilder("Handshake{tlsVersion=");
        sb6.append(this.f281127a);
        sb6.append(" cipherSuite=");
        sb6.append(this.f281128b);
        sb6.append(" peerCertificates=");
        sb6.append(string);
        sb6.append(" localCertificates=");
        List<Certificate> list = this.f281129c;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        sb6.append(arrayList2);
        sb6.append(CoreConstants.CURLY_RIGHT);
        return sb6.toString();
    }
}
