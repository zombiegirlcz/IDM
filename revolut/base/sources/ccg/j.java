package ccg;

import android.os.Parcelable;
import aw0.o9;
import cgi.k;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RoomPreviewCardDelegate;
import com.revolut.core.ui_kit.delegates.p2;
import com.revolut.core.ui_kit.delegates.ve;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.hotels.api.R$plurals;
import com.revolut.feature.travel.hotels.api.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.a0;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f23107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m9g.b f23108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p8g.c f23109c;

    public j(l80.e dateProvider, m9g.b bookingDatePrinter, p8g.c featureInteractor) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(bookingDatePrinter, "bookingDatePrinter");
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        this.f23107a = dateProvider;
        this.f23108b = bookingDatePrinter;
        this.f23109c = featureInteractor;
    }

    public final ArrayList a(List bedOptionsSelectionList) {
        ListSubheaderDelegate.Model model;
        Iterator it8;
        int i;
        boolean z;
        boolean z3;
        UrlImage urlImage;
        List listC;
        m9g.b bVar;
        l80.e eVar;
        boolean z4;
        String str;
        String str2;
        UrlImage urlImage2;
        j jVar = this;
        Intrinsics.checkNotNullParameter(bedOptionsSelectionList, "bedOptionsSelectionList");
        ArrayList arrayList = new ArrayList();
        Iterator it9 = bedOptionsSelectionList.iterator();
        int i2 = 0;
        while (it9.hasNext()) {
            Object next = it9.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            k kVar = (k) next;
            boolean zA = ((i9g.v) jVar.f23109c).a();
            if (zA) {
                model = new ListSubheaderDelegate.Model(a0.d.n("ROOM_SUBHEADER_ITEM_ID", i3), (Image) null, (Clause) new CompositeClause(u.c(new TextLocalisedClause(R$string.hotels_review_rooms_room_number, u.c(Integer.valueOf(i3)), null, 12)), null, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            } else {
                int i5 = kVar.b().c().getF98112a().f98119a;
                int size = kVar.b().c().getF98112a().f98120b.size();
                String strN = a0.d.n("ROOM_SUBHEADER_ITEM_ID", i3);
                Object[] elements = {new TextLocalisedClause(R$string.hotels_review_rooms_room_number, u.c(Integer.valueOf(i3)), null, 12), new DotDividerClause((Integer) null), new TextLocalisedQuantityClause(R$plurals.hotels_stays_search_adults_count, Integer.valueOf(i5), u.c(Integer.valueOf(i5)), (Style) null, 24), size != 0 ? new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, size != 0 ? new TextLocalisedQuantityClause(R$plurals.hotels_stays_search_children_count, Integer.valueOf(size), u.c(Integer.valueOf(size)), (Style) null, 24) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                model = new ListSubheaderDelegate.Model(strN, (Image) null, (Clause) new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            }
            ListSubheaderDelegate.Model model2 = model;
            m9g.b bookingDatePrinter = jVar.f23108b;
            l80.e dateProvider = jVar.f23107a;
            if (zA) {
                Intrinsics.checkNotNullParameter(kVar, "<this>");
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                Intrinsics.checkNotNullParameter(bookingDatePrinter, "bookingDatePrinter");
                TextLocalisedClause textLocalisedClause = kVar.b().c().b().size() > 1 ? new TextLocalisedClause(R$string.hotels_common_action_change, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10) : null;
                com.revolut.feature_travel_hotels_models.property.Image image = (com.revolut.feature_travel_hotels_models.property.Image) d0.d0(kVar.b().d().j());
                if (image != null) {
                    it8 = it9;
                    i = i3;
                    str = "ROOM_ITEMS_ITEM_ID";
                    str2 = "elements";
                    eVar = dateProvider;
                    bVar = bookingDatePrinter;
                    z4 = true;
                    urlImage2 = new UrlImage(image.f98056c, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations((CircleTransformation) null, true, false, (Integer) 8, (Integer) 72, (Integer) 72, 59), null, null, false, false, 507902);
                } else {
                    it8 = it9;
                    bVar = bookingDatePrinter;
                    eVar = dateProvider;
                    z4 = true;
                    str = "ROOM_ITEMS_ITEM_ID";
                    i = i3;
                    str2 = "elements";
                    urlImage2 = null;
                }
                int i6 = kVar.b().c().getF98112a().f98119a;
                List list = kVar.b().c().getF98112a().f98120b;
                int size2 = list.size();
                String strQ = j6.a.q(str, kVar.b().d().getF98098a());
                TextClause textClause = new TextClause(kVar.b().d().getF98099b(), (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122);
                Clause clauseA = h9g.j.a(bVar, eVar, kVar.b().a().getE(), "EEE, d MMM, HH:mm", true, R$string.hotels_room_options_cancellation_window_non_refundable);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.hotels_stays_search_guests_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.hotels_stays_search_adults_count, Integer.valueOf(i6), u.c(Integer.valueOf(i6)), (Style) null, 24);
                List listK = v.k(new TextLocalisedQuantityClause(R$plurals.hotels_stays_search_children_count, Integer.valueOf(size2), u.c(Integer.valueOf(size2)), (Style) null, 24), new TextLocalisedClause(R$string.hotels_review_rooms_children_ages, u.c(d0.k0(list, ", ", null, null, 0, null, 62)), null, 12));
                m70.a.t(t0.f186434a);
                Object[] objArr = {textLocalisedQuantityClause, size2 != 0 ? new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12) : null};
                Intrinsics.checkNotNullParameter(objArr, str2);
                Object[] objArr2 = {new ve(strQ, urlImage2, textClause, null, clauseA, textLocalisedClause2, null, new CompositeClause(kotlin.collections.d.L(objArr), new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), new RoomPreviewCardDelegate.a.b(false, urlImage2 != null ? z4 : false, 5), kVar, 999240), new CellDetailsNoteDelegate.Model(j6.a.q("ROOM_BED_OPTIONS_ITEM_ID", kVar.b().d().getF98098a()), new TextLocalisedClause(R$string.hotels_property_room_selection_beds_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, new TextClause(kVar.getF98091b().f98089c, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), null, false, null, textLocalisedClause, p2.f54570a, kVar, null, 0, 128244)};
                Intrinsics.checkNotNullParameter(objArr2, str2);
                listC = kotlin.collections.d.L(objArr2);
                yp0.b.k(listC, 0, 0, 0, 0, 31);
            } else {
                it8 = it9;
                i = i3;
                Intrinsics.checkNotNullParameter(kVar, "<this>");
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                Intrinsics.checkNotNullParameter(bookingDatePrinter, "bookingDatePrinter");
                TextLocalisedClause textLocalisedClause3 = kVar.b().c().b().size() > 1 ? new TextLocalisedClause(R$string.hotels_common_action_change, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10) : null;
                com.revolut.feature_travel_hotels_models.property.Image image2 = (com.revolut.feature_travel_hotels_models.property.Image) d0.d0(kVar.b().d().j());
                if (image2 != null) {
                    z = true;
                    z3 = false;
                    urlImage = new UrlImage(image2.f98056c, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations((CircleTransformation) null, true, false, (Integer) 8, (Integer) 72, (Integer) 72, 59), null, null, false, false, 507902);
                } else {
                    z = true;
                    z3 = false;
                    urlImage = null;
                }
                ve veVar = new ve(j6.a.q("ROOM_ITEMS_ITEM_ID", kVar.b().d().getF98098a()), urlImage, new TextClause(kVar.b().d().getF98099b(), (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), null, h9g.j.a(bookingDatePrinter, dateProvider, kVar.b().a().getE(), "EEE, d MMM, HH:mm", true, R$string.hotels_room_options_cancellation_window_non_refundable), new TextLocalisedClause(R$string.hotels_property_room_selection_beds_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), textLocalisedClause3, new TextClause(kVar.getF98091b().f98089c, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), new RoomPreviewCardDelegate.a.b(textLocalisedClause3 != null ? z : z3, urlImage != null ? z : z3, 4), kVar, 999176);
                yp0.b.l(veVar, 0, 0, 0, 0, null, false, 63);
                listC = u.c(veVar);
            }
            aim.e eVarB = u.b();
            eVarB.add(model2);
            eVarB.addAll(listC);
            a0.x(u.a(eVarB), arrayList);
            jVar = this;
            it9 = it8;
            i2 = i;
        }
        return arrayList;
    }
}
