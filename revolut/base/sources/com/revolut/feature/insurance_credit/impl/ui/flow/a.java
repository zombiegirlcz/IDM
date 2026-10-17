package com.revolut.feature.insurance_credit.impl.ui.flow;

import al4.q;
import com.revolut.feature.insurance_credit.api.navigation.Facility;
import com.revolut.feature.insurance_credit.impl.data.model.action.CancelAction;
import com.revolut.feature.insurance_credit.impl.data.model.action.ShowConfirmationAction;
import com.revolut.feature.insurance_credit.impl.data.model.action.ShowCoverageDetailsAction;
import com.revolut.feature.insurance_credit.impl.ui.flow.InsuranceCreditFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import cp5.d;
import dce.s0;
import dp4.n0;
import dt4.p;
import dt7.b;
import dt7.c;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o55.g;
import oki.h;
import om4.y3;
import y45.i;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final InsuranceCreditFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final js7.b f75815p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f75816q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f75817r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f75818s;

    public a(InsuranceCreditFlowContract$InputData inputData, js7.b cancelInsuranceInteractor, q creditCardProductInteractor, i loanProductInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cancelInsuranceInteractor, "cancelInsuranceInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        this.o = inputData;
        this.f75815p = cancelInsuranceInteractor;
        this.f75816q = creditCardProductInteractor;
        this.f75817r = loanProductInteractor;
        this.f75818s = d.a(this, inputData.f75805c, f0.f322471a, new p(this, 1));
    }

    public static final Object I2(a aVar, Facility facility, s0 s0Var) {
        if (facility instanceof Facility.Loan) {
            Object objA = nim.a.a(((o55.q) aVar.f75817r.f310803a).f222362g.g(g.f222339a, false), s0Var);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
        }
        if (!(facility instanceof Facility.CreditCard)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objD = ((y3) aVar.f75816q).f226759a.d.d(new n0(true), true, s0Var);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar2) {
            objD = Unit.f186387a;
        }
        if (objD != aVar2) {
            objD = Unit.f186387a;
        }
        return objD == aVar2 ? objD : Unit.f186387a;
    }

    public static void K2(a aVar, InsuranceCreditFlowContract$Step insuranceCreditFlowContract$Step) {
        h.t2(aVar, aVar.f75818s, insuranceCreditFlowContract$Step, true, null, false, 12);
    }

    public final void J2(ps7.b bVar, CancelAction cancelAction, ShowCoverageDetailsAction showCoverageDetailsAction, ShowConfirmationAction showConfirmationAction) {
        String str;
        int i = bVar == null ? -1 : c.f117397a[bVar.ordinal()];
        Continuation continuation = null;
        InsuranceCreditFlowContract$InputData insuranceCreditFlowContract$InputData = this.o;
        if (i == -1) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "InsuranceCreditFlowModel", j6.a.q("Called handlePromptAction with null action - ", insuranceCreditFlowContract$InputData.f75804b), null, h0Var);
            return;
        }
        if (i == 1) {
            if (showConfirmationAction != null) {
                h.t2(this, this.f75818s, new InsuranceCreditFlowContract$Step.CancellationConfirmation(showConfirmationAction), false, null, false, 12);
                return;
            }
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "InsuranceCreditFlowModel", j6.a.q("Called SHOW_CONFIRMATION action with null data - ", insuranceCreditFlowContract$InputData.f75804b), null, h0Var2);
            return;
        }
        yki.a aVar = this.f75818s;
        if (i == 2) {
            if (showCoverageDetailsAction != null) {
                h.w2(aVar, new InsuranceCreditFlowContract$Step.CoverageDetailsModal(showCoverageDetailsAction), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return;
            }
            h0 h0Var3 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "InsuranceCreditFlowModel", j6.a.q("Called SHOW_COVERAGE_DETAILS action with null data - ", insuranceCreditFlowContract$InputData.f75804b), null, h0Var3);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.e(true);
        } else {
            if (cancelAction != null && (str = cancelAction.f75755a) != null) {
                l2(new s0(this, str, continuation, 21), new yi5.b(26));
                return;
            }
            h0 h0Var4 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "InsuranceCreditFlowModel", j6.a.q("Called CANCEL_INSURANCE action with null data - ", insuranceCreditFlowContract$InputData.f75804b), null, h0Var4);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f75818s;
    }
}
