package com.revolut.feature.esim.instructions.ui.flow.instructions;

import com.revolut.feature.esim.instructions.ui.flow.instructions.EsimInstructionsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import td6.b;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final EsimInstructionsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f72123p;

    public a(EsimInstructionsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        ta8.a aVar = new ta8.a(this, 9);
        this.f72123p = d.a(this, EsimInstructionsFlowContract$Step.Instructions.f72122a, f0.f322471a, aVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f72123p;
    }
}
