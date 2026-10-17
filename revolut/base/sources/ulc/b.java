package ulc;

import com.revolut.feature.robo.api.model.RiskMetrics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ulc.a;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static final RiskMetrics a(a aVar) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        RiskMetrics.ReturnBreakDown returnBreakDown;
        RiskMetrics.ReturnBreakDown returnBreakDown2;
        RiskMetrics.ReturnBreakDown returnBreakDown3;
        RiskMetrics.ReturnBreakDown.OngoingCharges ongoingCharges;
        RiskMetrics.ReturnBreakDown.OngoingCharges ongoingCharges2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        BigDecimal averageAnnualReturn = aVar.getAverageAnnualReturn();
        BigDecimal standardDeviation = aVar.getStandardDeviation();
        BigDecimal benchmarkStandardDeviation = aVar.getBenchmarkStandardDeviation();
        BigDecimal medianReturn = aVar.getMedianReturn();
        BigDecimal bestYearReturn = aVar.getBestYearReturn();
        BigDecimal maxDrawdown = aVar.getMaxDrawdown();
        BigDecimal averageDrawdown = aVar.getAverageDrawdown();
        BigDecimal beta = aVar.getBeta();
        BigDecimal sharpeRatio = aVar.getSharpeRatio();
        BigDecimal valueAtRisk = aVar.getValueAtRisk();
        BigDecimal cagr = aVar.getCagr();
        BigDecimal dividendYield = aVar.getDividendYield();
        BigDecimal annualTotalReturn = aVar.getAnnualTotalReturn();
        BigDecimal benchmarkAnnualTotalReturn = aVar.getBenchmarkAnnualTotalReturn();
        BigDecimal benchmarkAverageAnnualReturn = aVar.getBenchmarkAverageAnnualReturn();
        BigDecimal benchmarkSharpeRatio = aVar.getBenchmarkSharpeRatio();
        BigDecimal freeRiskReturn = aVar.getFreeRiskReturn();
        a.C1553a averageAnnualReturnBreakdown = aVar.getAverageAnnualReturnBreakdown();
        ArrayList arrayList = null;
        if (averageAnnualReturnBreakdown != null) {
            BigDecimal valueAppreciation = averageAnnualReturnBreakdown.getValueAppreciation();
            BigDecimal fees = averageAnnualReturnBreakdown.getFees();
            a.C1553a.C1554a ongoingCharges3 = averageAnnualReturnBreakdown.getOngoingCharges();
            bigDecimal = averageAnnualReturn;
            if (ongoingCharges3 != null) {
                bigDecimal2 = standardDeviation;
                bigDecimal3 = benchmarkStandardDeviation;
                ongoingCharges2 = new RiskMetrics.ReturnBreakDown.OngoingCharges(ongoingCharges3.getMin(), ongoingCharges3.getMax());
            } else {
                bigDecimal2 = standardDeviation;
                bigDecimal3 = benchmarkStandardDeviation;
                ongoingCharges2 = null;
            }
            returnBreakDown = new RiskMetrics.ReturnBreakDown(valueAppreciation, fees, ongoingCharges2);
        } else {
            bigDecimal = averageAnnualReturn;
            bigDecimal2 = standardDeviation;
            bigDecimal3 = benchmarkStandardDeviation;
            returnBreakDown = null;
        }
        a.C1553a totalAnnualReturnBreakdown = aVar.getTotalAnnualReturnBreakdown();
        if (totalAnnualReturnBreakdown != null) {
            BigDecimal valueAppreciation2 = totalAnnualReturnBreakdown.getValueAppreciation();
            BigDecimal fees2 = totalAnnualReturnBreakdown.getFees();
            a.C1553a.C1554a ongoingCharges4 = totalAnnualReturnBreakdown.getOngoingCharges();
            if (ongoingCharges4 != null) {
                returnBreakDown2 = returnBreakDown;
                ongoingCharges = new RiskMetrics.ReturnBreakDown.OngoingCharges(ongoingCharges4.getMin(), ongoingCharges4.getMax());
            } else {
                returnBreakDown2 = returnBreakDown;
                ongoingCharges = null;
            }
            returnBreakDown3 = new RiskMetrics.ReturnBreakDown(valueAppreciation2, fees2, ongoingCharges);
        } else {
            returnBreakDown2 = returnBreakDown;
            returnBreakDown3 = null;
        }
        List overview = aVar.getOverview();
        if (overview != null) {
            List<a.b> list = overview;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            for (a.b bVar : list) {
                arrayList2.add(new RiskMetrics.RiskOverviewItem(bVar.getIcon(), bVar.getDescription()));
            }
            arrayList = arrayList2;
        }
        return new RiskMetrics(bigDecimal, bigDecimal2, bigDecimal3, medianReturn, bestYearReturn, maxDrawdown, averageDrawdown, beta, sharpeRatio, valueAtRisk, cagr, dividendYield, annualTotalReturn, benchmarkAnnualTotalReturn, benchmarkAverageAnnualReturn, benchmarkSharpeRatio, freeRiskReturn, returnBreakDown2, returnBreakDown3, arrayList);
    }
}
