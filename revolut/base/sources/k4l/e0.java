package k4l;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f180953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f180954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dfl.k0 f180955c;
    public final ArrayList d;
    public final long e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f180956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final BigDecimal f180957h;
    public final BigDecimal i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f180958j;
    public final Float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Float f180959l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c f180960m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b0 f180961n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k0 f180962p;

    public e0(a aVar, b bVar, dfl.k0 k0Var, ArrayList fees, long j2, long j3, int i, BigDecimal bigDecimal, BigDecimal bigDecimal2, List orderTypes, Float f, Float f4, c cVar, b0 b0Var, Integer num, k0 k0Var2) {
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(orderTypes, "orderTypes");
        this.f180953a = aVar;
        this.f180954b = bVar;
        this.f180955c = k0Var;
        this.d = fees;
        this.e = j2;
        this.f = j3;
        this.f180956g = i;
        this.f180957h = bigDecimal;
        this.i = bigDecimal2;
        this.f180958j = orderTypes;
        this.k = f;
        this.f180959l = f4;
        this.f180960m = cVar;
        this.f180961n = b0Var;
        this.o = num;
        this.f180962p = k0Var2;
    }

    public final boolean a() {
        return this.i != null;
    }

    public final BigDecimal b() {
        BigDecimal bigDecimal = this.i;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f180953a, e0Var.f180953a) && Intrinsics.f(this.f180954b, e0Var.f180954b) && Intrinsics.f(this.f180955c, e0Var.f180955c) && this.d.equals(e0Var.d) && this.e == e0Var.e && this.f == e0Var.f && this.f180956g == e0Var.f180956g && Intrinsics.f(this.f180957h, e0Var.f180957h) && Intrinsics.f(this.i, e0Var.i) && this.f180958j.equals(e0Var.f180958j) && Intrinsics.f(this.k, e0Var.k) && Intrinsics.f(this.f180959l, e0Var.f180959l) && Intrinsics.f(this.f180960m, e0Var.f180960m) && Intrinsics.f(this.f180961n, e0Var.f180961n) && Intrinsics.f(this.o, e0Var.o) && Intrinsics.f(this.f180962p, e0Var.f180962p);
    }

    public final int hashCode() {
        a aVar = this.f180953a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        b bVar = this.f180954b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        dfl.k0 k0Var = this.f180955c;
        int iB = j6.a.b(this.f180956g, a0.d.c(a0.d.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iHashCode2 + (k0Var == null ? 0 : k0Var.hashCode())) * 31, 31), 31, this.e), 31, this.f), 31);
        BigDecimal bigDecimal = this.f180957h;
        int iHashCode3 = (iB + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.i;
        int iD = p.a.d((iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31, 31, this.f180958j);
        Float f = this.k;
        int iHashCode4 = (iD + (f == null ? 0 : f.hashCode())) * 31;
        Float f4 = this.f180959l;
        int iHashCode5 = (iHashCode4 + (f4 == null ? 0 : f4.hashCode())) * 31;
        c cVar = this.f180960m;
        int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b0 b0Var = this.f180961n;
        int iHashCode7 = (iHashCode6 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        Integer num = this.o;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        k0 k0Var2 = this.f180962p;
        return iHashCode8 + (k0Var2 != null ? k0Var2.hashCode() : 0);
    }
}
