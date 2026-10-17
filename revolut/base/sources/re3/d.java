package re3;

import android.content.Context;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.preapplication.PreApplicationChecksScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.coverage_info.CFACInsuranceCoverageInfoScreen;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_details.CFACClaimDetailsScreen;
import com.revolut.feature.pay_later.impl.ui.linkedplans.PayLaterLinkedPlansController;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.SummaryController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_choose_number.EsimMobilePlanChooseNumberScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import rf6.a;
import rf6.b;
import rlm.q;
import rlm.s;
import rlm.v;
import rlm.w;
import th0.k;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253509a;

    public /* synthetic */ d(int i) {
        this.f253509a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f253509a) {
            case 0:
                return new qlm.e(a.f253503a);
            case 1:
                a.b bVar = rf6.a.Companion;
                return new qlm.e(b.a.f253704a);
            case 2:
                a.b bVar2 = rf6.a.Companion;
                return new qlm.e(b.a.f253704a);
            case 3:
                return new PromptContentDelegate();
            case 4:
                return new PromptMarketingContentDelegate();
            case 5:
                KProperty[] kPropertyArr = PreApplicationChecksScreen.S;
                return new RowDelegate(null, null, 7);
            case 6:
                KProperty[] kPropertyArr2 = PreApplicationChecksScreen.S;
                return new FullScreenStateDelegate();
            case 7:
                return Unit.f186387a;
            case 8:
                return Unit.f186387a;
            case 9:
                KProperty[] kPropertyArr3 = CFACInsuranceCoverageInfoScreen.c0;
                return new RowDelegate(null, null, 7);
            case 10:
                KProperty[] kPropertyArr4 = CFACInsuranceCoverageInfoScreen.c0;
                return new CellDetailsActionDelegate();
            case 11:
                KProperty[] kPropertyArr5 = PayLaterLinkedPlansController.U;
                return new RowDelegate(null, null, 7);
            case 12:
                KProperty[] kPropertyArr6 = PayLaterLinkedPlansController.U;
                return new RowLoadingDelegate();
            case 13:
                KProperty[] kPropertyArr7 = PayLaterLinkedPlansController.U;
                return new FullScreenStateDelegate();
            case 14:
                KProperty[] kPropertyArr8 = EsimMobilePlanChooseNumberScreen.R;
                return new RowDelegate(null, null, 7);
            case 15:
                KProperty[] kPropertyArr9 = ESignOtpScreen.V;
                return new CodeEditorDelegate();
            case 16:
                KProperty[] kPropertyArr10 = ESignOtpScreen.V;
                return new TextDelegate();
            case 17:
                KProperty[] kPropertyArr11 = CFACClaimDetailsScreen.f75126e0;
                return new RowDelegate(null, null, 7);
            case 18:
                KProperty[] kPropertyArr12 = CFACClaimDetailsScreen.f75126e0;
                return new ProgressStepVerticalDelegate();
            case 19:
                KProperty[] kPropertyArr13 = CFACClaimDetailsScreen.f75126e0;
                return new ListSubheaderDelegate();
            case 20:
                KProperty[] kPropertyArr14 = CFACClaimDetailsScreen.f75126e0;
                return new PlainTextWarningDelegate();
            case 21:
                KProperty[] kPropertyArr15 = SummaryController.T;
                return new CellDetailsDelegate();
            case 22:
                KProperty[] kPropertyArr16 = SummaryController.T;
                return new InputChecklistDelegate();
            case 23:
                KProperty[] kPropertyArr17 = SummaryController.T;
                return new FullScreenStateDelegate();
            case 24:
                Context context = rli.e.f255086b;
                if (context == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                sg0.c.Companion.getClass();
                return new k(context, sg0.b.f262576b);
            case 25:
                return w.f255128b;
            case 26:
                return s.f255120b;
            case 27:
                return q.f255118b;
            case 28:
                return v.f255126b;
            default:
                return rlm.e.f255098b;
        }
    }
}
