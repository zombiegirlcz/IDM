package c65;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanState;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.confirmation.CancelLoanConfirmationControllerContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class t extends oki.h implements o {
    public final CancelLoanConfirmationControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f21673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f21674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l35.b f21675r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f15.a f21676s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b55.b f21677t;
    public final ang.f u;
    public final cli.y v;

    public t(CancelLoanConfirmationControllerContract$InputData inputData, cli.n stateMapper, j60.a bottomDialog, v dialogModelProvider, l35.b loanInteractor, f15.a getCreditHelpExtension, b55.b loanHelpRequestProvider, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(dialogModelProvider, "dialogModelProvider");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(getCreditHelpExtension, "getCreditHelpExtension");
        Intrinsics.checkNotNullParameter(loanHelpRequestProvider, "loanHelpRequestProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = inputData;
        this.f21673p = bottomDialog;
        this.f21674q = dialogModelProvider;
        this.f21675r = loanInteractor;
        this.f21676s = getCreditHelpExtension;
        this.f21677t = loanHelpRequestProvider;
        this.u = userInteractor;
        this.v = mra.d.b(this, new j(inputData.f70360a), stateMapper, null, false, 12);
    }

    public static final void I2(t tVar) {
        y0 y0VarC;
        v vVar = tVar.f21674q;
        LoanDetails loanDetails = tVar.o.f70360a;
        ((x) vVar).getClass();
        Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
        Loan loan = loanDetails.f70144a;
        dj0.d dVar = loanDetails.d;
        int i = w.f21679a[loan.o.ordinal()];
        if (i == 1 || i == 2) {
            if (loanDetails.f70144a.i instanceof LoanState.Planned) {
                y0VarC = x.c(new TextLocalisedClause(R$string.loan_management_renouncement_complete_title, null, null, 14), null, null, null);
            } else {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.loan_management_details_choose_payment_dialog_full, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.loan_management_details_choose_payment_dialog_repay_later, null, null, 14);
                boolean zF = dVar.f(dj0.d.e);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.loan_management_cancellation_info_success_title, null, null, 14);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.loan_management_cancellation_info_success_description, null, null, 14);
                if (!zF) {
                    textLocalisedClause = null;
                }
                if (!zF) {
                    textLocalisedClause2 = null;
                }
                y0VarC = x.c(textLocalisedClause3, textLocalisedClause4, textLocalisedClause, textLocalisedClause2);
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            y0VarC = x.c(new TextLocalisedClause(R$string.loan_management_cancellation_mortgage_confirmed_title, null, null, 14), new TextLocalisedClause(R$string.loan_management_cancellation_mortgage_confirmed_description, null, null, 14), !dVar.f(dj0.d.e) ? null : new TextLocalisedClause(R$string.loan_management_cancellation_mortgage_confirmed_action_pay, null, null, 14), null);
        }
        yji.l.a1(tVar, tVar.X1(y0VarC), null, null, new s(tVar, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
