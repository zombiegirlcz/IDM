package com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home;

import a29.b;
import cli.y;
import hx7.e;
import iyg.b0;
import jkh.g;
import k8g.k;
import k8g.m;
import k8g.o;
import k8g.p;
import k8g.q;
import k8g.r;
import k8g.u;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nyb.m0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qr0.i;
import tnb.g0;
import tsk.t;
import u2f.j;
import ue0.c;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements m {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final j f93605y = j.HOTEL_LOYALTY_TRANSFERS;
    public final t o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f93606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g0 f93607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f93608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m0 f93609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f93610t;
    public final vii.b u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f93611w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f93612x;

    public a(u stateMapper, t tradeRevPointsAccountsInteractor, i tradeRevPointsAgentsInteractor, g0 tradeRevPointsOnboardingInteractor, b lifestyleBorderlessFooterFactory, m0 revPointsTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(tradeRevPointsAccountsInteractor, "tradeRevPointsAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradeRevPointsAgentsInteractor, "tradeRevPointsAgentsInteractor");
        Intrinsics.checkNotNullParameter(tradeRevPointsOnboardingInteractor, "tradeRevPointsOnboardingInteractor");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooterFactory, "lifestyleBorderlessFooterFactory");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        this.o = tradeRevPointsAccountsInteractor;
        this.f93606p = tradeRevPointsAgentsInteractor;
        this.f93607q = tradeRevPointsOnboardingInteractor;
        this.f93608r = lifestyleBorderlessFooterFactory;
        this.f93609s = revPointsTransactionsInteractor;
        this.f93610t = new vii.b();
        this.u = new vii.b();
        this.v = new vii.b();
        this.f93611w = d.b(this, new k(0), stateMapper, null, false, 12);
        this.f93612x = e.a(this, new k3k.k(this, 12));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new q(0, this, continuation), new yi5.b(26));
        l.a1(this, yh5.b.e(vkm.q.Q(this.f93610t, new p(0, this, continuation)), vkm.q.Q(this.u, new p(1, this, continuation)), vkm.q.Q(this.v, new p(2, this, continuation))), null, null, new r(0, this, continuation), 3);
        l.a1(this, ((x29.b) this.f93608r).a(), null, null, new r(1, this, continuation), 3);
        g0 g0Var = this.f93607q;
        g0Var.getClass();
        j product = f93605y;
        Intrinsics.checkNotNullParameter(product, "product");
        k1f.k kVar = (k1f.k) g0Var.f272384b;
        Intrinsics.checkNotNullParameter(product, "product");
        c cVar = kVar.f180238a;
        k1f.k.Companion.getClass();
        Intrinsics.checkNotNullParameter(product, "product");
        l.a1(this, rd0.e.e(new b0(cVar.C0(j6.a.q("IS_ONBOARDING_BANNER_CLOSED_", product.name()), Boolean.TYPE), 12), h0.f322473a, new i23.c(3, 9, continuation)), null, null, new g(this, continuation, 3), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f93612x;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f93611w;
    }
}
