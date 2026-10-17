package pfh;

import android.os.Parcelable;
import aw0.e;
import aw0.n6;
import bfl.g;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.wealth.private_equity.common.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import java.time.Instant;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public final ActionsBottomSheetController a(Instant cancellationDeadline) {
        Intrinsics.checkNotNullParameter(cancellationDeadline, "cancellationDeadline");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_orders_dialog_cancellation_deadline_title, null, null, 14);
        int i = R$string.wealth_trading_orders_dialog_cancellation_deadline_description_with_time;
        long epochMilli = cancellationDeadline.toEpochMilli();
        TimeClause.Format.INSTANCE.getClass();
        lw0.a aVar = new lw0.a(textLocalisedClause, new TextLocalisedClause(i, v.k(new TimeClause(epochMilli, TimeClause.Format.f57959a, null, null, 12), new TimeClause(cancellationDeadline.toEpochMilli(), TimeClause.Format.TimeDefault.f57977b, null, null, 12)), null, 12), null, null, false, 28);
        e eVar = new e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }

    public final ActionsBottomSheetController b(g tradeSide) {
        int i;
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_orders_dialog_fund_settlement_date_title, null, null, 14);
        int i2 = a.f235591a[tradeSide.ordinal()];
        if (i2 == 1) {
            i = R$string.wealth_trading_orders_dialog_fund_buy_settlement_date_description;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_trading_orders_dialog_fund_settlement_date_description;
        }
        lw0.a aVar = new lw0.a(textLocalisedClause, new TextLocalisedClause(i, null, null, 14), null, null, false, 28);
        e eVar = new e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }
}
