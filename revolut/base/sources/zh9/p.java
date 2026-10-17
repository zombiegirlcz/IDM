package zh9;

import ip0.v7;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f322316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f322317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f322318c;
    public final dj0.d d;
    public final o e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f322319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f322320h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj0.d f322321j;
    public final dj0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f322322l;

    public p(int i, DateTime dueDate, dj0.d amount, dj0.d fee2, o state, DateTime dateTime, Set transactionIds, dj0.d repaidFee, dj0.d repaidAmount, dj0.d lateInterest, dj0.d repaidLateInterest, boolean z) {
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        Intrinsics.checkNotNullParameter(repaidFee, "repaidFee");
        Intrinsics.checkNotNullParameter(repaidAmount, "repaidAmount");
        Intrinsics.checkNotNullParameter(lateInterest, "lateInterest");
        Intrinsics.checkNotNullParameter(repaidLateInterest, "repaidLateInterest");
        this.f322316a = i;
        this.f322317b = dueDate;
        this.f322318c = amount;
        this.d = fee2;
        this.e = state;
        this.f = dateTime;
        this.f322319g = transactionIds;
        this.f322320h = repaidFee;
        this.i = repaidAmount;
        this.f322321j = lateInterest;
        this.k = repaidLateInterest;
        this.f322322l = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f322316a == pVar.f322316a && Intrinsics.f(this.f322317b, pVar.f322317b) && Intrinsics.f(this.f322318c, pVar.f322318c) && Intrinsics.f(this.d, pVar.d) && this.e == pVar.e && Intrinsics.f(this.f, pVar.f) && Intrinsics.f(this.f322319g, pVar.f322319g) && Intrinsics.f(this.f322320h, pVar.f322320h) && Intrinsics.f(this.i, pVar.i) && Intrinsics.f(this.f322321j, pVar.f322321j) && Intrinsics.f(this.k, pVar.k) && this.f322322l == pVar.f322322l;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + v7.c(v7.c(m72.b.f(this.f322317b, Integer.hashCode(this.f322316a) * 31, 31), 31, this.f322318c), 31, this.d)) * 31;
        DateTime dateTime = this.f;
        return Boolean.hashCode(this.f322322l) + v7.c(v7.c(v7.c(v7.c(p.a.f((iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31, 31, this.f322319g), 31, this.f322320h), 31, this.i), 31, this.f322321j), 31, this.k);
    }
}
