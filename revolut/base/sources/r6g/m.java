package r6g;

import android.os.Parcelable;
import aw0.c7;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreenContract$Child;
import ip0.ck0;
import ip0.iq;
import ip0.u8;
import ip0.yj0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f251850a;

    public m(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f251850a = ((l80.f) dateProvider).e();
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        Clause textLocalisedClause;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        s0 s0Var = new s0(3);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.travel_flights_passengers_info_adults_title, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.travel_flights_passengers_info_adults_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_16_minus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        int i = domainState.f251841a;
        List list = domainState.f251842b;
        s0Var.a(new u8("ADULT_PASSENGERS_ITEM_ID", textLocalisedClause2, textLocalisedClause3, new TextClause(String.valueOf(i), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), resourceImage, resourceImage2, i < 9, i > 1, null, 63874));
        s0Var.a(new u8("CHILD_PASSENGERS_ITEM_ID", new TextLocalisedClause(R$string.travel_flights_passengers_info_children_title, null, null, 14), new TextLocalisedClause(R$string.travel_flights_passengers_info_children_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new TextClause(String.valueOf(list.size()), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), new ResourceImage(R$drawable.uikit_icn_16_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new ResourceImage(R$drawable.uikit_icn_16_minus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), list.size() < 4, list.size() > 0, null, 63874));
        List<TravelFlightsPassengersPickerScreenContract$Child> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (TravelFlightsPassengersPickerScreenContract$Child travelFlightsPassengersPickerScreenContract$Child : list2) {
            int i2 = travelFlightsPassengersPickerScreenContract$Child.f93375a;
            String strN = a0.d.n("CHILD_BIRTH_DATE_ITEM_ID_", i2);
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.travel_flights_passengers_info_child_title, u.c(Integer.valueOf(i2)), null, 12);
            LocalDate localDate = travelFlightsPassengersPickerScreenContract$Child.f93376b;
            if (localDate != null) {
                com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
                LocalDateClause$DateFormat.INSTANCE.getClass();
                LocalDateClause$DateFormat.DateMedium dateMedium = LocalDateClause$DateFormat.Companion.f57815b;
                Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
                jVar2.getClass();
                textLocalisedClause = com.revolut.core.ui_kit.models.j.a(localDate, dateMedium, custom);
            } else {
                textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_passengers_info_child_date_of_birth_placeholder, null, null, 14);
            }
            arrayList.add(new CellDetailsActionDelegate.Model(strN, textLocalisedClause4, 0, new ResourceImage(R$drawable.uikit_icn_24_edit, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), textLocalisedClause, null, false, false, null, null, travelFlightsPassengersPickerScreenContract$Child, 0, 0, 0, 0, 4192228));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (((TravelFlightsPassengersPickerScreenContract$Child) it8.next()).a(this.f251850a)) {
                    arrayList = d0.F0(new TextDelegate.Model("INFANT_FOOTNOTE_ITEM_ID", new TextLocalisedClause(R$string.travel_flights_passengers_info_infants_disclaimer, u.c(new TextLocalisedClause(R$string.travel_flights_passengers_info_infants_disclaimer_learn_more, null, new Click(30, (Integer) null, (Object) null, "INFANT_FOOTNOTE_LEARN_MORE_CLICK_ID", false), 10)), null, 12), false, new ck0(yj0.START), null, null, 0, 0, 0, 0, 2036), arrayList);
                    break;
                }
            }
        }
        s0Var.b(arrayList.toArray(new qv0.i[0]));
        ArrayList arrayList2 = s0Var.f186433a;
        List listK = v.k(arrayList2.toArray(new qv0.i[arrayList2.size()]));
        yp0.b.k(listK, R$attr.uikit_dp0, 0, 0, 0, 30);
        List list3 = listK;
        s0 s0Var2 = new s0(2);
        s0Var2.a(new ListSubheaderDelegate.Model("CABIN_CLASS_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.travel_flights_passengers_info_cabin_class_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp24, R$attr.uikit_dp12, 0, 0, 53242));
        List<m7g.d> listK2 = v.k(m7g.d.ECONOMY, m7g.d.PREMIUM_ECONOMY, m7g.d.BUSINESS, m7g.d.FIRST);
        ArrayList arrayList3 = new ArrayList(w.t(listK2, 10));
        for (m7g.d dVar : listK2) {
            String strQ = j6.a.q("CABIN_CLASS_ITEM_ID_", dVar.name());
            TextLocalisedClause textLocalisedClauseQ = ue8.c.Q(dVar);
            if (textLocalisedClauseQ == null) {
                throw new IllegalStateException(("Unexpected cabin class " + dVar).toString());
            }
            arrayList3.add(new InputChecklistDelegate.Model(strQ, textLocalisedClauseQ, dVar == domainState.f251843c, false, null, iq.RADIO_BUTTON, null, null, dVar, null, 0, 0, 0, 523992));
        }
        yp0.b.k(arrayList3, R$attr.uikit_dp0, 0, 0, 0, 30);
        s0Var2.b(arrayList3.toArray(new koi.j[0]));
        ArrayList arrayList4 = s0Var2.f186433a;
        return new k(d0.E0(v.k(arrayList4.toArray(new koi.j[arrayList4.size()])), list3));
    }
}
