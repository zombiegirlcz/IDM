package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.MortgageSignatureFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import r6f.i;
import re4.b;
import re4.e;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MortgageSignatureFlowContract$InputData f68037p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f68038q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f68039r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MortgageSignatureFlowContract$InputData inputData, e interactor, e84.e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68037p = inputData;
        this.f68038q = interactor;
        i iVar = new i(this, 16);
        this.f68039r = d.a(this, MortgageSignatureFlowContract$Step.Documents.f68031a, f0.f322471a, iVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68039r;
    }
}
