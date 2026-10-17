package jji;

import android.view.View;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.navigable.root.RootFlow;
import dy0.n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements com.revolut.core.ui_kit.views.slider_layout.d {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f174989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f174990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZoomTransitionAnimation f174991c;
    public final String d;
    public final a5a.c e;
    public final dy0.r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SliderLayout.SlidingSpec f174992g;

    public w(com.revolut.kompot.navigable.a controller, View view, RootFlow rootFlow, ZoomTransitionAnimation descriptor) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(rootFlow, "rootFlow");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f174989a = controller;
        this.f174990b = view;
        this.f174991c = descriptor;
        Companion.getClass();
        this.d = v.a(controller);
        this.e = new a5a.c(controller.getClass());
        this.f = dy0.r.SHOWN;
        this.f174992g = new SliderLayout.SlidingSpec(dy0.o.BOTTOM, false);
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.c
    public final void A(SliderLayout.SlidingSpec slidingSpec) {
        Intrinsics.checkNotNullParameter(slidingSpec, "slidingSpec");
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.d
    public final void D() {
        this.f174991c.o3(true);
        com.revolut.kompot.navigable.a child = this.f174989a;
        Intrinsics.checkNotNullParameter(child, "child");
        child.G2(true);
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.d
    public final SliderLayout.SlidingSpec D0() {
        return this.f174992g;
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.d
    public final n0 c0() {
        return this.e;
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.d
    public final String getId() {
        return this.d;
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.d
    public final dy0.r getInitialState() {
        return this.f;
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.d
    public final View r0() {
        return this.f174990b;
    }
}
