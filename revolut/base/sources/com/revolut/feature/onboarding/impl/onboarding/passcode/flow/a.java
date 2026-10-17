package com.revolut.feature.onboarding.impl.onboarding.passcode.flow;

import com.revolut.feature.onboarding.impl.onboarding.passcode.flow.PasscodeFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import lb9.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(PasscodeFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, new PasscodeFlowContract$Step.Creation(inputData.f78465a, inputData.f78466b), f0.f322471a, new v(this, 27));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
