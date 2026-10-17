package j8k;

import cli.g;
import cli.k;
import cli.y;
import imk.p0;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zjh.j;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends h implements c {
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f172225p;

    public d(j optOutInteractor, e stateMapper) {
        Intrinsics.checkNotNullParameter(optOutInteractor, "optOutInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = optOutInteractor;
        this.f172225p = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // fpa.e
    public final void N() {
        l2(new p0(this, null, 19), new yi5.b(26));
    }

    @Override // cli.z
    public final g getState() {
        return this.f172225p;
    }
}
