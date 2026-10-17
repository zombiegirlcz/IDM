package y4a;

import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.RecipientSelectionScreen;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.flow.RecipientSelectionFlowContract$InputData;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.flow.RecipientSelectionFlowContract$State;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.flow.RecipientSelectionFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.jvm.internal.Intrinsics;
import xyc.j;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends g implements a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RecipientSelectionFlowContract$InputData f310854t;
    public final h4a.a u;
    public final RecipientSelectionFlowContract$Step v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RecipientSelectionFlowContract$State f310855w;

    public b(RecipientSelectionFlowContract$InputData inputData, h4a.a resultObserver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(resultObserver, "resultObserver");
        this.f310854t = inputData;
        this.u = resultObserver;
        this.v = RecipientSelectionFlowContract$Step.f80145a;
        this.f310855w = RecipientSelectionFlowContract$State.f80144a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        RecipientSelectionFlowContract$Step step = (RecipientSelectionFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        RecipientSelectionFlowContract$InputData recipientSelectionFlowContract$InputData = this.f310854t;
        RecipientSelectionScreen recipientSelectionScreen = new RecipientSelectionScreen(recipientSelectionFlowContract$InputData.f80143b);
        j jVar = new j(recipientSelectionFlowContract$InputData, this, 18);
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        recipientSelectionScreen.H = jVar;
        return recipientSelectionScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f310855w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
