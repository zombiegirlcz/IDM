package m4b;

import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import p2b.i;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends h implements c {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.c f202689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f202690q;

    public g(i cfdRiskWarningInteractor, f stateMapper) {
        Intrinsics.checkNotNullParameter(cfdRiskWarningInteractor, "cfdRiskWarningInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = cfdRiskWarningInteractor;
        this.f202689p = new vii.c();
        this.f202690q = mra.d.b(this, new d(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(oi0.d.w(this.f202689p), new li2.f(continuation, this, 20)), null, null, new lph.h(this, continuation, 22), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f202690q;
    }
}
