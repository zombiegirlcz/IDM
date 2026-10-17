package s01;

import com.revolut.core_ui_advanced_chart.delegate.AdvancedChartViewDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdvancedChartViewDelegate f258751b;

    public /* synthetic */ c(AdvancedChartViewDelegate advancedChartViewDelegate, int i) {
        this.f258750a = i;
        this.f258751b = advancedChartViewDelegate;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String id10 = (String) obj2;
        String eventType = (String) obj3;
        switch (this.f258750a) {
            case 0:
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(eventType, "eventType");
                this.f258751b.d.onNext(new o(id10, eventType));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(eventType, "name");
                this.f258751b.d.onNext(new l(id10, eventType));
                break;
            default:
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(eventType, "name");
                this.f258751b.d.onNext(new p(id10, eventType));
                break;
        }
        return Unit.f186387a;
    }
}
