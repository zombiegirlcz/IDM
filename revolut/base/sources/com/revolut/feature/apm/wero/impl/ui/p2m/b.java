package com.revolut.feature.apm.wero.impl.ui.p2m;

import c12.r;
import com.revolut.feature.apm.wero.impl.ui.p2m.WeroP2MFlowContract$Step;
import cp5.d;
import eh3.s;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements ei2.b {
    public final WeroP2MFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d12.b f63076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r f63077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f63078r;

    public b(WeroP2MFlowContract$InputData flowInputData, d12.b entryExtension, r pendingExtension) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(entryExtension, "entryExtension");
        Intrinsics.checkNotNullParameter(pendingExtension, "pendingExtension");
        this.o = flowInputData;
        this.f63076p = entryExtension;
        this.f63077q = pendingExtension;
        s sVar = new s(this, 3);
        this.f63078r = d.a(this, WeroP2MFlowContract$Step.Intro.f63071a, f0.f322471a, sVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f63078r;
    }
}
