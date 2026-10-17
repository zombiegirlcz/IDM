package kp6;

import aii.e;
import aii.g;
import com.revolut.feature.feedback.api.di.FeedbackApi$FeedbackToggles$WorkflowStepNpsRedesign;
import com.revolut.feature.feedback.api.flow.OneClickFeedbackFlowContract$InputData;
import com.revolut.feature.feedback.api.navigation.FeedbackDestination;
import com.revolut.feature.feedback.api.navigation.OneClickFeedbackDestination;
import com.revolut.feature.feedback.api.navigation.OneClickFeedbackFlowDescriptor;
import com.revolut.feature.feedback.impl.ui.flow.one_click.OneClickFeedbackFlow;
import com.revolut.feature.feedback.impl.ui.screen.FeedbackContract$InputData;
import com.revolut.feature.feedback.impl.ui.screen.FeedbackController;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof OneClickFeedbackFlowDescriptor)) {
            return null;
        }
        OneClickFeedbackFlowDescriptor oneClickFeedbackFlowDescriptor = (OneClickFeedbackFlowDescriptor) descriptor;
        return oneClickFeedbackFlowDescriptor.a(new OneClickFeedbackFlow(oneClickFeedbackFlowDescriptor.f73153a));
    }

    @Override // nte.a
    public final List e() {
        return u.c(FeedbackApi$FeedbackToggles$WorkflowStepNpsRedesign.f73123c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof FeedbackDestination) {
            FeedbackDestination feedbackDestination = (FeedbackDestination) destination;
            FeedbackDestination.InputData inputData = feedbackDestination.f73146b;
            return new FeedbackController(new FeedbackContract$InputData(inputData.f73148a, inputData.f73149b, feedbackDestination.f73147c));
        }
        if (!(destination instanceof OneClickFeedbackDestination)) {
            return null;
        }
        OneClickFeedbackDestination.InputData inputData2 = ((OneClickFeedbackDestination) destination).f73150b;
        return new OneClickFeedbackFlow(new OneClickFeedbackFlowContract$InputData.OneClickFeedback(inputData2.f73152b, inputData2.f73151a));
    }
}
