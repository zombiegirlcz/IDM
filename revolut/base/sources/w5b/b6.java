package w5b;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.section.LoanDocumentSectionController;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccounts.multipleborrowers.LoanRepaymentAccountsController;
import com.revolut.feature.credit.loan.impl.ui.statements.LoanStatementsListScreen;
import com.revolut.feature.pix.impl.flow.alias_deletion.screens.review_delete.ReviewDeleteAliasScreen;
import com.revolut.feature.pix.impl.flow.automatico.screens.past_authorisations.PixAutomaticoPastAuthorisationsScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreen;
import com.revolut.shared.feature.offboarding.impl.ui.home.OffboardingScreen;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import w6h.g;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294790a;

    public /* synthetic */ b6(int i) {
        this.f294790a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f294790a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                KProperty[] kPropertyArr = LoanDocumentSectionController.Q;
                break;
            case 5:
                g.a aVar = w6h.g.Companion;
                List listC = zhm.u.c(new ip0.a3("MARGIN_STATUS_WIDGET_LOADING_LIST_ID"));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                break;
            case 6:
                KProperty[] kPropertyArr2 = LoanRepaymentAccountsController.f70518a0;
                break;
            case 7:
                KProperty[] kPropertyArr3 = LoanRepaymentAccountsController.f70518a0;
                break;
            case 8:
                KProperty[] kPropertyArr4 = LoanRepaymentAccountsController.f70518a0;
                break;
            case 9:
                KProperty[] kPropertyArr5 = LoanRepaymentAccountsController.f70518a0;
                break;
            case 10:
                KProperty[] kPropertyArr6 = LoanRepaymentAccountsController.f70518a0;
                break;
            case 11:
                KProperty[] kPropertyArr7 = LoanRepaymentAccountsController.f70518a0;
                break;
            case 12:
                KProperty[] kPropertyArr8 = CobrandedCardsValueReminderScreen.T;
                break;
            case 13:
                KProperty[] kPropertyArr9 = CobrandedCardsValueReminderScreen.T;
                break;
            case 14:
                KProperty[] kPropertyArr10 = CobrandedCardsValueReminderScreen.T;
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                KProperty[] kPropertyArr11 = LoanStatementsListScreen.f70611d0;
                break;
            case 22:
                KProperty[] kPropertyArr12 = LoanStatementsListScreen.f70611d0;
                break;
            case 23:
                KProperty[] kPropertyArr13 = LoanStatementsListScreen.f70611d0;
                break;
            case 24:
                KProperty[] kPropertyArr14 = ReviewDeleteAliasScreen.S;
                break;
            case 25:
                KProperty[] kPropertyArr15 = ReviewDeleteAliasScreen.S;
                break;
            case 26:
                KProperty[] kPropertyArr16 = OffboardingScreen.S;
                break;
            case 27:
                KProperty[] kPropertyArr17 = OffboardingScreen.S;
                break;
            case 28:
                KProperty[] kPropertyArr18 = OffboardingScreen.S;
                break;
            default:
                KProperty[] kPropertyArr19 = PixAutomaticoPastAuthorisationsScreen.Q;
                break;
        }
        return new RowDelegate(null, null, 7);
    }
}
