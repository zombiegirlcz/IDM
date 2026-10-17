package apd;

import anf.p;
import kotlin.jvm.internal.Intrinsics;
import r10.t;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mmd.b f8162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f8163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ufm.d f8164c;
    public final lmd.a d;
    public final t e;
    public final dsd.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hj8.a f8165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nqj.c f8166h;
    public final gte.a i;

    public f(mmd.b netWorthInteractor, wsg.n walletInteractor, ufm.d juniorNetWorthGroupProvider, lmd.a analyticsInteractor, t balanceHistoryProvider, dsd.f balanceSourceMapper, hj8.a juniorProfileInteractor, nqj.c balanceHistoryInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(netWorthInteractor, "netWorthInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorNetWorthGroupProvider, "juniorNetWorthGroupProvider");
        Intrinsics.checkNotNullParameter(analyticsInteractor, "analyticsInteractor");
        Intrinsics.checkNotNullParameter(balanceHistoryProvider, "balanceHistoryProvider");
        Intrinsics.checkNotNullParameter(balanceSourceMapper, "balanceSourceMapper");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(balanceHistoryInteractor, "balanceHistoryInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f8162a = netWorthInteractor;
        this.f8163b = walletInteractor;
        this.f8164c = juniorNetWorthGroupProvider;
        this.d = analyticsInteractor;
        this.e = balanceHistoryProvider;
        this.f = balanceSourceMapper;
        this.f8165g = juniorProfileInteractor;
        this.f8166h = balanceHistoryInteractor;
        this.i = featureToggleInteractor;
    }

    public final akg.n a(String str, String str2) {
        return nim.a.v(u0.i(str2 != null ? zi0.c.i(str2) : nim.a.A(nim.a.v(hj8.a.a(this.f8165g, str, w4l.h.f294642c), new p(26)), new p(27)), rd0.e.b(this.f8163b.a0(str, false)), this.f8164c.i(str)), new ak7.g(str, 9));
    }
}
