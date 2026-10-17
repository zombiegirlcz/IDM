package com.revolut.core.ui_kit.views.slider_layout;

import android.view.View;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.core.ui_kit.views.video.ZoomableFullScreenVideoView;
import dy0.n0;
import dy0.o;
import dy0.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoomableFullScreenVideoView f59691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a5a.c f59692c;
    public final r d;
    public final SliderLayout.SlidingSpec e;

    public h(String id10, ZoomableFullScreenVideoView view, ZoomableFullScreenVideoView zoomableFullScreenVideoView) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f59690a = id10;
        this.f59691b = view;
        this.f59692c = new a5a.c(zoomableFullScreenVideoView, 2);
        this.d = r.SHOWN;
        this.e = new SliderLayout.SlidingSpec(o.BOTTOM, false);
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.c
    public final void A(SliderLayout.SlidingSpec slidingSpec) {
        Intrinsics.checkNotNullParameter(slidingSpec, "slidingSpec");
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.d
    public final void D() {
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.d
    public final SliderLayout.SlidingSpec D0() {
        return this.e;
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.d
    public final n0 c0() {
        return this.f59692c;
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.d
    public final String getId() {
        return this.f59690a;
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.d
    public final r getInitialState() {
        return this.d;
    }

    @Override // com.revolut.core.ui_kit.views.slider_layout.d
    public final View r0() {
        return this.f59691b;
    }
}
