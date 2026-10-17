package com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity;

import aqd.o1;
import bbd.c;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import dwi.c0;
import hwi.h0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import svi.y0;
import vkm.j2;
import vkm.q;
import w4l.i;
import xnl.f;
import xxi.e;
import xxi.k;
import xxi.m;
import yi5.b;
import yji.l;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements k {
    public final c0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f99116p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j2 f99117q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f99118r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f99119s;

    public a(n stateMapper, c0 passActivityInteractor, c passActivityPagingSource) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(passActivityInteractor, "passActivityInteractor");
        Intrinsics.checkNotNullParameter(passActivityPagingSource, "passActivityPagingSource");
        this.o = passActivityInteractor;
        this.f99116p = passActivityPagingSource;
        this.f99117q = q.c(new y0(2));
        this.f99118r = d.b(this, new e(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), r0.g()), stateMapper, null, false, 12);
        this.f99119s = hx7.e.a(this, new xwd.a(this, 3));
    }

    @Override // yji.l
    public final void I1() {
        c0 c0Var = this.o;
        c0Var.getClass();
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        h0 h0Var = c0Var.f120413a;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, h0Var.e.b(Unit.f186387a, loadingStrategy), null, null, new m(this, null, 0), 3);
        c cVar = this.f99116p;
        l.a1(this, cVar.j(250L), null, null, new m(this, null, 1), 3);
        l.a1(this, cVar.n(this.f99117q), null, null, null, 7);
    }

    public final void I2(Map map) {
        H2(this.f99118r, new o1(map, 23));
        l2(new f(this, map, null, 18), new b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f99119s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f99118r;
    }
}
