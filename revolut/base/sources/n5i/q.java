package n5i;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.api.PaymentsToggles$PaymentsChargesMigration;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.feature_market_data_api.models.OrderQuoteExtraData;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements l5i.h, s5i.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5i.k f212610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s5i.b f212611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f212612c;

    public q(s5i.k helper, s5i.b amountDisplayer, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(amountDisplayer, "amountDisplayer");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f212610a = helper;
        this.f212611b = amountDisplayer;
        this.f212612c = featureToggleInteractor;
    }

    @Override // s5i.h
    public final qv0.i e(OrderQuote orderQuote, Function1 parcel, Function1 cellTitle, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return this.f212610a.e(orderQuote, parcel, cellTitle, bVar);
    }

    @Override // d4i.i
    public final List j(OrderQuote orderQuote, d4i.h itemsConfig, OrderQuoteExtraData orderQuoteExtraData) {
        qv0.i model;
        qv0.i iVarH;
        qv0.i iVarC;
        Intrinsics.checkNotNullParameter(orderQuote, "quote");
        Intrinsics.checkNotNullParameter(itemsConfig, "itemsConfig");
        qv0.i[] elements = new qv0.i[7];
        g cellTitle = new g(17);
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        elements[0] = this.f212610a.a(orderQuote, cellTitle);
        elements[1] = s5i.h.m(this, orderQuote, false, new g(18), new g(19), 2);
        g cellTitle2 = new g(20);
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(cellTitle2, "cellTitle");
        elements[2] = this.f212610a.f(orderQuote, cellTitle2);
        Charges charges = orderQuote.f104755g;
        ChargeBreakdown chargeBreakdown = charges.f104731a;
        ChargeBreakdown chargeBreakdown2 = charges.f104731a;
        if (chargeBreakdown.f104723b.isEmpty()) {
            model = new CellDetailsDelegate.Model("breakdown.fee", new TextLocalisedClause(R$string.donations_one_off_transfer_transfer_breakdown_exchange_fee, null, null, 14), new TextLocalisedClause(R$string.market_data_transfer_breakdown_exchange_no_fee, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        } else {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.donations_one_off_transfer_transfer_breakdown_exchange_fee, null, null, 14);
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
            Clause clauseA = this.f212611b.a(chargeBreakdown2.f104722a);
            Intrinsics.checkNotNullParameter(orderQuote, "$this$customFees");
            model = new CellDetailsActionDelegate.Model("breakdown.fee", textLocalisedClause, 0, resourceImage, clauseA, false, false, null, new l5i.k(chargeBreakdown2, null), 0, 0, 32224);
        }
        elements[3] = model;
        if (((jte.d) this.f212612c).c(PaymentsToggles$PaymentsChargesMigration.f79158c)) {
            g parcel = new g(21);
            Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            s5i.g cellTitle3 = s5i.g.f260089a;
            Intrinsics.checkNotNullParameter(cellTitle3, "cellTitle");
            iVarH = this.f212610a.h(orderQuote, parcel, cellTitle3);
        } else {
            iVarH = null;
        }
        elements[4] = iVarH;
        if (itemsConfig.f111333a) {
            g gVar = new g(22);
            Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
            iVarC = this.f212610a.c(orderQuote, gVar);
        } else {
            iVarC = null;
        }
        elements[5] = iVarC;
        g cellTitle4 = new g(23);
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(cellTitle4, "cellTitle");
        elements[6] = this.f212610a.d(orderQuote, null, cellTitle4);
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, R$attr.uikit_dp24, 0, 0, 29);
        return listL;
    }

    @Override // l5i.h
    public final TextLocalisedClause n(OrderQuote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        return new TextLocalisedClause(R$string.vaults_single_transfer_screen_transfer_breakdown_title, null, null, 14);
    }

    @Override // s5i.h
    public final qv0.i o(OrderQuote orderQuote, boolean z, Function1 parcel, Function1 cellTitle) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return this.f212610a.o(orderQuote, z, parcel, cellTitle);
    }
}
