package cpi;

import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellIncrementDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.transfer_breakdown.TapiTransferBreakdownScreen;
import com.revolut.feature.apm.bizum.impl.ui.registration.intro.BizumRegistrationIntroScreen;
import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collection_details.CryptoCollectionDetailsController;
import com.revolut.feature.kyc.impl.KycActivity;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.payments.send_from_clipboard.impl.ui.selection.SendFromClipboardSelectionScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.AsftCheckoutScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.number_of_travelers_picker.AsftNumberOfTravelersPickerScreen;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_category_budgets.SetCategoryBudgetsScreen;
import com.revolut.sso.impl.ui.signin_sessions_flow.bottom_dialog.SignInSessionsBottomSheet;
import cs7.b;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.d1;
import qlm.j1;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107949a;

    public /* synthetic */ b(int i) {
        this.f107949a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 7;
        NaviCommand naviCommand = null;
        boolean z = false;
        switch (this.f107949a) {
            case 0:
                return (jl0.a) ((kl0.a) kl0.d.Companion.c()).f185259b.get();
            case 1:
                return ((th0.a) th0.l.Companion.c()).f();
            case 2:
                return new qlm.e(cqb.a.f108064a);
            case 3:
                int i2 = SignInSessionsBottomSheet.U;
                return new RowDelegate(null, null, 7);
            case 4:
                BottomExpandableDialogView.Companion aVar = BottomExpandableDialogView.INSTANCE;
                return new ihm.f();
            case 5:
                KProperty[] kPropertyArr = TapiTransferBreakdownScreen.S;
                return new CellDetailsDelegate();
            case 6:
                KProperty[] kPropertyArr2 = TapiTransferBreakdownScreen.S;
                return new CellDetailsActionDelegate();
            case 7:
                b.Companion c0644b = cs7.b.INSTANCE;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_credit.impl.data.dto.claims.ClaimsLayoutDto", p0Var.b(cs7.b.class), new KClass[]{p0Var.b(b.a.class), p0Var.b(b.c.class)}, new KSerializer[]{b.a.C0642a.f108450a, new d1("UNKNOWN", b.c.INSTANCE, new Annotation[]{new cs7.a()})}, new Annotation[]{new cs7.a()});
            case 8:
                return new d1("UNKNOWN", b.c.INSTANCE, new Annotation[]{new cs7.a()});
            case 9:
                KProperty[] kPropertyArr3 = SetCategoryBudgetsScreen.f101550h0;
                return new z4l.j(i, u.c(new TextDelegate()), z);
            case 10:
                KProperty[] kPropertyArr4 = BizumRegistrationIntroScreen.f61592b0;
                return u.c(new FullScreenStateDelegate());
            case 11:
                return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.d, naviCommand, naviCommand, 6)));
            case 12:
                int i3 = KycActivity.B0;
                return new LargeActionButtonDelegate();
            case 13:
                KProperty[] kPropertyArr5 = AsftCheckoutScreen.V;
                return new FullScreenStateDelegate();
            case 14:
                KProperty[] kPropertyArr6 = AsftCheckoutScreen.V;
                return new AttributeSelectorSmallDelegate();
            case 15:
                KProperty[] kPropertyArr7 = AsftCheckoutScreen.V;
                return new CellDetailsDelegate();
            case 16:
                KProperty[] kPropertyArr8 = AsftCheckoutScreen.V;
                return new RowDelegate(null, null, 7);
            case 17:
                KProperty[] kPropertyArr9 = AsftCheckoutScreen.V;
                return new TextDelegate();
            case 18:
                return Unit.f186387a;
            case 19:
                KProperty[] kPropertyArr10 = AsftNumberOfTravelersPickerScreen.R;
                return new CellIncrementDelegate();
            case 20:
                KProperty[] kPropertyArr11 = AsftNumberOfTravelersPickerScreen.R;
                return new FullScreenStateDelegate();
            case 21:
                return j1.a("com.revolut.retail.feature.trading_hours.impl.data.model.TradingSessionDto", cxk.b.values(), new String[]{"PRE_MARKET", "OPEN", "AFTER_MARKET", "CLOSED", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null});
            case 22:
                return cxk.b.Companion.serializer();
            case 23:
                return new qlm.e(cxk.c.f109999a);
            case 24:
                KProperty[] kPropertyArr12 = CryptoCollectionDetailsController.U;
                return new ActionCardDelegate();
            case 25:
                KProperty[] kPropertyArr13 = CryptoCollectionDetailsController.U;
                return new FixedTabsDelegate();
            case 26:
                KProperty[] kPropertyArr14 = CryptoCollectionDetailsController.U;
                return new CellDetailsChevronDelegate();
            case 27:
                KProperty[] kPropertyArr15 = CryptoCollectionDetailsController.U;
                return new RewardsGridDelegate();
            case 28:
                KProperty[] kPropertyArr16 = CryptoCollectionDetailsController.U;
                return new TrendViewDelegate(200L);
            default:
                KProperty[] kPropertyArr17 = SendFromClipboardSelectionScreen.S;
                return new RowDelegate(null, null, 7);
        }
    }
}
