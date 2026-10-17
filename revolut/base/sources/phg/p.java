package phg;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.api.model.TravelMilesFlightFilters$FilterOption;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results.filter_options.TravelMilesFlightSearchFilterOptionScreenContract$InputData;
import ip0.qd0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesFlightSearchFilterOptionScreenContract$InputData f236312a;

    public p(TravelMilesFlightSearchFilterOptionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f236312a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        int i;
        int i2;
        Collection collectionC;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TravelMilesFlightSearchFilterOptionScreenContract$InputData travelMilesFlightSearchFilterOptionScreenContract$InputData = this.f236312a;
        h hVar = travelMilesFlightSearchFilterOptionScreenContract$InputData.f94337c;
        ArrayList arrayList = travelMilesFlightSearchFilterOptionScreenContract$InputData.f94335a;
        int[] iArr = o.f236311a;
        int i3 = iArr[hVar.ordinal()];
        if (i3 == 1) {
            i = R$string.miles_search_filters_airlines_title;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.miles_search_filters_programmes_title;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        Set set = domainState.f236302a;
        boolean z = !Intrinsics.f(set, travelMilesFlightSearchFilterOptionScreenContract$InputData.f94336b);
        if (domainState.f236304c) {
            collectionC = f0.f322471a;
        } else {
            qd0 qd0Var = set.size() == arrayList.size() ? qd0.SELECTED : qd0.UNSELECTED;
            int i5 = iArr[travelMilesFlightSearchFilterOptionScreenContract$InputData.f94337c.ordinal()];
            if (i5 == 1) {
                i2 = R$string.miles_search_filters_airlines_all;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$string.miles_search_filters_programmes_all;
            }
            collectionC = u.c(new SelectableDelegate.Model("LIST_SUBHEADER_ITEM_ID", new ListSubheaderDelegate.Model("LIST_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(i2, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), qd0Var, null, null, false, null, null, null, false, 32760));
        }
        Collection collection = collectionC;
        String str = domainState.f236303b;
        ArrayList<TravelMilesFlightFilters$FilterOption> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (d0.J(((TravelMilesFlightFilters$FilterOption) obj2).f94097b, str, true)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        for (TravelMilesFlightFilters$FilterOption travelMilesFlightFilters$FilterOption : arrayList2) {
            String str2 = travelMilesFlightFilters$FilterOption.f94096a;
            qd0 qd0Var2 = set.contains(str2) ? qd0.SELECTED : qd0.UNSELECTED;
            String strQ = j6.a.q("FILTER_OPTION_INNER_ID_PREFIX_", str2);
            TextClause textClause = new TextClause(travelMilesFlightFilters$FilterOption.f94097b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str3 = travelMilesFlightFilters$FilterOption.f94098c;
            TextClause textClause2 = str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            String str4 = travelMilesFlightFilters$FilterOption.d;
            arrayList3.add(new SelectableDelegate.Model(str2, new RowDelegate.Model(strQ, str4 != null ? new RowDelegate.Model.MainImage.Image40(new UrlImage(str4, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, false, null, false, 60) : null, textClause, null, 0, textClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), qd0Var2, null, null, false, null, new n(travelMilesFlightFilters$FilterOption), null, false, 32504));
        }
        return new k(textLocalisedClause, zhm.d0.E0(arrayList3, collection), z);
    }
}
