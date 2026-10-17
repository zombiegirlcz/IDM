package com.revolut.feature.kyc.impl.hyperverge.govauth;

import com.revolut.feature.kyc.impl.hyperverge.govauth.HypervergeDigilockerFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import xif.k;
import xv8.b;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final HypervergeDigilockerFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f77771p;

    public a(HypervergeDigilockerFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        k kVar = new k(this, 27);
        this.f77771p = d.a(this, HypervergeDigilockerFlowContract$Step.Portal.f77770a, f0.f322471a, kVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77771p;
    }
}
