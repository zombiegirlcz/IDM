package n5i;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l5i.i;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212597a;

    public /* synthetic */ g(int i) {
        this.f212597a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i;
        int i2;
        switch (this.f212597a) {
            case 0:
                OrderQuote exchanged = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(exchanged, "$this$exchanged");
                return new TextLocalisedClause(R$string.vaults_single_transfer_screen_transfer_breakdown_exchanged_amount, null, null, 14);
            case 1:
                OrderQuote effectiveRate = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(effectiveRate, "$this$effectiveRate");
                return i.b.f192282a;
            case 2:
                ChargeEntry it8 = (ChargeEntry) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new r5i.b(it8);
            case 3:
                OrderQuote taxes = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(taxes, "$this$taxes");
                return new l5i.o(taxes.f104755g.f104732b);
            case 4:
                ChargeEntry it9 = (ChargeEntry) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new g5i.b(it9);
            case 5:
                OrderQuote fees = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(fees, "$this$fees");
                return new l5i.k(fees.f104755g.f104731a, null);
            case 6:
                OrderQuote fees2 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(fees2, "$this$fees");
                return new l5i.k(fees2.f104755g.f104731a, null);
            case 7:
                OrderQuote estimatedTotal = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(estimatedTotal, "$this$estimatedTotal");
                f8l.b bVar = estimatedTotal.f104752a;
                f8l.b bVar2 = estimatedTotal.f104753b;
                if (bVar == bVar2) {
                    int i3 = m.f212603a[bVar2.ordinal()];
                    if (i3 == 1) {
                        i = R$string.market_data_exchange_breakdown_estimated_total_credit;
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R$string.market_data_exchange_breakdown_estimated_total_cost;
                    }
                } else {
                    i = R$string.market_data_exchange_breakdown_estimated_shares;
                }
                return new TextLocalisedClause(i, null, null, 14);
            case 8:
                OrderQuote exchanged2 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(exchanged2, "$this$exchanged");
                return new TextLocalisedClause(R$string.market_data_exchange_breakdown_traded_value, null, null, 14);
            case 9:
                OrderQuote effectiveRate2 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(effectiveRate2, "$this$effectiveRate");
                return i.b.f192282a;
            case 10:
                OrderQuote amount = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(amount, "$this$amount");
                return new TextLocalisedClause(amount.f104752a == amount.f104753b ? R$string.market_data_exchange_breakdown_shares : R$string.market_data_exchange_breakdown_amount, null, null, 14);
            case 11:
                OrderQuote price = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(price, "$this$price");
                return price.f104757j;
            case 12:
                Intrinsics.checkNotNullParameter((OrderQuote) obj2, "$this$price");
                return new TextLocalisedClause(R$string.market_data_exchange_breakdown_last_available_price, null, null, 14);
            case 13:
                OrderQuote exchanged3 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(exchanged3, "$this$exchanged");
                return new TextLocalisedClause(R$string.market_data_exchange_breakdown_estimated_order_value, null, null, 14);
            case 14:
                OrderQuote fees3 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(fees3, "$this$fees");
                return new l5i.k(fees3.f104755g.f104731a, null);
            case 15:
                Intrinsics.checkNotNullParameter((OrderQuote) obj2, "$this$fees");
                return new TextLocalisedClause(R$string.market_data_exchange_breakdown_estimated_fee, null, null, 14);
            case 16:
                OrderQuote estimatedTotal2 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(estimatedTotal2, "$this$estimatedTotal");
                f8l.b bVar3 = estimatedTotal2.f104752a;
                f8l.b bVar4 = estimatedTotal2.f104753b;
                if (bVar3 == bVar4) {
                    int i5 = o.f212607a[bVar4.ordinal()];
                    if (i5 == 1) {
                        i2 = R$string.market_data_exchange_breakdown_estimated_total_credit;
                    } else {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = R$string.market_data_exchange_breakdown_estimated_total_cost;
                    }
                } else {
                    i2 = R$string.market_data_exchange_breakdown_estimated_shares;
                }
                return new TextLocalisedClause(i2, null, null, 14);
            case 17:
                Intrinsics.checkNotNullParameter((OrderQuote) obj2, "$this$amount");
                return new TextLocalisedClause(R$string.vaults_single_transfer_screen_transfer_breakdown_received_in_vault, null, null, 14);
            case 18:
                OrderQuote price2 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(price2, "$this$price");
                return new l5i.m(price2.e.f104718b, price2.f104754c.f104718b);
            case 19:
                Intrinsics.checkNotNullParameter((OrderQuote) obj2, "$this$price");
                return new TextLocalisedClause(R$string.vaults_single_transfer_screen_transfer_breakdown_exchange_rate, null, null, 14);
            case 20:
                OrderQuote exchanged4 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(exchanged4, "$this$exchanged");
                return new TextLocalisedClause(R$string.vaults_single_transfer_screen_transfer_breakdown_exchanged_amount, null, null, 14);
            case 21:
                OrderQuote taxes2 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(taxes2, "$this$taxes");
                return new l5i.o(taxes2.f104755g.f104732b);
            case 22:
                OrderQuote effectiveRate3 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(effectiveRate3, "$this$effectiveRate");
                return i.b.f192282a;
            case 23:
                Intrinsics.checkNotNullParameter((OrderQuote) obj2, "$this$estimatedTotal");
                return new TextLocalisedClause(R$string.vaults_single_transfer_screen_transfer_breakdown_total_amount, null, null, 14);
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return null;
            case 25:
                CellDetailsDelegate.Model it10 = (CellDetailsDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.o;
            case 26:
                HighlightTileDelegate.Model it11 = (HighlightTileDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f52438a;
            case 27:
                hha.d it12 = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12.f152296p);
            case 28:
                String str = (String) obj2;
                return prk.o.m(str, "it", str, "ID_PRICING_PLAN_UPGRADE_ITEM");
            default:
                CellDetailsActionDelegate.Model it13 = (CellDetailsActionDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f51787l;
        }
    }
}
