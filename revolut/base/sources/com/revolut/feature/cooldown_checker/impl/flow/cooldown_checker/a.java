package com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker;

import com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker.CooldownCheckerFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import umd.n;
import un3.b;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements b {
    public final CooldownCheckerFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f66103p;

    public a(CooldownCheckerFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        n nVar = new n(this, 1);
        this.f66103p = d.a(this, CooldownCheckerFlowContract$Step.DeviceCooldownActive.f66102a, f0.f322471a, nVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f66103p;
    }
}
