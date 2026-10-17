package qp6;

import cli.y;
import com.revolut.feature.feedback.impl.ui.screen.comment.FeedbackCommentContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import qp6.c;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends oki.h implements a {
    public final FeedbackCommentContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dp6.a f248301p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f248302q;

    public g(h mapper, FeedbackCommentContract$InputData inputData, dp6.a feedbackRepository) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(feedbackRepository, "feedbackRepository");
        this.o = inputData;
        this.f248301p = feedbackRepository;
        this.f248302q = mra.d.b(this, new b("", false, inputData.f73159c), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void K1() {
        if (((b) ((j2) this.f248302q.f22677a).getValue()).f248297b) {
            return;
        }
        C2(c.b.f248300a);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f248302q;
    }
}
