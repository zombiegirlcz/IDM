package x0l;

import cli.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import ybl.l;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends oki.h implements dli.b {
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.c f301660p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f301661q;

    public i(j stateMapper, l configInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        this.o = configInteractor;
        this.f301660p = new vii.c();
        this.f301661q = mra.d.b(this, new a(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f301660p.a(Unit.f186387a, w4l.h.f294642c), new w2a.q(continuation, this, 28)), null, null, new wuh.q(this, continuation, 21), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f301661q;
    }
}
