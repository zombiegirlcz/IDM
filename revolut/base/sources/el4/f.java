package el4;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f127255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f127256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f127257c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f127258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f127259h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f127260j;
    public final int k;

    public f(xi0.b currency, dj0.d amountAvailable, dj0.d amountSpent, dj0.d monthlySpendingLimit, dj0.d monthlySpendingLimitMin, dj0.d monthlySpendingLimitMax, dj0.d dVar, dj0.d singlePurchaseLimitMin, dj0.d singlePurchaseLimitMax, boolean z, int i) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(amountAvailable, "amountAvailable");
        Intrinsics.checkNotNullParameter(amountSpent, "amountSpent");
        Intrinsics.checkNotNullParameter(monthlySpendingLimit, "monthlySpendingLimit");
        Intrinsics.checkNotNullParameter(monthlySpendingLimitMin, "monthlySpendingLimitMin");
        Intrinsics.checkNotNullParameter(monthlySpendingLimitMax, "monthlySpendingLimitMax");
        Intrinsics.checkNotNullParameter(singlePurchaseLimitMin, "singlePurchaseLimitMin");
        Intrinsics.checkNotNullParameter(singlePurchaseLimitMax, "singlePurchaseLimitMax");
        this.f127255a = currency;
        this.f127256b = amountAvailable;
        this.f127257c = amountSpent;
        this.d = monthlySpendingLimit;
        this.e = monthlySpendingLimitMin;
        this.f = monthlySpendingLimitMax;
        this.f127258g = dVar;
        this.f127259h = singlePurchaseLimitMin;
        this.i = singlePurchaseLimitMax;
        this.f127260j = z;
        this.k = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f127255a, fVar.f127255a) && Intrinsics.f(this.f127256b, fVar.f127256b) && Intrinsics.f(this.f127257c, fVar.f127257c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f127258g, fVar.f127258g) && Intrinsics.f(this.f127259h, fVar.f127259h) && Intrinsics.f(this.i, fVar.i) && this.f127260j == fVar.f127260j && this.k == fVar.k;
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(v7.c(v7.c(v7.c(this.f127255a.hashCode() * 31, 31, this.f127256b), 31, this.f127257c), 31, this.d), 31, this.e), 31, this.f);
        dj0.d dVar = this.f127258g;
        return Integer.hashCode(this.k) + j6.a.c(v7.c(v7.c((iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f127259h), 31, this.i), 31, this.f127260j);
    }
}
