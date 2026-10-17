package com.revolut.feature.shared.consent.prompt.builder.impl.ui.flow;

import b7d.b;
import b7d.c;
import com.revolut.feature.shared.consent.prompt.builder.impl.ui.flow.ConsentPromptFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements b {
    public final ConsentPromptFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f86100p;

    public a(ConsentPromptFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        c cVar = new c(this, 0);
        this.f86100p = d.a(this, ConsentPromptFlowContract$Step.ConsentPromptDialog.f86099a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f86100p;
    }
}
