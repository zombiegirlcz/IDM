package myg;

import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChart;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f210506a = w.y0(new mw1.a(23));

    public static final class a {
        private a() {
        }
    }

    public static dj0.d a(TotalValueChart totalValueChart) {
        long j2 = ((TotalValueChartPoint) d0.m0(totalValueChart.f95004c)).f95006b.f115082a;
        List list = totalValueChart.f95004c;
        return new dj0.d(j2 - ((TotalValueChartPoint) d0.b0(list)).f95006b.f115082a, ((TotalValueChartPoint) d0.b0(list)).f95006b.f115083b);
    }
}
