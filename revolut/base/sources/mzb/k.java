package mzb;

import cli.y;
import com.revolut.feature.rev_points.impl.ui.learn.RevPointsLearnScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.l;
import vkm.q;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends oki.h implements i {
    public final RevPointsLearnScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nyb.k f210754p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f210755q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f210756r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f210757s;

    public k(i3g.k stateMapper, RevPointsLearnScreenContract$InputData inputData, nyb.k revPointsInteractor, l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        this.o = inputData;
        this.f210754p = revPointsInteractor;
        this.f210755q = deeplinkRouter;
        this.f210756r = new vii.b();
        this.f210757s = mra.d.b(this, new h(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f210756r, new mk0.f(continuation, this, 11)), null, null, new mx5.g(this, continuation, 10), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f210757s;
    }
}
