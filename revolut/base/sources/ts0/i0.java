package ts0;

import com.revolut.core.ui_kit.internal.views.chart.LineChartView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class i0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LineChartView f273874b;

    public /* synthetic */ i0(LineChartView lineChartView, int i) {
        this.f273873a = i;
        this.f273874b = lineChartView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f273873a;
        LineChartView lineChartView = this.f273874b;
        switch (i) {
            case 0:
                return LineChartView.a(lineChartView, ((Float) obj2).floatValue());
            default:
                bt0.h hVar = (bt0.h) obj2;
                LineChartView.a aVar = LineChartView.Companion;
                Intrinsics.h(hVar);
                lineChartView.v = hVar;
                lineChartView.invalidate();
                return Unit.f186387a;
        }
    }
}
