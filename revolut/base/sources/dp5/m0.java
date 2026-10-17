package dp5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116782c;
    public final String d;
    public final long e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g0 f116783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f116784h;
    public final Long i;

    public /* synthetic */ m0(int i, String str, String str2, String str3, String str4, long j2, long j3, g0 g0Var, long j5, Long l2) {
        if (511 != (i & 511)) {
            qlm.j1.f(k0.f116772a.getDescriptor(), i, 511);
            throw null;
        }
        this.f116780a = str;
        this.f116781b = str2;
        this.f116782c = str3;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.f116783g = g0Var;
        this.f116784h = j5;
        this.i = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f116780a, m0Var.f116780a) && Intrinsics.f(this.f116781b, m0Var.f116781b) && Intrinsics.f(this.f116782c, m0Var.f116782c) && Intrinsics.f(this.d, m0Var.d) && this.e == m0Var.e && this.f == m0Var.f && Intrinsics.f(this.f116783g, m0Var.f116783g) && this.f116784h == m0Var.f116784h && Intrinsics.f(this.i, m0Var.i);
    }

    public final int hashCode() {
        int iC = a0.d.c((this.f116783g.hashCode() + a0.d.c(a0.d.c(p.a.c(p.a.c(p.a.c(this.f116780a.hashCode() * 31, 31, this.f116781b), 31, this.f116782c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.f116784h);
        Long l2 = this.i;
        return iC + (l2 == null ? 0 : l2.hashCode());
    }
}
