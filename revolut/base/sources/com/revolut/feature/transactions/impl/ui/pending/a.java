package com.revolut.feature.transactions.impl.ui.pending;

import com.revolut.feature.transactions.impl.ui.pending.PendingTransactionFlowContract$Step;
import com.revolut.feature.transactions.impl.ui.pending.screen.PendingTransactionScreen;
import com.revolut.feature.transactions.impl.ui.pending.screen.PendingTransactionScreenContract$InputData;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import fjd.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends g implements fnf.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final PendingTransactionFlowContract$InputData f92069t;
    public final PendingTransactionFlowContract$Step.PendingTransaction u;
    public final EmptyFlowState v;

    public a(PendingTransactionFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f92069t = inputData;
        this.u = PendingTransactionFlowContract$Step.PendingTransaction.f92068a;
        this.v = EmptyFlowState.f98428a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        PendingTransactionFlowContract$Step step = (PendingTransactionFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof PendingTransactionFlowContract$Step.PendingTransaction)) {
            throw new NoWhenBranchMatchedException();
        }
        PendingTransactionScreen pendingTransactionScreen = new PendingTransactionScreen(new PendingTransactionScreenContract$InputData(this.f92069t.f92067a));
        w wVar = new w(this, 19);
        Intrinsics.checkNotNullParameter(wVar, "<set-?>");
        pendingTransactionScreen.H = wVar;
        return pendingTransactionScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
