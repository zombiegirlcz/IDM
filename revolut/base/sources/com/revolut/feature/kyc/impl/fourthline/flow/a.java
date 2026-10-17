package com.revolut.feature.kyc.impl.fourthline.flow;

import com.revolut.feature.kyc.impl.fourthline.flow.FourthlineFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import umd.n;
import uv8.b;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final FourthlineFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f77764p;

    public a(FourthlineFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        n nVar = new n(this, 14);
        this.f77764p = d.a(this, FourthlineFlowContract$Step.InstallFeature.f77763a, f0.f322471a, nVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77764p;
    }
}
