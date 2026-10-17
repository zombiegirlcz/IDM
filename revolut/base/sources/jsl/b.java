package jsl;

import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountScreen;
import com.revolut.feature.apm.core.code.ui.ApmCodeController;
import com.revolut.feature.credit.card.impl.ui.repay.pse.CreditCardPseRepayScreen;
import com.revolut.feature.transfer_reasons.impl.ui.refund.TransferReasonsIsRefundScreen;
import com.revolut.feature.transport.impl.ui.hub.transit.TransportHubTransitScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.AirportLoungesHomeScreen;
import ip0.s7;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import org.joda.time.format.DateTimeFormat;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178203a;

    public /* synthetic */ b(int i) {
        this.f178203a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f178203a) {
            case 0:
                return new CellDetailsChevronDelegate();
            case 1:
                return new CellDetailsActionableIconDelegate();
            case 2:
                return new CellDetailsActionDelegate();
            case 3:
                return new CellDetailsNoteDelegate();
            case 4:
                return new LargeActionButtonDelegate();
            case 5:
                return new FixedTabsDelegate();
            case 6:
                return new HeaderDelegate();
            case 7:
                KProperty[] kPropertyArr = BizumTransferAmountScreen.l0;
                return new TextDelegate();
            case 8:
                KProperty[] kPropertyArr2 = BizumTransferAmountScreen.l0;
                return new LargeActionButtonDelegate();
            case 9:
                KProperty[] kPropertyArr3 = BizumTransferAmountScreen.l0;
                return new CellDetailsDelegate();
            case 10:
                KProperty[] kPropertyArr4 = BizumTransferAmountScreen.l0;
                return new CellDetailsActionDelegate();
            case 11:
                KProperty[] kPropertyArr5 = BizumTransferAmountScreen.l0;
                return new CellDetailsNoteDelegate();
            case 12:
                KProperty[] kPropertyArr6 = BizumTransferAmountScreen.l0;
                return new RowDelegate(null, null, 7);
            case 13:
                KProperty[] kPropertyArr7 = TransferReasonsIsRefundScreen.Q;
                return new RowDelegate(null, null, 7);
            case 14:
                KProperty[] kPropertyArr8 = CreditCardPseRepayScreen.X;
                return new FullScreenStateDelegate();
            case 15:
                KProperty[] kPropertyArr9 = CreditCardPseRepayScreen.X;
                return new AttributeSelectorSmallDelegate();
            case 16:
                ArrayList arrayList = new ArrayList(5);
                for (int i = 0; i < 5; i++) {
                    arrayList.add(new s7(a0.d.n("list-id-item-loading-", i), 0, 0, 0, 0, true, null, 94));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 17:
                return Unit.f186387a;
            case 18:
                KProperty[] kPropertyArr10 = TransportHubTransitScreen.f92543e0;
                return new SmallStockCardDelegate();
            case 19:
                KProperty[] kPropertyArr11 = TransportHubTransitScreen.f92543e0;
                return new SmallCardLoadingDelegate(null);
            case 20:
                KProperty[] kPropertyArr12 = TransportHubTransitScreen.f92543e0;
                return new ListSubheaderDelegate();
            case 21:
                KProperty[] kPropertyArr13 = TransportHubTransitScreen.f92543e0;
                return new FullScreenStateDelegate();
            case 22:
                KProperty[] kPropertyArr14 = TransportHubTransitScreen.f92543e0;
                return new CellDetailsChevronDelegate();
            case 23:
                return DateTimeFormat.forPattern("H:mm");
            case 24:
                KProperty[] kPropertyArr15 = ApmCodeController.S;
                return new TextDelegate();
            case 25:
                KProperty[] kPropertyArr16 = ApmCodeController.S;
                return new CodeEditorDelegate();
            case 26:
                KProperty[] kPropertyArr17 = AirportLoungesHomeScreen.f99073d0;
                return new SearchButtonDelegate();
            case 27:
                KProperty[] kPropertyArr18 = AirportLoungesHomeScreen.f99073d0;
                return new FullScreenStateDelegate();
            case 28:
                KProperty[] kPropertyArr19 = AirportLoungesHomeScreen.f99073d0;
                return new ListSubheaderDelegate();
            default:
                KProperty[] kPropertyArr20 = AirportLoungesHomeScreen.f99073d0;
                return new RowDelegate(null, null, 7);
        }
    }
}
