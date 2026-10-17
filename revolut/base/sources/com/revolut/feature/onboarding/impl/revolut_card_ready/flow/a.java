package com.revolut.feature.onboarding.impl.revolut_card_ready.flow;

import com.revolut.feature.onboarding.impl.revolut_card_ready.flow.RevolutCardReadyFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import tc9.b;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final RevolutCardReadyFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f78576p;

    public a(RevolutCardReadyFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        ta8.a aVar = new ta8.a(this, 6);
        this.f78576p = d.a(this, RevolutCardReadyFlowContract$Step.RevolutCardStep.f78575a, f0.f322471a, aVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f78576p;
    }
}
