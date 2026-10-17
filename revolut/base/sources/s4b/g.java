package s4b;

import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import p2b.i;
import rt4.o;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends h implements c {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.c f259807p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f259808q;

    public g(i cfdRiskWarningInteractor, f stateMapper) {
        Intrinsics.checkNotNullParameter(cfdRiskWarningInteractor, "cfdRiskWarningInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = cfdRiskWarningInteractor;
        this.f259807p = new vii.c();
        this.f259808q = mra.d.b(this, new d(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(oi0.d.w(this.f259807p), new r3k.c(continuation, this, 22)), null, null, new o(this, continuation, 28), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f259808q;
    }
}
