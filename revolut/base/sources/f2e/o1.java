package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class o1 {

    @NotNull
    public static final n1 Companion = new n1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131675c;
    public final String d;
    public final z3 e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d5 f131676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d2 f131677h;
    public final m0 i;

    public /* synthetic */ o1(int i, String str, String str2, String str3, String str4, z3 z3Var, g gVar, d5 d5Var, d2 d2Var, m0 m0Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(m1.f131657a.getDescriptor(), i, 15);
            throw null;
        }
        this.f131673a = str;
        this.f131674b = str2;
        this.f131675c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = z3Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = gVar;
        }
        if ((i & 64) == 0) {
            this.f131676g = null;
        } else {
            this.f131676g = d5Var;
        }
        if ((i & 128) == 0) {
            this.f131677h = null;
        } else {
            this.f131677h = d2Var;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = m0Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj2;
        return Intrinsics.f(this.f131673a, o1Var.f131673a) && Intrinsics.f(this.f131674b, o1Var.f131674b) && Intrinsics.f(this.f131675c, o1Var.f131675c) && Intrinsics.f(this.d, o1Var.d) && Intrinsics.f(this.e, o1Var.e) && Intrinsics.f(this.f, o1Var.f) && Intrinsics.f(this.f131676g, o1Var.f131676g) && Intrinsics.f(this.f131677h, o1Var.f131677h) && Intrinsics.f(this.i, o1Var.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f131673a.hashCode() * 31, 31, this.f131674b), 31, this.f131675c), 31, this.d);
        z3 z3Var = this.e;
        int iHashCode = (iC + (z3Var == null ? 0 : z3Var.hashCode())) * 31;
        g gVar = this.f;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        d5 d5Var = this.f131676g;
        int iHashCode3 = (iHashCode2 + (d5Var == null ? 0 : d5Var.hashCode())) * 31;
        d2 d2Var = this.f131677h;
        int iHashCode4 = (iHashCode3 + (d2Var == null ? 0 : d2Var.hashCode())) * 31;
        m0 m0Var = this.i;
        return iHashCode4 + (m0Var != null ? m0Var.hashCode() : 0);
    }
}
