package jq0;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.b0;
import zhm.u0;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f177340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f177341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f177342c;
    public final RectF d;
    public final RectF e;
    public final RectF f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f177343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f177344h;
    public final RectF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f177345j;
    public final RectF k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f177346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RectF f177347m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Matrix f177348n;
    public final Matrix o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RectF f177349p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final RectF f177350q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RectF f177351r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RectF f177352s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f177353t;
    public boolean u;
    public final RectF v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final es0.k f177354w;

    public c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f177340a = view;
        this.f177341b = new Object();
        this.f177342c = new ArrayList();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new RectF();
        this.f177343g = new RectF();
        this.f177344h = new RectF();
        this.i = new RectF();
        this.f177345j = new RectF();
        this.k = new RectF();
        this.f177346l = new RectF();
        this.f177347m = new RectF();
        this.f177348n = new Matrix();
        this.o = new Matrix();
        this.f177349p = new RectF();
        this.f177350q = new RectF();
        this.f177351r = new RectF();
        this.f177352s = new RectF();
        this.u = true;
        this.v = new RectF();
        this.f177354w = new es0.k(this, 4);
    }

    public static b b(ViewGroup viewGroup) {
        Object tag2 = viewGroup.getTag(R$id.internal_animation_clip_state_tag);
        if (tag2 instanceof b) {
            return (b) tag2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float c(float r6, android.graphics.RectF r7, android.graphics.RectF r8, android.graphics.RectF r9) {
        /*
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 > 0) goto L7
            return r6
        L7:
            float r1 = r6 - r0
            float r2 = r8.left
            float r3 = r9.left
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L22
            float r4 = r7.left
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 >= 0) goto L22
            float r3 = r4 - r3
            float r3 = r3 * r1
            float r4 = r4 - r2
            float r3 = r3 / r4
            float r3 = r3 + r0
            float r2 = java.lang.Math.min(r6, r3)
            goto L23
        L22:
            r2 = r6
        L23:
            float r8 = r8.right
            float r9 = r9.right
            int r3 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r3 <= 0) goto L3a
            float r7 = r7.right
            int r3 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r3 <= 0) goto L3a
            float r9 = r9 - r7
            float r9 = r9 * r1
            float r8 = r8 - r7
            float r9 = r9 / r8
            float r9 = r9 + r0
            float r2 = java.lang.Math.min(r2, r9)
        L3a:
            float r6 = kotlin.ranges.f.f(r2, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jq0.c.c(float, android.graphics.RectF, android.graphics.RectF, android.graphics.RectF):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float d(float r6, android.graphics.RectF r7, android.graphics.RectF r8, android.graphics.RectF r9) {
        /*
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 > 0) goto L7
            return r6
        L7:
            float r1 = r6 - r0
            float r2 = r8.top
            float r3 = r9.top
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L22
            float r4 = r7.top
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 >= 0) goto L22
            float r3 = r4 - r3
            float r3 = r3 * r1
            float r4 = r4 - r2
            float r3 = r3 / r4
            float r3 = r3 + r0
            float r2 = java.lang.Math.min(r6, r3)
            goto L23
        L22:
            r2 = r6
        L23:
            float r8 = r8.bottom
            float r9 = r9.bottom
            int r3 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r3 <= 0) goto L3a
            float r7 = r7.bottom
            int r3 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r3 <= 0) goto L3a
            float r9 = r9 - r7
            float r9 = r9 * r1
            float r8 = r8 - r7
            float r9 = r9 / r8
            float r9 = r9 + r0
            float r2 = java.lang.Math.min(r2, r9)
        L3a:
            float r6 = kotlin.ranges.f.f(r2, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jq0.c.d(float, android.graphics.RectF, android.graphics.RectF, android.graphics.RectF):float");
    }

    public static void e(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        matrix.mapRect(rectF);
        rectF.offset(view.getLeft() - viewGroup.getScrollX(), view.getTop() - viewGroup.getScrollY());
    }

    public static /* synthetic */ void f(c cVar, RectF rectF, View view, ViewGroup viewGroup) {
        Matrix matrix = view.getMatrix();
        Intrinsics.checkNotNullExpressionValue(matrix, "getMatrix(...)");
        cVar.getClass();
        e(view, matrix, rectF, viewGroup);
    }

    public static void k(Matrix matrix, View view, float f, float f4) {
        matrix.reset();
        matrix.postScale(f, f4, view.getPivotX(), view.getPivotY());
        matrix.postRotate(view.getRotation(), view.getPivotX(), view.getPivotY());
        matrix.postTranslate(view.getTranslationX(), view.getTranslationY());
    }

    public final boolean a(ViewGroup viewGroup, ViewGroup viewGroup2, RectF rectF) {
        int childCount = viewGroup.getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if (childAt.getWidth() != 0 && childAt.getHeight() != 0) {
                    float width = childAt.getWidth();
                    float height = childAt.getHeight();
                    RectF rectF2 = this.v;
                    rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
                    View view = childAt;
                    while (view != viewGroup2) {
                        ViewParent parent = view.getParent();
                        ViewGroup viewGroup3 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                        if (viewGroup3 == null) {
                            break;
                        }
                        f(this, rectF2, view, viewGroup3);
                        view = viewGroup3;
                    }
                    float f = rectF2.left;
                    if (f < rectF.left) {
                        rectF.left = f;
                        z = true;
                    }
                    float f4 = rectF2.top;
                    if (f4 < rectF.top) {
                        rectF.top = f4;
                        z = true;
                    }
                    float f5 = rectF2.right;
                    if (f5 > rectF.right) {
                        rectF.right = f5;
                        z = true;
                    }
                    float f6 = rectF2.bottom;
                    if (f6 > rectF.bottom) {
                        rectF.bottom = f6;
                        z = true;
                    }
                }
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) childAt;
                    if (!viewGroup4.getClipChildren() && !viewGroup4.getClipToPadding()) {
                        z = a(viewGroup4, viewGroup2, rectF) || z;
                    }
                }
            }
        }
        return z;
    }

    public final void g(float f, float f4, Function2 function2) {
        if (f <= 1.0f && f4 <= 1.0f) {
            i();
            return;
        }
        View view = this.f177340a;
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                float width = view.getWidth();
                float height = view.getHeight();
                RectF rectF = this.i;
                rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
                this.u = !((view instanceof ViewGroup ? (ViewGroup) view : null) == null ? false : a(r7, r7, rectF));
                RectF rectF2 = this.f177345j;
                rectF2.set(rectF);
                Matrix matrix = this.f177348n;
                k(matrix, view, 1.0f, 1.0f);
                e(view, matrix, rectF2, viewGroup);
                RectF rectF3 = this.k;
                rectF3.set(rectF);
                Matrix matrix2 = this.o;
                k(matrix2, view, f, f4);
                e(view, matrix2, rectF3, viewGroup);
                h(rectF2, rectF3, Float.valueOf(f), Float.valueOf(f4), function2);
                return;
            }
        }
        i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01cd, code lost:
    
        if (r26 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01cf, code lost:
    
        if (r27 == null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01d1, code lost:
    
        if (r22 == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01d3, code lost:
    
        r1 = r26.floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d9, code lost:
    
        if (r15 != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01db, code lost:
    
        if (r20 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01dd, code lost:
    
        r3 = r20.floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e7, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01e8, code lost:
    
        if (r16 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ea, code lost:
    
        r3 = r16.floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01ef, code lost:
    
        r3 = r26.floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f3, code lost:
    
        r1 = java.lang.Float.valueOf(java.lang.Math.min(r1, r3));
        r3 = r27.floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01ff, code lost:
    
        if (r15 != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0201, code lost:
    
        if (r21 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0203, code lost:
    
        r2 = r21.floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x020d, code lost:
    
        throw new java.lang.IllegalStateException("Required value was null.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x020e, code lost:
    
        if (r17 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0210, code lost:
    
        r2 = r17.floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0215, code lost:
    
        r2 = r27.floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0219, code lost:
    
        r2 = java.lang.Float.valueOf(java.lang.Math.min(r3, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0222, code lost:
    
        r1 = r26;
        r2 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0226, code lost:
    
        if (r5 == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0228, code lost:
    
        r1 = java.lang.Float.valueOf(java.lang.Math.min(r1.floatValue(), c(r26.floatValue(), r2, r3, r6)));
        r2 = java.lang.Float.valueOf(java.lang.Math.min(r2.floatValue(), d(r27.floatValue(), r2, r3, r6)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0250, code lost:
    
        if (r28 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0252, code lost:
    
        r28.invoke(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0255, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0266, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.graphics.RectF r24, android.graphics.RectF r25, java.lang.Float r26, java.lang.Float r27, kotlin.jvm.functions.Function2 r28) {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jq0.c.h(android.graphics.RectF, android.graphics.RectF, java.lang.Float, java.lang.Float, kotlin.jvm.functions.Function2):void");
    }

    public final void i() {
        this.f177340a.removeOnAttachStateChangeListener(this.f177354w);
        ArrayList arrayList = this.f177342c;
        Iterator it8 = b0.M(arrayList).iterator();
        while (true) {
            ListIterator listIterator = ((u0) it8).f322480a;
            if (!listIterator.hasPrevious()) {
                arrayList.clear();
                this.f177353t = false;
                return;
            }
            ViewGroup viewGroup = (ViewGroup) listIterator.previous();
            b bVarB = b(viewGroup);
            if (bVarB != null) {
                LinkedHashSet linkedHashSet = bVarB.f177339c;
                linkedHashSet.remove(this.f177341b);
                if (linkedHashSet.isEmpty()) {
                    viewGroup.setClipChildren(bVarB.f177337a);
                    viewGroup.setClipToPadding(bVarB.f177338b);
                    viewGroup.setTag(R$id.internal_animation_clip_state_tag, null);
                }
            }
        }
    }

    public final void j(ViewGroup viewGroup, RectF rectF, RectF rectF2, boolean z, boolean z3) {
        ArrayList arrayList = this.f177342c;
        if (arrayList.isEmpty()) {
            this.f177340a.addOnAttachStateChangeListener(this.f177354w);
            this.f177346l.set(rectF);
            this.f177347m.set(rectF2);
            this.f177353t = true;
        }
        if (arrayList.contains(viewGroup)) {
            return;
        }
        arrayList.add(viewGroup);
        b bVarB = b(viewGroup);
        if (bVarB == null) {
            bVarB = new b(viewGroup.getClipChildren(), viewGroup.getClipToPadding());
            viewGroup.setTag(R$id.internal_animation_clip_state_tag, bVarB);
        }
        bVarB.f177339c.add(this.f177341b);
        if (z) {
            viewGroup.setClipChildren(false);
        }
        if (z3) {
            viewGroup.setClipToPadding(false);
        }
    }
}
