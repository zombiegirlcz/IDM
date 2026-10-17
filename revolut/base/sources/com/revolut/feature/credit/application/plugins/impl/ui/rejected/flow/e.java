package com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedRootFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import hs3.l1;
import hs3.m1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mri.w;
import org.jetbrains.annotations.NotNull;
import ph4.j;
import ph4.l;
import wli.x;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends t implements j {

    @NotNull
    private static final l Companion = new l();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RejectedRootFlowContract$InputData f68319p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f68320q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sp3.a f68321r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w f68322s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f68323t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RejectedRootFlowContract$InputData inputData, x deeplinkHandler, sp3.a creditDataMonitoringFacade, w revolutJobInteractor, e84.e pluginControllerResolver) {
        FlowStep rejected;
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(creditDataMonitoringFacade, "creditDataMonitoringFacade");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68319p = inputData;
        this.f68320q = deeplinkHandler;
        this.f68321r = creditDataMonitoringFacade;
        this.f68322s = revolutJobInteractor;
        l1 l1Var = inputData.f68308a;
        if (l1Var instanceof m1) {
            rejected = new RejectedRootFlowContract$Step.Rejected((m1) l1Var);
        } else {
            if (!(l1Var instanceof l1.a)) {
                throw new NoWhenBranchMatchedException();
            }
            rejected = RejectedRootFlowContract$Step.RejectedDetails.f68312a;
        }
        this.f68323t = cp5.d.a(this, rejected, f0.f322471a, new cnc.t(this, 5));
    }

    @Override // yji.l
    public final void I1() {
        l2(new pe2.l(this, null, 6), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68323t;
    }
}
