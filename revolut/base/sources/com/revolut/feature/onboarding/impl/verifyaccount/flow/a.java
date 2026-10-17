package com.revolut.feature.onboarding.impl.verifyaccount.flow;

import com.revolut.feature.onboarding.api.verify_account.flow.VerifyAccountPromptFlowInputData;
import com.revolut.feature.onboarding.impl.verifyaccount.flow.VerifyAccountPromptFlowContract$Step;
import com.revolut.feature.onboarding.impl.verifyaccount.screen.VerifyAccountPromptScreenContract$InputData;
import cp5.d;
import kd8.f;
import kd9.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(VerifyAccountPromptFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, new VerifyAccountPromptFlowContract$Step.VerifyAccountPrompt(new VerifyAccountPromptScreenContract$InputData(inputData.f78236a)), f0.f322471a, new f(10));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
