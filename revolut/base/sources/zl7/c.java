package zl7;

import com.revolut.feature.insurance_car.impl.data.model.Answer;
import do3.n;
import java.time.LocalDate;
import java.time.Period;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static final Integer a(n nVar) {
        LocalDate localDateOf;
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        org.joda.time.LocalDate localDate = nVar.f116413j;
        if (localDate == null || (localDateOf = LocalDate.of(localDate.getYear(), localDate.getMonthOfYear(), localDate.getDayOfMonth())) == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(localDateOf, "<this>");
        return Integer.valueOf(Period.between(localDateOf, LocalDate.now()).getYears());
    }

    public static final boolean b(Answer.LicenceDuration licenceDuration, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(licenceDuration, "<this>");
        int i3 = b.f323192a[licenceDuration.ordinal()];
        if (i3 != 1) {
            i2 = 2;
            if (i3 == 2) {
                i2 = 1;
            } else if (i3 != 3) {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 5;
            }
        } else {
            i2 = 0;
        }
        return i >= i2 + 17;
    }
}
