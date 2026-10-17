package pt0;

import android.animation.Animator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.gaugechart.SegmentedGaugeChartView;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class r implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SegmentedGaugeChartView f239585b;

    public /* synthetic */ r(SegmentedGaugeChartView segmentedGaugeChartView, int i) {
        this.f239584a = i;
        this.f239585b = segmentedGaugeChartView;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    private final void p(Animator animator) {
    }

    private final void q(Animator animator) {
    }

    private final void r(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f239584a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f239584a) {
            case 0:
                f0 f0Var = f0.f322471a;
                SegmentedGaugeChartView segmentedGaugeChartView = this.f239585b;
                segmentedGaugeChartView.H = f0Var;
                segmentedGaugeChartView.I = f0Var;
                segmentedGaugeChartView.J.clear();
                segmentedGaugeChartView.K.clear();
                segmentedGaugeChartView.M = f0Var;
                segmentedGaugeChartView.f57132j.f57149c.clear();
                segmentedGaugeChartView.k = true;
                segmentedGaugeChartView.invalidate();
                break;
            case 1:
                this.f239585b.i0 = true;
                break;
            case 2:
                break;
            case 3:
                SegmentedGaugeChartView segmentedGaugeChartView2 = this.f239585b;
                segmentedGaugeChartView2.unselectingSegmentId = null;
                segmentedGaugeChartView2.setUnselectionProgress(BitmapDescriptorFactory.HUE_RED);
                break;
            case 4:
                break;
            default:
                this.f239585b.unselectingSegmentId = null;
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.f239584a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f239584a) {
            case 2:
                SegmentedGaugeChartView segmentedGaugeChartView = this.f239585b;
                segmentedGaugeChartView.m0.a();
                r rVar = segmentedGaugeChartView.f57129g;
                if (rVar != null) {
                    segmentedGaugeChartView.getSelectionAnimator().removeListener(rVar);
                }
                segmentedGaugeChartView.f57129g = null;
                break;
            case 4:
                SegmentedGaugeChartView segmentedGaugeChartView2 = this.f239585b;
                if (!segmentedGaugeChartView2.getData().d() && !segmentedGaugeChartView2.q()) {
                    segmentedGaugeChartView2.m0.a();
                    break;
                }
                break;
        }
    }
}
