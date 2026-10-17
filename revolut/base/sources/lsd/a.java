package lsd;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f199669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PricingPlanSubscription f199670b;

    public a(d balance, PricingPlanSubscription subscription) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f199669a = balance;
        this.f199670b = subscription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f199669a, aVar.f199669a) && Intrinsics.f(this.f199670b, aVar.f199670b);
    }

    public final int hashCode() {
        return this.f199670b.hashCode() + (this.f199669a.hashCode() * 31);
    }
}
