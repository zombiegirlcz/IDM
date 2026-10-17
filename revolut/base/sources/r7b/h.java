package r7b;

import com.revolut.data.model.Data;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsUpsellBanner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f252066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CobrandedCardsUpsellBanner f252067b;

    public h(Data transactionsContentData, CobrandedCardsUpsellBanner cobrandedCardsUpsellBanner) {
        Intrinsics.checkNotNullParameter(transactionsContentData, "transactionsContentData");
        this.f252066a = transactionsContentData;
        this.f252067b = cobrandedCardsUpsellBanner;
    }

    public static h a(h hVar, Data transactionsContentData, int i) {
        if ((i & 1) != 0) {
            transactionsContentData = hVar.f252066a;
        }
        CobrandedCardsUpsellBanner cobrandedCardsUpsellBanner = (i & 2) != 0 ? hVar.f252067b : null;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(transactionsContentData, "transactionsContentData");
        return new h(transactionsContentData, cobrandedCardsUpsellBanner);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f252066a, hVar.f252066a) && Intrinsics.f(this.f252067b, hVar.f252067b);
    }

    public final int hashCode() {
        int iHashCode = this.f252066a.hashCode() * 31;
        CobrandedCardsUpsellBanner cobrandedCardsUpsellBanner = this.f252067b;
        return iHashCode + (cobrandedCardsUpsellBanner == null ? 0 : cobrandedCardsUpsellBanner.hashCode());
    }
}
