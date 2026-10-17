package ta4;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import sqd.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends oki.h implements dli.b {
    public final ang.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f269095p;

    public j(ang.f userInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = userInteractor;
        this.f269095p = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new h0(this, null, 19), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f269095p;
    }
}
