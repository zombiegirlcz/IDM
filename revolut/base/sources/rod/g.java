package rod;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.x4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.spending_analytics.api.R$plurals;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.xk;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f255977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8b.a f255978b;

    public g(l80.e dateProvider, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f255977a = dateProvider;
        this.f255978b = countryInteractor;
    }

    public static dj0.d a(fod.c tripAnalytics, xi0.b baseCurrency) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(tripAnalytics, "tripAnalytics");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        ind.e eVar = tripAnalytics.f136926b;
        if (eVar instanceof ind.c) {
            dVar = ((ind.c) eVar).i;
        } else if (eVar instanceof ind.b) {
            dVar = new dj0.d(0L, baseCurrency);
        } else {
            if (!(eVar instanceof ind.d)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = tripAnalytics.d;
        }
        if (dVar != null) {
            return dVar.a();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static xk c(List items, h tripsHeaderType) {
        CounterTextDelegate.Model modelA;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(tripsHeaderType, "tripsHeaderType");
        String strA = tripsHeaderType.a();
        int size = items.size();
        int i = R$attr.uikit_dp0;
        List list = items;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            c cVar = (c) obj2;
            if (cVar instanceof b) {
                CounterTextDelegate.Model.Companion companion = CounterTextDelegate.Model.INSTANCE;
                String strK = com.google.android.gms.internal.mlkit_vision_face.a.k(i2, tripsHeaderType.b(), "_ITEM_LOADING_");
                int i5 = R$attr.uikit_dp0;
                int i6 = R$attr.uikit_dp24;
                modelA = CounterTextDelegate.Model.Companion.b(companion, strK, null, i6, i6, i5, i5, 6);
            } else {
                if (!(cVar instanceof a)) {
                    throw new NoWhenBranchMatchedException();
                }
                CounterTextDelegate.Model.Companion companion2 = CounterTextDelegate.Model.INSTANCE;
                String strK2 = com.google.android.gms.internal.mlkit_vision_face.a.k(i2, tripsHeaderType.b(), "_ITEM_LARGE_");
                a aVar = (a) cVar;
                Clause clause = aVar.f255970a;
                x4 x4Var = clause != null ? new x4(clause) : null;
                ?? r142 = aVar.f255971b;
                Clause clause2 = aVar.f255972c;
                int i21 = R$attr.uikit_dp0;
                modelA = CounterTextDelegate.Model.Companion.a(companion2, strK2, x4Var, r142, clause2, null, null, i21, i21, 1008);
            }
            arrayList.add(modelA);
            i2 = i3;
        }
        yp0.b.q(arrayList, 0, 0, 0, 0, 15);
        return new xk(strA, arrayList, Integer.valueOf(size), null, null, i, i, 0, 0, 65144);
    }

    public static ArrayList d(h headerType, int i) {
        Intrinsics.checkNotNullParameter(headerType, "headerType");
        IntRange intRange = new IntRange(1, i, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            it8.nextInt();
            arrayList.add(b.f255973a);
        }
        ArrayList arrayListF0 = d0.F0(new gu("TRIPS_LIST_TITLE_LOADING_ID", 0, 0, 30), u.c(c(arrayList, headerType)));
        IntRange intRange2 = new IntRange(1, 5, 1);
        ArrayList arrayList2 = new ArrayList(w.t(intRange2, 10));
        vim.f it9 = intRange2.iterator();
        while (it9.f289625c) {
            arrayList2.add(nb0.b(pb0.Companion, a0.d.n("TRIPS_LIST_LOADING_ID", it9.nextInt()), true, 0, false, 28));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return d0.E0(arrayList2, arrayListF0);
    }

    public static TextLocalisedQuantityClause e(ZonedDateTime startDate, ZonedDateTime endDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        long jH = ebm.a.h(startDate, endDate) + 1;
        return new TextLocalisedQuantityClause(R$plurals.trips_list_item_dates_summary_days_placeholder, Long.valueOf(jH), u.c(Long.valueOf(jH)), (Style) null, 24);
    }

    public final String b(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return ((o8b.c) this.f255978b).b(countryCode.f297794a);
    }
}
