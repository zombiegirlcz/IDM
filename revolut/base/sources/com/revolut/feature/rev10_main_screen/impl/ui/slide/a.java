package com.revolut.feature.rev10_main_screen.impl.ui.slide;

import aii.u;
import android.os.MessageQueue;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlow;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlowContract$InputData;
import com.revolut.feature.rev10_main_screen.impl.ui.slide.MainContainerSlideFlowContract$Step;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.view.SlidingAnimation;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import dy0.n0;
import dy0.o;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nhi.k;
import rv6.e;
import tse.c;
import um7.d;
import vkm.j2;
import vkm.q;
import yji.l;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends g implements utb.a {
    public final List A;
    public utb.b B;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final MainContainerSlideFlowContract$InputData f83451t;
    public final jtb.b u;
    public final t1j.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final os2.g f83452w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j2 f83453x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final MainContainerSlideFlowContract$Step f83454y;
    public final MainContainerSlideFlowContract$MainContainerSlideFlowState z;

    public a(MainContainerSlideFlowContract$InputData inputData, jtb.b tabControllerFactory, t1j.b shownControllersFlowProvider, os2.g idleRegistry) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(tabControllerFactory, "tabControllerFactory");
        Intrinsics.checkNotNullParameter(shownControllersFlowProvider, "shownControllersFlowProvider");
        Intrinsics.checkNotNullParameter(idleRegistry, "idleRegistry");
        this.f83451t = inputData;
        this.u = tabControllerFactory;
        this.v = shownControllersFlowProvider;
        this.f83452w = idleRegistry;
        this.f83453x = q.c(null);
        MainContainerFlowContract$InputData mainContainerFlowContract$InputData = inputData.f83446a;
        SliderLayout.SlidingSpec f83429a = mainContainerFlowContract$InputData.getF83429a();
        MainContainerSlideFlowContract$Step.Main main = MainContainerSlideFlowContract$Step.Main.f83448a;
        this.f83454y = f83429a == null ? main : new MainContainerSlideFlowContract$Step.Sliding(f83429a.f59673a, f83429a.f59674b);
        this.z = new MainContainerSlideFlowContract$MainContainerSlideFlowState(mainContainerFlowContract$InputData.getF83432b().f83420a);
        SliderLayout.SlidingSpec f83429a2 = mainContainerFlowContract$InputData.getF83429a();
        this.A = v.l(f83429a2 != null ? new Pair(main, new SlidingAnimation(R$id.root_sliding_container, f83429a2.f59673a, f83429a2.f59674b)) : null);
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.c
    public final void A(SliderLayout.SlidingSpec slidingSpec) {
        Intrinsics.checkNotNullParameter(slidingSpec, "slidingSpec");
        o oVar = slidingSpec.f59673a;
        boolean z = slidingSpec.f59674b;
        E2(new MainContainerSlideFlowContract$Step.Sliding(oVar, z), true, new SlidingAnimation(R$id.root_sliding_container, oVar, z), true);
    }

    @Override // dki.g
    public final boolean C2(u navigationDestination) {
        Intrinsics.checkNotNullParameter(navigationDestination, "navigationDestination");
        if (!(navigationDestination instanceof MainContainerScreenDestination.Slide)) {
            super.C2(navigationDestination);
            return false;
        }
        MainContainerScreenDestination.Slide slide = (MainContainerScreenDestination.Slide) navigationDestination;
        o oVar = slide.f83417a;
        boolean z = slide.f83418b;
        E2(new MainContainerSlideFlowContract$Step.Sliding(oVar, z), true, new SlidingAnimation(R$id.root_sliding_container, oVar, z), false);
        return true;
    }

    @Override // yji.l
    public final void I1() {
        MainScreenTab mainScreenTab = new MainScreenTab(((MainContainerSlideFlowContract$MainContainerSlideFlowState) A2().f98429a).f83447a);
        utb.b handler = this.B;
        os2.g gVar = this.f83452w;
        if (handler != null) {
            gVar.getClass();
            Intrinsics.checkNotNullParameter(handler, "handler");
            ((MessageQueue) gVar.f229224b).removeIdleHandler(handler);
        }
        utb.b handler2 = new utb.b(this, mainScreenTab);
        this.B = handler2;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(handler2, "handler");
        ((MessageQueue) gVar.f229224b).addIdleHandler(handler2);
        n0 n0VarA = this.u.a(mainScreenTab);
        j2 j2Var = this.f83453x;
        j2Var.getClass();
        j2Var.g(null, n0VarA);
        t1j.b bVar = this.v;
        bVar.getClass();
        l.a1(this, new e(new c(q.q(k.f215504a), bVar, 27), 23), null, null, new up2.q(this, null, 4), 3);
    }

    @Override // dki.g, yji.l
    public final void K1() {
        utb.b handler = this.B;
        if (handler != null) {
            os2.g gVar = this.f83452w;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(handler, "handler");
            ((MessageQueue) gVar.f229224b).removeIdleHandler(handler);
        }
        this.u.getClass();
        super.K1();
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        MainContainerSlideFlowContract$Step step = (MainContainerSlideFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof MainContainerSlideFlowContract$Step.Main) {
            MainContainerFlow mainContainerFlow = new MainContainerFlow(this.f83451t.f83446a);
            d block = new d(this, 29);
            Intrinsics.checkNotNullParameter(block, "block");
            mainContainerFlow.H = block;
            return mainContainerFlow;
        }
        if (!(step instanceof MainContainerSlideFlowContract$Step.Sliding)) {
            throw new NoWhenBranchMatchedException();
        }
        MainScreenTab tab2 = new MainScreenTab(((MainContainerSlideFlowContract$MainContainerSlideFlowState) A2().f98429a).f83447a);
        MainContainerSlideFlowContract$Step.Sliding sliding = (MainContainerSlideFlowContract$Step.Sliding) step;
        o direction = sliding.f83449a;
        boolean z = sliding.f83450b;
        jtb.b bVar = this.u;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return bVar.f178470a.a(tab2).a(direction, z);
    }

    @Override // dki.g
    public final List w2() {
        return this.A;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.z;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f83454y;
    }
}
