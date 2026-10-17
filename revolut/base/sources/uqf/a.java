package uqf;

import com.revolut.feature.transfer.core.impl.ui.reference.ReferenceScreen;
import com.revolut.feature.transfer.core.impl.ui.reference.flow.ReferenceFlowContract$InputData;
import com.revolut.feature.transfer.core.impl.ui.reference.flow.ReferenceFlowContract$State;
import com.revolut.feature.transfer.core.impl.ui.reference.flow.ReferenceFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import dki.s;
import kotlin.jvm.internal.Intrinsics;
import uif.d;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends g implements s {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ReferenceFlowContract$InputData f282122t;
    public final vqf.a u;
    public final ReferenceFlowContract$Step v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ReferenceFlowContract$State f282123w;

    public a(ReferenceFlowContract$InputData inputData, vqf.a resultObserver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(resultObserver, "resultObserver");
        this.f282122t = inputData;
        this.u = resultObserver;
        this.v = ReferenceFlowContract$Step.f92222a;
        this.f282123w = ReferenceFlowContract$State.f92221a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        ReferenceFlowContract$Step step = (ReferenceFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        ReferenceFlowContract$InputData referenceFlowContract$InputData = this.f282122t;
        ReferenceScreen referenceScreen = new ReferenceScreen(referenceFlowContract$InputData.f92220b);
        d dVar = new d(referenceFlowContract$InputData, this, 15);
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        referenceScreen.H = dVar;
        return referenceScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f282123w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
