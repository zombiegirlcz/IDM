package bt0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import aw0.y6;
import com.revolut.core.ui_kit.internal.views.chart.LineChartView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0.a f18239a = new a0.a(this, 6);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f18241c;

    public m(q qVar) {
        this.f18241c = qVar;
    }

    public final int a(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        q qVar = this.f18241c;
        if (qVar.f18244c.getF56704g().f56719b.left > x3 || qVar.f18244c.getF56704g().f56719b.right < x3) {
            return qVar.f18246h;
        }
        int size = qVar.f18244c.getChartItems().size() - 1;
        int i = 0;
        while (i <= size) {
            int iA = a10.b.a(size, i, 2, i);
            y6 y6Var = qVar.f18244c.getChartItems().get(iA);
            if (x3 < qVar.k(y6Var.f10630a)) {
                size = iA - 1;
            } else {
                if (x3 <= qVar.k(y6Var.f10630a)) {
                    return iA;
                }
                i = iA + 1;
            }
        }
        return Math.abs(qVar.k(qVar.f18244c.getChartItems().get(Math.min(i, v.j(qVar.f18244c.getChartItems()))).f10630a) - x3) < Math.abs(qVar.k(qVar.f18244c.getChartItems().get(size).f10630a) - x3) ? i : size;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        q qVar = this.f18241c;
        LineChartView lineChartView = qVar.f18244c;
        a0.a aVar = this.f18239a;
        lineChartView.removeCallbacks(aVar);
        qVar.f18246h = a(e);
        qVar.f18244c.postDelayed(aVar, 150L);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e2, float f, float f4) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        this.f18241c.f18244c.removeCallbacks(this.f18239a);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent moveEvent, float f, float f4) {
        Integer numValueOf;
        int iIntValue;
        q qVar = this.f18241c;
        LineChartView lineChartView = qVar.f18244c;
        Intrinsics.checkNotNullParameter(moveEvent, "moveEvent");
        boolean z = this.f18240b;
        a0.a aVar = this.f18239a;
        if (!z) {
            qVar.f18244c.removeCallbacks(aVar);
            return true;
        }
        com.revolut.core.ui_kit.internal.views.chart.h drawingDelegateModel = qVar.f18244c.getDrawingDelegateModel();
        Intrinsics.i(drawingDelegateModel, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.chart.delegates.LineChartTrendViewInteractionDrawingDelegate.Model");
        int i = l.f18238a[((n) drawingDelegateModel).f18242a.ordinal()];
        if (i == 1) {
            numValueOf = Integer.valueOf(a(moveEvent));
        } else {
            if (i != 2) {
                qVar.f18244c.removeCallbacks(aVar);
                return true;
            }
            qVar.h(a(moveEvent), (int) lineChartView.getF56704g().f56719b.width());
            numValueOf = null;
        }
        if (numValueOf != null && qVar.f18246h != (iIntValue = numValueOf.intValue())) {
            int size = lineChartView.getChartItems().size();
            int i2 = qVar.f18246h;
            if (i2 >= 0 && i2 < size && iIntValue >= 0 && iIntValue < lineChartView.getChartItems().size() && lineChartView.getChartItems().get(iIntValue).f10630a != lineChartView.getChartItems().get(qVar.f18246h).f10630a) {
                qVar.f18246h = iIntValue;
                qVar.f18249m.invoke(Integer.valueOf(iIntValue), Float.valueOf(lineChartView.getChartItems().get(iIntValue).f10631b));
            }
        }
        lineChartView.invalidate();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f18240b = false;
        q qVar = this.f18241c;
        qVar.f18250n.invoke();
        LineChartView lineChartView = qVar.f18244c;
        lineChartView.invalidate();
        lineChartView.removeCallbacks(this.f18239a);
        dgm.e eVar = qVar.f56725b;
        if (eVar == null) {
            return true;
        }
        eVar.onNext(Unit.f186387a);
        return true;
    }
}
