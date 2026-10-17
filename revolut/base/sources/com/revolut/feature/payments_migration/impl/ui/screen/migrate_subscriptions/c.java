package com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions;

import au.c0;
import cli.y;
import d6a.i;
import d6a.m;
import g6a.f;
import g6a.g;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o7.d;
import oki.h;
import vkm.q;
import wli.x;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends h implements g {
    public final v5a.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v5a.g f80265p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f80266q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f80267r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f80268s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f80269t;
    public final vii.b u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f80270w;

    public c(v5a.c paymentsMigrationInteractor, v5a.g termsAndConditionsHelper, d cardsProvider, i providerClickActionProvider, m providersSearchHelper, x deeplinkHandler, ac4.g stateMapper) {
        Intrinsics.checkNotNullParameter(paymentsMigrationInteractor, "paymentsMigrationInteractor");
        Intrinsics.checkNotNullParameter(termsAndConditionsHelper, "termsAndConditionsHelper");
        Intrinsics.checkNotNullParameter(cardsProvider, "cardsProvider");
        Intrinsics.checkNotNullParameter(providerClickActionProvider, "providerClickActionProvider");
        Intrinsics.checkNotNullParameter(providersSearchHelper, "providersSearchHelper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = paymentsMigrationInteractor;
        this.f80265p = termsAndConditionsHelper;
        this.f80266q = cardsProvider;
        this.f80267r = providerClickActionProvider;
        this.f80268s = providersSearchHelper;
        this.f80269t = deeplinkHandler;
        this.u = new vii.b();
        this.v = mra.d.b(this, new f(0), stateMapper, null, false, 12);
        this.f80270w = e.a(this, new fv1.a(this, 28));
    }

    @Override // yji.l
    public final void I1() {
        l2(new a(this, null), new yi5.b(26));
        l2(new ft.d(this, null, 28), new yi5.b(26));
    }

    public final void I2(boolean z) {
        Continuation continuation = null;
        l.a1(this, rd0.e.n(q.Q(this.u, new f5h.b(continuation, this, 29)), h0.f322473a), null, null, new c0(4, continuation, this, z), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f80270w;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
