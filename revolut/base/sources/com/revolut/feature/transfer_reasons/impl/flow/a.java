package com.revolut.feature.transfer_reasons.impl.flow;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData;
import com.revolut.feature.transfer_reasons.impl.flow.TransferReasonsFlowContract$Step;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsSuggestion;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import isf.d;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qc0.e1;
import qm2.c;
import qsf.g;
import qsf.k;
import qsf.l;
import qsf.m;
import qsf.n;
import qsf.o;
import qsf.p;
import qsf.q;
import qsf.r;
import qsf.s;
import rp0.g1;
import rp0.k1;
import vkm.j2;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements qsf.b {

    @NotNull
    public static final g Companion = new g();
    public final o o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f92346p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TransferReasonsFlowInputData f92347q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g1 f92348r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final csf.b f92349s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f92350t;
    public final qki.d u;
    public final yki.a v;

    public a(o collector, d dialogProvider, k stateFactory, TransferReasonsFlowInputData inputData, g1 shotDialogDisplayer, csf.b transferReasonsInteractor, b routeResolver) {
        TransferReasonsFlowContract$State transferReasonsFlowContract$State;
        Intrinsics.checkNotNullParameter(collector, "collector");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(stateFactory, "stateFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(transferReasonsInteractor, "transferReasonsInteractor");
        Intrinsics.checkNotNullParameter(routeResolver, "routeResolver");
        this.o = collector;
        this.f92346p = dialogProvider;
        this.f92347q = inputData;
        this.f92348r = shotDialogDisplayer;
        this.f92349s = transferReasonsInteractor;
        this.f92350t = routeResolver;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (inputData instanceof TransferReasonsFlowInputData.OpenForResult) {
            h0 h0Var = h0.f322473a;
            f0 f0Var = f0.f322471a;
            transferReasonsFlowContract$State = new TransferReasonsFlowContract$State(null, h0Var, f0Var, f0Var, 48);
        } else if (inputData instanceof TransferReasonsFlowInputData.EditForResult) {
            TransferReasonsFlowInputData.EditForResult editForResult = (TransferReasonsFlowInputData.EditForResult) inputData;
            transferReasonsFlowContract$State = k.a(stateFactory, editForResult.f92321c, editForResult.e);
        } else if (inputData instanceof TransferReasonsFlowInputData.EditFromTransaction) {
            TransferReasonsFlowInputData.EditFromTransaction editFromTransaction = (TransferReasonsFlowInputData.EditFromTransaction) inputData;
            transferReasonsFlowContract$State = k.a(stateFactory, editFromTransaction.f92323b, editFromTransaction.e.f274315a);
        } else {
            if (!(inputData instanceof TransferReasonsFlowInputData.CreateForPendingTransaction)) {
                throw new NoWhenBranchMatchedException();
            }
            h0 h0Var2 = h0.f322473a;
            f0 f0Var2 = f0.f322471a;
            transferReasonsFlowContract$State = new TransferReasonsFlowContract$State(null, h0Var2, f0Var2, f0Var2, 48);
        }
        this.u = e.b(this, transferReasonsFlowContract$State);
        c cVar = new c(this, 8);
        this.v = cp5.d.a(this, TransferReasonsFlowContract$Step.Initial.f92339a, f0.f322471a, cVar);
    }

    public static final void I2(a aVar, String str, int i) {
        ((k1) aVar.f92348r).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, str, new TextLocalisedClause(i, null, null, 14), null, null, null, 60));
    }

    @Override // yji.l
    public final void I1() {
        s qVar;
        if (this.f226127l) {
            return;
        }
        b bVar = this.f92350t;
        TransferReasonsFlowInputData transferReasonsFlowInputData = bVar.f92351a;
        TransferReasonsSuggestion transferReasonsSuggestion = transferReasonsFlowInputData.getF92327c().f92440c;
        if (transferReasonsFlowInputData instanceof TransferReasonsFlowInputData.EditFromTransaction) {
            TransferReasonsFlowInputData.EditFromTransaction editFromTransaction = (TransferReasonsFlowInputData.EditFromTransaction) transferReasonsFlowInputData;
            qVar = new q(new TransferReasonsFlowContract$Step.ChooseAction(editFromTransaction.d, editFromTransaction.e));
        } else if (transferReasonsFlowInputData instanceof TransferReasonsFlowInputData.EditForResult) {
            qVar = bVar.b();
        } else {
            qVar = (transferReasonsSuggestion != null ? transferReasonsSuggestion.f92443c : null) != null ? new q(new TransferReasonsFlowContract$Step.ReuseDeclaration(transferReasonsSuggestion)) : bVar.b();
        }
        L2(qVar);
    }

    public final void J2() {
        TransferReasonsFlowContract$State transferReasonsFlowContract$State = (TransferReasonsFlowContract$State) ((j2) this.u.f22677a).getValue();
        TransferReasonsFlowInputData transferReasonsFlowInputData = this.f92347q;
        dj0.d f92325a = transferReasonsFlowInputData.getF92325a();
        ttf.b bVar = transferReasonsFlowInputData.getF92327c().f92438a;
        TransferReasonCategory transferReasonCategory = transferReasonsFlowContract$State.f92332a;
        Set set = transferReasonsFlowContract$State.f92333b;
        List list = transferReasonsFlowContract$State.f92334c;
        List list2 = transferReasonsFlowContract$State.d;
        boolean z = transferReasonsFlowContract$State.e;
        this.o.getClass();
        n nVarA = o.a(f92325a, bVar, transferReasonCategory, set, list, list2, z);
        if (nVarA instanceof l) {
            K2(((l) nVarA).f248832a);
        } else {
            if (Intrinsics.f(nVarA, m.f248833a)) {
                h.t2(this, this.v, TransferReasonsFlowContract$Step.AmountAllocation.f92336a, false, null, false, 14);
                return;
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "TransferReasonsFlowModel", "Failed to collect results!", null, h0Var);
        }
    }

    public final void K2(TransferReasonsValues transferReasonsValues) {
        TransferReasonsFlowInputData transferReasonsFlowInputData = this.f92347q;
        if ((transferReasonsFlowInputData instanceof TransferReasonsFlowInputData.OpenForResult) || (transferReasonsFlowInputData instanceof TransferReasonsFlowInputData.EditForResult)) {
            C2(new dsf.e(transferReasonsValues));
            Unit unit = Unit.f186387a;
            return;
        }
        Continuation continuation = null;
        if (!(transferReasonsFlowInputData instanceof TransferReasonsFlowInputData.EditFromTransaction)) {
            if (!(transferReasonsFlowInputData instanceof TransferReasonsFlowInputData.CreateForPendingTransaction)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new e1(this, transferReasonsValues, continuation, 23), new yi5.b(26));
        } else {
            ttf.d dVar = ((TransferReasonsFlowContract$State) ((j2) this.u.f22677a).getValue()).f;
            if (dVar == null) {
                yji.l.a1(this, X1(d.b(this.f92346p)), null, null, null, 7);
            }
            if (dVar == null) {
                return;
            }
            l2(new qd8.e(this, dVar, transferReasonsValues, continuation, 10), new yi5.b(26));
        }
    }

    public final void L2(s sVar) {
        boolean z = sVar instanceof p;
        yki.a aVar = this.v;
        if (z) {
            p pVar = (p) sVar;
            h.t2(this, aVar, pVar.f248834a, pVar.f248835b, null, false, 12);
        } else if (sVar instanceof q) {
            h.w2(aVar, ((q) sVar).f248836a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            if (!(sVar instanceof r)) {
                throw new NoWhenBranchMatchedException();
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "TransferReasonsFlowModel", "Category is required for opening reasons list", null, h0Var);
            h.D2(aVar);
        }
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.u;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
