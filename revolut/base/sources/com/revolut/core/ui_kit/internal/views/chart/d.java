package com.revolut.core.ui_kit.internal.views.chart;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.revolut.core.ui_kit.internal.views.chart.ComparisonLineChartView;
import kotlin.jvm.internal.Intrinsics;
import t70.x;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f56772a = new x(this, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f56773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56774c;
    public float d;
    public final /* synthetic */ ComparisonLineChartView e;

    public d(ComparisonLineChartView comparisonLineChartView) {
        this.e = comparisonLineChartView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        ComparisonLineChartView comparisonLineChartView = this.e;
        x xVar = this.f56772a;
        comparisonLineChartView.removeCallbacks(xVar);
        comparisonLineChartView.postDelayed(xVar, 150L);
        this.d = e.getX();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent moveEvent, float f, float f4) {
        ComparisonLineChartView comparisonLineChartView = this.e;
        ComparisonLineChartView.c cVar = comparisonLineChartView.f56621g;
        Intrinsics.checkNotNullParameter(moveEvent, "moveEvent");
        if (!this.f56773b) {
            comparisonLineChartView.removeCallbacks(this.f56772a);
            return true;
        }
        cVar.o = true;
        this.d = moveEvent.getX();
        comparisonLineChartView.d(cVar, comparisonLineChartView.getData().a(), comparisonLineChartView.getData().b());
        comparisonLineChartView.f(cVar.f56654j, cVar.k);
        comparisonLineChartView.e(cVar.k);
        comparisonLineChartView.invalidate();
        return true;
    }
}
