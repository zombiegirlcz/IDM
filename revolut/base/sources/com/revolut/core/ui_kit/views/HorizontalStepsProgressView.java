package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0016\u0018\u0000 32\u00020\u0001:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0019\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u001d\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R*\u0010!\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R*\u0010%\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R*\u0010)\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0014\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R.\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020+0*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/revolut/core/ui_kit/views/HorizontalStepsProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "a", "I", "getItemsCount", "()I", "setItemsCount", "(I)V", "itemsCount", "", "b", "F", "getProgressBarRadiusDp", "()F", "setProgressBarRadiusDp", "(F)V", "progressBarRadiusDp", "d", "getGapSizeDp", "setGapSizeDp", "gapSizeDp", "f", "getBaseColor", "setBaseColor", "baseColor", "g", "getProgressColor", "setProgressColor", "progressColor", "h", "getOverallProgress", "setOverallProgress", "overallProgress", "Lkotlin/Function1;", "", "l", "Lkotlin/jvm/functions/Function1;", "getPageChangeListener", "()Lkotlin/jvm/functions/Function1;", "setPageChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "pageChangeListener", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class HorizontalStepsProgressView extends View {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int itemsCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public float progressBarRadiusDp;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f58630c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float gapSizeDp;
    public float e;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int baseColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int progressColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public float overallProgress;
    public final Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f58633j;
    public final ihm.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public Function1 pageChangeListener;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.HorizontalStepsProgressView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalStepsProgressView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void a(float f) {
        setOverallProgress(f);
    }

    public final int getBaseColor() {
        return this.baseColor;
    }

    public final float getGapSizeDp() {
        return this.gapSizeDp;
    }

    public final int getItemsCount() {
        return this.itemsCount;
    }

    public final float getOverallProgress() {
        return this.overallProgress;
    }

    @NotNull
    public final Function1<Integer, Unit> getPageChangeListener() {
        return this.pageChangeListener;
    }

    public final float getProgressBarRadiusDp() {
        return this.progressBarRadiusDp;
    }

    public final int getProgressColor() {
        return this.progressColor;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float width = (getWidth() - ((this.itemsCount - 1) * this.e)) / this.itemsCount;
        boolean z = getLayoutDirection() == 1;
        int i = this.itemsCount;
        if (i < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            float f = i2;
            float f4 = (this.e + width) * f;
            float f5 = (kotlin.ranges.f.f(this.overallProgress - f, BitmapDescriptorFactory.HUE_RED, 1.0f) * width) + f4;
            float f6 = f4 + width;
            Paint paint = this.f58633j;
            Paint paint2 = this.i;
            if (z) {
                float width2 = getWidth() - f6;
                float width3 = getWidth() - f4;
                float height = getHeight();
                float f32 = this.f58630c;
                canvas2.drawRoundRect(width2, BitmapDescriptorFactory.HUE_RED, width3, height, f32, f32, paint2);
                float height2 = getHeight();
                float f35 = this.f58630c;
                canvas.drawRoundRect(getWidth() - f5, BitmapDescriptorFactory.HUE_RED, width3, height2, f35, f35, paint);
            } else {
                float height3 = getHeight();
                float f36 = this.f58630c;
                canvas.drawRoundRect(f4, BitmapDescriptorFactory.HUE_RED, f6, height3, f36, f36, paint2);
                float height4 = getHeight();
                float f37 = this.f58630c;
                canvas.drawRoundRect(f4, BitmapDescriptorFactory.HUE_RED, f5, height4, f37, f37, paint);
            }
            if (i2 == i) {
                return;
            }
            i2++;
            canvas2 = canvas;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        gq0.g.d(this, info, this.itemsCount, this.overallProgress);
    }

    public final void setBaseColor(int i) {
        this.baseColor = i;
        this.i.setColor(i);
    }

    public final void setGapSizeDp(float f) {
        if (this.gapSizeDp == f) {
            return;
        }
        this.gapSizeDp = f;
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        this.e = kli.a.k(r0, f);
        invalidate();
    }

    public final void setItemsCount(int i) {
        if (this.itemsCount != i) {
            this.itemsCount = i;
            invalidate();
        }
    }

    public final void setOverallProgress(float f) {
        this.overallProgress = f;
        int i = (int) f;
        this.k.onNext(Integer.valueOf(i));
        this.pageChangeListener.invoke(Integer.valueOf(i));
        postInvalidate();
    }

    public final void setPageChangeListener(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.pageChangeListener = function1;
    }

    public final void setProgressBarRadiusDp(float f) {
        if (this.progressBarRadiusDp == f) {
            return;
        }
        this.progressBarRadiusDp = f;
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        this.f58630c = kli.a.k(r0, f);
        invalidate();
    }

    public final void setProgressColor(int i) {
        this.progressColor = i;
        this.f58633j.setColor(i);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalStepsProgressView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalStepsProgressView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.itemsCount = 1;
        this.progressBarRadiusDp = 1.0f;
        this.f58630c = kli.a.k(context, 1.0f);
        this.gapSizeDp = 4.0f;
        this.e = kli.a.k(context, 4.0f);
        this.baseColor = kli.a.s(R$attr.uikit_colorWhite_30, context);
        this.progressColor = kli.a.s(R$attr.uikit_colorWhite, context);
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        paint.setSubpixelText(true);
        paint.setDither(true);
        paint.setColor(this.baseColor);
        this.i = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setSubpixelText(true);
        paint2.setDither(true);
        paint2.setColor(this.progressColor);
        this.f58633j = paint2;
        this.k = v0.a.d("create(...)");
        this.pageChangeListener = new jli.f(15);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
            ViewCompat.setScreenReaderFocusable(this, true);
        }
    }

    public /* synthetic */ HorizontalStepsProgressView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
