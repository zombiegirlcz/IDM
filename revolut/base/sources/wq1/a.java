package wq1;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.delegates.timer.TimerDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.pagopa.impl.ui.bill_input.PagoPABillInputScreen;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.amount.TapiTransferAmountScreen;
import com.revolut.feature.card_design.impl.card_design.local_global_card_info.LocalGlobalCardInfoController;
import com.revolut.feature.credit.card.impl.ui.overdue_explainer.CreditCardOverdueExplainerController;
import com.revolut.feature.insurance_pet.impl.ui.add.step.selection.PetTypeSelectionFragment;
import com.revolut.feature.web_sign_in.ui.screen.confirmation.WebSignInConfirmationScreen;
import com.revolut.feature.workflow.engine.product_closures.screen.ProductClosuresScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_search.AirportSearchScreen;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.j1;
import qlm.v1;
import wtg.a0;
import wtg.d0;
import wtg.t;
import wvj.q;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299385a;

    public /* synthetic */ a(int i) {
        this.f299385a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f299385a) {
            case 0:
                KProperty[] kPropertyArr = PagoPABillInputScreen.f61486d0;
                return new InputTextDelegate(null);
            case 1:
                KProperty[] kPropertyArr2 = PagoPABillInputScreen.f61486d0;
                return new SingleChoiceDelegate();
            case 2:
                return new RowDelegate(null, null, 7);
            case 3:
                return new TwinHorizontalButtonDelegate();
            case 4:
                TapiTransferAmountScreen.a aVar = TapiTransferAmountScreen.Companion;
                return new LargeActionButtonDelegate();
            case 5:
                TapiTransferAmountScreen.a aVar2 = TapiTransferAmountScreen.Companion;
                return new TextDelegate();
            case 6:
                TapiTransferAmountScreen.a aVar3 = TapiTransferAmountScreen.Companion;
                return new InputTextDelegate(null);
            case 7:
                TapiTransferAmountScreen.a aVar4 = TapiTransferAmountScreen.Companion;
                return new RowLoadingDelegate();
            case 8:
                KProperty[] kPropertyArr3 = WebSignInConfirmationScreen.c0;
                return v.k(new TimerDelegate(), new CellDetailsDelegate(), new PlainTextWarningDelegate());
            case 9:
                KProperty[] kPropertyArr4 = CreditCardOverdueExplainerController.R;
                return new FullScreenStateDelegate();
            case 10:
                return new qlm.e(wtg.j.f299962a);
            case 11:
                return new qlm.e(v1.f247718a);
            case 12:
                return t.Companion.serializer();
            case 13:
                return j1.a("com.revolut.feature.wealth.account_closure.impl.data.network.model.AccountClosurePreconditionsStatusDto", t.values(), new String[]{"OK", "HAS_NON_TRADEABLE_STOCKS", "HAS_PENDING_STOCK_TRANSFERS", "HAS_TRANSFER_OUT_REQUESTS", "HAS_WARRANTS", "HAS_OPEN_POSITIONS", "HAS_CASH", "HAS_MARGIN_LOAN", "HAS_ROBO_OR_FLEXIBLE_ACCOUNT_ONBOARDED", "HAS_OTHER_ACCOUNT_ONBOARDED", "HAS_JOINT_GIA_ONBOARDED"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null});
            case 14:
                return new qlm.e(a0.f299940a);
            case 15:
                return new qlm.e(a0.f299940a);
            case 16:
                return new qlm.e(d0.f299948a);
            case 17:
                KProperty[] kPropertyArr5 = ProductClosuresScreen.S;
                return new RowDelegate(null, null, 7);
            case 18:
                KProperty[] kPropertyArr6 = ProductClosuresScreen.S;
                return new FullScreenStateDelegate();
            case 19:
                return LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_moon, R$attr.uikit_colorDeepGrey_10, R$attr.uikit_colorGroupedBackground, Integer.valueOf(R$attr.uikit_colorDeepGrey), 2.0f, BitmapDescriptorFactory.HUE_RED, null, 96);
            case 20:
                return new qlm.e(wvj.g.f300523a);
            case 21:
                return new qlm.e(wvj.g.f300523a);
            case 22:
                return new qlm.e(wvj.j.f300526a);
            case 23:
                q.Companion bVar = wvj.q.INSTANCE;
                return new qlm.e(wvj.g.f300523a);
            case 24:
                return new Handler(Looper.getMainLooper());
            case 25:
                AirportSearchScreen.a aVar5 = AirportSearchScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 26:
                AirportSearchScreen.a aVar6 = AirportSearchScreen.Companion;
                return new FullScreenStateDelegate();
            case 27:
                return new PromptMarketingContentDelegate();
            case 28:
                int i = LocalGlobalCardInfoController.V;
                return new RowDelegate(null, null, 7);
            default:
                int i2 = PetTypeSelectionFragment.i0;
                return new ProductSelectionDelegate();
        }
    }
}
