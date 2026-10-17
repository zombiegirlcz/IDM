package com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed;

import a18.c;
import cli.g;
import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l3d.h0;
import m0k.e;
import oki.h;
import org.jetbrains.annotations.NotNull;
import tzg.m;
import vkm.j2;
import vkm.t0;
import x18.f;
import x18.p;
import x18.q;
import ybl.d;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements p {

    @NotNull
    private static final x18.a Companion = new x18.a();
    public final j2 A;
    public final vii.b B;
    public final SmartFeedScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jt0.b f76442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f76443q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f76444r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f76445s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f76446t;
    public final h0 u;
    public final q18.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final onh.b f76447w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y08.a f76448x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f76449y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public b(x18.y stateMapper, SmartFeedScreenContract$InputData inputData, jt0.b feedInteractor, c recentInsightsModelExtension, e wealthNewsInteractor, m wealthAccountsInteractor, d portfolioInteractor, h0 watchlistInteractor, q18.h destinationProvider, onh.b disclaimersProvider, y08.a compliancePopupModelExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(feedInteractor, "feedInteractor");
        Intrinsics.checkNotNullParameter(recentInsightsModelExtension, "recentInsightsModelExtension");
        Intrinsics.checkNotNullParameter(wealthNewsInteractor, "wealthNewsInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(watchlistInteractor, "watchlistInteractor");
        Intrinsics.checkNotNullParameter(destinationProvider, "destinationProvider");
        Intrinsics.checkNotNullParameter(disclaimersProvider, "disclaimersProvider");
        Intrinsics.checkNotNullParameter(compliancePopupModelExtension, "compliancePopupModelExtension");
        this.o = inputData;
        this.f76442p = feedInteractor;
        this.f76443q = recentInsightsModelExtension;
        this.f76444r = wealthNewsInteractor;
        this.f76445s = wealthAccountsInteractor;
        this.f76446t = portfolioInteractor;
        this.u = watchlistInteractor;
        this.v = destinationProvider;
        this.f76447w = disclaimersProvider;
        this.f76448x = compliancePopupModelExtension;
        this.f76449y = mra.d.b(this, new q(0), stateMapper, null, false, 12);
        this.z = hx7.e.a(this, new wtj.c(this, 27));
        this.A = vkm.q.c(null);
        this.B = new vii.b();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new f(this, continuation, 0), new yi5.b(26));
        j2 j2Var = this.A;
        l.a1(this, new t0(j2Var, 1), null, null, new x18.d(this, continuation, 2), 3);
        l.a1(this, (j2) ((r18.m) this.f76443q).f250923p.f22677a, null, null, new x18.d(this, continuation, 1), 3);
        l.a1(this, vkm.q.Q(yh5.b.d(this.B, new t0(j2Var, 1)), new x18.e(continuation, this, 0)), null, null, new x18.d(this, continuation, 3), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, nim.a.v(((z0h.d) this.f76447w.f226950b).w0(), new q09.a(17)), null, new x18.d(this, continuation, 0), 3);
        n2(new f(this, continuation, 3), new whi.b(6));
    }

    @Override // cli.z
    public final g getState() {
        return this.f76449y;
    }
}
