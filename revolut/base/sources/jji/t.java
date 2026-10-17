package jji;

import android.os.Bundle;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.common.view.ControllerContainerSliderLayout;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.scroller.BaseScrollerFlow;
import com.revolut.kompot.navigable.root.RootFlow;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements xji.a {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RootFlow f174983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ControllerContainerSliderLayout f174984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f174985c;

    public t(RootFlow rootFlow, ControllerContainerSliderLayout slidingContainer) {
        Intrinsics.checkNotNullParameter(rootFlow, "rootFlow");
        Intrinsics.checkNotNullParameter(slidingContainer, "slidingContainer");
        this.f174983a = rootFlow;
        this.f174984b = slidingContainer;
    }

    public static com.revolut.kompot.navigable.a c(com.revolut.kompot.navigable.a aVar) {
        while (true) {
            if (aVar == null) {
                return null;
            }
            if (!(aVar instanceof y)) {
                TransitionAnimation transitionAnimation = aVar.q2().f206461b;
                ZoomTransitionAnimation zoomTransitionAnimation = transitionAnimation instanceof ZoomTransitionAnimation ? (ZoomTransitionAnimation) transitionAnimation : null;
                if (zoomTransitionAnimation != null && (zoomTransitionAnimation.getF98372c() || zoomTransitionAnimation.getF98369g())) {
                    break;
                }
            }
            aVar = aVar.f98405m;
        }
        return aVar;
    }

    @Override // xji.a
    public final void O0(com.revolut.kompot.navigable.a controller, boolean z) {
        com.revolut.kompot.navigable.a aVarC;
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (this.f174985c > 0) {
            boolean z3 = nji.a.b(controller) || (controller instanceof ali.g) || (controller instanceof BaseScrollerFlow);
            mki.a aVar = controller.f98398a;
            if (z3) {
                RootFlow rootFlowC2 = controller.C2();
                RootFlow rootFlow = this.f174983a;
                if (rootFlowC2.equals(rootFlow) && (aVarC = c(controller)) != null) {
                    ControllerContainerSliderLayout controllerContainerSliderLayout = this.f174984b;
                    if (!z) {
                        w.Companion.getClass();
                        controllerContainerSliderLayout.G(v.a(controller));
                        return;
                    }
                    TransitionAnimation transitionAnimation = aVarC.q2().f206461b;
                    ZoomTransitionAnimation zoomTransitionAnimation = transitionAnimation instanceof ZoomTransitionAnimation ? (ZoomTransitionAnimation) transitionAnimation : null;
                    Intrinsics.checkNotNullParameter("SLIDING_OWNERSHIP_META_INFO_KEY", "key");
                    aVar.getClass();
                    Bundle bundle = aVar.f206459a;
                    Intrinsics.checkNotNullParameter("SLIDING_OWNERSHIP_META_INFO_KEY", "key");
                    String string = bundle.getString("SLIDING_OWNERSHIP_META_INFO_KEY");
                    String e = zoomTransitionAnimation != null ? zoomTransitionAnimation.getE() : null;
                    if (zoomTransitionAnimation != null) {
                        if (string == null || !string.equals(e)) {
                            if (e == null) {
                                String string2 = UUID.randomUUID().toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                Intrinsics.checkNotNullParameter("SLIDING_OWNERSHIP_META_INFO_KEY", "key");
                                Intrinsics.checkNotNullParameter("SLIDING_OWNERSHIP_META_INFO_KEY", "key");
                                bundle.putString("SLIDING_OWNERSHIP_META_INFO_KEY", string2);
                                zoomTransitionAnimation.a6(string2);
                            }
                        }
                        zoomTransitionAnimation.o3(false);
                        controllerContainerSliderLayout.k(new w(controller, aVarC.D2(), rootFlow, zoomTransitionAnimation));
                        return;
                    }
                    w.Companion.getClass();
                    controllerContainerSliderLayout.G(v.a(controller));
                }
            }
        }
    }

    public final void a() {
        nhi.k.a(this);
        this.f174985c = 0;
    }

    public final void b() {
        nhi.k.b(this);
    }

    @Override // xji.a
    public final void q0(com.revolut.kompot.navigable.a controller, boolean z) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (z) {
            return;
        }
        ControllerContainerSliderLayout controllerContainerSliderLayout = this.f174984b;
        if (!controllerContainerSliderLayout.getSwipeStarted() && this.f174985c > 0) {
            if ((nji.a.b(controller) || (controller instanceof ali.g) || (controller instanceof BaseScrollerFlow)) && controller.C2().equals(this.f174983a) && c(controller) != null) {
                w.Companion.getClass();
                controllerContainerSliderLayout.G(v.a(controller));
            }
        }
    }

    @Override // xji.a
    public final void q1(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        if ((controller.q2().f206461b instanceof ZoomTransitionAnimation) && controller.C2().equals(this.f174983a)) {
            this.f174985c++;
        }
    }

    @Override // xji.a
    public final void w1(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        if (this.f174985c <= 0 || !controller.C2().equals(this.f174983a)) {
            return;
        }
        if (controller.q2().f206461b instanceof ZoomTransitionAnimation) {
            this.f174985c--;
        }
        w.Companion.getClass();
        this.f174984b.u(v.a(controller));
    }
}
