package com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow;

import com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow.CeFiToDeFiFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vvc.s;
import w36.c;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements c {
    public final CeFiToDeFiFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s36.h f71753p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w36.a f71754q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f71755r;

    public b(CeFiToDeFiFlowContract$InputData inputData, s36.h initialBalanceProvider, w36.a errorDialogProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(initialBalanceProvider, "initialBalanceProvider");
        Intrinsics.checkNotNullParameter(errorDialogProvider, "errorDialogProvider");
        this.o = inputData;
        this.f71753p = initialBalanceProvider;
        this.f71754q = errorDialogProvider;
        s sVar = new s(this, 13);
        this.f71755r = d.a(this, CeFiToDeFiFlowContract$Step.AssetSelection.f71750a, f0.f322471a, sVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f71755r;
    }
}
