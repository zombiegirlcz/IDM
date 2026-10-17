package com.revolut.feature.defi.exchange.impl.ui.flow;

import com.revolut.feature.defi.exchange.impl.ui.flow.DeFiExchangeFlowContract$Step;
import cp5.d;
import h1c.c;
import h46.b;
import h46.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final DeFiExchangeFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f71790p;

    public a(DeFiExchangeFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        c cVar = new c(this, 6);
        this.f71790p = d.a(this, DeFiExchangeFlowContract$Step.EnterAmount.f71787a, f0.f322471a, cVar);
    }

    public final void I2() {
        int i = e.f149327a[this.o.d.ordinal()];
        if (i == 1) {
            h.D2(this.f71790p);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            C2(h46.c.f149324a);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f71790p;
    }
}
