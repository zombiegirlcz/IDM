package com.revolut.feature.transport.impl.ui;

import com.revolut.feature.transport.api.navigation.TransportFlowInputData;
import com.revolut.feature.transport.api.navigation.TransportStartType;
import com.revolut.feature.transport.impl.ui.TransportFlowContract$Step;
import com.revolut.feature.transport.impl.ui.hub.TransportHubFlow;
import com.revolut.feature.transport.impl.ui.hub.TransportHubFlowContract$InputData;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qsa.p;
import qvf.b;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TransportFlowContract$Step.Home f92508t;
    public final EmptyFlowState u;

    public a(TransportFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        TransportStartType transportStartType = inputData.f92497a;
        if (!(transportStartType instanceof TransportStartType.Hub)) {
            throw new NoWhenBranchMatchedException();
        }
        this.f92508t = new TransportFlowContract$Step.Home((TransportStartType.Hub) transportStartType);
        this.u = EmptyFlowState.f98428a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        TransportFlowContract$Step step = (TransportFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof TransportFlowContract$Step.Home)) {
            throw new NoWhenBranchMatchedException();
        }
        TransportHubFlow transportHubFlow = new TransportHubFlow(new TransportHubFlowContract$InputData(((TransportFlowContract$Step.Home) step).f92507a));
        p pVar = new p(24);
        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
        transportHubFlow.I = pVar;
        return transportHubFlow;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f92508t;
    }
}
