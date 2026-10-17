package com.revolut.retail.feature.airportlounges.impl.ui.flows.refund;

import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.refund.LoungePassRefundFlowContract$Step;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.AirportLoungePassDetailsRefundScreen;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rrd.l;
import rwi.b;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LoungePassRefundFlowContract$Step.Refund f99024t = LoungePassRefundFlowContract$Step.Refund.f99023a;
    public final LoungePassRefundFlowContract$EmptyState u = LoungePassRefundFlowContract$EmptyState.f99022a;

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        LoungePassRefundFlowContract$Step step = (LoungePassRefundFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof LoungePassRefundFlowContract$Step.Refund)) {
            throw new NoWhenBranchMatchedException();
        }
        AirportLoungePassDetailsRefundScreen airportLoungePassDetailsRefundScreen = new AirportLoungePassDetailsRefundScreen();
        l block = new l(this, 17);
        Intrinsics.checkNotNullParameter(block, "block");
        airportLoungePassDetailsRefundScreen.H = block;
        return airportLoungePassDetailsRefundScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f99024t;
    }
}
