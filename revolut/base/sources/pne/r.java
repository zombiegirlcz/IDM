package pne;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f237733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f237734c;
    public final x d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f237735g;

    public /* synthetic */ r(int i, String str, String str2, h0 h0Var, x xVar, dj0.d dVar, dj0.d dVar2, String str3) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(p.f237731a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f237732a = str;
        this.f237733b = str2;
        this.f237734c = h0Var;
        this.d = xVar;
        this.e = dVar;
        this.f = dVar2;
        this.f237735g = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f237732a, rVar.f237732a) && Intrinsics.f(this.f237733b, rVar.f237733b) && Intrinsics.f(this.f237734c, rVar.f237734c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f237735g, rVar.f237735g);
    }

    public final int hashCode() {
        int iHashCode = (this.f237734c.hashCode() + p.a.c(this.f237732a.hashCode() * 31, 31, this.f237733b)) * 31;
        x xVar = this.d;
        int iC = v7.c(v7.c((iHashCode + (xVar == null ? 0 : xVar.hashCode())) * 31, 31, this.e), 31, this.f);
        String str = this.f237735g;
        return iC + (str != null ? str.hashCode() : 0);
    }

    public r(String code, String taxYear, h0 validityPeriod, x xVar, dj0.d currentLimit, dj0.d utilisedAmount, String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(taxYear, "taxYear");
        Intrinsics.checkNotNullParameter(validityPeriod, "validityPeriod");
        Intrinsics.checkNotNullParameter(currentLimit, "currentLimit");
        Intrinsics.checkNotNullParameter(utilisedAmount, "utilisedAmount");
        this.f237732a = code;
        this.f237733b = taxYear;
        this.f237734c = validityPeriod;
        this.d = xVar;
        this.e = currentLimit;
        this.f = utilisedAmount;
        this.f237735g = str;
    }
}
