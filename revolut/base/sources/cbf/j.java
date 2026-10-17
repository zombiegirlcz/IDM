package cbf;

import bw4.s;
import cli.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import ybl.l;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends oki.h implements dli.b {
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.c f22798p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f22799q;

    public j(k stateMapper, l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.o = tradingConfigInteractor;
        this.f22798p = new vii.c();
        this.f22799q = mra.d.b(this, new g(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f22798p.a(Unit.f186387a, w4l.h.f294642c), new s(continuation, this, 10)), null, null, new c1i.f(this, continuation, 29), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f22799q;
    }
}
