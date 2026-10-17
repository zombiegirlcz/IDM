package com.revolut.feature.foreign_currencies.impl.ui.flow;

import com.revolut.feature.foreign_currencies.impl.ui.flow.ForeignCurrenciesFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rl8.d;
import rq6.b;
import t99.k;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f73165p;

    public a(k exchangeGlobalAccessFlowProvider) {
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessFlowProvider, "exchangeGlobalAccessFlowProvider");
        this.o = exchangeGlobalAccessFlowProvider;
        d dVar = new d(this, 12);
        this.f73165p = cp5.d.a(this, ForeignCurrenciesFlowContract$Step.Details.f73164a, f0.f322471a, dVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f73165p;
    }
}
