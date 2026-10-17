package jig;

import cli.g;
import cli.n;
import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vfg.r;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends h implements dli.b {
    public final r o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.b f174487p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f174488q;

    public e(n stateMapper, r searchInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(searchInteractor, "searchInteractor");
        this.o = searchInteractor;
        this.f174487p = new vii.b();
        this.f174488q = mra.d.b(this, new c(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f174487p, new iw6.l(continuation, this, 18)), null, null, new j82.q(this, continuation, 29), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f174488q;
    }
}
