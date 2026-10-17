package com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.flow;

import com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.flow.DeFiToCeFiFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import l56.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final DeFiToCeFiFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f71806p;

    public a(DeFiToCeFiFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        v vVar = new v(this, 9);
        this.f71806p = d.a(this, DeFiToCeFiFlowContract$Step.AssetSelection.f71805a, f0.f322471a, vVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f71806p;
    }
}
