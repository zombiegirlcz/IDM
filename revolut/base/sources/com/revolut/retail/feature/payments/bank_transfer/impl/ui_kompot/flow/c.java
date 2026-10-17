package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow;

import a5k.t;
import com.revolut.feature.bank_transfer.models.UltimateDebtor;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputReference;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.BankTransferFlowContract$Step;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.BankTransferReviewScreenContract$InputData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import hl9.d;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mz3.r;
import oki.h;
import qua.p;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends h implements n4k.b {
    public final BankTransferFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d3j.b f102110p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f102111q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a5k.a f102112r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final aqf.b f102113s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f102114t;
    public final yki.a u;

    public c(BankTransferFlowInputData inputData, d3j.b beneficiaryInteractor, t bankTransferExecutionExtension, a5k.a bankTransferChecksExtension, aqf.b transferExecutionLoadingController, d transferScannedBillDetailsInteractor) {
        FlowStep reviewOnly;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(bankTransferExecutionExtension, "bankTransferExecutionExtension");
        Intrinsics.checkNotNullParameter(bankTransferChecksExtension, "bankTransferChecksExtension");
        Intrinsics.checkNotNullParameter(transferExecutionLoadingController, "transferExecutionLoadingController");
        Intrinsics.checkNotNullParameter(transferScannedBillDetailsInteractor, "transferScannedBillDetailsInteractor");
        this.o = inputData;
        this.f102110p = beneficiaryInteractor;
        this.f102111q = bankTransferExecutionExtension;
        this.f102112r = bankTransferChecksExtension;
        this.f102113s = transferExecutionLoadingController;
        this.f102114t = transferScannedBillDetailsInteractor;
        if (inputData instanceof BankTransferFlowInputData.NewTransfer) {
            BankTransferInputData bankTransferInputData = ((BankTransferFlowInputData.NewTransfer) inputData).f101944h;
            f5j.a aVar = bankTransferInputData.f101950a;
            TransferFlowType transferFlowType = bankTransferInputData.f101951b;
            BankTransferInputReference bankTransferInputReference = bankTransferInputData.f101952c;
            TransferMoneyPocket transferMoneyPocket = bankTransferInputData.d;
            m1l.a aVar2 = bankTransferInputData.e;
            TransferScheduleData transferScheduleData = bankTransferInputData.f;
            p pVar = bankTransferInputData.f101953g;
            Map map = bankTransferInputData.i;
            UltimateDebtor ultimateDebtor = bankTransferInputData.f101955j;
            reviewOnly = new BankTransferFlowContract$Step.Amount(new BankTransferAmountScreenContract$InputData.NewTransfer(aVar, transferFlowType, bankTransferInputData.k, bankTransferInputData.f101957m, bankTransferInputReference, transferMoneyPocket, ultimateDebtor, aVar2, transferScheduleData, pVar, map, bankTransferInputData.f101956l, bankTransferInputData.o));
        } else {
            if (!(inputData instanceof BankTransferFlowInputData.ReviewOnly)) {
                throw new NoWhenBranchMatchedException();
            }
            BankTransferFlowInputData.ReviewOnly reviewOnly2 = (BankTransferFlowInputData.ReviewOnly) inputData;
            reviewOnly = new BankTransferFlowContract$Step.ReviewOnly(new BankTransferReviewScreenContract$InputData(reviewOnly2.f101945h, reviewOnly2.i, reviewOnly2.f101946j, reviewOnly2.f101949n, reviewOnly2.k));
        }
        this.u = cp5.d.a(this, reviewOnly, f0.f322471a, new r(this, 17));
    }

    public final void I2(f5j.a aVar, BankTransferData bankTransferData, boolean z) {
        BankTransferFlowInputData bankTransferFlowInputData = this.o;
        h.t2(this, this.u, new BankTransferFlowContract$Step.Review(new BankTransferReviewScreenContract$InputData(aVar, bankTransferFlowInputData.getF101941b(), bankTransferFlowInputData.getF101942c(), bankTransferData, bankTransferFlowInputData.getE())), z, null, false, 12);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
