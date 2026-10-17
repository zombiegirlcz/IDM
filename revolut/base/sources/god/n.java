package god;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.eg;
import com.revolut.core.ui_kit.delegates.je;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.spending_analytics.api.R$plurals;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.country_picker.TripsCountryPickerContract$Country;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        ?? arrayList;
        eg egVar;
        god.a domainState = (god.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f145131a;
        Set set = domainState.f145132b;
        List listP0 = d0.P0(list, new o());
        String str = domainState.f145133c;
        if (kotlin.text.d0.W(str)) {
            arrayList = listP0;
        } else {
            arrayList = new ArrayList();
            for (Object obj2 : listP0) {
                TripsCountryPickerContract$Country tripsCountryPickerContract$Country = (TripsCountryPickerContract$Country) obj2;
                if (kotlin.text.d0.J(tripsCountryPickerContract$Country.f87603a, str, true) || kotlin.text.d0.J(tripsCountryPickerContract$Country.f87604b, str, true)) {
                    arrayList.add(obj2);
                }
            }
        }
        ArrayList<TripsCountryPickerContract$Country> arrayList2 = new ArrayList();
        for (Object obj3 : listP0) {
            if (set.contains(((TripsCountryPickerContract$Country) obj3).f87604b)) {
                arrayList2.add(obj3);
            }
        }
        if (arrayList2.isEmpty()) {
            egVar = null;
        } else {
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
            for (TripsCountryPickerContract$Country tripsCountryPickerContract$Country2 : arrayList2) {
                String str2 = tripsCountryPickerContract$Country2.f87604b;
                arrayList3.add(new ReferralContactDelegate.Model(str2, new CountryImage(str2, (Integer) null, (ez0.e) null, 14), new TextClause(tripsCountryPickerContract$Country2.f87603a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, new je(new DangerCircleBadge(dw0.a.Error)), null, null, null, null, 524216));
            }
            egVar = new eg("strip_id", arrayList3, null, BitmapDescriptorFactory.HUE_RED, 0, 0, 1020);
        }
        aim.e eVarB = u.b();
        if (egVar != null) {
            eVarB.add(egVar);
        }
        Iterable<TripsCountryPickerContract$Country> iterable = (Iterable) arrayList;
        ArrayList arrayList4 = new ArrayList(w.t(iterable, 10));
        for (TripsCountryPickerContract$Country tripsCountryPickerContract$Country3 : iterable) {
            String str3 = tripsCountryPickerContract$Country3.f87604b;
            String str4 = tripsCountryPickerContract$Country3.f87604b;
            boolean zContains = set.contains(str3);
            String str5 = tripsCountryPickerContract$Country3.f87604b;
            TextClause textClause = new TextClause(tripsCountryPickerContract$Country3.f87603a, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122);
            Map map = domainState.d;
            wi0.b.Companion.getClass();
            Integer num = (Integer) map.get(wi0.a.a(str4));
            arrayList4.add(new SelectableDelegate.Model(tripsCountryPickerContract$Country3.f87604b, new RowDelegate.Model(str5, new RowDelegate.Model.MainImage.Image40(new CountryImage(str4, (Integer) null, (ez0.e) null, 14), null, null, false, null, false, 62), textClause, null, 0, num != null ? new TextLocalisedQuantityClause(R$plurals.trips_add_trip_picker_screen_cell_subtitle, Integer.valueOf(num.intValue()), (List) null, (Style) null, 28) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), zContains ? qd0.SELECTED : qd0.UNSELECTED, SelectableDelegate.b.C0424b.f53319a, vd0.CHECKBOX, false, null, null, null, false, 32736));
        }
        yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayList4);
        aim.e eVarA = u.a(eVarB);
        int size = set.size();
        return new c(eVarA, new TextLocalisedClause(R$string.trips_add_trip_picker_screen_add_button, u.c(Integer.valueOf(size)), null, 12), size > 0);
    }
}
