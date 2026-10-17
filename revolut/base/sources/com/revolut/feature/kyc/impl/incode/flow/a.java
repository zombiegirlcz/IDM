package com.revolut.feature.kyc.impl.incode.flow;

import com.revolut.feature.kyc.impl.incode.flow.IncodeFlowContract$Step;
import cp5.d;
import kj4.c;
import kotlin.jvm.internal.Intrinsics;
import kw8.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final IncodeFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f77814p;

    public a(IncodeFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        c cVar = new c(this, 22);
        this.f77814p = d.a(this, IncodeFlowContract$Step.InstallFeature.f77813a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77814p;
    }
}
