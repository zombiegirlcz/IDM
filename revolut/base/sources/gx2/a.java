package gx2;

import androidx.compose.runtime.tooling.CompositionErrorContextKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.timer.TimerDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.breakdown.details.BreakdownDetailsController;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.consent.confirmation.ApmConfirmationScreen;
import com.revolut.feature.card_contactless_limit.impl.ui.mvp.RevolutCardResetScaActivity;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_to_form.DeliveryToFormController;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser.ChooserScreen;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.RenewalDetailsActivity;
import com.revolut.feature.invest_feed.impl.widgets.analytics.screen.AnalyticsMethodScreen;
import com.revolut.feature.selfserve.sow.impl.ui.summary.SowSummaryFragment;
import h04.a;
import h26.j;
import h26.k;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147616a;

    public /* synthetic */ a(int i) {
        this.f147616a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 7;
        switch (this.f147616a) {
            case 0:
                KProperty[] kPropertyArr = RevolutCardResetScaActivity.A0;
                return new z4l.j(i, zhm.u.c(new ProgressDelegate()), false);
            case 1:
                return hyl.l.Companion.serializer();
            case 2:
                return new qlm.e(v1.f247718a);
            case 3:
                return new qlm.e(gyl.d.f147921a);
            case 4:
                return new qlm.e(hyl.j.Companion.serializer());
            case 5:
                return new qlm.e(gyl.f.f147922a);
            case 6:
                int i2 = RenewalDetailsActivity.B0;
                return new ListSubheaderDelegate();
            case 7:
                int i3 = RenewalDetailsActivity.B0;
                return new RowDelegate(null, null, 7);
            case 8:
                int i5 = RenewalDetailsActivity.B0;
                return new LargeActionButtonDelegate();
            case 9:
                int i6 = RenewalDetailsActivity.B0;
                return new CellDetailsSwitcherDelegate();
            case 10:
                a.b bVar = h04.a.Companion;
                return new qlm.e(v1.f247718a);
            case 11:
                int i21 = SowSummaryFragment.g0;
                return new RowDelegate(null, null, 7);
            case 12:
                return new qlm.e(v1.f247718a);
            case 13:
                return new qlm.e(v1.f247718a);
            case 14:
                return new qlm.e(h0k.a.f148418a);
            case 15:
                return j1.b("com.revolut.feature.lifestyle.content_gateway.api.model.home.LifestyleHomeProduct.Type", h19.c.values());
            case 16:
                return new qlm.e(h19.a.f148478a);
            case 17:
                return CompositionErrorContextKt.LocalCompositionErrorContext$lambda$0();
            case 18:
                return InspectionTablesKt.LocalInspectionTables$lambda$0();
            case 19:
                int i22 = BreakdownDetailsController.V;
                return new CellDetailsDelegate();
            case 20:
                int i32 = BreakdownDetailsController.V;
                return new CellDetailsActionDelegate();
            case 21:
                return new qlm.e(h26.a.f148710a);
            case 22:
                return new qlm.e(v1.f247718a);
            case 23:
                k.Companion companion = h26.k.INSTANCE;
                return new qlm.e(j.a.f148726a);
            case 24:
                KProperty[] kPropertyArr2 = AnalyticsMethodScreen.R;
                return new RowDelegate(null, null, 7);
            case 25:
                return new qlm.e(h29.a.f148741a);
            case 26:
                KProperty[] kPropertyArr3 = ApmConfirmationScreen.R;
                return new RowDelegate(null, null, 7);
            case 27:
                KProperty[] kPropertyArr4 = ApmConfirmationScreen.R;
                return new TimerDelegate();
            case 28:
                KProperty[] kPropertyArr5 = DeliveryToFormController.R;
                return new InputTextDelegate(null);
            default:
                KProperty[] kPropertyArr6 = ChooserScreen.Z;
                return new LargeActionButtonDelegate();
        }
    }
}
