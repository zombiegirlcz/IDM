package com.revolut.feature_exchange.impl.ui.takeprofit_stopsell;

import com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.TakeProfitStopLossControllerContract$Step;
import cp5.d;
import i3i.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final TakeProfitStopLossControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f96987p;

    public a(TakeProfitStopLossControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        hw9.b bVar = new hw9.b(this, 26);
        this.f96987p = d.a(this, TakeProfitStopLossControllerContract$Step.ChartLimit.f96984a, f0.f322471a, bVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f96987p;
    }
}
