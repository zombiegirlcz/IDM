package ws0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.revolut.core.ui_kit.internal.views.chart.charttracker.chart.StepChartView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StepChartView f299639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f299640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f299641c;

    public a(StepChartView chartView) {
        Intrinsics.checkNotNullParameter(chartView, "chartView");
        this.f299639a = chartView;
        Intrinsics.checkNotNullExpressionValue(chartView.getContext(), "getContext(...)");
        this.f299640b = kli.a.k(r2, 40.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onDown(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            com.revolut.core.ui_kit.internal.views.chart.charttracker.chart.StepChartView r0 = r3.f299639a
            at0.a r1 = r0.getTooltip()
            int r1 = r1.getVisibility()
            r2 = 1
            if (r1 != 0) goto L35
            java.lang.Float r1 = r0.getTooltipXCoordinate()
            if (r1 == 0) goto L33
            float r4 = r4.getX()
            java.lang.Float r1 = r0.getTooltipXCoordinate()
            kotlin.jvm.internal.Intrinsics.h(r1)
            float r1 = r1.floatValue()
            float r4 = r4 - r1
            float r4 = java.lang.Math.abs(r4)
            float r1 = r3.f299640b
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 >= 0) goto L33
            goto L35
        L33:
            r4 = 0
            goto L36
        L35:
            r4 = r2
        L36:
            r3.f299641c = r4
            r0.postInvalidate()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ws0.a.onDown(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f, float f4) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        if (!this.f299641c) {
            return false;
        }
        StepChartView stepChartView = this.f299639a;
        stepChartView.tooltip.setVisibility(0);
        stepChartView.setTooltipXCoordinate$ui_kit_components_release(Float.valueOf(f.f(e2.getX(), stepChartView.getLeftMostTooltipPosition$ui_kit_components_release(), stepChartView.getRightMostTooltipPosition$ui_kit_components_release())));
        stepChartView.b(e2);
        stepChartView.postInvalidateOnAnimation();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f299639a.a(e.getX());
        return true;
    }
}
