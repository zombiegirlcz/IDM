package r4g;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.ui.screen.airlines_filter.TravelFlightsAirlinesFilterScreenContract$InputData;
import com.revolut.feature.travel.flights.models.domain.common.Carrier;
import ip0.qd0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsAirlinesFilterScreenContract$InputData f251460a;

    public m(TravelFlightsAirlinesFilterScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f251460a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        qd0 qd0Var;
        Collection collectionC;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_search_filters_airlines_header_title, null, null, 14);
        Set set = domainState.f251452a;
        TravelFlightsAirlinesFilterScreenContract$InputData travelFlightsAirlinesFilterScreenContract$InputData = this.f251460a;
        Set set2 = travelFlightsAirlinesFilterScreenContract$InputData.f93238b;
        ArrayList arrayList = travelFlightsAirlinesFilterScreenContract$InputData.f93237a;
        boolean z = !Intrinsics.f(set, set2);
        if (domainState.f251454c) {
            collectionC = f0.f322471a;
        } else if (arrayList.isEmpty()) {
            qd0Var = qd0.SELECTED;
            collectionC = u.c(new SelectableDelegate.Model("travel_flights_airlines_filter_select_all", new ListSubheaderDelegate.Model("travel_flights_airlines_filter_select_all", (Image) null, (Clause) new TextLocalisedClause(R$string.travel_flights_all_airlines_select_all, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), qd0Var, null, null, false, null, null, null, false, 32760));
        } else {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                if (!set.contains(((Carrier) it8.next()).f93487a)) {
                    qd0Var = qd0.UNSELECTED;
                    break;
                }
            }
            qd0Var = qd0.SELECTED;
            collectionC = u.c(new SelectableDelegate.Model("travel_flights_airlines_filter_select_all", new ListSubheaderDelegate.Model("travel_flights_airlines_filter_select_all", (Image) null, (Clause) new TextLocalisedClause(R$string.travel_flights_all_airlines_select_all, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), qd0Var, null, null, false, null, null, null, false, 32760));
        }
        Collection collection = collectionC;
        ArrayList<Carrier> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (d0.J(((Carrier) obj2).f93488b, domainState.f251453b, true)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        for (Carrier carrier : arrayList2) {
            String str = carrier.f93487a;
            arrayList3.add(new SelectableDelegate.Model(j6.a.q("travel_flights_airlines_filter_airline_", str), new RowDelegate.Model(j6.a.q("travel_flights_airlines_filter_airline_inner_", str), new RowDelegate.Model.MainImage.Image40(q4g.l.b(null, carrier.f93489c), null, null, false, null, false, 62), new TextClause(carrier.f93488b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), set.contains(str) ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, carrier, null, false, 32504));
        }
        return new j(textLocalisedClause, zhm.d0.E0(arrayList3, collection), z);
    }
}
