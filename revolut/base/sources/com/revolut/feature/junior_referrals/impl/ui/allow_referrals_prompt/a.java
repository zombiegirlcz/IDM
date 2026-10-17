package com.revolut.feature.junior_referrals.impl.ui.allow_referrals_prompt;

import ack.f;
import al8.b;
import com.revolut.feature.junior_referrals.impl.ui.allow_referrals_prompt.AllowReferralsPromptFlowContract$Step;
import cp5.d;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final AllowReferralsPromptFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t1 f77164p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f77165q;

    public a(AllowReferralsPromptFlowContract$InputData inputData, t1 juniorSettingsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorSettingsInteractor, "juniorSettingsInteractor");
        this.o = inputData;
        this.f77164p = juniorSettingsInteractor;
        f fVar = new f(this, 25);
        this.f77165q = d.a(this, AllowReferralsPromptFlowContract$Step.AllowReferralsPrompt.f77163a, f0.f322471a, fVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77165q;
    }
}
