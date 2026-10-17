package n6h;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.borrowing_interest.WealthMarginBorrowingInterestScreen;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.borrowing_interest.WealthMarginBorrowingInterestScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) obj2;
        e eVar = (e) this.receiver;
        int i = WealthMarginBorrowingInterestScreen.V;
        com.revolut.kompot.navigable.vc.modal.a aVar = ((com.revolut.feature.wealth.gia.margin_trading.impl.ui.borrowing_interest.a) eVar).f95465s;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51832a;
        int iHashCode = str.hashCode();
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (iHashCode != -323676529) {
            if (iHashCode != 1532021404) {
                if (iHashCode == 1864068511 && str.equals("WEALTH_MARGIN_BORROWING_INTEREST_MONTHLY_ACCRUED_FEES")) {
                    h.v2(aVar, WealthMarginBorrowingInterestScreenContract$ModalStep.AccruedFeesMonthlyExplanation.f95459a, bottom_dialog);
                }
            } else if (str.equals("WEALTH_MARGIN_BORROWING_INTEREST_ANNUAL_RATE")) {
                h.v2(aVar, WealthMarginBorrowingInterestScreenContract$ModalStep.AnnualInterestRateExplanation.f95460a, bottom_dialog);
            }
        } else if (str.equals("WEALTH_MARGIN_BORROWING_INTEREST_NEXT_PAYMENT_DATE")) {
            h.v2(aVar, WealthMarginBorrowingInterestScreenContract$ModalStep.NextPaymentDateExplanation.f95461a, bottom_dialog);
        }
        return Unit.f186387a;
    }
}
