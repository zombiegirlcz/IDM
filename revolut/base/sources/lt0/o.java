package lt0;

import com.revolut.core.ui_kit.internal.views.fanchart.MultiTargetFanChartView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiTargetFanChartView f199753b;

    public /* synthetic */ o(MultiTargetFanChartView multiTargetFanChartView, int i) {
        this.f199752a = i;
        this.f199753b = multiTargetFanChartView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f199752a) {
            case 0:
                this.f199753b.I = (q) obj2;
                return Unit.f186387a;
            default:
                return MultiTargetFanChartView.a(this.f199753b, ((Float) obj2).floatValue());
        }
    }
}
