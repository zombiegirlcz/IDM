package sw6;

import cli.y;
import et6.h1;
import gr6.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import s9b.n;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends oki.h implements dli.b {
    public final o o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h1 f266120p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l61.a f266121q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f266122r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f266123s;

    public h(o freelancerProcessingFeesInteractor, h1 freelancerInteractor, l61.a userCompanyInteractor, kxk.o stateMapper) {
        Intrinsics.checkNotNullParameter(freelancerProcessingFeesInteractor, "freelancerProcessingFeesInteractor");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = freelancerProcessingFeesInteractor;
        this.f266120p = freelancerInteractor;
        this.f266121q = userCompanyInteractor;
        this.f266122r = new vii.b();
        this.f266123s = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f266122r, new n(continuation, this, 12)), null, null, new sek.q(this, continuation, 23), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f266123s;
    }
}
