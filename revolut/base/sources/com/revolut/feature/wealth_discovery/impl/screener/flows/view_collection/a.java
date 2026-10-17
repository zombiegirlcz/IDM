package com.revolut.feature.wealth_discovery.impl.screener.flows.view_collection;

import com.revolut.feature.wealth_discovery.impl.screener.flows.view_collection.ScreenerViewCollectionFlowContract$Step;
import cp5.d;
import fgj.g;
import fph.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final ScreenerViewCollectionFlowContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f96194p;

    public a(ScreenerViewCollectionFlowContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.o = input;
        g gVar = new g(this, 20);
        this.f96194p = d.a(this, ScreenerViewCollectionFlowContract$Step.Collection.f96192a, f0.f322471a, gVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f96194p;
    }
}
