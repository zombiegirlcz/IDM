package n4d;

import android.net.Uri;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import ip0.l90;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l5i.i;
import qv0.c;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212354a;

    public /* synthetic */ d0(int i) {
        this.f212354a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        switch (this.f212354a) {
            case 0:
                FavouritesAssetTypeKey it8 = (FavouritesAssetTypeKey) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f86866a;
            case 1:
                FavouritesAssetTypeKey it9 = (FavouritesAssetTypeKey) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f86866a;
            case 2:
                FavouritesAssetTypeKey it10 = (FavouritesAssetTypeKey) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f86866a;
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                Intrinsics.checkNotNullParameter("LIST_ID_RATE_ONE_CLICK", "listId");
                int i = R$attr.uikit_dp0;
                l90 l90Var = new l90();
                l90Var.f165146a = c.d.f249513a;
                l90Var.f165147b = null;
                l90Var.f165148c = null;
                l90Var.d = null;
                l90Var.e = null;
                l90Var.f = i;
                l90Var.f165149g = i;
                l90Var.f165150h = i;
                l90Var.i = i;
                return zhm.u.c(l90Var);
            case 4:
                String it11 = (String) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new n52.b(it11);
            case 5:
                xo9.f result = (xo9.f) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof xo9.a) {
                    Uri uri2 = Uri.parse(((xo9.a) result).f307736a);
                    Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
                    return new BrowserCommand(uri2);
                }
                if (result instanceof xo9.l) {
                    throw new IllegalStateException("Expected QR code with Redirect URL, got a Structured QR code instead");
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                return r6.b.g(null, null, null, 7, command);
            case 7:
                OrderQuote amount = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(amount, "$this$amount");
                return new TextLocalisedClause(R$string.bill_accounts_one_off_transfer_transfer_breakdown_received_in_pocket, null, null, 14);
            case 8:
                OrderQuote price = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(price, "$this$price");
                return new l5i.m(price.e.f104718b, price.f104754c.f104718b);
            case 9:
                Intrinsics.checkNotNullParameter((OrderQuote) obj2, "$this$price");
                return new TextLocalisedClause(R$string.vaults_single_transfer_screen_transfer_breakdown_exchange_rate, null, null, 14);
            case 10:
                OrderQuote exchanged = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(exchanged, "$this$exchanged");
                return new TextLocalisedClause(R$string.vaults_single_transfer_screen_transfer_breakdown_exchanged_amount, null, null, 14);
            case 11:
                OrderQuote effectiveRate = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(effectiveRate, "$this$effectiveRate");
                return i.b.f192282a;
            case 12:
                OrderQuote estimatedTotal = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(estimatedTotal, "$this$estimatedTotal");
                return new TextLocalisedClause(R$string.vaults_single_transfer_screen_transfer_breakdown_total_amount, null, null, 14);
            case 13:
                OrderQuote taxes = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(taxes, "$this$taxes");
                return new l5i.o(taxes.f104755g.f104732b);
            case 14:
                OrderQuote effectiveRate2 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(effectiveRate2, "$this$effectiveRate");
                return i.b.f192282a;
            case 15:
                OrderQuote amount2 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(amount2, "$this$amount");
                return new TextLocalisedClause(R$string.market_data_transaction_breakdown_received, null, null, 14);
            case 16:
                OrderQuote fees = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(fees, "$this$fees");
                ChargeEntry chargeEntry = (ChargeEntry) zhm.d0.M0(fees.f104755g.f104731a.f104723b);
                if (chargeEntry != null && (str = chargeEntry.f104725a) != null) {
                    String str2 = str.length() > 0 ? str : null;
                    if (str2 != null) {
                        return new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    }
                }
                return new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.market_data_transaction_breakdown_fees, null, null, 14);
            case 17:
                OrderQuote taxes2 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(taxes2, "$this$taxes");
                return new l5i.o(taxes2.f104755g.f104732b);
            case 18:
                OrderQuote estimatedTotal2 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(estimatedTotal2, "$this$estimatedTotal");
                return new TextLocalisedClause(R$string.move_money_review_your_total, null, null, 14);
            case 19:
                OrderQuote amount3 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(amount3, "$this$amount");
                return new TextLocalisedClause(R$string.market_data_transaction_breakdown_received, null, null, 14);
            case 20:
                OrderQuote exchanged2 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(exchanged2, "$this$exchanged");
                return new TextLocalisedClause(R$string.market_data_transaction_breakdown_exchanged, null, null, 14);
            case 21:
                OrderQuote effectiveRate3 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(effectiveRate3, "$this$effectiveRate");
                return i.b.f192282a;
            case 22:
                OrderQuote estimatedTotal3 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(estimatedTotal3, "$this$estimatedTotal");
                int i2 = n5i.e.f212593a[estimatedTotal3.f104752a.ordinal()];
                if (i2 == 1) {
                    return new TextLocalisedClause(R$string.market_data_exchange_breakdown_estimated_total_proceeds, null, null, 14);
                }
                if (i2 == 2) {
                    return new TextLocalisedClause(R$string.market_data_exchange_breakdown_estimated_total_cost, null, null, 14);
                }
                throw new NoWhenBranchMatchedException();
            case 23:
                OrderQuote taxes3 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(taxes3, "$this$taxes");
                return new l5i.o(taxes3.f104755g.f104732b);
            case 24:
                OrderQuote amount4 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(amount4, "$this$amount");
                return new TextLocalisedClause(R$string.market_data_transaction_breakdown_received, null, null, 14);
            case 25:
                Intrinsics.checkNotNullParameter((OrderQuote) obj2, "$this$fees");
                return new TextLocalisedClause(R$string.move_money_review_credit_transfer_comission, null, null, 14);
            case 26:
                OrderQuote estimatedTotal4 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(estimatedTotal4, "$this$estimatedTotal");
                return new TextLocalisedClause(R$string.move_money_review_your_total, null, null, 14);
            case 27:
                OrderQuote amount5 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(amount5, "$this$amount");
                return new TextLocalisedClause(R$string.vaults_single_transfer_screen_transfer_breakdown_total_amount, null, null, 14);
            case 28:
                OrderQuote price2 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(price2, "$this$price");
                return new l5i.m(price2.f104754c.f104718b, price2.e.f104718b);
            default:
                Intrinsics.checkNotNullParameter((OrderQuote) obj2, "$this$price");
                return new TextLocalisedClause(R$string.vaults_single_transfer_screen_transfer_breakdown_exchange_rate, null, null, 14);
        }
    }

    public /* synthetic */ d0(lal.a aVar) {
        this.f212354a = 16;
    }
}
