package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.AnimatedImageSwitcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class de extends koi.b {
    public final AnimatedImageSwitcher f;

    public de(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AnimatedImageSwitcher itemView = new AnimatedImageSwitcher(context, null);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        super(itemView);
        this.f = itemView;
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK = kli.a.k(context2, 32.0f);
        itemView.setLayoutParams(new FrameLayout.LayoutParams(iK, iK));
        AlphaAnimation alphaAnimation = new AlphaAnimation(BitmapDescriptorFactory.HUE_RED, 1.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(200L);
        itemView.setInAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, BitmapDescriptorFactory.HUE_RED);
        alphaAnimation2.setInterpolator(new AccelerateInterpolator());
        alphaAnimation2.setDuration(200L);
        itemView.setOutAnimation(alphaAnimation2);
    }
}
