package com.revolut.feature.kyc.impl.dap;

import com.revolut.feature.kyc.impl.dap.DapFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vu8.d;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements vu8.b {

    @NotNull
    public static final d Companion = new d();
    public final DapFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final iv8.a f77616p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f77617q;

    public b(DapFlowContract$InputData inputData, iv8.a externalKycUiConfigurationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(externalKycUiConfigurationProvider, "externalKycUiConfigurationProvider");
        this.o = inputData;
        this.f77616p = externalKycUiConfigurationProvider;
        vh9.b bVar = new vh9.b(this, 27);
        this.f77617q = cp5.d.a(this, DapFlowContract$Step.Intro.f77614a, f0.f322471a, bVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77617q;
    }
}
