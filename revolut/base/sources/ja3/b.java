package ja3;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.feature.crypto.account.api.model.dto.CryptoProductOnboardingDto;
import com.revolut.feature.crypto.account.impl.model.CryptoAccountDto;
import com.revolut.feature.crypto.account.impl.model.CryptoAccountPromotionDto;
import com.revolut.feature.html_viewer.impl.screen.HtmlViewerScreen;
import com.revolut.feature.pay_later.impl.ui.accountdetails.PayLaterAccountDetailsScreen;
import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreen;
import com.revolut.feature_retail_user_declarations.risk_assessment.screen.RiskAssessmentScreen;
import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.ReturnCryptoDepositSummaryScreen;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.PlanGiftingReceiverPickerScreen;
import java.lang.annotation.Annotation;
import jf7.b1;
import jf7.g1;
import jf7.k0;
import jf7.k1;
import jf7.l;
import jf7.q0;
import jf7.v;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlinx.serialization.json.Json;
import org.jmrtd.cbeff.ISO781611;
import qlm.d1;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172414a;

    public /* synthetic */ b(int i) {
        this.f172414a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 1;
        switch (this.f172414a) {
            case 0:
                return new ImageTransformations(null, new RoundedRectTransformation(12.0f), null, null, null, null, null, ISO781611.SMT_TAG);
            case 1:
                CryptoAccountDto.Companion bVar = CryptoAccountDto.INSTANCE;
                return new qlm.e(CryptoAccountPromotionDto.a.f70772a);
            case 2:
                CryptoAccountDto.Companion bVar2 = CryptoAccountDto.INSTANCE;
                return new qlm.e(CryptoProductOnboardingDto.a.f70762a);
            case 3:
                KProperty[] kPropertyArr = RiskAssessmentScreen.S;
                return new InputChecklistDelegate();
            case 4:
                KProperty[] kPropertyArr2 = ReturnCryptoDepositSummaryScreen.R;
                return new CellDetailsDelegate();
            case 5:
                KProperty[] kPropertyArr3 = ReturnCryptoDepositSummaryScreen.R;
                return new CellDetailsActionDelegate();
            case 6:
                return jck.c.a("12 Abcdef");
            case 7:
                return jck.c.a("12 abcd");
            case 8:
                KProperty[] kPropertyArr4 = PlanGiftingReceiverPickerScreen.U;
                return new ActionWidgetDelegate();
            case 9:
                KProperty[] kPropertyArr5 = PlanGiftingReceiverPickerScreen.U;
                return new RowDelegate(null, null, 7);
            case 10:
                KProperty[] kPropertyArr6 = PlanGiftingReceiverPickerScreen.U;
                return new FullScreenStateDelegate();
            case 11:
                KProperty[] kPropertyArr7 = PlanGiftingReceiverPickerScreen.U;
                return new ListSubheaderDelegate();
            case 12:
                KProperty[] kPropertyArr8 = HtmlViewerScreen.T;
                return new WebViewDelegate();
            case 13:
                return new qlm.e(jdl.a.f173154a);
            case 14:
                return new qlm.e(l.f173689a);
            case 15:
                return new qlm.e(v.f173715a);
            case 16:
                return new qlm.e(k0.f173687a);
            case 17:
                return new qlm.e(q0.f173702a);
            case 18:
                return j1.b("com.revolut.feature.incentive_reward.impl.model.details.block.IncentiveRewardDetailsBlock.ToDo.ActionStyle", b1.values());
            case 19:
                return new qlm.e(g1.f173675a);
            case 20:
                return new d1("com.revolut.feature.incentive_reward.impl.model.details.block.IncentiveRewardDetailsBlock.Unknown", k1.INSTANCE, new Annotation[]{new hi9.g(15)});
            case 21:
                return Unit.f186387a;
            case 22:
                return Unit.f186387a;
            case 23:
                return Unit.f186387a;
            case 24:
                KProperty[] kPropertyArr9 = SharedConverterScreen.f86850h0;
                return new RowLoadingDelegate();
            case 25:
                KProperty[] kPropertyArr10 = SharedConverterScreen.f86850h0;
                return new FullScreenStateDelegate();
            case 26:
                Lazy lazy = jhl.a.f174314a;
                return ue0.e.b(Json.d, new jhi.a(i));
            case 27:
                KProperty[] kPropertyArr11 = PayLaterAccountDetailsScreen.i0;
                return new BannerDelegate();
            case 28:
                KProperty[] kPropertyArr12 = PayLaterAccountDetailsScreen.i0;
                return new LargeActionButtonDelegate();
            default:
                KProperty[] kPropertyArr13 = PayLaterAccountDetailsScreen.i0;
                return new RowDelegate(null, null, 7);
        }
    }
}
