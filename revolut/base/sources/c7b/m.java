package c7b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsPlan f21901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CobrandedCardsCardConfiguration f21902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CobrandedCardsCardConfiguration f21903c;

    public m(CobrandedCardsPlan plan, CobrandedCardsCardConfiguration physicalCardConfiguration, CobrandedCardsCardConfiguration virtualCardConfiguration) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(physicalCardConfiguration, "physicalCardConfiguration");
        Intrinsics.checkNotNullParameter(virtualCardConfiguration, "virtualCardConfiguration");
        this.f21901a = plan;
        this.f21902b = physicalCardConfiguration;
        this.f21903c = virtualCardConfiguration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f21901a, mVar.f21901a) && Intrinsics.f(this.f21902b, mVar.f21902b) && Intrinsics.f(this.f21903c, mVar.f21903c);
    }

    public final int hashCode() {
        return this.f21903c.hashCode() + ((this.f21902b.hashCode() + (this.f21901a.hashCode() * 31)) * 31);
    }
}
