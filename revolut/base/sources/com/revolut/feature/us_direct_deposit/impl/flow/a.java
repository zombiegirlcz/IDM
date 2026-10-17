package com.revolut.feature.us_direct_deposit.impl.flow;

import com.revolut.feature.us_direct_deposit.impl.atomic.AtomicScreen;
import com.revolut.feature.us_direct_deposit.impl.flow.DirectDepositFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import fjd.w;
import flg.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DirectDepositFlowContract$Step.Atomic f94580t = DirectDepositFlowContract$Step.Atomic.f94579a;
    public final DirectDepositFlowContract$EmptyState u = DirectDepositFlowContract$EmptyState.f94578a;

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        DirectDepositFlowContract$Step step = (DirectDepositFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof DirectDepositFlowContract$Step.Atomic)) {
            throw new NoWhenBranchMatchedException();
        }
        AtomicScreen atomicScreen = new AtomicScreen();
        w wVar = new w(this, 7);
        Intrinsics.checkNotNullParameter(wVar, "<set-?>");
        atomicScreen.H = wVar;
        return atomicScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f94580t;
    }
}
