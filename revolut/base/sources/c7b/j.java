package c7b;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e93.f f21896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CobrandedCardsCardConfiguration f21897b;

    public j(e93.f cardDesign, CobrandedCardsCardConfiguration cardConfiguration) {
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        Intrinsics.checkNotNullParameter(cardConfiguration, "cardConfiguration");
        this.f21896a = cardDesign;
        this.f21897b = cardConfiguration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f21896a, jVar.f21896a) && Intrinsics.f(this.f21897b, jVar.f21897b);
    }

    public final int hashCode() {
        return this.f21897b.hashCode() + (this.f21896a.hashCode() * 31);
    }
}
