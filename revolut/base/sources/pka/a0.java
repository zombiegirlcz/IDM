package pka;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f236953c;
    public final boolean d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d0 f236954g;

    public /* synthetic */ a0(int i, String str, String str2, String str3, boolean z, boolean z3, String str4, d0 d0Var) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(y.f236999a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f236951a = str;
        this.f236952b = str2;
        this.f236953c = str3;
        this.d = z;
        this.e = z3;
        this.f = str4;
        this.f236954g = d0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f236951a, a0Var.f236951a) && Intrinsics.f(this.f236952b, a0Var.f236952b) && Intrinsics.f(this.f236953c, a0Var.f236953c) && this.d == a0Var.d && this.e == a0Var.e && Intrinsics.f(this.f, a0Var.f) && Intrinsics.f(this.f236954g, a0Var.f236954g);
    }

    public final int hashCode() {
        String str = this.f236951a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f236952b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f236953c;
        int iC = p.a.c(j6.a.c(j6.a.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        d0 d0Var = this.f236954g;
        return iC + (d0Var != null ? d0Var.f236960a.hashCode() : 0);
    }

    public a0(String str, String str2, String str3, boolean z, boolean z3, String asset, d0 d0Var) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f236951a = str;
        this.f236952b = str2;
        this.f236953c = str3;
        this.d = z;
        this.e = z3;
        this.f = asset;
        this.f236954g = d0Var;
    }
}
