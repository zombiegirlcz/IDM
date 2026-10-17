package com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow;

import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.flow.CreditPromptFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import v48.d;
import v74.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements b {
    public final CreditPromptFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f67351p;

    public a(CreditPromptFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        d dVar = new d(this, 7);
        this.f67351p = cp5.d.a(this, CreditPromptFlowContract$Step.Prompt.f67350a, f0.f322471a, dVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67351p;
    }
}
