package com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings;

import cli.g;
import cli.y;
import et6.p1;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okf.m;
import oki.h;
import or4.i;
import ox5.r;
import oy6.f;
import oy6.k;
import qy6.d;
import vii.b;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements k {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p1 f73934p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f73935q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f73936r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f73937s;

    public a(d dialogFactory, p1 invoiceInteractor, i3g.k stateMapper) {
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(invoiceInteractor, "invoiceInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = dialogFactory;
        this.f73934p = invoiceInteractor;
        this.f73935q = new b();
        this.f73936r = mra.d.b(this, new f(0), stateMapper, null, false, 12);
        this.f73937s = e.a(this, new i(this, 15));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f73935q, new m(continuation, this, 13)), null, null, new r(this, continuation, 3), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f73937s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f73936r;
    }
}
