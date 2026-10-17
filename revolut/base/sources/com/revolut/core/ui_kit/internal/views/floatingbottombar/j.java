package com.revolut.core.ui_kit.internal.views.floatingbottombar;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.drawables.FloatingBottomBarDrawable;
import com.revolut.core.ui_kit.internal.drawables.FloatingBottomBarSelectorDrawable;
import com.revolut.core.ui_kit.internal.views.floatingbottombar.FloatingBottomTabView;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import kotlin.jvm.internal.Intrinsics;
import mt0.w;
import mt0.x;
import mx0.o6;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FloatingBottomBarView f57073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatingBottomBarDrawable f57074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o6 f57075c;
    public final int d;
    public final boolean e;
    public x f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f57076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f57077h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f57078j;
    public final LinearLayout k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f57079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Float f57080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f57081n;
    public final Matrix o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Matrix f57082p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f57083q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f57084r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jq0.h f57085s;

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    public j(FloatingBottomBarView barView, FloatingBottomBarDrawable drawable, o6 callbacks) {
        Intrinsics.checkNotNullParameter(barView, "barView");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.f57073a = barView;
        this.f57074b = drawable;
        this.f57075c = callbacks;
        this.d = ViewConfiguration.get(barView.getContext()).getScaledTouchSlop();
        this.e = ((Boolean) jo0.g.J.getValue()).booleanValue();
        this.f = x.IDLE;
        this.k = barView.getContent();
        this.o = new Matrix();
        this.f57082p = new Matrix();
        this.f57083q = new float[2];
        this.f57085s = new jq0.h(this, 1);
    }

    public final void a(boolean z) {
        e(x.IDLE);
        this.f57078j = null;
        this.i = null;
        if (this.f57081n) {
            Choreographer.getInstance().removeFrameCallback(this.f57085s);
            this.f57081n = false;
        }
        this.f57080m = null;
        if (z) {
            FloatingBottomBarDrawable floatingBottomBarDrawable = this.f57074b;
            FloatingBottomBarSelectorDrawable floatingBottomBarSelectorDrawable = floatingBottomBarDrawable.i;
            floatingBottomBarSelectorDrawable.f55990x = false;
            floatingBottomBarSelectorDrawable.b(BitmapDescriptorFactory.HUE_RED, 400L);
            floatingBottomBarDrawable.invalidateSelf();
        }
    }

    public final Integer b(float f) {
        if (this.k.getChildCount() == 0) {
            return null;
        }
        float width = (r0.getWidth() - r0.getPaddingStart()) - r0.getPaddingEnd();
        if (width <= BitmapDescriptorFactory.HUE_RED) {
            return null;
        }
        return Integer.valueOf(kotlin.ranges.f.g((int) (kotlin.ranges.f.f(f - r0.getPaddingStart(), BitmapDescriptorFactory.HUE_RED, width) / (width / r0.getChildCount())), 0, r0.getChildCount() - 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(float r7) {
        /*
            r6 = this;
            java.lang.Integer r7 = r6.b(r7)
            r0 = 0
            if (r7 == 0) goto L20
            int r7 = r7.intValue()
            android.widget.LinearLayout r1 = r6.k
            android.view.View r7 = r1.getChildAt(r7)
            boolean r1 = r7 instanceof com.revolut.core.ui_kit.internal.views.floatingbottombar.FloatingBottomTabView
            if (r1 == 0) goto L18
            com.revolut.core.ui_kit.internal.views.floatingbottombar.FloatingBottomTabView r7 = (com.revolut.core.ui_kit.internal.views.floatingbottombar.FloatingBottomTabView) r7
            goto L19
        L18:
            r7 = r0
        L19:
            if (r7 == 0) goto L20
            com.revolut.core.ui_kit.internal.views.floatingbottombar.FloatingBottomTabView$DisplayedItemModel r7 = r7.getDisplayedItem()
            goto L21
        L20:
            r7 = r0
        L21:
            if (r7 != 0) goto L24
            goto L4c
        L24:
            com.revolut.core.ui_kit.internal.views.floatingbottombar.k r1 = r7.f57046g
            java.lang.String r7 = r7.f57043a
            int[] r2 = com.revolut.core.ui_kit.internal.views.floatingbottombar.l.f57086a
            int r3 = r1.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L50
            r4 = 2
            if (r2 == r4) goto L40
            r5 = 3
            if (r2 != r5) goto L3a
            goto L40
        L3a:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L40:
            int[] r2 = com.revolut.core.ui_kit.internal.views.floatingbottombar.i.f57072a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            if (r1 == r3) goto L4e
            if (r1 == r4) goto L4d
        L4c:
            return r0
        L4d:
            return r7
        L4e:
            java.lang.String r7 = "EXPAND_ACTION"
        L50:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.floatingbottombar.j.c(float):java.lang.String");
    }

    public final void d(float f, float f4) {
        Float fValueOf;
        FloatingBottomTabView.DisplayedItemModel displayedItem;
        float fG = g(f, f4);
        this.f57079l = fG;
        boolean z = this.e;
        if (z) {
            h(fG);
        }
        if (this.f57081n) {
            return;
        }
        this.f57081n = true;
        if (this.f57080m == null) {
            if (z) {
                String selectedItemId = this.f57073a.getSelectedItemId();
                Float fValueOf2 = null;
                if (selectedItemId != null) {
                    LinearLayout linearLayout = this.k;
                    int childCount = linearLayout.getChildCount();
                    int i = 0;
                    while (true) {
                        if (i >= childCount) {
                            break;
                        }
                        View childAt = linearLayout.getChildAt(i);
                        FloatingBottomTabView floatingBottomTabView = childAt instanceof FloatingBottomTabView ? (FloatingBottomTabView) childAt : null;
                        if (Intrinsics.f((floatingBottomTabView == null || (displayedItem = floatingBottomTabView.getDisplayedItem()) == null) ? null : displayedItem.f57043a, selectedItemId)) {
                            fValueOf2 = Float.valueOf((floatingBottomTabView.getWidth() / 2.0f) + floatingBottomTabView.getLeft());
                            break;
                        }
                        i++;
                    }
                }
                fValueOf = Float.valueOf(fValueOf2 != null ? fValueOf2.floatValue() : this.f57079l);
            } else {
                fValueOf = Float.valueOf(this.f57079l);
            }
            this.f57080m = fValueOf;
        }
        Choreographer.getInstance().postFrameCallback(this.f57085s);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void e(x touchState) {
        if (touchState != this.f) {
            Intrinsics.checkNotNullParameter(touchState, "touchState");
            a bottomBarController = this.f57075c.f209887a.getBottomBarController();
            if (bottomBarController != null) {
                Intrinsics.checkNotNullParameter(touchState, "touchState");
                if (((Boolean) jo0.g.J.getValue()).booleanValue() && (!bottomBarController.f57052h || touchState == x.IDLE)) {
                    boolean z = bottomBarController.f57053j;
                    int i = mt0.m.f208712a[touchState.ordinal()];
                    boolean z3 = i == 1 || i == 2;
                    bottomBarController.f57053j = z3;
                    if (z3) {
                        if (!z) {
                            bottomBarController.k = true;
                            bottomBarController.a(bottomBarController.f57048a, 1.025f, 120L, new mt0.k(bottomBarController, 1), new mt0.k(bottomBarController, 2));
                            String str = bottomBarController.f57054l;
                            if (str != null) {
                                bottomBarController.b(str, true);
                            }
                        }
                    } else if (!bottomBarController.k) {
                        bottomBarController.c();
                    }
                }
            }
            this.f = touchState;
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void f() {
        View childAt;
        Integer numB = b(g(this.f57076g, this.f57077h));
        if (numB != null) {
            int iIntValue = numB.intValue();
            FloatingBottomBarSelectorDrawable floatingBottomBarSelectorDrawable = this.f57074b.i;
            RectF rectF = floatingBottomBarSelectorDrawable.f;
            RectF rectF2 = floatingBottomBarSelectorDrawable.f55979h;
            RectF rectF3 = floatingBottomBarSelectorDrawable.f55978g;
            RectF rectF4 = floatingBottomBarSelectorDrawable.e;
            ViewGroup viewGroup = floatingBottomBarSelectorDrawable.f55975a;
            if (((Boolean) jo0.g.J.getValue()).booleanValue() && iIntValue >= 0 && iIntValue < viewGroup.getChildCount()) {
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
                if (childAt == null) {
                    return;
                }
                if (!rectF4.isEmpty() || floatingBottomBarSelectorDrawable.f(childAt)) {
                    int iIndexOfChild = viewGroup.indexOfChild(childAt);
                    if (iIndexOfChild == iIntValue) {
                        floatingBottomBarSelectorDrawable.f55989w = iIntValue;
                        rectF3.set(rectF4);
                        rectF2.set(rectF4);
                        floatingBottomBarSelectorDrawable.d();
                        return;
                    }
                    View childAt2 = viewGroup.getChildAt(iIntValue);
                    Intrinsics.h(childAt2);
                    if (childAt2.getWidth() <= 0 || childAt2.getHeight() <= 0) {
                        return;
                    }
                    rectF.set(rectF4);
                    if (floatingBottomBarSelectorDrawable.f(childAt2)) {
                        floatingBottomBarSelectorDrawable.f55989w = iIntValue;
                        rectF3.set(rectF4);
                        rectF2.set(rectF);
                        floatingBottomBarSelectorDrawable.d();
                        floatingBottomBarSelectorDrawable.e(iIndexOfChild, iIntValue, true);
                    }
                }
            }
        }
    }

    public final float g(float f, float f4) {
        boolean z = this.f57084r;
        LinearLayout linearLayout = this.k;
        if (!z) {
            return kotlin.ranges.f.f(f, BitmapDescriptorFactory.HUE_RED, linearLayout.getWidth());
        }
        float[] fArr = this.f57083q;
        fArr[0] = f;
        fArr[1] = f4;
        this.f57082p.mapPoints(fArr);
        return kotlin.ranges.f.f(fArr[0], BitmapDescriptorFactory.HUE_RED, linearLayout.getWidth());
    }

    public final void h(float f) {
        String strC = c(f);
        if (Intrinsics.f(strC, this.i)) {
            return;
        }
        this.i = strC;
        this.f57075c.a(strC);
    }
}
