package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail;

import cli.y;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.flow.CryptoTradeFlowContract$InputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.RetailCryptoTradeFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import lx5.b;
import mnl.g;
import mra.d;
import mx5.e;
import oki.h;
import ox5.j;
import vkm.t1;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements e {
    public final CryptoTradeFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f71556p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final iw5.j f71557q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f71558r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t1 f71559s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f71560t;

    public a(CryptoTradeFlowContract$InputData flowInputData, j contentControllerProvider, iw5.j headerMediator, mx5.h stateMapper) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(contentControllerProvider, "contentControllerProvider");
        Intrinsics.checkNotNullParameter(headerMediator, "headerMediator");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = flowInputData;
        this.f71556p = contentControllerProvider;
        this.f71557q = headerMediator;
        this.f71558r = d.b(this, new mx5.d(0), stateMapper, null, false, 12);
        this.f71559s = ((b) headerMediator).f;
        g gVar = new g(this, 25);
        this.f71560t = cp5.d.a(this, RetailCryptoTradeFlowContract$Step.Content.f71555a, f0.f322471a, gVar);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, ((b) this.f71557q).d, null, null, new mx5.g(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f71558r;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f71560t;
    }
}
