package ajh;

import cli.n;
import cli.y;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tzg.m;
import vkm.q;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends oki.h implements g {
    public final List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f5579p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.l f5580q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ybl.i f5581r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ejh.b f5582s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.c f5583t;
    public final y u;

    public l(List list, m wealthAccountsInteractor, ybl.l tradingConfigInteractor, ybl.i productGroupAvailabilityInteractor, ejh.b onboardingNavigationCommandFactory, n stateMapper) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(onboardingNavigationCommandFactory, "onboardingNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = list;
        this.f5579p = wealthAccountsInteractor;
        this.f5580q = tradingConfigInteractor;
        this.f5581r = productGroupAvailabilityInteractor;
        this.f5582s = onboardingNavigationCommandFactory;
        this.f5583t = new vii.c();
        this.u = mra.d.b(this, new f(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, com.revolut.data.database.models.openbanking.d.x("WealthAccountsGetStartedOnboardingScreenModel", "fetchAccounts", nim.a.v(q.Q(this.f5583t.a(Unit.f186387a, w4l.h.f294642c), new a0e.m(continuation, this, 16)), new afa.q(this, 12))), null, new af4.e(this, continuation, 15), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
