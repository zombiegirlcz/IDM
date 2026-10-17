package com.revolut.feature.customer_present.tips.impl.flow.tips;

import com.revolut.feature.customer_present.tips.api.navigation.CustomerPresentTipsFlowDescriptor$InputData;
import com.revolut.feature.customer_present.tips.impl.flow.tips.CustomerPresentTipsFlowContract$Step;
import cp5.d;
import d06.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final CustomerPresentTipsFlowDescriptor$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f71619p;

    public a(CustomerPresentTipsFlowDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        cwj.h hVar = new cwj.h(this, 3);
        this.f71619p = d.a(this, CustomerPresentTipsFlowContract$Step.SelectTip.f71618a, f0.f322471a, hVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f71619p;
    }
}
