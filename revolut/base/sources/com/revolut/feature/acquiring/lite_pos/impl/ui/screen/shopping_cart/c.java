package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart;

import a2g.q;
import cd1.e;
import cli.g;
import cli.y;
import df1.k;
import df1.o;
import hd.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nd1.j;
import nd1.n;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends h implements k {
    public final n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rd1.a f60837p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f60838q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r f60839r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f60840s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f60841t;

    public c(o stateMapper, n shoppingCartInteractor, rd1.a actionBottomSheetControllerFactory, j paymentNotificationObserver, r paymentDelegate) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(shoppingCartInteractor, "shoppingCartInteractor");
        Intrinsics.checkNotNullParameter(actionBottomSheetControllerFactory, "actionBottomSheetControllerFactory");
        Intrinsics.checkNotNullParameter(paymentNotificationObserver, "paymentNotificationObserver");
        Intrinsics.checkNotNullParameter(paymentDelegate, "paymentDelegate");
        this.o = shoppingCartInteractor;
        this.f60837p = actionBottomSheetControllerFactory;
        this.f60838q = paymentNotificationObserver;
        this.f60839r = paymentDelegate;
        e.Companion.getClass();
        this.f60840s = d.b(this, new df1.h(e.f), stateMapper, null, false, 12);
        this.f60841t = hx7.e.a(this, new cwj.h(this, 25));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, this.o.c(), null, null, new d8j.c(this, continuation, 14), 3);
        l.a1(this, this.f60838q.f214295a, null, null, new q(this, continuation, 9), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f60841t;
    }

    @Override // cli.z
    public final g getState() {
        return this.f60840s;
    }
}
