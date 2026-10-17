package com.revolut.core.ui_kit.views.slider_layout;

import android.view.View;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import dy0.i0;
import dy0.m0;
import dy0.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f59679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SliderLayout.SlidingSpec f59680b;

    public a(SliderLayout.SlidingSpec slidingSpec, m0 transition) {
        Intrinsics.checkNotNullParameter(slidingSpec, "slidingSpec");
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.f59679a = transition;
        this.f59680b = slidingSpec;
    }

    @Override // dy0.m0
    public final void a(View view, SliderLayout parent, r state) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f59679a.a(view, parent, state);
    }

    @Override // dy0.m0
    public final void b(View view, SliderLayout parent, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f59679a.b(view, parent, f);
    }

    @Override // dy0.m0
    public final void c(View view, SliderLayout parent, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f59679a.c(view, parent, f);
    }

    @Override // dy0.m0
    public final void d(View view, SliderLayout parent, r targetState) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(targetState, "targetState");
        this.f59679a.d(view, parent, targetState);
    }

    @Override // dy0.m0
    public final void e(View view, SliderLayout parent, float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f59679a.e(view, parent, f);
    }

    @Override // dy0.m0
    public final i0 getConfig() {
        return this.f59679a.getConfig();
    }
}
