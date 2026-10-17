package x5i;

import com.revolut.feature.exchange.models.ExchangeOrder;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements j8l.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f302992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f302993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f302994c;
    public final ExchangeOrder.Active d;

    public k(l type, dj0.d sourceMoney, dj0.d targetMoney, ExchangeOrder.Active order) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(sourceMoney, "sourceMoney");
        Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
        Intrinsics.checkNotNullParameter(order, "order");
        this.f302992a = type;
        this.f302993b = sourceMoney;
        this.f302994c = targetMoney;
        this.d = order;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f302992a == kVar.f302992a && this.f302993b.equals(kVar.f302993b) && this.f302994c.equals(kVar.f302994c) && this.d.equals(kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(v7.c(this.f302992a.hashCode() * 31, 31, this.f302993b), 31, this.f302994c);
    }
}
