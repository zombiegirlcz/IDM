package u07;

import cli.y;
import et6.h1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends oki.h implements dli.b {
    public final a61.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r10.f f276086p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h1 f276087q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f276088r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f276089s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f276090t;

    public l(a61.a taxHubConfigurationInteractor, r10.f taxHubProfileInteractor, h1 freelancerInteractor, ang.f userInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(taxHubConfigurationInteractor, "taxHubConfigurationInteractor");
        Intrinsics.checkNotNullParameter(taxHubProfileInteractor, "taxHubProfileInteractor");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = taxHubConfigurationInteractor;
        this.f276086p = taxHubProfileInteractor;
        this.f276087q = freelancerInteractor;
        this.f276088r = userInteractor;
        this.f276089s = new vii.b();
        this.f276090t = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f276089s, new tik.b(continuation, this, 15)), null, null, new tz6.e(this, continuation, 4), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f276090t;
    }
}
