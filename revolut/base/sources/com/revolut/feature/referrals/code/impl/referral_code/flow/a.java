package com.revolut.feature.referrals.code.impl.referral_code.flow;

import com.revolut.feature.referrals.code.api.ReferralCodeApiContract$InputData;
import com.revolut.feature.referrals.code.impl.referral_code.flow.ReferralCodeFlowContract$Step;
import cp5.d;
import iwa.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final ReferralCodeApiContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f81683p;

    public a(ReferralCodeApiContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        in1.a aVar = new in1.a(this, 20);
        this.f81683p = d.a(this, ReferralCodeFlowContract$Step.EnterReferralCode.f81682a, f0.f322471a, aVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f81683p;
    }
}
