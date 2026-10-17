package wf4;

import cli.k;
import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends oki.h implements dli.b {
    public final mf4.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f296971p;

    public h(mf4.e offerFlowInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(offerFlowInteractor, "offerFlowInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = offerFlowInteractor;
        this.f296971p = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f296971p;
    }
}
