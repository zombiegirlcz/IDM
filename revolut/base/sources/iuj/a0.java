package iuj;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 extends oki.h implements v {
    public final stj.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wwa.b f168624p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f168625q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wli.x f168626r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f168627s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cli.y f168628t;

    public a0(cq9.m stateMapper, stj.h rewardsHubInteractor, wwa.b inviteCampaignHomeInteractor, gte.a featureToggleInteractor, wli.x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(rewardsHubInteractor, "rewardsHubInteractor");
        Intrinsics.checkNotNullParameter(inviteCampaignHomeInteractor, "inviteCampaignHomeInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = rewardsHubInteractor;
        this.f168624p = inviteCampaignHomeInteractor;
        this.f168625q = featureToggleInteractor;
        this.f168626r = deeplinkHandler;
        this.f168627s = new vii.b();
        this.f168628t = mra.d.b(this, new o(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        x xVar = new x(2, this, continuation);
        vii.b bVar = this.f168627s;
        yji.l.a1(this, vkm.q.Q(bVar, xVar), null, null, new y(2, this, null), 3);
        yji.l.a1(this, vkm.q.Q(bVar, new x(1, this, continuation)), null, null, new y(1, this, null), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, vkm.q.Q(this.f168627s, new x(0, this, null)), null, new y(0, this, null), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f168628t;
    }
}
