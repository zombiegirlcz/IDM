package c7b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsPlan f21899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CobrandedCardsCardConfiguration f21900b;

    public l(CobrandedCardsPlan plan, CobrandedCardsCardConfiguration cardConfiguration) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(cardConfiguration, "cardConfiguration");
        this.f21899a = plan;
        this.f21900b = cardConfiguration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f21899a, lVar.f21899a) && Intrinsics.f(this.f21900b, lVar.f21900b);
    }

    public final int hashCode() {
        return this.f21900b.hashCode() + (this.f21899a.hashCode() * 31);
    }
}
