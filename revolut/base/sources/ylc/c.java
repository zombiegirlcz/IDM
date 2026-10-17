package ylc;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vlc.a;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public static sdh.b a(vlc.a drawdownChartDto) {
        Intrinsics.checkNotNullParameter(drawdownChartDto, "drawdownChartDto");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(drawdownChartDto.getStart());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        Instant instantOfEpochMilli2 = Instant.ofEpochMilli(drawdownChartDto.getEnd());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
        BigDecimal maxDrawdown = drawdownChartDto.getMaxDrawdown();
        Long maxDrawdownDate = drawdownChartDto.getMaxDrawdownDate();
        Instant instantOfEpochMilli3 = maxDrawdownDate != null ? Instant.ofEpochMilli(maxDrawdownDate.longValue()) : null;
        Long recoveryDate = drawdownChartDto.getRecoveryDate();
        Instant instantOfEpochMilli4 = recoveryDate != null ? Instant.ofEpochMilli(recoveryDate.longValue()) : null;
        BigDecimal benchmarkMaxDrawdown = drawdownChartDto.getBenchmarkMaxDrawdown();
        List<a.C1602a> points = drawdownChartDto.getPoints();
        ArrayList arrayList = new ArrayList(w.t(points, 10));
        for (a.C1602a c1602a : points) {
            Instant instantOfEpochMilli5 = Instant.ofEpochMilli(c1602a.getTimestamp());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli5, "ofEpochMilli(...)");
            arrayList.add(new sdh.a(instantOfEpochMilli5, c1602a.getDrawdown(), c1602a.getBenchmark()));
        }
        return new sdh.b(instantOfEpochMilli, instantOfEpochMilli2, maxDrawdown, instantOfEpochMilli3, instantOfEpochMilli4, benchmarkMaxDrawdown, arrayList);
    }
}
