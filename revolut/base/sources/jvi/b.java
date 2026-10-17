package jvi;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import ez0.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k7i.i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f178884a;

    public b(i countryNameProvider) {
        Intrinsics.checkNotNullParameter(countryNameProvider, "countryNameProvider");
        this.f178884a = countryNameProvider;
    }

    public final RowDelegate.Model a(bti.a airport) {
        Intrinsics.checkNotNullParameter(airport, "airport");
        String strQ = j6.a.q("AIRPORT_ITEM_", airport.f18583c);
        wi0.b bVar = airport.d;
        return new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(new CountryImage(bVar.f297794a, (Integer) null, (e) null, 14), new AccentCircleBadge(dw0.a.Travel), null, false, null, false, 60), new TextLocalisedClause(R$string.asft_common_template_airport, v.k(new TextClause(airport.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(airport.f18583c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, 0, new TextLocalisedClause(R$string.asft_common_template_comma, v.k(new TextClause(airport.f18581a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(this.f178884a.i(bVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, airport.f18583c, null, 0, 0, 0, 0, 532676568);
    }

    public final List b(bti.b airportsList) {
        Intrinsics.checkNotNullParameter(airportsList, "airportsList");
        ArrayList arrayList = airportsList.f18585a;
        ArrayList arrayList2 = airportsList.f18586b;
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("list_id_empty_state", new TextLocalisedClause(R$string.asft_airport_no_results_title, null, null, 14), new TextLocalisedClause(R$string.asft_airport_no_results_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32752);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return u.c(model);
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            arrayList3.add(a((bti.a) it8.next()));
        }
        if (arrayList3.isEmpty()) {
            yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
        } else {
            arrayList3 = yp0.b.g(arrayList3, new ListSubheaderDelegate.Model("ID_NEAR_YOU_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.asft_airport_near, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        }
        ArrayList arrayList4 = airportsList.f18585a;
        ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
        Iterator it9 = arrayList4.iterator();
        while (it9.hasNext()) {
            arrayList5.add(a((bti.a) it9.next()));
        }
        if (arrayList5.isEmpty()) {
            yp0.b.k(arrayList5, 0, 0, 0, 0, 31);
        } else {
            arrayList5 = yp0.b.g(arrayList5, new ListSubheaderDelegate.Model("ID_ALL_AIRPORTS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.asft_airport_all, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        }
        return d0.E0(arrayList5, arrayList3);
    }
}
