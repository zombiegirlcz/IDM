package com.revolut.feature.credit.application.plugins.impl.ui.credit_addon;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_addon.CreditAddonFlowContract$Step;
import cp5.d;
import e84.e;
import f84.k;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends t implements f84.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CreditAddonFlowContract$InputData f67356p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f67357q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f67358r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CreditAddonFlowContract$InputData inputData, k interactor, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67356p = inputData;
        this.f67357q = interactor;
        cnc.t tVar = new cnc.t(this, 2);
        this.f67358r = d.a(this, CreditAddonFlowContract$Step.Initial.f67354a, f0.f322471a, tVar);
    }

    @Override // yji.l
    public final void I1() {
        l2(new a(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67358r;
    }
}
