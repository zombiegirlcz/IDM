package n5i;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.api.PaymentsToggles$PaymentsChargesMigration;
import com.revolut.feature_market_data_api.models.OrderQuoteExtraData;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.v9;
import n4d.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements l5i.h, s5i.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5i.k f212594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f212595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aoa.k f212596c;

    public f(s5i.k helper, gte.a featureToggleInteractor, aoa.k exchangeTitleProvider) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(exchangeTitleProvider, "exchangeTitleProvider");
        this.f212594a = helper;
        this.f212595b = featureToggleInteractor;
        this.f212596c = exchangeTitleProvider;
    }

    public final qv0.i b(OrderQuote orderQuote, Function1 cellTitle) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return this.f212594a.a(orderQuote, cellTitle);
    }

    public final qv0.i c(OrderQuote orderQuote, dj0.d dVar, Function1 cellTitle) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return this.f212594a.d(orderQuote, dVar, cellTitle);
    }

    public final qv0.i d(OrderQuote orderQuote, Function1 parcel, Function1 cellTitle) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return this.f212594a.h(orderQuote, parcel, cellTitle);
    }

    @Override // s5i.h
    public final qv0.i e(OrderQuote orderQuote, Function1 parcel, Function1 cellTitle, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return this.f212594a.e(orderQuote, parcel, cellTitle, bVar);
    }

    @Override // d4i.i
    public final List j(OrderQuote orderQuote, d4i.h itemsConfig, OrderQuoteExtraData orderQuoteExtraData) {
        qv0.i iVarC;
        Intrinsics.checkNotNullParameter(orderQuote, "quote");
        Intrinsics.checkNotNullParameter(itemsConfig, "itemsConfig");
        boolean z = orderQuoteExtraData instanceof OrderQuoteExtraData.CreditCardQuoteExtraData;
        int i = 23;
        s5i.g gVar = s5i.g.f260089a;
        gte.a aVar = this.f212595b;
        if (z && ((OrderQuoteExtraData.CreditCardQuoteExtraData) orderQuoteExtraData).f97008a) {
            qv0.i[] elements = {b(orderQuote, new d0(24)), e(orderQuote, new b(itemsConfig, 2), new d0(25), itemsConfig.f111335c), ((jte.d) aVar).c(PaymentsToggles$PaymentsChargesMigration.f79158c) ? d(orderQuote, new d0(i), gVar) : null, c(orderQuote, null, new d0(26))};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, R$attr.uikit_dp24, 0, 0, 29);
            return listL;
        }
        qv0.i iVarB = b(orderQuote, new d0(19));
        qv0.i iVarM = s5i.h.m(this, orderQuote, itemsConfig.e, new v9(1, this, f.class, "createPricePayload", "createPricePayload(Lcom/revolut/shared/feature/market_data/models/domain/models/OrderQuote;)Lcom/revolut/feature_market_data_impl/ui/delegates/transactionbreakdown/TransactionBreakdownDelegateContract$Payload;", 0, 18), null, 8);
        d0 cellTitle = new d0(20);
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        s5i.k kVar = this.f212594a;
        qv0.i iVarF = kVar.f(orderQuote, cellTitle);
        qv0.i iVarL = s5i.h.l(this, orderQuote, new b(itemsConfig, 1), null, itemsConfig.f111335c, 4);
        qv0.i iVarD = ((jte.d) aVar).c(PaymentsToggles$PaymentsChargesMigration.f79158c) ? d(orderQuote, new d0(i), gVar) : null;
        if (itemsConfig.f111333a) {
            d0 d0Var = new d0(21);
            Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
            iVarC = kVar.c(orderQuote, d0Var);
        } else {
            iVarC = null;
        }
        qv0.i[] elements2 = {iVarB, iVarM, iVarF, iVarL, iVarD, iVarC, c(orderQuote, null, new d0(22))};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        List listL2 = kotlin.collections.d.L(elements2);
        yp0.b.k(listL2, 0, R$attr.uikit_dp24, 0, 0, 29);
        return listL2;
    }

    @Override // l5i.h
    public final TextLocalisedClause n(OrderQuote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        return this.f212596c.a(quote);
    }

    @Override // s5i.h
    public final qv0.i o(OrderQuote orderQuote, boolean z, Function1 parcel, Function1 cellTitle) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return this.f212594a.o(orderQuote, z, parcel, cellTitle);
    }
}
