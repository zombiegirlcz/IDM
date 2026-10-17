package asc;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8915c;
    public final String d;
    public final Long e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f8916g;

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4, Long l2, Long l3, String str5) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(a.f8912a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f8913a = str;
        this.f8914b = str2;
        this.f8915c = str3;
        this.d = str4;
        this.e = l2;
        this.f = l3;
        this.f8916g = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f8913a, cVar.f8913a) && Intrinsics.f(this.f8914b, cVar.f8914b) && Intrinsics.f(this.f8915c, cVar.f8915c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f8916g, cVar.f8916g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f8913a.hashCode() * 31, 31, this.f8914b), 31, this.f8915c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.f8916g;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public c(String fromCurrency, String toCurrency, String fromPocketId, String str, Long l2, Long l3, String str2) {
        Intrinsics.checkNotNullParameter(fromCurrency, "fromCurrency");
        Intrinsics.checkNotNullParameter(toCurrency, "toCurrency");
        Intrinsics.checkNotNullParameter(fromPocketId, "fromPocketId");
        this.f8913a = fromCurrency;
        this.f8914b = toCurrency;
        this.f8915c = fromPocketId;
        this.d = str;
        this.e = l2;
        this.f = l3;
        this.f8916g = str2;
    }
}
