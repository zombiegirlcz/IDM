package g53;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.selection.LoanSelectionController;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.confirm.CreateMandateConfirmationController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.strategypicker.StrategyPickerController;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreen;
import g53.f;
import g9f.c0;
import g9f.g;
import g9f.g0;
import g9f.h0;
import g9f.l0;
import g9f.n0;
import g9f.q;
import g9f.v;
import g9f.z;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140618a;

    public /* synthetic */ e(int i) {
        this.f140618a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f140618a) {
            case 0:
                f.b bVar = f.Companion;
                return new qlm.e(v1.f247718a);
            case 1:
                return new LargeActionButtonDelegate();
            case 2:
                return Unit.f186387a;
            case 3:
                KProperty[] kPropertyArr = LoanSelectionController.R;
                return new RowDelegate(null, null, 7);
            case 4:
                pdh.c[] elements = {pdh.c.ONE_MONTH, pdh.c.SIX_MONTHS, pdh.c.YEAR_TO_DATE, pdh.c.ONE_YEAR, pdh.c.FIVE_YEARS, pdh.c.TEN_YEARS};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return (pdh.c[]) kotlin.collections.d.L(elements).toArray(new pdh.c[0]);
            case 5:
                KProperty[] kPropertyArr2 = CreateMandateConfirmationController.S;
                return new CellDetailsDelegate();
            case 6:
                KProperty[] kPropertyArr3 = CreateMandateConfirmationController.S;
                return new FullScreenStateDelegate();
            case 7:
                KProperty[] kPropertyArr4 = CobrandedCardsPlanHubScreen.V;
                return new ActionWidgetDelegate();
            case 8:
                KProperty[] kPropertyArr5 = CobrandedCardsPlanHubScreen.V;
                return new RowDelegate(null, null, 7);
            case 9:
                KProperty[] kPropertyArr6 = CobrandedCardsPlanHubScreen.V;
                return new InputDisclosureDelegate();
            case 10:
                KProperty[] kPropertyArr7 = CobrandedCardsPlanHubScreen.V;
                return new FullScreenStateDelegate();
            case 11:
                KProperty[] kPropertyArr8 = CobrandedCardsPlanHubScreen.V;
                return new LargeActionButtonDelegate();
            case 12:
                KProperty[] kPropertyArr9 = CobrandedCardsPlanHubScreen.V;
                return new HighlightTileDelegate();
            case 13:
                int i = StrategyPickerController.V;
                return new SingleChoiceDelegate();
            case 14:
                return n0.Companion.serializer();
            case 15:
                return j1.b("com.revolut.feature.trading.transfer.investments.impl.data.network.model.TransferDirectionDto", g.values());
            case 16:
                return n0.Companion.serializer();
            case 17:
                return new qlm.e(c0.f141549a);
            case 18:
                q.Companion bVar2 = q.INSTANCE;
                return n0.Companion.serializer();
            case 19:
                return j1.a("com.revolut.feature.trading.transfer.investments.impl.data.network.model.TransferRequestDirectionDto", v.values(), new String[]{"IN", "OUT"}, new Annotation[][]{null, null});
            case 20:
                return g0.Companion.serializer();
            case 21:
                return n0.Companion.serializer();
            case 22:
                return v.Companion.serializer();
            case 23:
                return new qlm.e(h0.f141558a);
            case 24:
                return new qlm.e(z.f141585a);
            case 25:
                return j1.a("com.revolut.feature.trading.transfer.investments.impl.data.network.model.TransferRequestStateDto", g0.values(), new String[]{"CREATED", "SUBMITTED", "COMPLETED", "CANCELLED", "FAILED", null}, new Annotation[][]{null, null, null, null, null, null});
            case 26:
                return l0.Companion.serializer();
            case 27:
                return j1.a("com.revolut.feature.trading.transfer.investments.impl.data.network.model.TransferRequestStepStateDto", l0.values(), new String[]{"COMPLETED", "IN_PROGRESS", "PENDING", "FAILED", null}, new Annotation[][]{null, null, null, null, null});
            case 28:
                return j1.a("com.revolut.feature.trading.transfer.investments.impl.data.network.model.TransferTypeDto", n0.values(), new String[]{"ACAT_FULL", "ACAT_PARTIAL", "DRS", "DTC", "ISA", "FOP", null}, new Annotation[][]{null, null, null, null, null, null, null});
            default:
                return Unit.f186387a;
        }
    }
}
