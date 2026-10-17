package kzb;

import cli.y;
import com.revolut.feature.rev_points.api.navigation.RevPointsEarnOptionsScreenApi$InputData;
import klf.a3;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.l;
import vkm.q;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends oki.h implements g {
    public final RevPointsEarnOptionsScreenApi$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nyb.k f191089p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f191090q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f191091r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f191092s;

    public h(k stateMapper, RevPointsEarnOptionsScreenApi$InputData inputData, nyb.k revPointsInteractor, l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        this.o = inputData;
        this.f191089p = revPointsInteractor;
        this.f191090q = deeplinkRouter;
        this.f191091r = new vii.b();
        this.f191092s = mra.d.b(this, new f(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f191091r, new a3(continuation, this, 14)), null, null, new krc.h(this, continuation, 22), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f191092s;
    }
}
