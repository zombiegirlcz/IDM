package pk8;

import cli.n;
import cli.y;
import kk8.k;
import kotlin.jvm.internal.Intrinsics;
import pe2.l;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends oki.h implements dli.b {
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f236942p;

    public i(n stateMapper, k interactor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.o = interactor;
        this.f236942p = mra.d.b(this, new d(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new l(this, null, 13), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f236942p;
    }
}
