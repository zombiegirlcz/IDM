package com.revolut.core.ui_kit.internal.views.swipeablecards.container;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$color;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import iv0.s;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.h;
import tu0.b;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/swipeablecards/container/SwipeableCardContainerView;", "Lcom/revolut/core/ui_kit/internal/views/framelayout/UIKitFrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwipeableCardContainerView extends UIKitFrameLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f57608h;
    public final LinkedHashMap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f57609j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeableCardContainerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            view.setClipToOutline(true);
        }
        if (view != null) {
            view.setOutlineProvider(this.f57609j);
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fK = a.k(context, h.EXTRA_LARGE.a());
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        canvas.drawRoundRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height, fK, a.k(r0, r2.a()), this.f57608h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator it8 = this.i.values().iterator();
        while (it8.hasNext()) {
            ((b) it8.next()).a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Iterator it8 = this.i.values().iterator();
        while (it8.hasNext()) {
            ((b) it8.next()).b(this);
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeableCardContainerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableCardContainerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(context.getColor(R$color.internal_color_swipeable_cards_overlay));
        paint.setAlpha(0);
        this.f57608h = paint;
        this.i = new LinkedHashMap();
        this.f57609j = new s(a.k(context, h.EXTRA_LARGE.a()), true);
        setWillNotDraw(false);
        setReadableAreaGuidelinesEnabled(true);
    }

    public /* synthetic */ SwipeableCardContainerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
