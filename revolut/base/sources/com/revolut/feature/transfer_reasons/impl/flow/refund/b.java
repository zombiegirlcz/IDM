package com.revolut.feature.transfer_reasons.impl.flow.refund;

import com.revolut.feature.transfer_reasons.impl.flow.refund.TransferReasonsRefundFlowContract$Step;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasons;
import isf.d;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qsf.k;
import qsf.l;
import qsf.m;
import qsf.n;
import qsf.o;
import rd0.c;
import ssf.e;
import vkm.j2;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements ssf.b {

    @NotNull
    private static final e Companion = new e();
    public final o o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f92366p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TransferReasonsRefundFlowContract$InputData f92367q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f92368r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final csf.b f92369s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qki.d f92370t;
    public final yki.a u;

    public b(o collector, d dialogProvider, TransferReasonsRefundFlowContract$InputData inputData, k stateFactory, csf.b transferReasonsInteractor) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateFactory, "stateFactory");
        Intrinsics.checkNotNullParameter(transferReasonsInteractor, "transferReasonsInteractor");
        this.o = collector;
        this.f92366p = dialogProvider;
        this.f92367q = inputData;
        this.f92368r = stateFactory;
        this.f92369s = transferReasonsInteractor;
        this.f92370t = hx7.e.b(this, new TransferReasonsRefundFlowContract$State(null, null, null, null, 63));
        scl.h hVar = new scl.h(this, 26);
        this.u = cp5.d.a(this, TransferReasonsRefundFlowContract$Step.SelectTransaction.f92364a, f0.f322471a, hVar);
    }

    public final void I2() {
        ttf.b bVar;
        TransferReasonsRefundFlowContract$State transferReasonsRefundFlowContract$State = (TransferReasonsRefundFlowContract$State) ((j2) this.f92370t.f22677a).getValue();
        TransferReasons transferReasons = transferReasonsRefundFlowContract$State.f92356a;
        if (transferReasons == null || (bVar = transferReasons.f92438a) == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(c.ERROR, "TransferReasonsRefundFlowModel", "Failed to collect results!", null, h0Var);
            return;
        }
        dj0.d dVar = this.f92367q.f92353a;
        TransferReasonCategory transferReasonCategory = transferReasonsRefundFlowContract$State.f92357b;
        Set set = transferReasonsRefundFlowContract$State.f92358c;
        List list = transferReasonsRefundFlowContract$State.d;
        List list2 = transferReasonsRefundFlowContract$State.e;
        boolean z = transferReasonsRefundFlowContract$State.f;
        this.o.getClass();
        n nVarA = o.a(dVar, bVar, transferReasonCategory, set, list, list2, z);
        if (nVarA instanceof l) {
            C2(new dsf.e(((l) nVarA).f248832a));
        } else {
            if (Intrinsics.f(nVarA, m.f248833a)) {
                h.t2(this, this.u, TransferReasonsRefundFlowContract$Step.AmountAllocation.f92360a, false, null, false, 14);
                return;
            }
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(c.ERROR, "TransferReasonsRefundFlowModel", "Failed to collect results!", null, h0Var2);
        }
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f92370t;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
