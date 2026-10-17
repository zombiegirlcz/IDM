package com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.ExpiredApplicationLazyFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import e54.r;
import e84.e;
import kotlin.jvm.internal.Intrinsics;
import mri.w;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements eb4.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ExpiredApplicationLazyFlowContract$InputData f67659p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f67660q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f67661r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ExpiredApplicationLazyFlowContract$InputData inputData, w revolutJobInteractor, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67659p = inputData;
        this.f67660q = revolutJobInteractor;
        this.f67661r = d.a(this, new r(this, 21));
    }

    @Override // yki.j
    public final void M0() {
        w.r0(this.f67660q, this.f67659p.f67655a.f66892b);
        h.w2(this.f67661r, ExpiredApplicationLazyFlowContract$Step.Popup.f67656a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67661r;
    }
}
