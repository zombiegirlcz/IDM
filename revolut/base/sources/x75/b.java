package x75;

import c55.d0;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBorrower;
import ip0.vd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.l;
import rp0.t;
import rp0.y;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public final y a(String str, List borrowersItems) {
        boolean zF;
        Object next;
        Intrinsics.checkNotNullParameter(borrowersItems, "borrowersItems");
        l lVar = l.WINDOW;
        t tVar = new t(new TextLocalisedClause(R$string.credit_loan_management_repayment_management_repayment_accounts_edit_sheet_title, null, null, 14), new TextLocalisedClause(R$string.credit_loan_management_repayment_management_repayment_accounts_edit_sheet_description, null, null, 14), null, 28);
        List list = borrowersItems;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            LoanBorrower loanBorrower = (LoanBorrower) it8.next();
            if (str != null) {
                zF = Intrinsics.f(loanBorrower.f70138a, str);
            } else if (loanBorrower.f70139b == 0) {
                zF = true;
            }
            arrayList.add(new SelectableDelegate.Model("ITEM_ID_SELECTABLE_BORROWER_ACCOUNT", new RowDelegate.Model("ITEM_ID_BORROWER_ACCOUNT", null, d0.a(loanBorrower), null, 0, d0.b(loanBorrower), null, null, 0, null, false, null, false, null, null, null, null, null, null, loanBorrower, null, 0, 0, 0, 0, 532676570), zF, SelectableDelegate.b.C0424b.f53319a, vd0.RADIO, 131040));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                next = null;
                break;
            }
            next = it9.next();
            if (Intrinsics.f(((LoanBorrower) next).f70138a, str)) {
                break;
            }
        }
        LoanBorrower loanBorrower2 = (LoanBorrower) next;
        if (loanBorrower2 != null) {
            zF = !(loanBorrower2.f70139b == 0);
        }
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ITEM_ID_BUTTON_SAVE_PRIORITY", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.credit_loan_management_repayment_management_repayment_accounts_edit_sheet_action, null, null, 14), zF, "TAG_LOADING_BUTTON_SAVE_PRIORITY", null, null, null, 904);
        int i = R$attr.uikit_dp16;
        yp0.b.r(model, i, i, 0, 0, 12);
        return new y(zhm.d0.F0(model, arrayList), tVar, lVar, null, null, null, 1016);
    }
}
