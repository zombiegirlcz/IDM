package kwg;

import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.SimpleTotalValueChart;
import java.util.Optional;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f190350b;

    public /* synthetic */ i(l lVar, int i) {
        this.f190349a = i;
        this.f190350b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Optional it8 = (Optional) obj2;
        switch (this.f190349a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                SimpleTotalValueChart simpleTotalValueChart = (SimpleTotalValueChart) gj7.b.m(it8);
                this.f190350b.getClass();
                if (simpleTotalValueChart != null) {
                    return simpleTotalValueChart;
                }
                DateTime dateTime = l.f190352t;
                return new SimpleTotalValueChart(dateTime, dateTime, f0.f322471a);
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                SimpleTotalValueChart simpleTotalValueChart2 = (SimpleTotalValueChart) gj7.b.m(it8);
                this.f190350b.getClass();
                if (simpleTotalValueChart2 != null) {
                    return simpleTotalValueChart2;
                }
                DateTime dateTime2 = l.f190352t;
                return new SimpleTotalValueChart(dateTime2, dateTime2, f0.f322471a);
        }
    }
}
