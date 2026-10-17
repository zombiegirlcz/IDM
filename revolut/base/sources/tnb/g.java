package tnb;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final djb.n f272377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final djb.u f272378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final elb.b f272379c;
    public final x79.a d;
    public final ou5.b e;
    public final xqe.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final aob.d f272380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ijb.a f272381h;
    public final gte.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wa7.m f272382j;
    public final ang.f k;

    public g(djb.n savingsAccountsDetailsInteractor, djb.u tradingOnboardingStatusProvider, elb.b savingsFeatureConfigInteractor, x79.a onHoldAccountInteractor, ou5.b juniorProfilesDataInteractor, xqe.b teenProfileInteractor, aob.d savingsProductAccountMapper, ijb.a savingsProductInteractor, gte.a featureToggleInteractor, wa7.m hiddenAccountsInteractor, gjb.b teenSavingsAccountIdResolver, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(tradingOnboardingStatusProvider, "tradingOnboardingStatusProvider");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        Intrinsics.checkNotNullParameter(onHoldAccountInteractor, "onHoldAccountInteractor");
        Intrinsics.checkNotNullParameter(juniorProfilesDataInteractor, "juniorProfilesDataInteractor");
        Intrinsics.checkNotNullParameter(teenProfileInteractor, "teenProfileInteractor");
        Intrinsics.checkNotNullParameter(savingsProductAccountMapper, "savingsProductAccountMapper");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(teenSavingsAccountIdResolver, "teenSavingsAccountIdResolver");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f272377a = savingsAccountsDetailsInteractor;
        this.f272378b = tradingOnboardingStatusProvider;
        this.f272379c = savingsFeatureConfigInteractor;
        this.d = onHoldAccountInteractor;
        this.e = juniorProfilesDataInteractor;
        this.f = teenProfileInteractor;
        this.f272380g = savingsProductAccountMapper;
        this.f272381h = savingsProductInteractor;
        this.i = featureToggleInteractor;
        this.f272382j = hiddenAccountsInteractor;
        this.k = userInteractor;
    }

    public final cxe.u a(ncd.h hVar) {
        return nim.a.y(ijb.a.a(this.f272381h, hVar, null, null, null, 14), new tlf.n(8));
    }

    public final Flow b(djb.k kVar) {
        return xam.a.h(new c(this, kVar, null), rd0.e.b(ue0.e.p(((rnb.i) this.f272377a).f(kVar, w4l.i.f294643c), h0.f322473a)));
    }

    public final Flow c() {
        return vkm.q.q(nim.a.v(this.k.j(w4l.j.f294644c), new tlf.n(10)));
    }
}
