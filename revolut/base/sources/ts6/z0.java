package ts6;

import et6.q1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends nri.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f274039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q06.d f274040c;
    public final h1b.b d;
    public final t0 e;
    public final q1 f;

    public z0(CoroutineScope coroutineScope, q06.d deeplinkParser, h1b.b appsFlyerDeeplinkObserver, t0 freelancerDeeplinkHandler, q1 freelancerJoinCampaignInteractor) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(appsFlyerDeeplinkObserver, "appsFlyerDeeplinkObserver");
        Intrinsics.checkNotNullParameter(freelancerDeeplinkHandler, "freelancerDeeplinkHandler");
        Intrinsics.checkNotNullParameter(freelancerJoinCampaignInteractor, "freelancerJoinCampaignInteractor");
        this.f274039b = coroutineScope;
        this.f274040c = deeplinkParser;
        this.d = appsFlyerDeeplinkObserver;
        this.e = freelancerDeeplinkHandler;
        this.f = freelancerJoinCampaignInteractor;
    }

    @Override // nri.a
    public final void i3() {
        skm.e0.C(this.f274039b, null, null, new tjf.p0(this, null, 9), 3);
    }
}
