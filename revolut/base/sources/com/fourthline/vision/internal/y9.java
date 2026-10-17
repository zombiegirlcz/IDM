package com.fourthline.vision.internal;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class y9 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rect f37143a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyPosition(View view, Rect rect) {
        view.setLayoutParams(generatePreviewLayoutParams(rect));
    }

    private final ViewGroup.LayoutParams generatePreviewLayoutParams(Rect rect) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect != null ? rect.width() : -1, rect != null ? rect.height() : -1);
        layoutParams.gravity = 136;
        if (rect != null) {
            int measuredWidth = (getMeasuredWidth() - rect.width()) / 2;
            int measuredHeight = (getMeasuredHeight() - rect.height()) / 2;
            if (measuredWidth < measuredHeight) {
                layoutParams.topMargin = measuredHeight;
                return layoutParams;
            }
            layoutParams.setMarginStart(measuredWidth);
        }
        return layoutParams;
    }

    public static /* synthetic */ ViewGroup.LayoutParams generatePreviewLayoutParams$default(y9 y9Var, Rect rect, int i, Object obj2) {
        if ((i & 1) != 0) {
            rect = null;
        }
        return y9Var.generatePreviewLayoutParams(rect);
    }

    @Override // android.view.ViewGroup
    public void addView(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        Rect rect = this.f37143a;
        if (rect != null) {
            applyPosition(child, rect);
        }
        super.addView(child);
    }

    public final Rect getScreenRect() {
        return this.f37143a;
    }

    public final void setScreenRect(Rect rect) {
        this.f37143a = rect;
        if (rect == null || getChildCount() <= 0) {
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            applyPosition(childAt, rect);
        }
    }
}
