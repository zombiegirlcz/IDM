package com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.ExpiredApplicationRootFlowContract$Step;
import e54.r;
import e84.e;
import eb4.d;
import kotlin.jvm.internal.Intrinsics;
import mri.w;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends t implements d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ExpiredApplicationRootFlowContract$InputData f67662p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f67663q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f67664r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ExpiredApplicationRootFlowContract$InputData inputData, w revolutJobInteractor, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67662p = inputData;
        this.f67663q = revolutJobInteractor;
        r rVar = new r(this, 22);
        this.f67664r = cp5.d.a(this, ExpiredApplicationRootFlowContract$Step.ExpiredPopup.f67658a, f0.f322471a, rVar);
    }

    @Override // yji.l
    public final void I1() {
        w.r0(this.f67663q, this.f67662p.f67657a.f66892b);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67664r;
    }
}
