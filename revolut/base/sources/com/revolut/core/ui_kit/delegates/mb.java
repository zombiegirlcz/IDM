package com.revolut.core.ui_kit.delegates;

import android.graphics.drawable.GradientDrawable;
import com.revolut.core.ui_kit.gradients.UiKitGradient;
import com.revolut.core.ui_kit_resources.R$attr;

/* JADX INFO: loaded from: classes19.dex */
public abstract class mb implements nb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiKitGradient f54474a;

    public mb(int i) {
        this.f54474a = new UiKitGradient(new int[]{i, R$attr.uikit_colorGroupedBackground}, new float[]{0.5f, 1.0f}, GradientDrawable.Orientation.TL_BR);
    }
}
