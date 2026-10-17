package trj;

import dj0.d;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import tof.i3;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3 f273803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f273804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f273805c;
    public final d d;
    public final d e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f273806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f273807h;

    public a(i3 transactionCategory, boolean z, d spentMoney, d plannedMoney, d remainingMoney, d overspentMoney, int i, d remainingMoneyPerDay) {
        Intrinsics.checkNotNullParameter(transactionCategory, "transactionCategory");
        Intrinsics.checkNotNullParameter(spentMoney, "spentMoney");
        Intrinsics.checkNotNullParameter(plannedMoney, "plannedMoney");
        Intrinsics.checkNotNullParameter(remainingMoney, "remainingMoney");
        Intrinsics.checkNotNullParameter(overspentMoney, "overspentMoney");
        Intrinsics.checkNotNullParameter(remainingMoneyPerDay, "remainingMoneyPerDay");
        this.f273803a = transactionCategory;
        this.f273804b = z;
        this.f273805c = spentMoney;
        this.d = plannedMoney;
        this.e = remainingMoney;
        this.f = overspentMoney;
        this.f273806g = i;
        this.f273807h = remainingMoneyPerDay;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f273803a, aVar.f273803a) && this.f273804b == aVar.f273804b && Intrinsics.f(this.f273805c, aVar.f273805c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f273806g == aVar.f273806g && Intrinsics.f(this.f273807h, aVar.f273807h);
    }

    public final int hashCode() {
        return this.f273807h.hashCode() + j6.a.b(this.f273806g, v7.c(v7.c(v7.c(v7.c(j6.a.c(this.f273803a.hashCode() * 31, 31, this.f273804b), 31, this.f273805c), 31, this.d), 31, this.e), 31, this.f), 31);
    }
}
