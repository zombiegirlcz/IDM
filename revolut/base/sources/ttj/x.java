package ttj;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f274426c;
    public final String d;
    public final c2 e;
    public final z1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f274427g;

    public /* synthetic */ x(int i, String str, String str2, String str3, String str4, c2 c2Var, z1 z1Var, String str5) {
        if (127 != (i & CertificateBody.profileType)) {
            qlm.j1.f(v.f274417a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f274424a = str;
        this.f274425b = str2;
        this.f274426c = str3;
        this.d = str4;
        this.e = c2Var;
        this.f = z1Var;
        this.f274427g = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f274424a, xVar.f274424a) && Intrinsics.f(this.f274425b, xVar.f274425b) && Intrinsics.f(this.f274426c, xVar.f274426c) && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e) && Intrinsics.f(this.f, xVar.f) && Intrinsics.f(this.f274427g, xVar.f274427g);
    }

    public final int hashCode() {
        int iHashCode = this.f274424a.hashCode() * 31;
        String str = this.f274425b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f274426c);
        String str2 = this.d;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        c2 c2Var = this.e;
        int iHashCode3 = (iHashCode2 + (c2Var == null ? 0 : c2Var.f274327a.hashCode())) * 31;
        z1 z1Var = this.f;
        int iHashCode4 = (iHashCode3 + (z1Var == null ? 0 : z1Var.hashCode())) * 31;
        String str3 = this.f274427g;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
