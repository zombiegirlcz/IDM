package com.revolut.feature.freelancer.impl.ui.ecommerce.auth.flow;

import com.revolut.feature.freelancer.impl.ui.ecommerce.auth.flow.FreelancerPluginAuthFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import nk4.o;
import nw6.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final FreelancerPluginAuthFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f73785p;

    public a(FreelancerPluginAuthFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        o oVar = new o(this, 28);
        this.f73785p = d.a(this, FreelancerPluginAuthFlowContract$Step.AuthoriseEcommercePlugin.f73784a, f0.f322471a, oVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f73785p;
    }
}
