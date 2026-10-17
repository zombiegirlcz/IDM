package vph;

import akl.p;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class o {
    public static ScreenerSelectedFilter.Options a(zel.g metric, List list, String updatedValue) {
        List listC;
        Intrinsics.checkNotNullParameter(metric, "metric");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            listC = u.c(updatedValue);
        } else {
            ArrayList arrayListF1 = d0.f1(list2);
            if (list.contains(updatedValue)) {
                arrayListF1.remove(updatedValue);
                listC = arrayListF1;
            } else {
                arrayListF1.add(updatedValue);
                listC = arrayListF1;
            }
        }
        return new ScreenerSelectedFilter.Options(metric, listC);
    }

    public static ScreenerSelectedFilter.Range b(zel.g metric, BigDecimal step, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        Intrinsics.checkNotNullParameter(step, "step");
        return new ScreenerSelectedFilter.Range(metric, i == i3 ? null : BigDecimal.valueOf(i3).multiply(step), i2 != i5 ? BigDecimal.valueOf(i5).multiply(step) : null);
    }

    public static ArrayList c(List currentFilters, ScreenerSelectedFilter updatedFilter) {
        boolean zIsEmpty;
        Intrinsics.checkNotNullParameter(currentFilters, "currentFilters");
        Intrinsics.checkNotNullParameter(updatedFilter, "updatedFilter");
        if (updatedFilter instanceof ScreenerSelectedFilter.Options) {
            zIsEmpty = ((ScreenerSelectedFilter.Options) updatedFilter).f105166b.isEmpty();
        } else {
            if (!(updatedFilter instanceof ScreenerSelectedFilter.Range)) {
                throw new NoWhenBranchMatchedException();
            }
            ScreenerSelectedFilter.Range range = (ScreenerSelectedFilter.Range) updatedFilter;
            zIsEmpty = range.f105168b == null && range.f105169c == null;
        }
        if (zIsEmpty) {
            ArrayList arrayListF1 = d0.f1(currentFilters);
            arrayListF1.removeIf(new p(new vh2.j(updatedFilter, 25), 28));
            return arrayListF1;
        }
        int size = currentFilters.size();
        ArrayList arrayListF12 = d0.f1(currentFilters);
        Iterator it8 = arrayListF12.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            if (((ScreenerSelectedFilter) it8.next()).getF105167a() == updatedFilter.getF105167a()) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            arrayListF12.set(i, updatedFilter);
            return arrayListF12;
        }
        arrayListF12.add(size, updatedFilter);
        return arrayListF12;
    }
}
