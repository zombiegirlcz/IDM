package com.revolut.feature.wealth_discovery.impl.screener.flows.new_collection;

import bhi.c;
import bph.b;
import com.revolut.feature.wealth_discovery.impl.screener.flows.new_collection.ScreenerNewCollectionFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final ScreenerNewCollectionFlowContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f96181p;

    public a(ScreenerNewCollectionFlowContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.o = input;
        c cVar = new c(this, 15);
        this.f96181p = d.a(this, ScreenerNewCollectionFlowContract$Step.Filters.f96178a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f96181p;
    }
}
