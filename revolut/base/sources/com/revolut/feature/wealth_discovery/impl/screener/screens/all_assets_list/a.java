package com.revolut.feature.wealth_discovery.impl.screener.screens.all_assets_list;

import ble.c1;
import cli.y;
import d9.e1;
import fi7.s;
import jph.e;
import jph.f;
import jph.g;
import kotlin.coroutines.Continuation;
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
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements e {
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u f96198p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f96199q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o5d.a f96200r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f96201s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f96202t;

    public a(g inputData, u instrumentsExtension, o screenerInstrumentTypeMapper, o5d.a swipeAssetTradeActionsExtension, ac4.g stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(instrumentsExtension, "instrumentsExtension");
        Intrinsics.checkNotNullParameter(screenerInstrumentTypeMapper, "screenerInstrumentTypeMapper");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsExtension, "swipeAssetTradeActionsExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f96198p = instrumentsExtension;
        this.f96199q = screenerInstrumentTypeMapper;
        this.f96200r = swipeAssetTradeActionsExtension;
        this.f96201s = d.b(this, new f(new z(new t(inputData.f177282a, f0.f322471a), 1022), false, null), stateMapper, null, false, 12);
        this.f96202t = hx7.e.a(this, new jnf.d(this, 2));
    }

    @Override // yji.l
    public final void I1() {
        f0 f0Var = f0.f322471a;
        zel.f fVar = this.o.f177282a;
        u uVar = this.f96198p;
        uVar.c3(1000, f0Var, fVar);
        uVar.Z2(false);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f96202t;
    }

    @Override // yji.l
    public final void T1(long j2) {
        v1 v1VarN = e1.N(new s(2, this, a.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 29), (j2) ((l0) this.f96198p).f282162r.f22677a);
        Continuation continuation = null;
        l.b1(this, v1VarN, null, new jph.l(this, continuation, 0), 3);
        l.b1(this, this.f96200r.Z2(new c1(v1VarN, 18)), null, new jph.l(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f96201s;
    }
}
