package com.revolut.feature.wealth_discovery.impl.screener.screens.collection;

import ble.c1;
import bof.r;
import cli.g;
import cli.y;
import com.revolut.feature.wealth_discovery.impl.screener.screens.collection.ScreenerCollectionScreenContract$CollectionConfig;
import d9.e1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oki.h;
import ooh.d;
import org.jetbrains.annotations.NotNull;
import tph.e;
import tph.f;
import tph.m;
import tph.o;
import ugl.c;
import uqh.l0;
import uqh.u;
import vkm.j2;
import vkm.q0;
import vkm.v1;
import w4l.i;
import wli.x;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements e {

    @NotNull
    public static final m Companion = new m();
    public final ScreenerCollectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f96228p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f96229q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f96230r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f96231s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o5d.a f96232t;
    public final y u;

    public a(ScreenerCollectionScreenContract$InputData inputData, c screenerInteractor, u instrumentsExtension, d instrumentGroupMapper, x deeplinkHandler, o5d.a swipeAssetTradeActionsExtension, r stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(screenerInteractor, "screenerInteractor");
        Intrinsics.checkNotNullParameter(instrumentsExtension, "instrumentsExtension");
        Intrinsics.checkNotNullParameter(instrumentGroupMapper, "instrumentGroupMapper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsExtension, "swipeAssetTradeActionsExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f96228p = screenerInteractor;
        this.f96229q = instrumentsExtension;
        this.f96230r = instrumentGroupMapper;
        this.f96231s = deeplinkHandler;
        this.f96232t = swipeAssetTradeActionsExtension;
        this.u = mra.d.b(this, new f(null, null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Flow flowV;
        ScreenerCollectionScreenContract$CollectionConfig screenerCollectionScreenContract$CollectionConfig = this.o.f96227a;
        if (screenerCollectionScreenContract$CollectionConfig instanceof ScreenerCollectionScreenContract$CollectionConfig.FromCollection) {
            flowV = zi0.c.i(((ScreenerCollectionScreenContract$CollectionConfig.FromCollection) screenerCollectionScreenContract$CollectionConfig).f96225a);
        } else {
            if (!(screenerCollectionScreenContract$CollectionConfig instanceof ScreenerCollectionScreenContract$CollectionConfig.FromId)) {
                throw new NoWhenBranchMatchedException();
            }
            flowV = nim.a.v(((yhl.f) this.f96228p).c(i.f294643c), new tjf.e(screenerCollectionScreenContract$CollectionConfig, 28));
        }
        q0 q0VarN = rd0.e.n(flowV, h0.f322473a);
        l.a1(this, q0VarN, null, null, new o(this, null, 0), 3);
        l.a1(this, mo3.a.g(q0VarN, null, new tj9.d(26), 1), null, null, new o(this, null, 1), 3);
        v1 v1VarN = e1.N(new rch.o(2, this, a.class, "tillFinish", "tillFinish(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 12), (j2) ((l0) this.f96229q).f282162r.f22677a);
        l.a1(this, v1VarN, null, null, new o(this, null, 2), 3);
        l.b1(this, this.f96232t.Z2(new c1(v1VarN, 26)), null, new o(this, null, 3), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
