package vph;

import android.os.Parcelable;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {
    public static final boolean a(List list, List other) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return b(list).equals(b(other));
    }

    public static final LinkedHashSet b(List list) {
        Parcelable range;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            ScreenerSelectedFilter screenerSelectedFilter = (ScreenerSelectedFilter) it8.next();
            if (screenerSelectedFilter instanceof ScreenerSelectedFilter.Options) {
                ScreenerSelectedFilter.Options options = (ScreenerSelectedFilter.Options) screenerSelectedFilter;
                List values = d0.O0(d0.U(options.f105166b));
                zel.g metric = options.f105165a;
                Intrinsics.checkNotNullParameter(metric, "metric");
                Intrinsics.checkNotNullParameter(values, "values");
                range = new ScreenerSelectedFilter.Options(metric, values);
            } else {
                if (!(screenerSelectedFilter instanceof ScreenerSelectedFilter.Range)) {
                    throw new NoWhenBranchMatchedException();
                }
                ScreenerSelectedFilter.Range range2 = (ScreenerSelectedFilter.Range) screenerSelectedFilter;
                BigDecimal bigDecimal = range2.f105168b;
                BigDecimal bigDecimal2 = bigDecimal != null ? bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros() : null;
                BigDecimal bigDecimal3 = range2.f105169c;
                BigDecimal bigDecimal4 = bigDecimal3 != null ? bigDecimal3.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal3.stripTrailingZeros() : null;
                zel.g metric2 = range2.f105167a;
                Intrinsics.checkNotNullParameter(metric2, "metric");
                range = new ScreenerSelectedFilter.Range(metric2, bigDecimal2, bigDecimal4);
            }
            linkedHashSet.add(range);
        }
        return linkedHashSet;
    }
}
