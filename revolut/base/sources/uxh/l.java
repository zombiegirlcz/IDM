package uxh;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature_market_data_api.navigation.HistoricFeeBreakdownFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import grl.k9;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l extends m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u2i.d f284013l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mre.c f284014m;

    public l(u2i.d cryptoOrderPriceDialogFactory, mre.c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(cryptoOrderPriceDialogFactory, "cryptoOrderPriceDialogFactory");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.f284013l = cryptoOrderPriceDialogFactory;
        this.f284014m = termsNavigationFactory;
    }

    @Override // uxh.m
    public final void Z2(CellDetailsActionDelegate.Model model) {
        n0i.a cryptoPriceDialogData;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.f51787l;
        String str = model.f51781a;
        ActionsBottomSheetController actionsBottomSheetController = null;
        actionsBottomSheetController = null;
        if (Intrinsics.f(str, "breakdown.fee")) {
            ChargeBreakdown chargeBreakdown = obj2 instanceof ChargeBreakdown ? (ChargeBreakdown) obj2 : null;
            String strB3 = b3();
            if (strB3 == null) {
                return;
            }
            A2(u0.c(new HistoricFeeBreakdownFeatureConfig(chargeBreakdown, strB3, (z3i.b) null, (xi0.b) null, e3(), d3(), c4i.a.EXCHANGE, (AnalyticsProduct.Retail) null, 396)));
            return;
        }
        if (!Intrinsics.f(str, "CRYPTO_PRICE_ID") || (cryptoPriceDialogData = c3(obj2)) == null) {
            return;
        }
        this.f284013l.getClass();
        Intrinsics.checkNotNullParameter(cryptoPriceDialogData, "cryptoPriceDialogData");
        Pair pairC = u2i.d.c(cryptoPriceDialogData);
        Integer num = (Integer) pairC.f186385a;
        TextLocalisedClause textLocalisedClause = (TextLocalisedClause) pairC.f186386b;
        if (num != null && textLocalisedClause != null) {
            lw0.a aVar = new lw0.a(new TextLocalisedClause(num.intValue(), null, null, 14), textLocalisedClause, null, null, false, 28);
            aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_alert_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
            k9 k9Var = k9.Crypto;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        }
        if (actionsBottomSheetController != null) {
            N2(actionsBottomSheetController, ModalDestination.Style.BOTTOM_DIALOG.f98301a, new uu9.b(this, 9));
        }
    }

    public abstract String b3();

    public abstract n0i.a c3(Object obj2);

    public abstract boolean d3();

    public abstract boolean e3();
}
