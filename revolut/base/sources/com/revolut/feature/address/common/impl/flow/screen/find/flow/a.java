package com.revolut.feature.address.common.impl.flow.screen.find.flow;

import com.revolut.feature.address.common.api.navigation.FindAddressControllerDescriptor$InputData;
import com.revolut.feature.address.common.impl.flow.screen.find.flow.AddressSearchFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import lcc.c;
import li1.b;
import oki.h;
import vi1.i;
import yki.g;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements g, b {
    public final FindAddressControllerDescriptor$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f61025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f61026q;

    public a(FindAddressControllerDescriptor$InputData inputData, i addressFlowStringFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(addressFlowStringFactory, "addressFlowStringFactory");
        this.o = inputData;
        this.f61025p = addressFlowStringFactory;
        c cVar = new c(this, 12);
        this.f61026q = d.a(this, AddressSearchFlowContract$Step.AddressSearch.f61024a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f61026q;
    }
}
