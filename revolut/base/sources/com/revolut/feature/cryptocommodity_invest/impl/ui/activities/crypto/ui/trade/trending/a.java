package com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.flow.CryptoTradeFlowContract$InputData;
import hx7.e;
import kgm.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ny5.g;
import oki.h;
import rl8.d;
import rt4.o;
import ru6.r;
import rx5.b;
import rx5.k;
import vkm.q;
import yji.l;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final CryptoTradeFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f71575p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f71576q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f71577r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f71578s;

    public a(k stateMapper, CryptoTradeFlowContract$InputData flowInputData, c trendingInteractor, g rateTilesPresentationModel) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(trendingInteractor, "trendingInteractor");
        Intrinsics.checkNotNullParameter(rateTilesPresentationModel, "rateTilesPresentationModel");
        this.o = flowInputData;
        this.f71575p = trendingInteractor;
        this.f71576q = rateTilesPresentationModel;
        this.f71577r = e.a(this, new d(this, 17));
        this.f71578s = mra.d.b(this, new rx5.a(cw5.e.ONE_DAY, new Data(null, null, true, 3, null), r0.g()), stateMapper, null, false, 12);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f71577r;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(q.q(this.f71578s.B(new r(18))), new r3k.c(continuation, this, 16)), null, new o(this, continuation, 9), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f71578s;
    }
}
