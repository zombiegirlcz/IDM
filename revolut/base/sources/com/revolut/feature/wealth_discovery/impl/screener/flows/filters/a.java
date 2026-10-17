package com.revolut.feature.wealth_discovery.impl.screener.flows.filters;

import com.revolut.feature.wealth_discovery.impl.screener.flows.filters.ScreenerFiltersFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zel.f;
import zhm.f0;
import zoh.b;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(ScreenerFiltersFlowContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        f fVar = input.f96173a;
        this.o = d.a(this, fVar == null ? ScreenerFiltersFlowContract$Step.ProductPicker.f96176a : new ScreenerFiltersFlowContract$Step.AllFilters(fVar), f0.f322471a, new zaf.d(input, this, 3));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
