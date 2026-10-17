package raf;

import cli.y;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends oki.h implements h {
    public final o9f.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c1l.e f252838p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.l f252839q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ba8.f f252840r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.c f252841s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f252842t;

    public n(q stateMapper, o9f.a accountsForTransferInteractor, c1l.e tradingOnboardingStartCommandProvider, ybl.l tradingConfigInteractor, ba8.f juniorIsaNaviProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(accountsForTransferInteractor, "accountsForTransferInteractor");
        Intrinsics.checkNotNullParameter(tradingOnboardingStartCommandProvider, "tradingOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(juniorIsaNaviProvider, "juniorIsaNaviProvider");
        this.o = accountsForTransferInteractor;
        this.f252838p = tradingOnboardingStartCommandProvider;
        this.f252839q = tradingConfigInteractor;
        this.f252840r = juniorIsaNaviProvider;
        this.f252841s = new vii.c();
        this.f252842t = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, prk.o.w("NewTransferAccountSelectorScreenModel", "fetchAccountsForTransfer", vkm.q.Q(this.f252841s.a(Unit.f186387a, w4l.h.f294642c), new r3k.c(null, this, 3))), null, new j(this, null, 0), 3);
        yji.l.b1(this, com.revolut.data.database.models.openbanking.d.x("NewTransferAccountSelectorScreenModel", "fetchTradingContext", ybl.l.d(this.f252839q)), null, new j(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f252842t;
    }
}
