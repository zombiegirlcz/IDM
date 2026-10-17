package np6;

import com.revolut.feature.feedback.api.flow.OneClickFeedbackFlowContract$InputData;
import com.revolut.feature.feedback.api.flow.OneClickFeedbackFlowContract$Step;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mp6.o;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements ap6.a {
    public final OneClickFeedbackFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f218151p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ParcelableDestination f218152q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f218153r;

    public b(OneClickFeedbackFlowContract$InputData inputData, o feedbackPendingShotProvider) {
        FlowStep comment;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(feedbackPendingShotProvider, "feedbackPendingShotProvider");
        this.o = inputData;
        this.f218151p = feedbackPendingShotProvider;
        boolean z = inputData instanceof OneClickFeedbackFlowContract$InputData.OneClickFeedback;
        OneClickFeedbackFlowContract$InputData.OneClickFeedback oneClickFeedback = z ? (OneClickFeedbackFlowContract$InputData.OneClickFeedback) inputData : null;
        this.f218152q = oneClickFeedback != null ? oneClickFeedback.f73141b : null;
        if (z) {
            comment = new OneClickFeedbackFlowContract$Step.OneClickFeedback(((OneClickFeedbackFlowContract$InputData.OneClickFeedback) inputData).f73140a);
        } else {
            if (!(inputData instanceof OneClickFeedbackFlowContract$InputData.Comment)) {
                throw new NoWhenBranchMatchedException();
            }
            OneClickFeedbackFlowContract$InputData.Comment comment2 = (OneClickFeedbackFlowContract$InputData.Comment) inputData;
            comment = new OneClickFeedbackFlowContract$Step.Comment(comment2.f73139b, comment2.f73138a, null);
        }
        this.f218153r = d.a(this, comment, f0.f322471a, new nk4.o(this, 11));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f218153r;
    }
}
