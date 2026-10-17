package fce;

import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.dialog.SubscriptionDetailsDialogControllerContract$SubscriptionOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f133717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SubscriptionDetailsDialogControllerContract$SubscriptionOwner f133718b;

    public s(qua.p subscription, SubscriptionDetailsDialogControllerContract$SubscriptionOwner subscriptionOwner) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(subscriptionOwner, "subscriptionOwner");
        this.f133717a = subscription;
        this.f133718b = subscriptionOwner;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f133717a, sVar.f133717a) && Intrinsics.f(this.f133718b, sVar.f133718b);
    }

    public final int hashCode() {
        return this.f133718b.hashCode() + (this.f133717a.hashCode() * 31);
    }
}
