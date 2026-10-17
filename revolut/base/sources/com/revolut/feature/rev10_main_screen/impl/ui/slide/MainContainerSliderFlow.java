package com.revolut.feature.rev10_main_screen.impl.ui.slide;

import aii.m;
import aii.n;
import aii.q;
import aii.v;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.views.slider_layout.SlidingDimmerView;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev10_main_screen.impl.R$id;
import com.revolut.feature.rev10_main_screen.impl.R$layout;
import com.revolut.feature.rev10_main_screen.impl.ui.slide.MainContainerSlideFlowContract$Step;
import com.revolut.feature.rev10_main_screen.impl.ui.slide.MainContainerSliderFlow;
import com.revolut.kompot.common.view.ControllerContainerSliderLayout;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import rd0.d;
import te0.w;
import utb.e;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/rev10_main_screen/impl/ui/slide/MainContainerSliderFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/rev10_main_screen/impl/ui/slide/MainContainerSlideFlowContract$Step;", "Lcom/revolut/feature/rev10_main_screen/impl/ui/slide/MainContainerSlideFlowContract$InputData;", "Laii/q;", "Lno/d1;", "Companion", "com/revolut/feature/rev10_main_screen/impl/ui/slide/b", "a", "feature_rev10_main_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainContainerSliderFlow extends BaseFlow<MainContainerSlideFlowContract$Step, MainContainerSlideFlowContract$InputData, q> implements d1 {
    public final h P;
    public final int Q;
    public final int R;
    public final Object S;
    public final Object T;
    public final Object U;
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(MainContainerSliderFlow.class, "binding", "getBinding()Lcom/revolut/feature/rev10_main_screen/impl/databinding/FlowSlideMainContainerScreenBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.rev10_main_screen.impl.ui.slide.MainContainerSliderFlow$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerSliderFlow(MainContainerSlideFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = s.t(this, e.f);
        this.Q = R$layout.flow_slide_main_container_screen;
        this.R = R$id.main_container_flow;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: utb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainContainerSliderFlow f283071b;

            {
                this.f283071b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MainContainerSliderFlow mainContainerSliderFlow = this.f283071b;
                switch (i2) {
                    case 0:
                        MainContainerSliderFlow.Companion companion = MainContainerSliderFlow.INSTANCE;
                        return (a) ((mtb.c) mainContainerSliderFlow.U.getValue()).f208798c.get();
                    default:
                        MainContainerSliderFlow.Companion companion2 = MainContainerSliderFlow.INSTANCE;
                        return nji.c.a(nji.b.Companion, mainContainerSliderFlow.D2());
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: utb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MainContainerSliderFlow f283071b;

            {
                this.f283071b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MainContainerSliderFlow mainContainerSliderFlow = this.f283071b;
                switch (i22) {
                    case 0:
                        MainContainerSliderFlow.Companion companion = MainContainerSliderFlow.INSTANCE;
                        return (a) ((mtb.c) mainContainerSliderFlow.U.getValue()).f208798c.get();
                    default:
                        MainContainerSliderFlow.Companion companion2 = MainContainerSliderFlow.INSTANCE;
                        return nji.c.a(nji.b.Companion, mainContainerSliderFlow.D2());
                }
            }
        });
        this.U = w.y0(new uj7.a(this, inputData, 16));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow, com.revolut.kompot.navigable.a
    public final void H2() {
        super.H2();
        com.revolut.kompot.navigable.a.g2(this, ((a) ((utb.a) this.S.getValue())).f83453x, null, new up2.q(this, null, 5), 3);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow, com.revolut.kompot.navigable.a
    public final void J0(boolean z) {
        ControllerContainerSliderLayout controllerContainerSliderLayout;
        super.J0(z);
        if (z || (controllerContainerSliderLayout = (ControllerContainerSliderLayout) this.T.getValue()) == null) {
            return;
        }
        controllerContainerSliderLayout.G(i3());
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, aii.o
    public final n M0(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        v vVar = event instanceof v ? (v) event : null;
        if (!((vVar != null ? vVar.f5294b : null) instanceof MainContainerScreenDestination.Slide) || !h3().f189516a.getControllersTransitionActive()) {
            return super.M0(event);
        }
        IllegalStateException illegalStateException = new IllegalStateException("Trying to launch programmatic sliding transition while another sliding transition is active");
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.ERROR, null, null, illegalStateException, h0Var);
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (mtb.c) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (mtb.c) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    /* JADX INFO: renamed from: R2, reason: from getter */
    public final int getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final dki.s S2() {
        return (utb.a) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void b3() {
        ControllerContainerSliderLayout controllerContainerSliderLayout = (ControllerContainerSliderLayout) this.T.getValue();
        if (controllerContainerSliderLayout != null) {
            controllerContainerSliderLayout.u(i3());
        }
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        MainContainerSlideFlowContract$Step step = (MainContainerSlideFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof MainContainerSlideFlowContract$Step.Sliding) {
            SlidingDimmerView slidingDimmer = h3().f189518c;
            Intrinsics.checkNotNullExpressionValue(slidingDimmer, "slidingDimmer");
            slidingDimmer.setVisibility(0);
        }
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Q;
    }

    public final ktb.b h3() {
        ViewBinding value = this.P.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ktb.b) value;
    }

    public final String i3() {
        return j6.a.q("MainContainerSlidingHandler", u2().f98378a);
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }
}
