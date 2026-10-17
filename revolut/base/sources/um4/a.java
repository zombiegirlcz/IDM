package um4;

import dj0.d;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f281222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f281223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f281224c;
    public final Integer d;
    public final boolean e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f281225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f281226h;
    public final xw4.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f281227j;

    public a(d totalLimit, d dVar, int i, Integer num, boolean z, d dVar2, d spentMoney, d availableMoney, xw4.a paymentState, boolean z3) {
        Intrinsics.checkNotNullParameter(totalLimit, "totalLimit");
        Intrinsics.checkNotNullParameter(spentMoney, "spentMoney");
        Intrinsics.checkNotNullParameter(availableMoney, "availableMoney");
        Intrinsics.checkNotNullParameter(paymentState, "paymentState");
        this.f281222a = totalLimit;
        this.f281223b = dVar;
        this.f281224c = i;
        this.d = num;
        this.e = z;
        this.f = dVar2;
        this.f281225g = spentMoney;
        this.f281226h = availableMoney;
        this.i = paymentState;
        this.f281227j = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f281222a, aVar.f281222a) && Intrinsics.f(this.f281223b, aVar.f281223b) && this.f281224c == aVar.f281224c && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f281225g, aVar.f281225g) && Intrinsics.f(this.f281226h, aVar.f281226h) && this.i == aVar.i && this.f281227j == aVar.f281227j;
    }

    public final int hashCode() {
        int iHashCode = this.f281222a.hashCode() * 31;
        d dVar = this.f281223b;
        int iB = j6.a.b(this.f281224c, (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31);
        Integer num = this.d;
        int iC = j6.a.c((iB + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
        d dVar2 = this.f;
        return Boolean.hashCode(this.f281227j) + ((this.i.hashCode() + v7.c(v7.c((iC + (dVar2 != null ? dVar2.hashCode() : 0)) * 31, 31, this.f281225g), 31, this.f281226h)) * 31);
    }
}
