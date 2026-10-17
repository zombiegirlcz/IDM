package nn8;

import amh.w;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final hn8.b f217485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kd8.e f217486m;

    public g(hn8.b juniorQrCodePushInterceptor, kd8.e juniorConsentInteractor) {
        Intrinsics.checkNotNullParameter(juniorQrCodePushInterceptor, "juniorQrCodePushInterceptor");
        Intrinsics.checkNotNullParameter(juniorConsentInteractor, "juniorConsentInteractor");
        this.f217485l = juniorQrCodePushInterceptor;
        this.f217486m = juniorConsentInteractor;
    }

    @Override // nn8.a
    public final w Z2(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        return new w(q.Q(new ahd.c(((pn8.a) this.f217485l).f237678a, juniorId, 6), new mki.d((Continuation) null, this, juniorId)), 19);
    }
}
