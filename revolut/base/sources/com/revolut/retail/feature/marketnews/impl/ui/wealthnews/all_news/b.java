package com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news;

import cli.y;
import g1k.c;
import g1k.g;
import g1k.i;
import g1k.l;
import g1k.w;
import g1k.x;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements c {
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g1k.b f101861p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final aah.h f101862q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f101863r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f101864s;

    public b(WealthAllNewsContract$InputData inputData, w stateMapper, l pagingSource, g1k.b newsGrouper, aah.h wealthDisclaimersControllerModelExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(newsGrouper, "newsGrouper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersControllerModelExtension, "wealthDisclaimersControllerModelExtension");
        this.o = pagingSource;
        this.f101861p = newsGrouper;
        this.f101862q = wealthDisclaimersControllerModelExtension;
        this.f101863r = d.b(this, new g1k.d(6, x.a(inputData.f101859a)), stateMapper, null, false, 12);
        this.f101864s = e.a(this, new fv1.a(this, 20));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, nim.a.u(new i(this, continuation, 0), this.o.j(250L)), null, null, new g(this, continuation, 1), 3);
        l2(new g1k.h(this, continuation, 1), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f101864s;
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, nim.a.v(this.f101862q.f2828l.w0(), new g1.c(29)), null, new g(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f101863r;
    }
}
