package com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentAccountData;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import e85.g;
import e85.i;
import e85.j;
import e85.r;
import e85.s;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import m35.f;
import m35.p;
import mra.d;
import oki.h;
import q35.g0;
import vkm.j2;
import y45.m;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements i {
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final AmountInputControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f70552p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y45.i f70553q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LoanRepaymentAccountModelExtension f70554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f70555s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f70556t;
    public final f u;
    public final b55.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f15.a f70557w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s f70558x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f70559y;
    public final y z;

    public a(AmountInputControllerContract$InputData inputData, r stateMapper, w80.b amountFormatter, y45.i loanProductInteractor, LoanRepaymentAccountModelExtension repaymentAccountPickerModelExtension, m loansRepaymentBalancesFilterInteractor, p loanStateExplainerMapper, f loanDialogMapper, b55.b loanHelpRequestProvider, f15.a getCreditHelpExtension, s amountValidator, c repaymentActionDeterminer) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(repaymentAccountPickerModelExtension, "repaymentAccountPickerModelExtension");
        Intrinsics.checkNotNullParameter(loansRepaymentBalancesFilterInteractor, "loansRepaymentBalancesFilterInteractor");
        Intrinsics.checkNotNullParameter(loanStateExplainerMapper, "loanStateExplainerMapper");
        Intrinsics.checkNotNullParameter(loanDialogMapper, "loanDialogMapper");
        Intrinsics.checkNotNullParameter(loanHelpRequestProvider, "loanHelpRequestProvider");
        Intrinsics.checkNotNullParameter(getCreditHelpExtension, "getCreditHelpExtension");
        Intrinsics.checkNotNullParameter(amountValidator, "amountValidator");
        Intrinsics.checkNotNullParameter(repaymentActionDeterminer, "repaymentActionDeterminer");
        this.o = inputData;
        this.f70552p = amountFormatter;
        this.f70553q = loanProductInteractor;
        this.f70554r = repaymentAccountPickerModelExtension;
        this.f70555s = loansRepaymentBalancesFilterInteractor;
        this.f70556t = loanStateExplainerMapper;
        this.u = loanDialogMapper;
        this.v = loanHelpRequestProvider;
        this.f70557w = getCreditHelpExtension;
        this.f70558x = amountValidator;
        this.f70559y = repaymentActionDeterminer;
        this.z = d.b(this, new g(inputData.f70546a, new Data(null, null, true, 3, null), inputData.f70547b), stateMapper, null, false, 12);
        this.A = e.a(this, new e54.r(this, 9));
    }

    @Override // yji.l
    public final void I1() {
        l2(new e85.p(this, null), new yi5.b(26));
    }

    public final void I2(dj0.d dVar, g0 g0Var) {
        LoanRepaymentAccountModelExtension.RepaymentAccountState repaymentAccountState;
        e85.f fVar = (e85.f) ((g) ((j2) this.z.f22677a).getValue()).f123582b.getContent();
        AccountWrapper accountWrapper = (fVar == null || (repaymentAccountState = fVar.f123580b) == null) ? null : repaymentAccountState.f70504a;
        C2(new j(accountWrapper != null ? new LoanRepaymentAccountData(accountWrapper.getId(), yoj.b.y(accountWrapper.f97224a)) : null, dVar, g0Var));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.z;
    }
}
