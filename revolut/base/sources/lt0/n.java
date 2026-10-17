package lt0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.chart.ComparisonLineChartView;
import com.revolut.core.ui_kit.internal.views.fanchart.FanChartView;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public final class n implements iv0.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f199751b;

    public /* synthetic */ n(View view, int i) {
        this.f199750a = i;
        this.f199751b = view;
    }

    private final void b() {
    }

    @Override // iv0.l
    public final void a(float f) {
        switch (this.f199750a) {
            case 0:
                ((FanChartView) this.f199751b).setAppearingAnimatedValue(f);
                break;
            default:
                ((ComparisonLineChartView) this.f199751b).setAppearingAnimatedValue(f);
                break;
        }
    }

    @Override // iv0.l
    public final void onAnimationEnd() {
        switch (this.f199750a) {
            case 0:
                break;
            default:
                ComparisonLineChartView comparisonLineChartView = (ComparisonLineChartView) this.f199751b;
                if (!comparisonLineChartView.M.f56774c) {
                    comparisonLineChartView.k(ts0.p.PULSATING);
                }
                break;
        }
    }

    @Override // iv0.l
    public final void onAnimationStart() {
        switch (this.f199750a) {
            case 0:
                ((FanChartView) this.f199751b).f56963a.onNext(Unit.f186387a);
                break;
            default:
                ComparisonLineChartView.a((ComparisonLineChartView) this.f199751b);
                break;
        }
    }
}
