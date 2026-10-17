package r07;

import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends oki.h implements dli.b {
    public final a61.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r10.f f250715p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r10.d f250716q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f250717r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f250718s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f250719t;

    public h(a61.a taxHubConfigurationInteractor, r10.f taxHubProfileInteractor, r10.d taxHubCalendarEventsInteractor, ang.f userInteractor, j stateMapper) {
        Intrinsics.checkNotNullParameter(taxHubConfigurationInteractor, "taxHubConfigurationInteractor");
        Intrinsics.checkNotNullParameter(taxHubProfileInteractor, "taxHubProfileInteractor");
        Intrinsics.checkNotNullParameter(taxHubCalendarEventsInteractor, "taxHubCalendarEventsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = taxHubConfigurationInteractor;
        this.f250715p = taxHubProfileInteractor;
        this.f250716q = taxHubCalendarEventsInteractor;
        this.f250717r = userInteractor;
        this.f250718s = new vii.b();
        this.f250719t = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f250718s, new q7b.j(continuation, this, 26)), null, null, new qp7.g(this, continuation, 16), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f250719t;
    }
}
