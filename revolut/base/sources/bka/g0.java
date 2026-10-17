package bka;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16314c;
    public final boolean d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k0 f16315g;

    public /* synthetic */ g0(int i, String str, String str2, String str3, boolean z, boolean z3, String str4, k0 k0Var) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(e0.f16308a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f16312a = str;
        this.f16313b = str2;
        this.f16314c = str3;
        this.d = z;
        this.e = z3;
        this.f = str4;
        this.f16315g = k0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f16312a, g0Var.f16312a) && Intrinsics.f(this.f16313b, g0Var.f16313b) && Intrinsics.f(this.f16314c, g0Var.f16314c) && this.d == g0Var.d && this.e == g0Var.e && Intrinsics.f(this.f, g0Var.f) && Intrinsics.f(this.f16315g, g0Var.f16315g);
    }

    public final int hashCode() {
        String str = this.f16312a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f16313b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f16314c;
        int iC = p.a.c(j6.a.c(j6.a.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        k0 k0Var = this.f16315g;
        return iC + (k0Var != null ? k0Var.f16323a.hashCode() : 0);
    }

    public g0(String str, String str2, String str3, boolean z, boolean z3, String asset, k0 k0Var) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f16312a = str;
        this.f16313b = str2;
        this.f16314c = str3;
        this.d = z;
        this.e = z3;
        this.f = asset;
        this.f16315g = k0Var;
    }
}
