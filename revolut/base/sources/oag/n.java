package oag;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Object obj4 = ((RowDelegate.Model) obj3).u;
        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui.search_pickers.location.TravelHotelsLocationPickerContract.RecentSearchPayload");
        Long lValueOf = Long.valueOf(((h) obj4).getTimestamp());
        Object obj5 = ((RowDelegate.Model) obj2).u;
        Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui.search_pickers.location.TravelHotelsLocationPickerContract.RecentSearchPayload");
        return cim.b.b(lValueOf, Long.valueOf(((h) obj5).getTimestamp()));
    }
}
