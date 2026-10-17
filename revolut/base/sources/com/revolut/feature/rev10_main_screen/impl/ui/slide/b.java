package com.revolut.feature.rev10_main_screen.impl.ui.slide;

import android.view.View;
import android.view.ViewGroup;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.core.ui_kit.views.slider_layout.d;
import com.revolut.feature.rev10_main_screen.impl.ui.slide.MainContainerSlideFlowContract$Step;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import dki.g;
import dy0.n0;
import dy0.r;
import dy0.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final utb.a f83455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f83456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f83457c;
    public final String d;
    public final r e;
    public final SliderLayout.SlidingSpec f;

    /* JADX WARN: Multi-variable type inference failed */
    public b(utb.a flowModel, ControllerContainerFrameLayout flowContainer, n0 transitionFactory, String slidingHandlerId) {
        r rVar;
        SliderLayout.SlidingSpec slidingSpec;
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        Intrinsics.checkNotNullParameter(flowContainer, "flowContainer");
        Intrinsics.checkNotNullParameter(transitionFactory, "transitionFactory");
        Intrinsics.checkNotNullParameter(slidingHandlerId, "slidingHandlerId");
        this.f83455a = flowModel;
        this.f83456b = flowContainer;
        this.f83457c = transitionFactory;
        this.d = slidingHandlerId;
        g gVar = (g) flowModel;
        MainContainerSlideFlowContract$Step mainContainerSlideFlowContract$Step = (MainContainerSlideFlowContract$Step) gVar.A2().f98430b;
        if (mainContainerSlideFlowContract$Step instanceof MainContainerSlideFlowContract$Step.Main) {
            rVar = r.HIDDEN;
        } else {
            if (!(mainContainerSlideFlowContract$Step instanceof MainContainerSlideFlowContract$Step.Sliding)) {
                throw new NoWhenBranchMatchedException();
            }
            rVar = r.SHOWN;
        }
        this.e = rVar;
        MainContainerSlideFlowContract$Step mainContainerSlideFlowContract$Step2 = (MainContainerSlideFlowContract$Step) gVar.A2().f98430b;
        if (mainContainerSlideFlowContract$Step2 instanceof MainContainerSlideFlowContract$Step.Sliding) {
            MainContainerSlideFlowContract$Step.Sliding sliding = (MainContainerSlideFlowContract$Step.Sliding) mainContainerSlideFlowContract$Step2;
            slidingSpec = new SliderLayout.SlidingSpec(sliding.f83449a, sliding.f83450b);
        } else {
            if (!(mainContainerSlideFlowContract$Step2 instanceof MainContainerSlideFlowContract$Step.Main)) {
                throw new NoWhenBranchMatchedException();
            }
            slidingSpec = null;
        }
        this.f = slidingSpec;
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.c
    public final void A(SliderLayout.SlidingSpec slidingSpec) {
        Intrinsics.checkNotNullParameter(slidingSpec, "slidingSpec");
        ((a) this.f83455a).A(slidingSpec);
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.d
    public final void D() {
        ((g) this.f83455a).B2(true);
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.d
    public final SliderLayout.SlidingSpec D0() {
        return this.f;
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.d
    public final n0 c0() {
        return this.f83457c;
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.d
    public final String getId() {
        return this.d;
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.d
    public final r getInitialState() {
        return this.e;
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.d
    public final z getType() {
        return z.ROOT_SLIDER;
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.d
    public final View r0() {
        View childAt = this.f83456b.getChildAt(r0.getChildCount() - 1);
        Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
        return childAt;
    }
}
