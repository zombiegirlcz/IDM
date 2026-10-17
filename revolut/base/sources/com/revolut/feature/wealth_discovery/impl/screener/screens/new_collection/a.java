package com.revolut.feature.wealth_discovery.impl.screener.screens.new_collection;

import a97.i;
import ble.c1;
import cli.y;
import cqh.j;
import d9.e1;
import eh3.s;
import eqh.e;
import eqh.f;
import eqh.g;
import eqh.k;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import sph.o;
import uqh.l0;
import uqh.t;
import uqh.u;
import uqh.z;
import vkm.j2;
import vkm.v1;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements e {
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f96255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f96256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o5d.a f96257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f96258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f96259t;

    public a(g inputData, o screenerInstrumentTypeMapper, u instrumentsExtension, o5d.a swipeAssetTradeActionsExtension, j stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(screenerInstrumentTypeMapper, "screenerInstrumentTypeMapper");
        Intrinsics.checkNotNullParameter(instrumentsExtension, "instrumentsExtension");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsExtension, "swipeAssetTradeActionsExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f96255p = screenerInstrumentTypeMapper;
        this.f96256q = instrumentsExtension;
        this.f96257r = swipeAssetTradeActionsExtension;
        this.f96258s = d.b(this, new f(new z(new t(inputData.f128462a, inputData.f128463b), 1022), null), stateMapper, null, false, 12);
        this.f96259t = hx7.e.a(this, new s(this, 21));
    }

    @Override // yji.l
    public final void I1() {
        g gVar = this.o;
        this.f96256q.c3(1000, gVar.f128463b, gVar.f128462a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f96259t;
    }

    @Override // yji.l
    public final void T1(long j2) {
        v1 v1VarN = e1.N(new i(2, this, a.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 27), (j2) ((l0) this.f96256q).f282162r.f22677a);
        l.b1(this, v1VarN, null, new k(this, null, 0), 3);
        l.b1(this, this.f96257r.Z2(new c1(v1VarN, 6)), null, new k(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f96258s;
    }
}
