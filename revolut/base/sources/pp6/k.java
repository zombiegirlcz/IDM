package pp6;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.feedback.impl.ui.screen.FeedbackContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import om4.d0;
import pfk.o0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends oki.h implements a {
    public final FeedbackContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dp6.a f238287p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final skd.i f238288q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d0 f238289r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f238290s;

    public k(l mapper, FeedbackContract$InputData inputData, dp6.a feedbackRepository, skd.i slotManagerInteractor, d0 mainSlotContextProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(feedbackRepository, "feedbackRepository");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(mainSlotContextProvider, "mainSlotContextProvider");
        this.o = inputData;
        this.f238287p = feedbackRepository;
        this.f238288q = slotManagerInteractor;
        this.f238289r = mainSlotContextProvider;
        this.f238290s = mra.d.b(this, new b(new Data(null, null, true, 3, null), "", null, h0.f322473a), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        FeedbackContract$InputData feedbackContract$InputData = this.o;
        yo6.d referenceType = feedbackContract$InputData.f73155b;
        String referenceId = feedbackContract$InputData.f73154a;
        lp6.m mVar = (lp6.m) this.f238287p;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        yji.l.a1(this, mVar.e.c(new lp6.d(referenceId, referenceType), false), null, null, new o0(this, (Continuation) null, 28), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f238290s;
    }
}
