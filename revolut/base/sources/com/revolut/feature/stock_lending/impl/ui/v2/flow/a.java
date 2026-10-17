package com.revolut.feature.stock_lending.impl.ui.v2.flow;

import com.revolut.feature.stock_lending.impl.ui.v2.flow.StockLendingFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import l1e.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements b {
    public final StockLendingFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f88414p;

    public a(StockLendingFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        v vVar = new v(this, 1);
        this.f88414p = d.a(this, StockLendingFlowContract$Step.ProductDescription.f88413a, f0.f322471a, vVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f88414p;
    }
}
