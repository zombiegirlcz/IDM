package com.revolut.core.ui_kit.internal.views.chart;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import t70.x;
import ts0.o0;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f56784a = new PointF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f56785b = new int[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f56786c = new x(this, 5);
    public boolean d;
    public final /* synthetic */ o0 e;

    public i(o0 o0Var) {
        this.e = o0Var;
    }

    public final void a(MotionEvent motionEvent, View view) {
        view.getLocationOnScreen(this.f56785b);
        this.f56784a.set(motionEvent.getRawX() - r0[0], motionEvent.getRawY() - r0[1]);
    }

    public final int b() {
        o0 o0Var = this.e;
        RectF[] rectFArr = o0Var.f273895a.getDrawHolder().f56754a;
        int length = rectFArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            RectF rectF = rectFArr[i];
            int i3 = i2 + 1;
            RectF rectF2 = o0Var.f273897c;
            SegmentedChartView segmentedChartView = o0Var.f273895a;
            rectF2.top = segmentedChartView.getDrawHolder().d.top;
            rectF2.bottom = segmentedChartView.getDrawHolder().d.bottom;
            float f = rectF.left;
            int i5 = o0Var.e;
            rectF2.left = f - (i5 / 2);
            rectF2.right = rectF.right + (i5 / 2);
            RectF rectF3 = o0Var.f273897c;
            float f4 = rectF3.left;
            float f5 = this.f56784a.x;
            if (f4 <= f5 && rectF3.right >= f5) {
                return i2;
            }
            i++;
            i2 = i3;
        }
        return -1;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        o0 o0Var = this.e;
        SegmentedChartView segmentedChartView = o0Var.f273895a;
        x xVar = this.f56786c;
        segmentedChartView.removeCallbacks(xVar);
        SegmentedChartView segmentedChartView2 = o0Var.f273895a;
        a(e, segmentedChartView2);
        segmentedChartView2.postDelayed(xVar, 500L);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e2, float f, float f4) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        this.e.f273895a.removeCallbacks(this.f56786c);
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f, float f4) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        boolean z = this.d;
        o0 o0Var = this.e;
        if (!z) {
            o0Var.f273895a.removeCallbacks(this.f56786c);
            return true;
        }
        a(e2, o0Var.f273895a);
        int iB = b();
        if (iB < 0) {
            return true;
        }
        o0Var.f273895a.setSelectedPosition(iB);
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
        o0 o0Var = this.e;
        if (!z) {
            a(e, o0Var.f273895a);
            int iB = b();
            SegmentedChartView segmentedChartView = o0Var.f273895a;
            if (iB == segmentedChartView.getSelectedPosition()) {
                iB = -1;
            }
            segmentedChartView.setSelectedPosition(iB);
        }
        this.d = false;
        o0Var.f273895a.removeCallbacks(this.f56786c);
        return true;
    }
}
