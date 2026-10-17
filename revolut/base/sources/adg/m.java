package adg;

import android.os.Parcelable;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$plurals;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.TravelHotelsGuestPickerScreenContract$ChildAgePayload;
import com.revolut.feature_travel_hotels_models.property.search.Child;
import com.revolut.feature_travel_hotels_models.property.search.HotelsPropertyRoomOccupancy;
import ip0.ak0;
import ip0.u8;
import ip0.yj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements n {
    public static u8 a(String str, i iVar, int i, int i2, int i3, int i5) {
        return new u8(str, new TextLocalisedClause(i3, null, null, 14), new TextLocalisedClause(i5, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new NumberClause(i, (NumberClause.Format.Compact) null, (Custom) null, 6), new ResourceImage(R$drawable.uikit_icn_16_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new ResourceImage(R$drawable.uikit_icn_16_minus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, new h(i2, iVar), 63362);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        Iterator it8;
        char c2;
        Clause textLocalisedClause;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f3344a;
        ArrayList arrayList = new ArrayList();
        Iterator it9 = list.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it9.hasNext()) {
                List list2 = domainState.f3344a;
                int iJ = hx7.a.j(list2);
                int iK = hx7.a.k(list2);
                TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.hotels_stays_search_rooms_count, Integer.valueOf(list2.size()), v1.c.v(list2), (Style) null, 24);
                TextClause textClauseA = com.revolut.core.ui_kit.models.b.a();
                TextLocalisedQuantityClause textLocalisedQuantityClause2 = new TextLocalisedQuantityClause(R$plurals.hotels_stays_search_adults_count, Integer.valueOf(iJ), u.c(Integer.valueOf(iJ)), (Style) null, 24);
                TextClause textClauseA2 = com.revolut.core.ui_kit.models.b.a();
                if (iK <= 0) {
                    textClauseA2 = null;
                }
                Object[] elements = {textLocalisedQuantityClause, textClauseA, textLocalisedQuantityClause2, textClauseA2, iK > 0 ? new TextLocalisedQuantityClause(R$plurals.hotels_stays_search_children_count, Integer.valueOf(iK), u.c(Integer.valueOf(iK)), (Style) null, 24) : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new k(new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14), arrayList);
            }
            Object next = it9.next();
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            HotelsPropertyRoomOccupancy hotelsPropertyRoomOccupancy = (HotelsPropertyRoomOccupancy) next;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new ListSubheaderDelegate.Model(a0.d.n("ROOMS_SUBHEADER_ITEM_ID", i), (Image) null, (Clause) new TextLocalisedClause(R$string.hotels_stays_search_guests_room_title, u.c(Integer.valueOf(i2)), null, 12), (Image) null, (Clause) (i > 0 ? new TextLocalisedClause(R$string.hotels_common_action_remove, null, null, 14) : null), (String) null, (ListSubheaderDelegate.Model.a) (i > 0 ? new ListSubheaderDelegate.Model.a.b(z, z, true, 3) : null), false, false, (Object) Integer.valueOf(i), (Parcelable) null, 0, 0, 0, 0, 64426));
            ArrayList arrayList3 = new ArrayList();
            int i3 = hotelsPropertyRoomOccupancy.f98127a;
            List list3 = hotelsPropertyRoomOccupancy.f98128b;
            arrayList3.add(a(a0.d.n("ADULTS_GUESTS_ITEM_ID", i), i.ADULT, i3, i, R$string.hotels_stays_search_guests_adults_title, R$string.hotels_stays_search_guests_adults_subtitle));
            arrayList3.add(a(a0.d.n("CHILDREN_GUESTS_ITEM_ID", i), i.CHILD, list3.size(), i, R$string.hotels_stays_search_guests_children_title, R$string.hotels_stays_search_guests_children_subtitle));
            if (list3.isEmpty()) {
                it8 = it9;
            } else {
                arrayList3.add(new TextDelegate.Model(a0.d.n("CHILDREN_INFO_ITEM_ID", i), new TextLocalisedClause(R$string.hotels_stays_search_guests_children_info, null, null, 14), false, new ak0(yj0.START, null, 2), null, null, 0, 0, 0, 0, 2036));
                List list4 = list3;
                ArrayList arrayList4 = new ArrayList(w.t(list4, 10));
                int i5 = 0;
                for (Object obj2 : list4) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        v.s();
                        throw null;
                    }
                    String strG = a0.d.g(i, i5, "CHILDREN_AGE_ITEM_ID_", "_");
                    Iterator it10 = it9;
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.hotels_stays_search_guests_child_title, u.c(Integer.valueOf(i6)), null, 12);
                    ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
                    Integer num = ((Child) obj2).f98125a;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        textLocalisedClause = new TextLocalisedQuantityClause(R$plurals.hotels_stays_search_guests_child_age_years_old, Integer.valueOf(iIntValue), u.c(Integer.valueOf(iIntValue)), (Style) null, 24);
                        c2 = 14;
                    } else {
                        c2 = 14;
                        textLocalisedClause = new TextLocalisedClause(R$string.hotels_stays_search_guests_child_age_select, null, null, 14);
                    }
                    arrayList4.add(new CellDetailsActionDelegate.Model(strG, textLocalisedClause2, 0, resourceImage, textLocalisedClause, null, false, false, null, null, new TravelHotelsGuestPickerScreenContract$ChildAgePayload(i, i5), 0, 0, 0, 0, 4192228));
                    i5 = i6;
                    it9 = it10;
                }
                it8 = it9;
                a0.x(arrayList4, arrayList3);
            }
            yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
            a0.x(arrayList3, arrayList2);
            a0.x(arrayList2, arrayList);
            i = i2;
            it9 = it8;
            z = false;
        }
    }
}
