package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import aw0.d0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import iv0.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ms0.e1;
import ms0.o0;
import op0.q;
import org.jetbrains.annotations.NotNull;
import qv0.c;
import tw0.b1;
import tw0.g1;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0002\u001b\u0014B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u000fR.\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010(\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u000fR\u0014\u0010+\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*¨\u0006/"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/DraggableWidgetRootFrameLayout;", "Landroid/widget/FrameLayout;", "Lms0/e1;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "preview", "", "setPreviewMode", "(Z)V", "elevated", "setElevated", "Lop0/q;", "value", "a", "Lop0/q;", "getWidgetSize", "()Lop0/q;", "setWidgetSize", "(Lop0/q;)V", "widgetSize", "Lms0/o0;", "h", "Lms0/o0;", "getOnLongTapListener", "()Lms0/o0;", "setOnLongTapListener", "(Lms0/o0;)V", "onLongTapListener", "i", "Z", "getWholeWidgetClickable", "()Z", "setWholeWidgetClickable", "wholeWidgetClickable", "getLastRawTouchX", "()I", "lastRawTouchX", "getLastRawTouchY", "lastRawTouchY", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DraggableWidgetRootFrameLayout extends FrameLayout implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public q widgetSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0 f56156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f56157c;
    public float d;
    public float e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f56158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public o0 onLongTapListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean wholeWidgetClickable;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f56160j;
    public final kt0.d k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DraggableWidgetRootFrameLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(DraggableWidgetRootFrameLayout draggableWidgetRootFrameLayout) {
        if (Math.abs(draggableWidgetRootFrameLayout.f56157c - draggableWidgetRootFrameLayout.getY()) > draggableWidgetRootFrameLayout.f) {
            return;
        }
        super.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0));
        o0 o0Var = draggableWidgetRootFrameLayout.onLongTapListener;
        if (o0Var != null) {
            o0Var.b();
        }
    }

    public final void b() {
        d0 d0VarB;
        q qVar = this.widgetSize;
        if (qVar != null) {
            b1 b1Var = g1.Companion;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            b1Var.getClass();
            d0VarB = b1.a(context).b(qVar);
        } else {
            d0VarB = null;
        }
        if (Intrinsics.f(this.f56156b, d0VarB)) {
            return;
        }
        this.f56156b = d0VarB;
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r7.getActionMasked()
            r1 = 1
            kt0.d r2 = r6.k
            android.os.Handler r3 = r6.f56158g
            if (r0 == 0) goto L4b
            if (r0 == r1) goto L43
            r1 = 2
            if (r0 == r1) goto L19
            r1 = 3
            if (r0 == r1) goto L43
            goto L46
        L19:
            float r0 = r7.getRawX()
            float r1 = r6.d
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            float r1 = r7.getRawY()
            float r4 = r6.e
            float r1 = r1 - r4
            float r1 = java.lang.Math.abs(r1)
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r1 = r1 + r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            int r1 = r6.f
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L46
            r3.removeCallbacks(r2)
            goto L46
        L43:
            r3.removeCallbacks(r2)
        L46:
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        L4b:
            float r0 = r7.getRawX()
            r6.d = r0
            float r0 = r7.getRawY()
            r6.e = r0
            float r0 = r6.getY()
            r6.f56157c = r0
            r4 = 300(0x12c, double:1.48E-321)
            r3.postDelayed(r2, r4)
            super.dispatchTouchEvent(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.DraggableWidgetRootFrameLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // ms0.e1
    public int getLastRawTouchX() {
        return (int) this.d;
    }

    @Override // ms0.e1
    public int getLastRawTouchY() {
        return (int) this.e;
    }

    public final o0 getOnLongTapListener() {
        return this.onLongTapListener;
    }

    public final boolean getWholeWidgetClickable() {
        return this.wholeWidgetClickable;
    }

    public final q getWidgetSize() {
        return this.widgetSize;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f56160j || this.wholeWidgetClickable) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        d0 d0Var = this.f56156b;
        if (d0Var == null) {
            super.onMeasure(i, i2);
            return;
        }
        int iC = rr0.i.c(i, getLayoutParams().width, Integer.MAX_VALUE);
        if (iC < 0 || i == Integer.MAX_VALUE) {
            super.onMeasure(i, i2);
            iC = getMeasuredWidth();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((iC * d0Var.f10275b) / d0Var.f10274a, 1073741824));
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getLayoutParams().height == -2) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
        }
    }

    public final void setElevated(boolean elevated) {
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        setElevation(kli.a.k(r0, (elevated ? Float.valueOf(16.0f) : null) != null ? r3.floatValue() : BitmapDescriptorFactory.HUE_RED));
    }

    public final void setOnLongTapListener(o0 o0Var) {
        this.onLongTapListener = o0Var;
    }

    public final void setPreviewMode(boolean preview) {
        this.f56160j = preview;
    }

    public final void setWholeWidgetClickable(boolean z) {
        this.wholeWidgetClickable = z;
    }

    public final void setWidgetSize(q qVar) {
        this.widgetSize = qVar;
        b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DraggableWidgetRootFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableWidgetRootFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f = kli.a.k(context, 6.0f);
        this.f56158g = new Handler(Looper.getMainLooper());
        int iS = kli.a.s(R$attr.uikit_colorBlack_20, context);
        int iK = kli.a.k(context, new c.e((qv0.h) null, 3).f249514a.a());
        setClipToOutline(true);
        setOutlineProvider(new s(iK, true));
        setOutlineAmbientShadowColor(iS);
        setOutlineSpotShadowColor(iS);
        this.k = new kt0.d(this, 11);
    }

    public /* synthetic */ DraggableWidgetRootFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
