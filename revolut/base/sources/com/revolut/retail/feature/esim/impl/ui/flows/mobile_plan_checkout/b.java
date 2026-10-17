package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_checkout;

import cu8.r0;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements dgj.b {
    public final EsimMobilePlanCheckoutFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r0 f100719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f100720q;

    public b(EsimMobilePlanCheckoutFlowContract$InputData inputData, r0 kycRequiredActionTransformer) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        this.o = inputData;
        this.f100719p = kycRequiredActionTransformer;
        this.f100720q = d.a(this, new dgj.h(this, 0));
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new dgj.i(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100720q;
    }
}
