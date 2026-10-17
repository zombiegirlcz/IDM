package com.revolut.feature.wealth_discovery.impl.screener.screens.meta_collection;

import a97.i;
import ble.c1;
import bw4.s;
import cli.y;
import cqh.f;
import cqh.g;
import cqh.o;
import d9.e1;
import hx7.e;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import poh.j;
import poh.m;
import su9.c;
import uqh.l0;
import uqh.t;
import uqh.u;
import uqh.z;
import vkm.j2;
import vkm.q;
import vkm.v1;
import wgl.d;
import yji.l;
import yoj.b;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements f {
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f96245p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f96246q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f96247r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o5d.a f96248s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zel.f f96249t;
    public final Map u;
    public final j2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f96250w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f96251x;

    public a(cqh.h inputData, j configProvider, m paramsMapper, u instrumentsExtension, c metaCollectionInteractor, o5d.a swipeAssetTradeActionsExtension, cqh.j stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(configProvider, "configProvider");
        Intrinsics.checkNotNullParameter(paramsMapper, "paramsMapper");
        Intrinsics.checkNotNullParameter(instrumentsExtension, "instrumentsExtension");
        Intrinsics.checkNotNullParameter(metaCollectionInteractor, "metaCollectionInteractor");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsExtension, "swipeAssetTradeActionsExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = configProvider;
        this.f96245p = paramsMapper;
        this.f96246q = instrumentsExtension;
        this.f96247r = metaCollectionInteractor;
        this.f96248s = swipeAssetTradeActionsExtension;
        zel.f fVarJ = b.j(inputData.f108108a);
        this.f96249t = fVarJ;
        d dVar = inputData.f108108a;
        Map mapB = paramsMapper.b(dVar);
        this.u = mapB;
        this.v = q.c(dVar);
        this.f96250w = mra.d.b(this, new g(new z(new t(fVarJ, f0.f322471a), 1022), mapB, configProvider.a(fVarJ), null), stateMapper, null, false, 12);
        this.f96251x = e.a(this, new cnc.t(this, 11));
    }

    @Override // yji.l
    public final void I1() {
        u uVar = this.f96246q;
        uVar.Z2(false);
        v1 v1VarN = e1.N(new i(2, this, a.class, "tillFinish", "tillFinish(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 9), (j2) ((l0) uVar).f282162r.f22677a);
        Continuation continuation = null;
        l.a1(this, v1VarN, null, null, new o(this, continuation, 0), 3);
        l.b1(this, this.f96248s.Z2(new c1(v1VarN, 1)), null, new o(this, continuation, 1), 3);
        j2 j2Var = this.v;
        l.a1(this, new cqh.m(j2Var, this, 0), null, null, new o(this, continuation, 2), 3);
        l.a1(this, rd0.e.n(q.Q(j2Var, new s(continuation, this, 23)), h0.f322473a), null, null, new o(this, continuation, 3), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f96251x;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f96250w;
    }
}
