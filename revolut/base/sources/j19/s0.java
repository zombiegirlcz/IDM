package j19;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class s0 {

    @NotNull
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170251c;
    public final String d;
    public final k19.a0 e;
    public final k19.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f170252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k19.q f170253h;
    public final k19.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Float f170254j;

    public /* synthetic */ s0(int i, String str, String str2, String str3, String str4, k19.a0 a0Var, k19.c cVar, String str5, k19.q qVar, k19.j jVar, Float f) {
        if (39 != (i & 39)) {
            qlm.j1.f(q0.f170235a.getDescriptor(), i, 39);
            throw null;
        }
        this.f170249a = str;
        this.f170250b = str2;
        this.f170251c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = a0Var;
        }
        this.f = cVar;
        if ((i & 64) == 0) {
            this.f170252g = null;
        } else {
            this.f170252g = str5;
        }
        if ((i & 128) == 0) {
            this.f170253h = null;
        } else {
            this.f170253h = qVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = jVar;
        }
        if ((i & 512) == 0) {
            this.f170254j = null;
        } else {
            this.f170254j = f;
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
        return Intrinsics.f(this.f170249a, s0Var.f170249a) && Intrinsics.f(this.f170250b, s0Var.f170250b) && Intrinsics.f(this.f170251c, s0Var.f170251c) && Intrinsics.f(this.d, s0Var.d) && Intrinsics.f(this.e, s0Var.e) && Intrinsics.f(this.f, s0Var.f) && Intrinsics.f(this.f170252g, s0Var.f170252g) && Intrinsics.f(this.f170253h, s0Var.f170253h) && Intrinsics.f(this.i, s0Var.i) && Intrinsics.f(this.f170254j, s0Var.f170254j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f170249a.hashCode() * 31, 31, this.f170250b), 31, this.f170251c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        k19.a0 a0Var = this.e;
        int iHashCode2 = (this.f.hashCode() + ((iHashCode + (a0Var == null ? 0 : a0Var.hashCode())) * 31)) * 31;
        String str2 = this.f170252g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        k19.q qVar = this.f170253h;
        int iHashCode4 = (iHashCode3 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        k19.j jVar = this.i;
        int iHashCode5 = (iHashCode4 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Float f = this.f170254j;
        return iHashCode5 + (f != null ? f.hashCode() : 0);
    }
}
