package o83;

import com.revolut.feature.card_screen.common.cards.models.CardsStateSnapshot$SubscriptionsContent;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardsStateSnapshot$SubscriptionsContent f222915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f222916b;

    public f(CardsStateSnapshot$SubscriptionsContent subscriptions, q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        this.f222915a = subscriptions;
        this.f222916b = transactionsExtraData;
    }

    public static f a(f fVar, CardsStateSnapshot$SubscriptionsContent subscriptions, q transactionsExtraData, int i) {
        if ((i & 1) != 0) {
            subscriptions = fVar.f222915a;
        }
        if ((i & 2) != 0) {
            transactionsExtraData = fVar.f222916b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        return new f(subscriptions, transactionsExtraData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f222915a, fVar.f222915a) && Intrinsics.f(this.f222916b, fVar.f222916b);
    }

    public final int hashCode() {
        return this.f222916b.hashCode() + (this.f222915a.hashCode() * 31);
    }
}
