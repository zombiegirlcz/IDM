package lia;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public static ArrayList a(kia.b params) {
        LocalDate localDatePlusDays;
        Intrinsics.checkNotNullParameter(params, "params");
        ArrayList arrayList = new ArrayList();
        LocalDate localDatePlusDays2 = params.f184190a;
        LocalDate localDate = params.f184191b;
        while (true) {
            if (!localDatePlusDays2.isBefore(localDate) && !localDatePlusDays2.isEqual(localDate)) {
                return arrayList;
            }
            int i = b.f195442a[params.f184192c.ordinal()];
            if (i == 1) {
                localDatePlusDays = localDatePlusDays2.plusDays(1L);
            } else if (i == 2) {
                localDatePlusDays = localDatePlusDays2.plusDays(7L);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                localDatePlusDays = localDatePlusDays2.with(TemporalAdjusters.firstDayOfNextMonth());
            }
            LocalDate localDateMinusDays = localDatePlusDays.minusDays(1L);
            if (localDateMinusDays.isAfter(localDate)) {
                localDateMinusDays = localDate;
            }
            Intrinsics.h(localDateMinusDays);
            arrayList.add(new a(localDatePlusDays2, localDateMinusDays));
            localDatePlusDays2 = localDateMinusDays.plusDays(1L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays2, "plusDays(...)");
        }
    }
}
