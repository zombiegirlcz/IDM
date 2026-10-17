package com.revolut.retail.feature.limits.impl.ui.limits.flow;

import com.revolut.retail.feature.limits.impl.ui.limits.flow.SettingsLimitsFlowContract$Step;
import cp5.d;
import izj.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements c {
    public final SettingsLimitsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f101784p;

    public a(SettingsLimitsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        in1.a aVar = new in1.a(this, 25);
        this.f101784p = d.a(this, SettingsLimitsFlowContract$Step.Limits.f101783a, f0.f322471a, aVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f101784p;
    }
}
