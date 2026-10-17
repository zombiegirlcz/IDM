package j29;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c0 {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170745c;
    public final boolean d;
    public final String e;
    public final b0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f170746g;

    public /* synthetic */ c0(int i, String str, String str2, String str3, boolean z, String str4, b0 b0Var, String str5) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(x.f170773a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f170743a = str;
        this.f170744b = str2;
        this.f170745c = str3;
        this.d = z;
        this.e = str4;
        this.f = b0Var;
        this.f170746g = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f170743a, c0Var.f170743a) && Intrinsics.f(this.f170744b, c0Var.f170744b) && Intrinsics.f(this.f170745c, c0Var.f170745c) && this.d == c0Var.d && Intrinsics.f(this.e, c0Var.e) && Intrinsics.f(this.f, c0Var.f) && Intrinsics.f(this.f170746g, c0Var.f170746g);
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(p.a.c(p.a.c(this.f170743a.hashCode() * 31, 31, this.f170744b), 31, this.f170745c), 31, this.d), 31, this.e);
        b0 b0Var = this.f;
        int iHashCode = (iC + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        String str = this.f170746g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
