package rmb;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Long lValueOf;
        SavingsProductData savingsProductData = (SavingsProductData) obj2;
        LocalDate localDate = ocd.c.f224221a;
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        Period periodA = ocd.c.a(savingsProductData);
        Long lValueOf2 = null;
        if (periodA != null) {
            ChronoUnit chronoUnit = ChronoUnit.DAYS;
            LocalDate localDate2 = ocd.c.f224221a;
            lValueOf = Long.valueOf(chronoUnit.between(localDate2, localDate2.plus((TemporalAmount) periodA)));
        } else {
            lValueOf = null;
        }
        SavingsProductData savingsProductData2 = (SavingsProductData) obj3;
        Intrinsics.checkNotNullParameter(savingsProductData2, "<this>");
        Period periodA2 = ocd.c.a(savingsProductData2);
        if (periodA2 != null) {
            ChronoUnit chronoUnit2 = ChronoUnit.DAYS;
            LocalDate localDate3 = ocd.c.f224221a;
            lValueOf2 = Long.valueOf(chronoUnit2.between(localDate3, localDate3.plus((TemporalAmount) periodA2)));
        }
        return cim.b.b(lValueOf, lValueOf2);
    }
}
