package z1i;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.RectangularButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.details.ApmRecipientDetailsNewScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails.LoanAccountDetailsScreen;
import com.revolut.feature.defi.trade.impl.ui.trade.DefiTradeScreen;
import com.revolut.feature_exchange.impl.ui.exchange.order_summary.OrderSummaryActivity;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreen;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import qlm.v1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318799a;

    public /* synthetic */ a(int i) {
        this.f318799a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f318799a) {
            case 0:
                int i = OrderSummaryActivity.G0;
                return new LargeActionButtonDelegate();
            case 1:
                int i2 = OrderSummaryActivity.G0;
                return new FixedTabsDelegate();
            case 2:
                return new Regex("\\[.*?]|[{}]");
            case 3:
                KProperty[] kPropertyArr = ApmRecipientDetailsNewScreen.X;
                return new RectangularButtonDelegate();
            case 4:
                KProperty[] kPropertyArr2 = ApmRecipientDetailsNewScreen.X;
                return new RowDelegate(null, null, 7);
            case 5:
                KProperty[] kPropertyArr3 = ApmRecipientDetailsNewScreen.X;
                return new CellDetailsDelegate();
            case 6:
                KProperty[] kPropertyArr4 = ApmRecipientDetailsNewScreen.X;
                return new CellDetailsChevronDelegate();
            case 7:
                KProperty[] kPropertyArr5 = ApmRecipientDetailsNewScreen.X;
                return new LargeActionButtonDelegate();
            case 8:
                KProperty[] kPropertyArr6 = LoanAccountDetailsScreen.Y;
                return new FullScreenStateDelegate();
            case 9:
                KProperty[] kPropertyArr7 = LoanAccountDetailsScreen.Y;
                return new ProgressStepVerticalDelegate();
            case 10:
                KProperty[] kPropertyArr8 = LoanAccountDetailsScreen.Y;
                return new TextDelegate();
            case 11:
                KProperty[] kPropertyArr9 = LoanAccountDetailsScreen.Y;
                return new ListSubheaderDelegate();
            case 12:
                KProperty[] kPropertyArr10 = LoanAccountDetailsScreen.Y;
                return new RowDelegate(null, null, 7);
            case 13:
                KProperty[] kPropertyArr11 = LoanAccountDetailsScreen.Y;
                return new CellDetailsDelegate();
            case 14:
                KProperty[] kPropertyArr12 = LoanAccountDetailsScreen.Y;
                return new CellDetailsChevronDelegate();
            case 15:
                KProperty[] kPropertyArr13 = LoanAccountDetailsScreen.Y;
                return new CellDetailsActionDelegate();
            case 16:
                KProperty[] kPropertyArr14 = LoanAccountDetailsScreen.Y;
                return new CellDetailsNoteDelegate();
            case 17:
                DefiTradeScreen.a aVar = DefiTradeScreen.Companion;
                return new ListSubheaderDelegate();
            case 18:
                DefiTradeScreen.a aVar2 = DefiTradeScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 19:
                DefiTradeScreen.a aVar3 = DefiTradeScreen.Companion;
                return new FullScreenStateDelegate();
            case 20:
                return new qlm.e(z7g.v.f320000a);
            case 21:
                return new qlm.e(z7g.p.f319990a);
            case 22:
                return new qlm.e(z7g.v.f320000a);
            case 23:
                return new qlm.h0(v1.f247718a, new qlm.e(z7g.s.f319996a), 1);
            case 24:
                return new qlm.e(z7g.v.f320000a);
            case 25:
                return new qlm.e(z7g.y.f320004a);
            case 26:
                PeerToPeerAmountScreen.a aVar4 = PeerToPeerAmountScreen.Companion;
                return new LargeActionButtonDelegate();
            case 27:
                PeerToPeerAmountScreen.a aVar5 = PeerToPeerAmountScreen.Companion;
                return new CellDetailsDelegate();
            case 28:
                PeerToPeerAmountScreen.a aVar6 = PeerToPeerAmountScreen.Companion;
                return new CellDetailsActionDelegate();
            default:
                PeerToPeerAmountScreen.a aVar7 = PeerToPeerAmountScreen.Companion;
                return new CellDetailsNoteDelegate();
        }
    }
}
