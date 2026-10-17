package dtl;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.trading.core.domain.orders.InvestCommodityOrder;
import com.revolut.retail.trading.core.domain.orders.InvestFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.trading.orders.R$string;
import dce.s0;
import grl.k9;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.z;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends yji.n implements b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final vrl.g f117481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o f117482m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z1 f117483n;

    public m(vrl.g investOrdersInteractor, o dialogMapper) {
        Intrinsics.checkNotNullParameter(investOrdersInteractor, "investOrdersInteractor");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.f117481l = investOrdersInteractor;
        this.f117482m = dialogMapper;
        this.f117483n = q.b(0, 7, null);
    }

    public static z b3(InvestOrder investOrder) {
        boolean z = investOrder instanceof InvestFundOrder;
        return new z(z ? new TextLocalisedClause(R$string.wealth_order_fund_cancellation_error_title, null, null, 14) : new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.trading_order_error_cancel, null, null, 14), z ? new TextLocalisedClause(R$string.wealth_order_fund_cancellation_error_description, null, null, 14) : null, null, null, null, null, false, null, null, null, null, null, null, 32764);
    }

    public final void Z2(InvestOrder investOrder) {
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        Continuation continuation = null;
        dg4.c block = new dg4.c(this, investOrder, continuation, 12);
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        Intrinsics.checkNotNullParameter(block, "block");
        T2(new s0(this, block, investOrder, continuation, 23), new yi5.b(27));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(com.revolut.retail.trading.core.domain.orders.InvestOrder.InvestSecuritiesOrder r21, dtl.c r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dtl.m.c3(com.revolut.retail.trading.core.domain.orders.InvestOrder$InvestSecuritiesOrder, dtl.c, gim.c):java.lang.Object");
    }

    public final void d3(InvestOrder investOrder) {
        int i;
        TextLocalisedClause textLocalisedClause;
        int i2;
        TextLocalisedClause textLocalisedClause2;
        this.f117482m.getClass();
        Intrinsics.checkNotNullParameter(investOrder, "investOrder");
        int i3 = 1;
        if (investOrder instanceof InvestCommodityOrder) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_order_cancellation_dialog_title, null, null, 14);
        } else if (investOrder instanceof InvestFundOrder) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_order_fund_cancellation_confirmation_dialog_title, null, null, 14);
        } else {
            int i5 = n.f117484a[investOrder.getF104635j().ordinal()];
            if (i5 == 1) {
                i = R$string.wealth_order_cancel_alert_limit_order_title;
            } else if (i5 == 2) {
                i = R$string.wealth_order_cancel_alert_stop_order_title;
            } else if (i5 == 3) {
                i = R$string.wealth_order_cancel_alert_market_order_title;
            } else {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.trading_orders_recurring_cancel_dialog_title;
            }
            textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        }
        if (investOrder instanceof InvestFundOrder) {
            textLocalisedClause2 = null;
        } else {
            int i6 = n.f117484a[investOrder.getF104635j().ordinal()];
            if (i6 == 1) {
                i2 = R$string.wealth_order_cancel_alert_limit_order_message;
            } else if (i6 == 2) {
                i2 = R$string.wealth_order_cancel_alert_stop_order_message;
            } else if (i6 == 3) {
                i2 = R$string.wealth_order_cancel_alert_market_order_message;
            } else {
                if (i6 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$string.trading_orders_recurring_cancel_dialog_info;
            }
            textLocalisedClause2 = new TextLocalisedClause(i2, null, null, 14);
        }
        lw0.a aVar = new lw0.a(textLocalisedClause, textLocalisedClause2, null, null, false, 28);
        aw0.g gVar = new aw0.g(new n6(new TextLocalisedClause(R$string.wealth_order_cancel_alert_negative, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_order_cancel_alert_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        N2(new ActionsBottomSheetController(new dii.a(aVar, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new h(this, investOrder, i3));
    }
}
