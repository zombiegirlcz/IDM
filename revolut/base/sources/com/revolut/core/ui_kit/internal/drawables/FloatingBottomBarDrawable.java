package com.revolut.core.ui_kit.internal.drawables;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c8g.c;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import dr0.n;
import dr0.o;
import jo0.g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/FloatingBottomBarDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "Companion", "dr0/n", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FloatingBottomBarDrawable extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f55966l = {BitmapDescriptorFactory.HUE_RED, 0.3f, 0.5f, 0.7f, 1.0f};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f55967m = R$attr.uikit_colorGreyTone50;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f55968n = R$attr.uikit_colorWhite;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55971c;
    public final boolean d;
    public final boolean e;
    public n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f55972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f55973h;
    public final FloatingBottomBarSelectorDrawable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Float f55974j;
    public float k;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.drawables.FloatingBottomBarDrawable$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public FloatingBottomBarDrawable(Context context, ViewGroup contentView, int i, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.f55969a = context;
        this.f55970b = i;
        this.f55971c = z;
        this.d = z3;
        this.e = z4;
        this.f = n.SOLID;
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        paintC.setStyle(Paint.Style.FILL);
        paintC.setColor(d());
        this.f55972g = paintC;
        Paint paintC2 = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        paintC2.setStyle(Paint.Style.STROKE);
        Context context2 = contentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        paintC2.setStrokeWidth(kli.a.l(context2, 1.0f));
        this.f55973h = paintC2;
        FloatingBottomBarSelectorDrawable floatingBottomBarSelectorDrawable = new FloatingBottomBarSelectorDrawable(contentView);
        floatingBottomBarSelectorDrawable.setCallback(this);
        this.i = floatingBottomBarSelectorDrawable;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a() {
        View childAt;
        FloatingBottomBarSelectorDrawable floatingBottomBarSelectorDrawable = this.i;
        ViewGroup viewGroup = floatingBottomBarSelectorDrawable.f55975a;
        if (!((Boolean) g.J.getValue()).booleanValue() || floatingBottomBarSelectorDrawable.f55989w < 0) {
            return;
        }
        floatingBottomBarSelectorDrawable.f55989w = -1;
        ValueAnimator valueAnimator = floatingBottomBarSelectorDrawable.u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        floatingBottomBarSelectorDrawable.b(BitmapDescriptorFactory.HUE_RED, 400L);
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(i);
            Intrinsics.h(childAt);
            if (childAt.isSelected()) {
                break;
            } else {
                i++;
            }
        }
        if (childAt != null && floatingBottomBarSelectorDrawable.f(childAt)) {
            floatingBottomBarSelectorDrawable.f55988t = viewGroup.indexOfChild(childAt);
            floatingBottomBarSelectorDrawable.f55979h.set(floatingBottomBarSelectorDrawable.e);
            floatingBottomBarSelectorDrawable.invalidateSelf();
        }
    }

    public final void b(Integer num, Integer num2, boolean z) {
        FloatingBottomBarSelectorDrawable floatingBottomBarSelectorDrawable = this.i;
        RectF rectF = floatingBottomBarSelectorDrawable.f55978g;
        RectF rectF2 = floatingBottomBarSelectorDrawable.f;
        RectF rectF3 = floatingBottomBarSelectorDrawable.e;
        ViewGroup viewGroup = floatingBottomBarSelectorDrawable.f55975a;
        View view = null;
        RectF rectF4 = (z && floatingBottomBarSelectorDrawable.f55990x) ? new RectF(floatingBottomBarSelectorDrawable.i) : null;
        boolean z3 = false;
        floatingBottomBarSelectorDrawable.f55990x = false;
        floatingBottomBarSelectorDrawable.b(BitmapDescriptorFactory.HUE_RED, 400L);
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.h(childAt);
            if (childAt.isSelected()) {
                view = childAt;
                break;
            }
            i++;
        }
        if (view == null) {
            floatingBottomBarSelectorDrawable.c();
            return;
        }
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            floatingBottomBarSelectorDrawable.f55989w = -1;
            ValueAnimator valueAnimator = floatingBottomBarSelectorDrawable.u;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            floatingBottomBarSelectorDrawable.b(BitmapDescriptorFactory.HUE_RED, 400L);
            floatingBottomBarSelectorDrawable.c();
            floatingBottomBarSelectorDrawable.f55991y = view;
            view.addOnLayoutChangeListener(floatingBottomBarSelectorDrawable.z);
            return;
        }
        floatingBottomBarSelectorDrawable.c();
        if (!z) {
            floatingBottomBarSelectorDrawable.f55989w = -1;
            ValueAnimator valueAnimator2 = floatingBottomBarSelectorDrawable.u;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            floatingBottomBarSelectorDrawable.f(view);
            floatingBottomBarSelectorDrawable.f55988t = viewGroup.indexOfChild(view);
            floatingBottomBarSelectorDrawable.f55979h.set(rectF3);
            floatingBottomBarSelectorDrawable.invalidateSelf();
            return;
        }
        if (rectF4 == null && num2 != null && floatingBottomBarSelectorDrawable.f55989w == num2.intValue()) {
            floatingBottomBarSelectorDrawable.f55989w = -1;
            floatingBottomBarSelectorDrawable.b(BitmapDescriptorFactory.HUE_RED, 400L);
            return;
        }
        if (rectF4 != null) {
            rectF2.set(rectF4);
            if (floatingBottomBarSelectorDrawable.f(view)) {
                rectF.set(rectF3);
                floatingBottomBarSelectorDrawable.e(floatingBottomBarSelectorDrawable.f55988t, viewGroup.indexOfChild(view), false);
                return;
            }
            return;
        }
        if (rectF3.isEmpty() || !floatingBottomBarSelectorDrawable.f55982m) {
            floatingBottomBarSelectorDrawable.f(view);
            floatingBottomBarSelectorDrawable.f55988t = viewGroup.indexOfChild(view);
            floatingBottomBarSelectorDrawable.invalidateSelf();
            return;
        }
        rectF2.set(rectF3);
        if (floatingBottomBarSelectorDrawable.f(view)) {
            rectF.set(rectF3);
            int iIntValue = num != null ? num.intValue() : floatingBottomBarSelectorDrawable.f55988t;
            int iIntValue2 = num2 != null ? num2.intValue() : viewGroup.indexOfChild(view);
            if (num != null && num2 != null) {
                z3 = true;
            }
            floatingBottomBarSelectorDrawable.e(iIntValue, iIntValue2, z3);
        }
    }

    public final int d() {
        int i = o.f117057a[this.f.ordinal()];
        if (i == 1) {
            return this.f55970b;
        }
        Context context = this.f55969a;
        if (i == 2) {
            return io0.a.d(0.5f, kli.a.s(R$attr.uikit_colorElevatedBackground, context));
        }
        if (i == 3) {
            return io0.a.d(BitmapDescriptorFactory.HUE_RED, kli.a.s(R$attr.uikit_colorElevatedBackground, context));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r10) {
        /*
            r9 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            android.graphics.Rect r0 = r9.getBounds()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            goto L60
        L10:
            boolean r0 = r9.f55971c
            if (r0 == 0) goto L56
            android.graphics.Rect r0 = r9.getBounds()
            android.graphics.Paint r1 = r9.f55972g
            r10.drawRect(r0, r1)
            boolean r0 = r9.e
            if (r0 == 0) goto L56
            android.graphics.Paint r8 = r9.f55973h
            float r0 = r8.getStrokeWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            android.graphics.Rect r1 = r9.getBounds()
            int r1 = r1.left
            float r1 = (float) r1
            float r2 = r1 + r0
            android.graphics.Rect r1 = r9.getBounds()
            int r1 = r1.top
            float r1 = (float) r1
            float r3 = r1 + r0
            android.graphics.Rect r1 = r9.getBounds()
            int r1 = r1.right
            float r1 = (float) r1
            float r4 = r1 - r0
            android.graphics.Rect r1 = r9.getBounds()
            int r1 = r1.bottom
            float r1 = (float) r1
            float r5 = r1 - r0
            float r6 = r9.k
            r7 = r6
            r1 = r10
            r1.drawRoundRect(r2, r3, r4, r5, r6, r7, r8)
            goto L57
        L56:
            r1 = r10
        L57:
            boolean r10 = r9.d
            if (r10 == 0) goto L60
            com.revolut.core.ui_kit.internal.drawables.FloatingBottomBarSelectorDrawable r10 = r9.i
            r10.draw(r1)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.drawables.FloatingBottomBarDrawable.draw(android.graphics.Canvas):void");
    }

    public final void e(n backgroundStyle) {
        Intrinsics.checkNotNullParameter(backgroundStyle, "backgroundStyle");
        if (this.f != backgroundStyle) {
            this.f = backgroundStyle;
            this.f55972g.setColor(d());
            Rect bounds = getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
            j(bounds);
            invalidateSelf();
        }
    }

    public final void f(float f) {
        if (Intrinsics.d(this.f55974j, f)) {
            return;
        }
        this.f55974j = Float.valueOf(f);
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        if (i(bounds)) {
            invalidateSelf();
        }
    }

    public final void g(float f) {
        FloatingBottomBarSelectorDrawable floatingBottomBarSelectorDrawable = this.i;
        float f4 = floatingBottomBarSelectorDrawable.k;
        ViewGroup viewGroup = floatingBottomBarSelectorDrawable.f55975a;
        if (!floatingBottomBarSelectorDrawable.f55982m || viewGroup.getChildCount() == 0) {
            return;
        }
        if (!floatingBottomBarSelectorDrawable.f55990x) {
            floatingBottomBarSelectorDrawable.f55990x = true;
            floatingBottomBarSelectorDrawable.d();
        }
        View childAt = viewGroup.getChildAt(0);
        float width = viewGroup.getWidth();
        float childCount = (floatingBottomBarSelectorDrawable.f55981l * 2) + (width / viewGroup.getChildCount());
        float f5 = BitmapDescriptorFactory.HUE_RED;
        float f6 = f.f(f, BitmapDescriptorFactory.HUE_RED, width);
        float f32 = childCount / 2.0f;
        float f35 = f6 - f32;
        if (f35 < BitmapDescriptorFactory.HUE_RED) {
            f35 = 0.0f;
        }
        float f36 = f6 + f32;
        if (f36 > width) {
            f36 = width;
        }
        float f37 = f36 >= width ? width - childCount : f35;
        if (f35 > BitmapDescriptorFactory.HUE_RED) {
            childCount = f36;
        }
        RectF rectF = floatingBottomBarSelectorDrawable.i;
        if (f37 >= BitmapDescriptorFactory.HUE_RED) {
            f5 = f37;
        }
        float top = childAt.getTop() + f4;
        if (childCount <= width) {
            width = childCount;
        }
        rectF.set(f5, top, width, childAt.getBottom() - f4);
        floatingBottomBarSelectorDrawable.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Float h() {
        FloatingBottomBarSelectorDrawable floatingBottomBarSelectorDrawable = this.i;
        RectF rectF = floatingBottomBarSelectorDrawable.i;
        if (!((Boolean) g.J.getValue()).booleanValue() || floatingBottomBarSelectorDrawable.f55989w < 0) {
            return null;
        }
        floatingBottomBarSelectorDrawable.f55989w = -1;
        ValueAnimator valueAnimator = floatingBottomBarSelectorDrawable.u;
        rectF.set((valueAnimator == null || !valueAnimator.isRunning()) ? floatingBottomBarSelectorDrawable.f55978g : floatingBottomBarSelectorDrawable.f55979h);
        ValueAnimator valueAnimator2 = floatingBottomBarSelectorDrawable.u;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        floatingBottomBarSelectorDrawable.f55990x = true;
        floatingBottomBarSelectorDrawable.invalidateSelf();
        return Float.valueOf(rectF.centerX());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(android.graphics.Rect r6) {
        /*
            r5 = this;
            int r0 = r6.height()
            float r0 = (float) r0
            java.lang.Float r1 = r5.f55974j
            r2 = 0
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L23
            float r4 = r1.floatValue()
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 == 0) goto L23
            float r1 = r1.floatValue()
            float r0 = r0 / r3
            int r4 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r4 <= 0) goto L25
            r1 = r0
            goto L25
        L23:
            float r1 = r0 / r3
        L25:
            android.graphics.Paint r0 = r5.f55973h
            float r0 = r0.getStrokeWidth()
            float r0 = r0 / r3
            float r1 = r1 - r0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L32
            goto L33
        L32:
            r2 = r1
        L33:
            int r6 = r6.height()
            float r6 = (float) r6
            float r6 = r6 / r3
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L3e
            r2 = r6
        L3e:
            float r6 = r5.k
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 != 0) goto L46
            r6 = 0
            return r6
        L46:
            r5.k = r2
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.drawables.FloatingBottomBarDrawable.i(android.graphics.Rect):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        invalidateSelf();
    }

    public final void j(Rect rect) {
        boolean z = this.f55971c;
        Paint paint = this.f55973h;
        if (!z || !this.e) {
            paint.setShader(null);
            return;
        }
        Context context = this.f55969a;
        boolean zQ = kli.a.q(context);
        int iS = kli.a.s(zQ ? f55967m : f55968n, context);
        float f = zQ ? 0.16f : 0.32f;
        float f4 = zQ ? 0.08f : 0.16f;
        c.q(paint, rect, new int[]{io0.a.d(f, iS), io0.a.d(f4, iS), io0.a.d(zQ ? 0.04f : 0.08f, iS), io0.a.d(f4, iS), io0.a.d(f, iS)}, f55966l);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.i.setBounds(bounds);
        j(bounds);
        i(bounds);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable who, Runnable what, long j2) {
        Intrinsics.checkNotNullParameter(who, "who");
        Intrinsics.checkNotNullParameter(what, "what");
        scheduleSelf(what, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f55972g.setAlpha(i);
        this.f55973h.setAlpha(i);
        this.i.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f55972g.setColorFilter(colorFilter);
        this.f55973h.setColorFilter(colorFilter);
        this.i.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable who, Runnable what) {
        Intrinsics.checkNotNullParameter(who, "who");
        Intrinsics.checkNotNullParameter(what, "what");
        unscheduleSelf(what);
    }

    public /* synthetic */ FloatingBottomBarDrawable(Context context, LinearLayout linearLayout, int i, int i2) {
        this(context, linearLayout, i, (i2 & 8) != 0, true, false);
    }
}
