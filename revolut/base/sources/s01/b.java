package s01;

import com.revolut.core_ui_advanced_chart.delegate.AdvancedChartViewDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdvancedChartViewDelegate f258749b;

    public /* synthetic */ b(AdvancedChartViewDelegate advancedChartViewDelegate, int i) {
        this.f258748a = i;
        this.f258749b = advancedChartViewDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f258748a) {
            case 0:
                this.f258749b.d.onNext(r.f258806a);
                break;
            default:
                this.f258749b.d.onNext(s.f258807a);
                break;
        }
        return Unit.f186387a;
    }
}
