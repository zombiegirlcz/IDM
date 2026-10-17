package gil;

import iil.a;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tel.b;
import tel.c;
import tel.d;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    public static final d a(iil.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        List<a.C0924a> projections = aVar.getProjections();
        ArrayList arrayList = new ArrayList(w.t(projections, 10));
        for (a.C0924a c0924a : projections) {
            Intrinsics.checkNotNullParameter(c0924a, "<this>");
            LocalDate localDate = LocalDate.parse(c0924a.getDate());
            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
            BigDecimal bigDecimal = new BigDecimal(c0924a.getContributionRatio());
            a.b projectionRatios = c0924a.getProjectionRatios();
            Intrinsics.checkNotNullParameter(projectionRatios, "<this>");
            arrayList.add(new b(localDate, new c(new BigDecimal(projectionRatios.getMinus2Std()), new BigDecimal(projectionRatios.getMinus1Std()), new BigDecimal(projectionRatios.getMean()), new BigDecimal(projectionRatios.getPlus1Std()), new BigDecimal(projectionRatios.getPlus2Std())), bigDecimal));
        }
        List steps = aVar.getSteps();
        ArrayList arrayList2 = new ArrayList(w.t(steps, 10));
        Iterator it8 = steps.iterator();
        while (it8.hasNext()) {
            arrayList2.add(mo3.a.o((jo3.a) it8.next()));
        }
        return new d(arrayList, arrayList2, mo3.a.o(aVar.getDefaultInvestment()));
    }
}
