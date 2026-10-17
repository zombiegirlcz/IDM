package a7b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CobrandedCardsPlan f1825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CobrandedCardsCardConfiguration f1826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CobrandedCardsCardConfiguration f1827c;

    public n(CobrandedCardsPlan plan, CobrandedCardsCardConfiguration physicalCardConfiguration, CobrandedCardsCardConfiguration virtualCardConfiguration) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(physicalCardConfiguration, "physicalCardConfiguration");
        Intrinsics.checkNotNullParameter(virtualCardConfiguration, "virtualCardConfiguration");
        this.f1825a = plan;
        this.f1826b = physicalCardConfiguration;
        this.f1827c = virtualCardConfiguration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f1825a, nVar.f1825a) && Intrinsics.f(this.f1826b, nVar.f1826b) && Intrinsics.f(this.f1827c, nVar.f1827c);
    }

    public final int hashCode() {
        return this.f1827c.hashCode() + ((this.f1826b.hashCode() + (this.f1825a.hashCode() * 31)) * 31);
    }
}
