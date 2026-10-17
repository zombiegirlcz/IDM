package dp5;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Lazy[] f116745p = {null, null, null, null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new dmj.b(5)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116748c;
    public final String d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f116749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f116750h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f116751j;
    public final bl5.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f116752l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f116753m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f116754n;
    public final cl5.a o;

    public /* synthetic */ f(int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, Boolean bool, String str7, List list, bl5.b bVar, Boolean bool2, d0 d0Var, long j2, cl5.a aVar) {
        if (32767 != (i & 32767)) {
            qlm.j1.f(d.f116737a.getDescriptor(), i, 32767);
            throw null;
        }
        this.f116746a = str;
        this.f116747b = str2;
        this.f116748c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.f116749g = str6;
        this.f116750h = bool;
        this.i = str7;
        this.f116751j = list;
        this.k = bVar;
        this.f116752l = bool2;
        this.f116753m = d0Var;
        this.f116754n = j2;
        this.o = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f116746a, fVar.f116746a) && Intrinsics.f(this.f116747b, fVar.f116747b) && Intrinsics.f(this.f116748c, fVar.f116748c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && this.f == fVar.f && Intrinsics.f(this.f116749g, fVar.f116749g) && Intrinsics.f(this.f116750h, fVar.f116750h) && Intrinsics.f(this.i, fVar.i) && Intrinsics.f(this.f116751j, fVar.f116751j) && Intrinsics.f(this.k, fVar.k) && Intrinsics.f(this.f116752l, fVar.f116752l) && Intrinsics.f(this.f116753m, fVar.f116753m) && this.f116754n == fVar.f116754n && Intrinsics.f(this.o, fVar.o);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f116746a.hashCode() * 31, 31, this.f116747b), 31, this.f116748c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iC2 = p.a.c(j6.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.f116749g);
        Boolean bool = this.f116750h;
        int iHashCode2 = (iC2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f116751j;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        bl5.b bVar = this.k;
        int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool2 = this.f116752l;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        d0 d0Var = this.f116753m;
        int iC3 = a0.d.c((iHashCode6 + (d0Var == null ? 0 : d0Var.hashCode())) * 31, 31, this.f116754n);
        cl5.a aVar = this.o;
        return iC3 + (aVar != null ? aVar.hashCode() : 0);
    }
}
