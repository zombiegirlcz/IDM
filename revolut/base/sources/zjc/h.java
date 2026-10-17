package zjc;

import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends oki.h implements dli.b {
    public final a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bgc.e f322785p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f322786q;

    public h(a inputData, bgc.e rewardsInteractor, l stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f322785p = rewardsInteractor;
        this.f322786q = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f322786q;
    }
}
