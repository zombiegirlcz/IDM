package com.revolut.feature.address.common.impl.flow.field_search.flow;

import bhi.c;
import bi1.b;
import com.revolut.feature.address.common.impl.flow.field_search.flow.AddressFieldSearchFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.g;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements g, b {
    public final AddressFieldSearchFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f60970p;

    public a(AddressFieldSearchFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        c cVar = new c(this, 2);
        this.f60970p = d.a(this, AddressFieldSearchFlowContract$Step.Search.f60969a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f60970p;
    }
}
