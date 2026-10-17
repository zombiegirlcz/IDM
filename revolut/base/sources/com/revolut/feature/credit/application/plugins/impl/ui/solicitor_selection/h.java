package com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.SolicitorSelectionFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends t implements bi4.a {

    @NotNull
    private static final bi4.c Companion = new bi4.c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SolicitorSelectionFlowContract$InputData f68401p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fy3.a f68402q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f68403r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f68404s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SolicitorSelectionFlowContract$InputData inputData, fy3.a interactor, ang.f userInteractor, e84.e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68401p = inputData;
        this.f68402q = interactor;
        this.f68403r = userInteractor;
        bhi.c cVar = new bhi.c(this, 3);
        this.f68404s = cp5.d.a(this, SolicitorSelectionFlowContract$Step.Initial.f68385a, f0.f322471a, cVar);
    }

    @Override // yji.l
    public final void I1() {
        l2(new g(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68404s;
    }
}
