package ahg;

import cli.y;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.see_all.TravelMilesAirlineSeeAllScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends oki.h implements k {
    public final TravelMilesAirlineSeeAllScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vfg.e f5124p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jwb.e f5125q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f5126r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f5127s;

    public n(cli.n stateMapper, TravelMilesAirlineSeeAllScreenContract$InputData inputData, vfg.e airlinesInteractor, jwb.e revPointsGiftcardsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(airlinesInteractor, "airlinesInteractor");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsInteractor, "revPointsGiftcardsInteractor");
        this.o = inputData;
        this.f5124p = airlinesInteractor;
        this.f5125q = revPointsGiftcardsInteractor;
        this.f5126r = new vii.b();
        this.f5127s = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.n(vkm.q.Q(this.f5126r, new a0e.m(continuation, this, 14)), h0.f322473a), null, null, new m(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f5127s;
    }
}
