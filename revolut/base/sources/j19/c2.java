package j19;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c2 implements c {

    @NotNull
    public static final b2 Companion = new b2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170179c;
    public final String d;
    public final k19.a0 e;
    public final k19.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f170180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k19.q f170181h;
    public final k19.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Float f170182j;

    public /* synthetic */ c2(int i, String str, String str2, String str3, String str4, k19.a0 a0Var, k19.c cVar, String str5, k19.q qVar, k19.j jVar, Float f) {
        if (35 != (i & 35)) {
            qlm.j1.f(a2.f170170a.getDescriptor(), i, 35);
            throw null;
        }
        this.f170177a = str;
        this.f170178b = str2;
        if ((i & 4) == 0) {
            this.f170179c = null;
        } else {
            this.f170179c = str3;
        }
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
            this.f170180g = null;
        } else {
            this.f170180g = str5;
        }
        if ((i & 128) == 0) {
            this.f170181h = null;
        } else {
            this.f170181h = qVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = jVar;
        }
        if ((i & 512) == 0) {
            this.f170182j = null;
        } else {
            this.f170182j = f;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        return Intrinsics.f(this.f170177a, c2Var.f170177a) && Intrinsics.f(this.f170178b, c2Var.f170178b) && Intrinsics.f(this.f170179c, c2Var.f170179c) && Intrinsics.f(this.d, c2Var.d) && Intrinsics.f(this.e, c2Var.e) && Intrinsics.f(this.f, c2Var.f) && Intrinsics.f(this.f170180g, c2Var.f170180g) && Intrinsics.f(this.f170181h, c2Var.f170181h) && Intrinsics.f(this.i, c2Var.i) && Intrinsics.f(this.f170182j, c2Var.f170182j);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f170177a.hashCode() * 31, 31, this.f170178b);
        String str = this.f170179c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        k19.a0 a0Var = this.e;
        int iHashCode3 = (this.f.hashCode() + ((iHashCode2 + (a0Var == null ? 0 : a0Var.hashCode())) * 31)) * 31;
        String str3 = this.f170180g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        k19.q qVar = this.f170181h;
        int iHashCode5 = (iHashCode4 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        k19.j jVar = this.i;
        int iHashCode6 = (iHashCode5 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Float f = this.f170182j;
        return iHashCode6 + (f != null ? f.hashCode() : 0);
    }
}
