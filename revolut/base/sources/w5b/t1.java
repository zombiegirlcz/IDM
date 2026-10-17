package w5b;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class t1 {

    @NotNull
    public static final s1 Companion = new s1();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Lazy[] f295012m = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new w56.a(14)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f295015c;
    public final String d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f295016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a0 f295017h;
    public final a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f295018j;
    public final ld7.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k1 f295019l;

    public /* synthetic */ t1(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, a0 a0Var, a0 a0Var2, String str7, ld7.f fVar, k1 k1Var) {
        if (4095 != (i & 4095)) {
            qlm.j1.f(r1.f294994a.getDescriptor(), i, 4095);
            throw null;
        }
        this.f295013a = str;
        this.f295014b = str2;
        this.f295015c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
        this.f295016g = str6;
        this.f295017h = a0Var;
        this.i = a0Var2;
        this.f295018j = str7;
        this.k = fVar;
        this.f295019l = k1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj2;
        return Intrinsics.f(this.f295013a, t1Var.f295013a) && Intrinsics.f(this.f295014b, t1Var.f295014b) && Intrinsics.f(this.f295015c, t1Var.f295015c) && Intrinsics.f(this.d, t1Var.d) && Intrinsics.f(this.e, t1Var.e) && Intrinsics.f(this.f, t1Var.f) && Intrinsics.f(this.f295016g, t1Var.f295016g) && Intrinsics.f(this.f295017h, t1Var.f295017h) && Intrinsics.f(this.i, t1Var.i) && Intrinsics.f(this.f295018j, t1Var.f295018j) && Intrinsics.f(this.k, t1Var.k) && Intrinsics.f(this.f295019l, t1Var.f295019l);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f295013a.hashCode() * 31, 31, this.f295014b), 31, this.f295015c);
        String str = this.d;
        int iHashCode = (this.f295017h.hashCode() + p.a.c(p.a.d(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f295016g)) * 31;
        a0 a0Var = this.i;
        int iHashCode2 = (iHashCode + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        String str2 = this.f295018j;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ld7.f fVar = this.k;
        int iHashCode4 = (iHashCode3 + (fVar == null ? 0 : fVar.f194043a.hashCode())) * 31;
        k1 k1Var = this.f295019l;
        return iHashCode4 + (k1Var != null ? k1Var.hashCode() : 0);
    }
}
