package tp6;

import cli.y;
import com.revolut.feature.feedback.impl.ui.screen.one_click.OneClickFeedbackContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import tp6.d;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends oki.h implements a {
    public final OneClickFeedbackContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dp6.a f273298p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f273299q;

    public g(h mapper, OneClickFeedbackContract$InputData inputData, dp6.a feedbackRepository) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(feedbackRepository, "feedbackRepository");
        this.o = inputData;
        this.f273298p = feedbackRepository;
        this.f273299q = mra.d.b(this, new b(false), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void K1() {
        if (((b) ((j2) this.f273299q.f22677a).getValue()).f273290a) {
            return;
        }
        C2(d.a.f273293a);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f273299q;
    }
}
