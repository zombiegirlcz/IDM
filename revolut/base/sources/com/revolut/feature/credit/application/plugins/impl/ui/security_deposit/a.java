package com.revolut.feature.credit.application.plugins.impl.ui.security_deposit;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.security_deposit.SecurityDepositFlowContract$Step;
import cp5.d;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements th4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SecurityDepositFlowContract$InputData f68344p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dy3.a f68345q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ffk.t f68346r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f68347s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SecurityDepositFlowContract$InputData inputData, dy3.a securityDepositInteractor, ffk.t pricingPlanInteractor, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(securityDepositInteractor, "securityDepositInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68344p = inputData;
        this.f68345q = securityDepositInteractor;
        this.f68346r = pricingPlanInteractor;
        ta8.a aVar = new ta8.a(this, 16);
        this.f68347s = d.a(this, SecurityDepositFlowContract$Step.Deposit.f68343a, f0.f322471a, aVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f68347s;
    }
}
