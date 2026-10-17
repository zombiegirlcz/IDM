package com.revolut.feature.shared_separate_favourites.converter.ui.flow;

import com.revolut.feature.shared_separate_favourites.api.converter.navigation.SharedConverterDestination;
import com.revolut.feature.shared_separate_favourites.converter.ui.flow.SharedConverterFlowContract$Step;
import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreen;
import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import gvc.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import z2d.c;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends g implements hgd.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SharedConverterDestination.InputData f86848t;
    public final d3d.g u;
    public final c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SharedConverterFlowContract$Step.InitialLoading f86849w;

    public b(SharedConverterDestination.InputData inputData, d3d.g converterInteractor, c assetTypesInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(converterInteractor, "converterInteractor");
        Intrinsics.checkNotNullParameter(assetTypesInteractor, "assetTypesInteractor");
        this.f86848t = inputData;
        this.u = converterInteractor;
        this.v = assetTypesInteractor;
        this.f86849w = SharedConverterFlowContract$Step.InitialLoading.f86845a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        SharedConverterFlowContract$Step step = (SharedConverterFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (Intrinsics.f(step, SharedConverterFlowContract$Step.InitialLoading.f86845a)) {
            l2(new m(this, null, 16), new yi5.b(26));
            return new LayoutViewerScreen(R$layout.screen_transparent);
        }
        if (!Intrinsics.f(step, SharedConverterFlowContract$Step.Converter.f86844a)) {
            throw new NoWhenBranchMatchedException();
        }
        SharedConverterScreen sharedConverterScreen = new SharedConverterScreen(new SharedConverterScreenContract$InputData(((SharedConverterFlowContract$State) A2().f98429a).f86843a, this.f86848t.f86792a.f86789b));
        hgd.c cVar = new hgd.c(this, 0);
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        sharedConverterScreen.H = cVar;
        return sharedConverterScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return new SharedConverterFlowContract$State(h0.f322473a);
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f86849w;
    }
}
