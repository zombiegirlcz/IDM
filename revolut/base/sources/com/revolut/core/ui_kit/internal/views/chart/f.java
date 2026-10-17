package com.revolut.core.ui_kit.internal.views.chart;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import t70.x;
import ts0.s;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f56779a = new PointF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f56780b = new int[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f56781c = new x(this, 4);
    public boolean d;
    public final /* synthetic */ s e;

    public f(s sVar) {
        this.e = sVar;
    }

    public final void a(MotionEvent motionEvent, View view) {
        view.getLocationOnScreen(this.f56780b);
        this.f56779a.set(motionEvent.getRawX() - r0[0], motionEvent.getRawY() - r0[1]);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(boolean r12) {
        /*
            r11 = this;
            ts0.s r0 = r11.e
            com.revolut.core.ui_kit.internal.views.chart.HistogramView r1 = r0.f273903a
            com.revolut.core.ui_kit.internal.views.chart.HistogramView$b r1 = r1.getDrawHolder()
            android.graphics.RectF[] r1 = r1.f56692g
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L59
            r5 = r1[r3]
            int r6 = r4 + 1
            android.graphics.RectF r7 = r0.f273905c
            android.graphics.RectF r8 = r0.f273905c
            com.revolut.core.ui_kit.internal.views.chart.HistogramView r9 = r0.f273903a
            com.revolut.core.ui_kit.internal.views.chart.HistogramView$b r10 = r9.getDrawHolder()
            android.graphics.RectF r10 = r10.i
            float r10 = r10.top
            r7.top = r10
            com.revolut.core.ui_kit.internal.views.chart.HistogramView$b r9 = r9.getDrawHolder()
            android.graphics.RectF r9 = r9.i
            float r9 = r9.bottom
            r7.bottom = r9
            float r9 = r5.left
            r7.left = r9
            float r5 = r5.right
            r7.right = r5
            android.graphics.PointF r5 = r11.f56779a
            if (r12 == 0) goto L48
            float r7 = r8.left
            float r9 = r5.x
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 > 0) goto L48
            float r7 = r8.right
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L48
            goto L54
        L48:
            if (r12 != 0) goto L55
            float r7 = r5.x
            float r5 = r5.y
            boolean r5 = r8.contains(r7, r5)
            if (r5 == 0) goto L55
        L54:
            return r4
        L55:
            int r3 = r3 + 1
            r4 = r6
            goto Ld
        L59:
            r12 = -1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.chart.f.b(boolean):int");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        s sVar = this.e;
        HistogramView histogramView = sVar.f273903a;
        x xVar = this.f56781c;
        histogramView.removeCallbacks(xVar);
        HistogramView histogramView2 = sVar.f273903a;
        a(e, histogramView2);
        histogramView2.postDelayed(xVar, 500L);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e2, float f, float f4) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        this.e.f273903a.removeCallbacks(this.f56781c);
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f, float f4) {
        s sVar = this.e;
        HistogramView histogramView = sVar.f273903a;
        Intrinsics.checkNotNullParameter(e2, "e2");
        if (!this.d) {
            sVar.f273903a.removeCallbacks(this.f56781c);
            return true;
        }
        boolean z = histogramView.getSelectedPosition() >= 0;
        a(e2, sVar.f273903a);
        int iB = b(z);
        if (iB >= 0) {
            histogramView.setSelectedPosition(iB);
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        boolean z = this.d;
        s sVar = this.e;
        if (!z) {
            a(e, sVar.f273903a);
            int iB = b(false);
            HistogramView histogramView = sVar.f273903a;
            if (iB == histogramView.getSelectedPosition()) {
                iB = -1;
            }
            histogramView.setSelectedPosition(iB);
        }
        this.d = false;
        sVar.f273903a.removeCallbacks(this.f56781c);
        return true;
    }
}
