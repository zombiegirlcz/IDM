package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription;

import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_subscription.EsimMobilePlanSubscriptionFlowContract$Step;
import dfj.z2;
import kotlin.jvm.internal.Intrinsics;
import m84.e;
import sfj.d;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends d implements mgj.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final EsimMobilePlanSubscriptionFlowContract$InputData f100855r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f100856s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EsimMobilePlanSubscriptionFlowContract$InputData inputData, z2 esimRestrictionsInteractor) {
        super(esimRestrictionsInteractor, a.f);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(esimRestrictionsInteractor, "esimRestrictionsInteractor");
        this.f100855r = inputData;
        e eVar = new e(this, 15);
        this.f100856s = cp5.d.a(this, EsimMobilePlanSubscriptionFlowContract$Step.Subscription.f100854a, f0.f322471a, eVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100856s;
    }
}
