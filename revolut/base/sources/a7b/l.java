package a7b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e93.f f1821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CobrandedCardsCardConfiguration f1822b;

    public l(e93.f cardDesign, CobrandedCardsCardConfiguration cardConfiguration) {
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        Intrinsics.checkNotNullParameter(cardConfiguration, "cardConfiguration");
        this.f1821a = cardDesign;
        this.f1822b = cardConfiguration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f1821a, lVar.f1821a) && Intrinsics.f(this.f1822b, lVar.f1822b);
    }

    public final int hashCode() {
        return this.f1822b.hashCode() + (this.f1821a.hashCode() * 31);
    }
}
