package dx4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x4 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f120836c;
    public final long d;
    public final long e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v4 f120837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f120838h;
    public final l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q f120839j;
    public final l k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q f120840l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f120841m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f120842n;
    public final w4 o;

    public x4(String name, String title, long j2, long j3, long j5, int i, v4 amountType, boolean z, l lVar, q qVar, l lVar2, q qVar2, String parameterKey, List list, w4 titleGravity) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        Intrinsics.checkNotNullParameter(titleGravity, "titleGravity");
        this.f120834a = name;
        this.f120835b = title;
        this.f120836c = j2;
        this.d = j3;
        this.e = j5;
        this.f = i;
        this.f120837g = amountType;
        this.f120838h = z;
        this.i = lVar;
        this.f120839j = qVar;
        this.k = lVar2;
        this.f120840l = qVar2;
        this.f120841m = parameterKey;
        this.f120842n = list;
        this.o = titleGravity;
    }

    public final x4 a(Long l2) {
        Long l3 = new kotlin.ranges.e(this.f120836c, this.d).c(l2.longValue()) ? l2 : null;
        long jLongValue = l3 != null ? l3.longValue() : this.e;
        String name = this.f120834a;
        Intrinsics.checkNotNullParameter(name, "name");
        String title = this.f120835b;
        Intrinsics.checkNotNullParameter(title, "title");
        v4 amountType = this.f120837g;
        Intrinsics.checkNotNullParameter(amountType, "amountType");
        String parameterKey = this.f120841m;
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        w4 titleGravity = this.o;
        Intrinsics.checkNotNullParameter(titleGravity, "titleGravity");
        return new x4(name, title, this.f120836c, this.d, jLongValue, this.f, amountType, this.f120838h, this.i, this.f120839j, this.k, this.f120840l, parameterKey, this.f120842n, titleGravity);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x4)) {
            return false;
        }
        x4 x4Var = (x4) obj2;
        return Intrinsics.f(this.f120834a, x4Var.f120834a) && Intrinsics.f(this.f120835b, x4Var.f120835b) && this.f120836c == x4Var.f120836c && this.d == x4Var.d && this.e == x4Var.e && this.f == x4Var.f && Intrinsics.f(this.f120837g, x4Var.f120837g) && this.f120838h == x4Var.f120838h && Intrinsics.f(this.i, x4Var.i) && this.f120839j == x4Var.f120839j && Intrinsics.f(this.k, x4Var.k) && this.f120840l == x4Var.f120840l && Intrinsics.f(this.f120841m, x4Var.f120841m) && Intrinsics.f(this.f120842n, x4Var.f120842n) && this.o == x4Var.o;
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f120837g.hashCode() + j6.a.b(this.f, a0.d.c(a0.d.c(a0.d.c(p.a.c(this.f120834a.hashCode() * 31, 31, this.f120835b), 31, this.f120836c), 31, this.d), 31, this.e), 31)) * 31, 31, this.f120838h);
        l lVar = this.i;
        int iHashCode = (iC + (lVar == null ? 0 : lVar.hashCode())) * 31;
        q qVar = this.f120839j;
        int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        l lVar2 = this.k;
        int iHashCode3 = (iHashCode2 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        q qVar2 = this.f120840l;
        int iC2 = p.a.c((iHashCode3 + (qVar2 == null ? 0 : qVar2.hashCode())) * 31, 31, this.f120841m);
        List list = this.f120842n;
        return this.o.hashCode() + ((iC2 + (list != null ? list.hashCode() : 0)) * 31);
    }
}
