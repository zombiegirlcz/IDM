package n5i;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.feature_market_data_api.models.OrderQuoteExtraData;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l5i.i;
import n4d.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements l5i.h, s5i.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5i.k f212599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s5i.b f212600b;

    public i(s5i.k helper, s5i.b amountDisplayer) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(amountDisplayer, "amountDisplayer");
        this.f212599a = helper;
        this.f212600b = amountDisplayer;
    }

    @Override // s5i.h
    public final qv0.i e(OrderQuote orderQuote, Function1 parcel, Function1 cellTitle, xi0.b bVar) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        return this.f212599a.e(orderQuote, parcel, cellTitle, bVar);
    }

    @Override // d4i.i
    public final List j(OrderQuote charityAmount, d4i.h itemsConfig, OrderQuoteExtraData orderQuoteExtraData) {
        qv0.i iVarC;
        Amount amount;
        Intrinsics.checkNotNullParameter(charityAmount, "quote");
        Intrinsics.checkNotNullParameter(itemsConfig, "itemsConfig");
        d0 cellTitle = new d0(27);
        Intrinsics.checkNotNullParameter(charityAmount, "orderQuote");
        Intrinsics.checkNotNullParameter(cellTitle, "cellTitle");
        s5i.k kVar = this.f212599a;
        qv0.i iVarA = kVar.a(charityAmount, cellTitle);
        qv0.i iVarM = s5i.h.m(this, charityAmount, false, new d0(28), new d0(29), 2);
        g cellTitle2 = new g(0);
        Intrinsics.checkNotNullParameter(charityAmount, "orderQuote");
        Intrinsics.checkNotNullParameter(cellTitle2, "cellTitle");
        qv0.i iVarF = kVar.f(charityAmount, cellTitle2);
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("breakdown.fee", new TextLocalisedClause(R$string.donations_one_off_transfer_transfer_breakdown_exchange_fee, null, null, 14), new TextLocalisedClause(R$string.market_data_transfer_breakdown_exchange_no_fee, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        int i = 1;
        if (itemsConfig.f111333a) {
            g gVar = new g(i);
            Intrinsics.checkNotNullParameter(charityAmount, "orderQuote");
            iVarC = kVar.c(charityAmount, gVar);
        } else {
            iVarC = null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.donations_one_off_transfer_transfer_breakdown_charity_gets, null, null, 14);
        int i2 = h.f212598a[charityAmount.f104752a.ordinal()];
        if (i2 == 1) {
            amount = charityAmount.e;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            amount = charityAmount.f104754c;
        }
        if (amount == null) {
            throw new IllegalStateException("Missing estimated total");
        }
        Clause clauseA = this.f212600b.a(amount);
        int i3 = R$drawable.uikit_icn_16_info_outline;
        Intrinsics.checkNotNullParameter(charityAmount, "$this$charityAmount");
        qv0.i[] elements = {iVarA, iVarM, iVarF, model, iVarC, new CellDetailsDelegate.Model("breakdown.charity_amount", textLocalisedClause, clauseA, i3, i.a.f192281a, null, null, null, null, false, 0, 0, 32736)};
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
        return this.f212599a.o(orderQuote, z, parcel, cellTitle);
    }
}
