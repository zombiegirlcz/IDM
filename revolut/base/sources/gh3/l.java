package gh3;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_step_details.ChecklistStepDetailsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import wli.x;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends oki.h implements h {
    public final ChecklistStepDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wg3.a f143846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bil.a f143847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f143848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f80.a f143849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f143850t;
    public final y u;

    public l(cli.n stateMapper, ChecklistStepDetailsScreenContract$InputData inputData, wg3.a interactor, bil.a detailsUIBlocksProvider, x deeplinkHandler, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(detailsUIBlocksProvider, "detailsUIBlocksProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.o = inputData;
        this.f143846p = interactor;
        this.f143847q = detailsUIBlocksProvider;
        this.f143848r = deeplinkHandler;
        this.f143849s = uriHelper;
        this.f143850t = new vii.b(w4l.i.f294643c);
        this.u = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, q.Q(this.f143850t, new g6f.l(continuation, this, 4)), null, new gaa.g(this, continuation, 22), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
