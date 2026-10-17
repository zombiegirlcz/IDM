package wz6;

import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends oki.h implements dli.b {
    public final o7.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.b f301376p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f301377q;

    public g(o7.d freelancerPerksInteractor, i stateMapper) {
        Intrinsics.checkNotNullParameter(freelancerPerksInteractor, "freelancerPerksInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = freelancerPerksInteractor;
        this.f301376p = new vii.b();
        this.f301377q = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f301376p, new w2a.q(continuation, this, 26)), null, null, new wuh.q(this, continuation, 18), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f301377q;
    }
}
