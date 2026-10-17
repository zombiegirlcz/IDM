package ttj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class s0 {

    @NotNull
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f274400c;
    public final int d;
    public final String e;
    public final g0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f274401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f274402h;
    public final p0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v0 f274403j;

    public /* synthetic */ s0(int i, String str, String str2, String str3, int i2, String str4, g0 g0Var, String str5, String str6, p0 p0Var, v0 v0Var) {
        if (381 != (i & 381)) {
            qlm.j1.f(q0.f274394a.getDescriptor(), i, 381);
            throw null;
        }
        this.f274398a = str;
        if ((i & 2) == 0) {
            this.f274399b = null;
        } else {
            this.f274399b = str2;
        }
        this.f274400c = str3;
        this.d = i2;
        this.e = str4;
        this.f = g0Var;
        this.f274401g = str5;
        if ((i & 128) == 0) {
            this.f274402h = null;
        } else {
            this.f274402h = str6;
        }
        this.i = p0Var;
        if ((i & 512) == 0) {
            this.f274403j = null;
        } else {
            this.f274403j = v0Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f274398a, s0Var.f274398a) && Intrinsics.f(this.f274399b, s0Var.f274399b) && Intrinsics.f(this.f274400c, s0Var.f274400c) && this.d == s0Var.d && Intrinsics.f(this.e, s0Var.e) && Intrinsics.f(this.f, s0Var.f) && Intrinsics.f(this.f274401g, s0Var.f274401g) && Intrinsics.f(this.f274402h, s0Var.f274402h) && Intrinsics.f(this.i, s0Var.i) && Intrinsics.f(this.f274403j, s0Var.f274403j);
    }

    public final int hashCode() {
        int iHashCode = this.f274398a.hashCode() * 31;
        String str = this.f274399b;
        int iC = p.a.c((this.f.hashCode() + p.a.c(j6.a.b(this.d, p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f274400c), 31), 31, this.e)) * 31, 31, this.f274401g);
        String str2 = this.f274402h;
        int iHashCode2 = (this.i.hashCode() + ((iC + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        v0 v0Var = this.f274403j;
        return iHashCode2 + (v0Var != null ? v0Var.hashCode() : 0);
    }
}
