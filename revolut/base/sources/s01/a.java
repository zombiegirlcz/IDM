package s01;

import com.revolut.core_ui_advanced_chart.delegate.AdvancedChartViewDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdvancedChartViewDelegate f258747b;

    public /* synthetic */ a(AdvancedChartViewDelegate advancedChartViewDelegate, int i) {
        this.f258746a = i;
        this.f258747b = advancedChartViewDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String info = (String) obj2;
        switch (this.f258746a) {
            case 0:
                Intrinsics.checkNotNullParameter(info, "info");
                this.f258747b.d.onNext(new q(info));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(info, "id");
                this.f258747b.d.onNext(new n(info));
                break;
            case 2:
                Intrinsics.checkNotNullParameter(info, "info");
                this.f258747b.d.onNext(new k(info));
                break;
            default:
                Intrinsics.checkNotNullParameter(info, "info");
                this.f258747b.d.onNext(new m(info));
                break;
        }
        return Unit.f186387a;
    }
}
