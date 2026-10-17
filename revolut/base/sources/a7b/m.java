package a7b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsPlan f1823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CobrandedCardsCardConfiguration f1824b;

    public m(CobrandedCardsPlan plan) {
        CobrandedCardsCardConfiguration cardConfiguration = plan.f82308h;
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(cardConfiguration, "cardConfiguration");
        this.f1823a = plan;
        this.f1824b = cardConfiguration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f1823a, mVar.f1823a) && Intrinsics.f(this.f1824b, mVar.f1824b);
    }

    public final int hashCode() {
        return this.f1824b.hashCode() + (this.f1823a.hashCode() * 31);
    }
}
