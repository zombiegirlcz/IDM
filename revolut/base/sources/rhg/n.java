package rhg;

import com.revolut.feature.travel.miles.api.model.TravelMilesSearchAppliedFilters;
import java.util.ArrayList;
import java.util.List;
import kl7.n1;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f254459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f254460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f254461c;

    public /* synthetic */ n(Object obj2, com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a aVar, boolean z) {
        this.f254459a = 0;
        this.f254460b = obj2;
        this.f254461c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        TravelMilesSearchAppliedFilters travelMilesSearchAppliedFiltersA;
        switch (this.f254459a) {
            case 0:
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Object obj3 = this.f254460b;
                boolean z = obj3 instanceof v;
                boolean z3 = this.f254461c;
                if (z) {
                    TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters = update.f254453b;
                    travelMilesSearchAppliedFiltersA = TravelMilesSearchAppliedFilters.a(travelMilesSearchAppliedFilters, com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a.I2(travelMilesSearchAppliedFilters.f94125a, z3, ((v) obj3).f254471a), null, null, null, null, null, 62);
                } else if (obj3 instanceof q) {
                    TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters2 = update.f254453b;
                    travelMilesSearchAppliedFiltersA = TravelMilesSearchAppliedFilters.a(travelMilesSearchAppliedFilters2, null, com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a.I2(travelMilesSearchAppliedFilters2.f94126b, z3, ((q) obj3).f254464a), null, null, null, null, 61);
                } else if (obj3 instanceof p) {
                    TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters3 = update.f254453b;
                    travelMilesSearchAppliedFiltersA = TravelMilesSearchAppliedFilters.a(travelMilesSearchAppliedFilters3, null, null, null, null, com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a.I2(travelMilesSearchAppliedFilters3.e, z3, ((p) obj3).f254463a), null, 47);
                } else if (obj3 instanceof t) {
                    TravelMilesSearchAppliedFilters travelMilesSearchAppliedFilters4 = update.f254453b;
                    travelMilesSearchAppliedFiltersA = TravelMilesSearchAppliedFilters.a(travelMilesSearchAppliedFilters4, null, null, null, null, null, com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filters.a.I2(travelMilesSearchAppliedFilters4.f, z3, ((t) obj3).f254467a), 31);
                } else {
                    travelMilesSearchAppliedFiltersA = update.f254453b;
                }
                return j.a(update, null, travelMilesSearchAppliedFiltersA, 1);
            case 1:
                wnc.m updateState = (wnc.m) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return wnc.m.a(updateState, null, null, r0.q(updateState.f298807c, new Pair(((ooc.a) this.f254460b).f227026a, Boolean.valueOf(this.f254461c))), null, null, null, null, 123);
            case 2:
                yo7.h updateState2 = (yo7.h) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                List list = updateState2.i;
                int i = ((n1) this.f254460b).f185362a;
                List list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                int i2 = 0;
                for (Object objA : list2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    if (i2 == i) {
                        objA = vp7.b.a((vp7.b) objA, null, null, Boolean.valueOf(!this.f254461c), null, 11);
                    }
                    arrayList.add(objA);
                    i2 = i3;
                }
                return yo7.h.a(updateState2, null, null, null, null, null, null, null, arrayList, null, null, null, null, null, 16127);
            default:
                yo7.h updateState3 = (yo7.h) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                List list3 = updateState3.i;
                int i5 = ((n1) this.f254460b).f185362a;
                List list4 = list3;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                int i6 = 0;
                for (Object objA2 : list4) {
                    int i21 = i6 + 1;
                    if (i6 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    if (i6 == i5) {
                        objA2 = vp7.b.a((vp7.b) objA2, null, null, null, Boolean.valueOf(this.f254461c), 7);
                    }
                    arrayList2.add(objA2);
                    i6 = i21;
                }
                return yo7.h.a(updateState3, null, null, null, null, null, null, null, arrayList2, null, null, null, null, null, 16127);
        }
    }

    public /* synthetic */ n(Object obj2, boolean z, int i) {
        this.f254459a = i;
        this.f254460b = obj2;
        this.f254461c = z;
    }
}
