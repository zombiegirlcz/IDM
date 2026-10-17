package s63;

import com.revolut.data.model.Data;
import com.revolut.feature.card_screen.common.cards.models.CardsStateSnapshot$SubscriptionsContent;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import od0.i;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f260120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f260121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f260122c;
    public final List d;
    public final i e;
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yt8.c f260123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e7l.f f260124h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e93.e f260125j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f260126l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f260127m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CardsStateSnapshot$SubscriptionsContent f260128n;
    public final Data o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f260129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map f260130q;

    public g(boolean z, List cards, List cardsConfigs, List checkoutOrderDetails, i selectedCard, i selectedCardDetails, yt8.c kyc2, e7l.f config, boolean z3, e93.e eVar, List payLaterCardsAvailability, i payLaterProductState, f transactionsContent, CardsStateSnapshot$SubscriptionsContent subscriptionsContent, Data pockets, List disposableCardLimits, Map cardIdToBanner) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(cardsConfigs, "cardsConfigs");
        Intrinsics.checkNotNullParameter(checkoutOrderDetails, "checkoutOrderDetails");
        Intrinsics.checkNotNullParameter(selectedCard, "selectedCard");
        Intrinsics.checkNotNullParameter(selectedCardDetails, "selectedCardDetails");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter("retail_disposable", "disposableCardPlaceholderId");
        Intrinsics.checkNotNullParameter(payLaterCardsAvailability, "payLaterCardsAvailability");
        Intrinsics.checkNotNullParameter(payLaterProductState, "payLaterProductState");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(subscriptionsContent, "subscriptionsContent");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(disposableCardLimits, "disposableCardLimits");
        Intrinsics.checkNotNullParameter(cardIdToBanner, "cardIdToBanner");
        this.f260120a = z;
        this.f260121b = cards;
        this.f260122c = cardsConfigs;
        this.d = checkoutOrderDetails;
        this.e = selectedCard;
        this.f = selectedCardDetails;
        this.f260123g = kyc2;
        this.f260124h = config;
        this.i = z3;
        this.f260125j = eVar;
        this.k = payLaterCardsAvailability;
        this.f260126l = payLaterProductState;
        this.f260127m = transactionsContent;
        this.f260128n = subscriptionsContent;
        this.o = pockets;
        this.f260129p = disposableCardLimits;
        this.f260130q = cardIdToBanner;
    }

    public static g a(g gVar, i selectedCard) {
        boolean z = gVar.f260120a;
        List cards = gVar.f260121b;
        List cardsConfigs = gVar.f260122c;
        List checkoutOrderDetails = gVar.d;
        i selectedCardDetails = gVar.f;
        yt8.c kyc2 = gVar.f260123g;
        e7l.f config = gVar.f260124h;
        boolean z3 = gVar.i;
        e93.e eVar = gVar.f260125j;
        gVar.getClass();
        List payLaterCardsAvailability = gVar.k;
        i payLaterProductState = gVar.f260126l;
        f transactionsContent = gVar.f260127m;
        CardsStateSnapshot$SubscriptionsContent subscriptionsContent = gVar.f260128n;
        Data pockets = gVar.o;
        List disposableCardLimits = gVar.f260129p;
        Map cardIdToBanner = gVar.f260130q;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(cardsConfigs, "cardsConfigs");
        Intrinsics.checkNotNullParameter(checkoutOrderDetails, "checkoutOrderDetails");
        Intrinsics.checkNotNullParameter(selectedCard, "selectedCard");
        Intrinsics.checkNotNullParameter(selectedCardDetails, "selectedCardDetails");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter("retail_disposable", "disposableCardPlaceholderId");
        Intrinsics.checkNotNullParameter(payLaterCardsAvailability, "payLaterCardsAvailability");
        Intrinsics.checkNotNullParameter(payLaterProductState, "payLaterProductState");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(subscriptionsContent, "subscriptionsContent");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(disposableCardLimits, "disposableCardLimits");
        Intrinsics.checkNotNullParameter(cardIdToBanner, "cardIdToBanner");
        return new g(z, cards, cardsConfigs, checkoutOrderDetails, selectedCard, selectedCardDetails, kyc2, config, z3, eVar, payLaterCardsAvailability, payLaterProductState, transactionsContent, subscriptionsContent, pockets, disposableCardLimits, cardIdToBanner);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f260120a == gVar.f260120a && Intrinsics.f(this.f260121b, gVar.f260121b) && Intrinsics.f(this.f260122c, gVar.f260122c) && Intrinsics.f(this.d, gVar.d) && this.e.equals(gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f260123g, gVar.f260123g) && Intrinsics.f(this.f260124h, gVar.f260124h) && this.i == gVar.i && Intrinsics.f(this.f260125j, gVar.f260125j) && Intrinsics.f(this.k, gVar.k) && this.f260126l.equals(gVar.f260126l) && Intrinsics.f(this.f260127m, gVar.f260127m) && Intrinsics.f(this.f260128n, gVar.f260128n) && Intrinsics.f(this.o, gVar.o) && Intrinsics.f(this.f260129p, gVar.f260129p) && Intrinsics.f(this.f260130q, gVar.f260130q);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f260124h.hashCode() + ((this.f260123g.hashCode() + r6.b.f(this.f, r6.b.f(this.e, p.a.d(p.a.d(p.a.d(Boolean.hashCode(this.f260120a) * 31, 31, this.f260121b), 31, this.f260122c), 31, this.d), 31), 31)) * 31)) * 31, 31, this.i);
        e93.e eVar = this.f260125j;
        return this.f260130q.hashCode() + p.a.d(kii.e.c(this.o, (this.f260128n.hashCode() + ((this.f260127m.hashCode() + r6.b.f(this.f260126l, p.a.d((((iC + (eVar == null ? 0 : eVar.hashCode())) * 31) + 1505989148) * 31, 31, this.k), 31)) * 31)) * 31, 31), 31, this.f260129p);
    }
}
