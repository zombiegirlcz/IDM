package com.revolut.core.ui_kit.views.slider_layout;

import android.view.View;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import dy0.n0;
import dy0.r;
import dy0.z;

/* JADX INFO: loaded from: classes20.dex */
public interface d extends c {
    void D();

    SliderLayout.SlidingSpec D0();

    n0 c0();

    String getId();

    r getInitialState();

    default z getType() {
        return z.DEFAULT;
    }

    View r0();
}
