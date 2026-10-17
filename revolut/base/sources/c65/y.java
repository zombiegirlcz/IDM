package c65;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.credit.core.R$plurals;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ck0;
import ip0.qe0;
import ip0.we0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class y implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static aim.e a(TextLocalisedQuantityClause textLocalisedQuantityClause, dj0.d dVar, String str) {
        aim.e eVarB = zhm.u.b();
        eVarB.add(new TextDelegate.Model("CANCELLATION_DESCRIPTION_LIST_ID", textLocalisedQuantityClause, false, new ck0(0), null, null, 0, 0, 0, 0, 2036));
        if (dVar.f(dj0.d.e)) {
            CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("OUTSTANDING_BALANCE_ID", new TextLocalisedClause(R$string.loan_management_cancellation_explainer_outstanding_amount, null, null, 14), new MoneyClause(dVar, new MoneyClause.Format.Asset(0), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model);
        }
        eVarB.add(new we0("CANCELLATION_IMAGE_LIST_ID", new qe0(-2, com.revolut.core.ui_kit_core.displayers.image.models.b.c(str, new ImageTransformations(null, null, null, gz0.b.Undefined, null, null, Integer.valueOf(Constants.TAG_SUPPORTED_LOCALE_LIST), 55), null, "mobile/3d_images/v2", 20))));
        return zhm.u.a(eVarB);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        int i;
        int i2;
        aim.e eVarA;
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        LoanDetails loanDetails = domainState.f21663a;
        b95.a aVar = loanDetails.f70144a.o;
        int[] iArr = z.f21680a;
        int i3 = iArr[aVar.ordinal()];
        if (i3 == 1 || i3 == 2) {
            i = R$string.loan_management_cancellation_info_title;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.loan_management_cancellation_mortgage_explainer_disbursed_title;
        }
        TextLocalisedClause textLocalisedClause = null;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, null, null, 14);
        Loan loan = loanDetails.f70144a;
        int i5 = iArr[loan.o.ordinal()];
        if (i5 == 1 || i5 == 2) {
            i2 = R$string.loan_management_cancellation_info_cancel_loan;
        } else {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.loan_management_cancellation_mortgage_explainer_action_cancel;
        }
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i2, null, null, 14);
        b95.a aVar2 = loan.o;
        q35.h hVar = loan.f;
        LoanState loanState = loan.i;
        if (aVar2 != b95.a.MORTGAGE_LOAN) {
            wi0.b bVar = loan.f70112h;
            wi0.b.Companion.getClass();
            textLocalisedClause = Intrinsics.f(bVar, wi0.b.y2) ? new TextLocalisedClause(R$string.loan_management_cancellation_info_footer_value_pt, null, null, 14) : new TextLocalisedClause(R$string.loan_management_cancellation_info_footer_value, null, null, 14);
        }
        int i6 = iArr[loan.o.ordinal()];
        if (i6 == 1 || i6 == 2) {
            eVarA = a(new TextLocalisedQuantityClause(R$plurals.loan_management_cancellation_info_description_with_placeholder, Integer.valueOf(hVar.i), (List) null, (Style) null, 28), loan.k, "3d302");
        } else {
            if (i6 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            eVarA = a(new TextLocalisedQuantityClause(loanState instanceof LoanState.Planned ? R$plurals.loan_management_cancellation_mortgage_explainer_not_disbursed_description_with_placeholder : R$plurals.loan_management_cancellation_mortgage_explainer_disbursed_description_with_placeholder, Integer.valueOf(hVar.i), (List) null, (Style) null, 28), loanDetails.d, loanState instanceof LoanState.Planned ? "3d302" : "3d358");
        }
        return new p(eVarA, textLocalisedClause2, textLocalisedClause3, textLocalisedClause);
    }
}
