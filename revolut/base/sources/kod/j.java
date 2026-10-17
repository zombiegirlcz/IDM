package kod;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        Pair pair;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<b> list = domainState.f186299a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (b bVar : list) {
            int i = i.f186304a[bVar.ordinal()];
            if (i == 1) {
                pair = new Pair(Integer.valueOf(R$string.trips_edit_trip_options_edit_dates), Integer.valueOf(R$drawable.uikit_icn_24_calendar));
            } else if (i == 2) {
                pair = new Pair(Integer.valueOf(R$string.trips_edit_trip_options_edit_start_date), Integer.valueOf(R$drawable.uikit_icn_24_calendar));
            } else if (i == 3) {
                pair = new Pair(Integer.valueOf(R$string.trips_edit_trip_options_edit_transactions), Integer.valueOf(R$drawable.uikit_icn_24_coins_search));
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = new Pair(Integer.valueOf(R$string.trips_edit_trip_options_remove_trip), Integer.valueOf(R$drawable.uikit_icn_24_trash));
            }
            int iIntValue = ((Number) pair.f186385a).intValue();
            int iIntValue2 = ((Number) pair.f186386b).intValue();
            Pair pair2 = bVar == b.REMOVE_TRIP ? new Pair(Integer.valueOf(R$attr.uikit_colorPerformanceNegative), Integer.valueOf(R$attr.uikit_colorPerformanceNegative_10)) : new Pair(Integer.valueOf(R$attr.uikit_colorAccent), Integer.valueOf(R$attr.uikit_colorAccent_10));
            int iIntValue3 = ((Number) pair2.f186385a).intValue();
            arrayList.add(new RowDelegate.Model(bVar.toString(), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(iIntValue2, iIntValue3, ((Number) pair2.f186386b).intValue()), null, null, false, null, false, 62), new TextLocalisedClause(iIntValue, null, new Custom(Integer.valueOf(iIntValue3), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, bVar, null, 0, 0, 0, 0, 532676600));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new d(arrayList);
    }
}
