package ieg;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.hotels.api.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;
import org.jmrtd.lds.icao.DG11File;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements c {
    public static mx0.d b(xag.a aVar) {
        int i = d.f160715a[aVar.ordinal()];
        if (i == 1) {
            return mx0.d.ACCENT;
        }
        if (i != 2 && i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return mx0.d.SEMIBLACK;
    }

    public final List a(xag.c filters) {
        boolean z;
        Intrinsics.checkNotNullParameter(filters, "filters");
        r.Companion.getClass();
        if (Intrinsics.f(filters, l.f160719b)) {
            return f0.f322471a;
        }
        List list = filters.f303878c;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((b) obj2).f160710a == oei.b.FOOD_AND_DRINK) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            List list2 = ((b) it8.next()).f160711b;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list2) {
                if (((a) obj3).f160707a.f97838b == oei.a.RATE) {
                    arrayList3.add(obj3);
                }
            }
            zhm.a0.x(arrayList3, arrayList2);
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        if (zIsEmpty) {
            z = false;
            break;
        }
        if (!arrayList2.isEmpty()) {
            Iterator it9 = arrayList2.iterator();
            while (it9.hasNext()) {
                if (!((a) it9.next()).f160708b) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        ActionsView.Item item = new ActionsView.Item("BREAKFAST_QUICK_FILTER_ID", z ? mx0.d.ACCENT : mx0.d.SEMIBLACK, false, !zIsEmpty ? e4.EnabledClickable : e4.DisabledNonClickable, null, new TextLocalisedClause(R$string.hotels_choose_rooms_filters_breakfast, null, null, 14), null, null, null, null, false, null, null, Boolean.valueOf(z), null, 24468);
        xag.a aVar = filters.f303876a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.hotels_choose_rooms_filters_free_cancellation, null, null, 14);
        mx0.d dVarB = b(aVar);
        xag.a aVar2 = xag.a.UNAVAILABLE;
        ActionsView.Item item2 = new ActionsView.Item("FREE_CANCELLATION_QUICK_FILTER_ID", dVarB, false, aVar == aVar2 ? e4.DisabledNonClickable : e4.EnabledClickable, null, textLocalisedClause, null, null, null, null, false, null, null, null, null, 32660);
        xag.a aVar3 = filters.f303877b;
        ActionsView.Item item3 = aVar3 != xag.a.HIDDEN ? new ActionsView.Item("PAY_AT_PROPERTY_QUICK_FILTER_ID", b(aVar3), false, aVar3 == aVar2 ? e4.DisabledNonClickable : e4.EnabledClickable, null, new TextLocalisedClause(R$string.hotels_choose_rooms_filters_pay_at_property, null, null, 14), null, null, null, null, false, null, null, null, null, 32660) : null;
        List list3 = filters.f303878c;
        ArrayList arrayList4 = new ArrayList();
        Iterator it10 = list3.iterator();
        while (it10.hasNext()) {
            zhm.a0.x(((b) it10.next()).f160711b, arrayList4);
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : arrayList4) {
            if (((a) obj4).f160708b) {
                arrayList5.add(obj4);
            }
        }
        boolean zIsEmpty2 = arrayList5.isEmpty();
        ActionsView.Item[] elements = {item, item2, item3, new ActionsView.Item("AMENITIES_QUICK_FILTER_ID", !zIsEmpty2 ? mx0.d.ACCENT : mx0.d.SEMIBLACK, false, !list3.isEmpty() ? e4.EnabledClickable : e4.DisabledNonClickable, null, !arrayList5.isEmpty() ? new TextLocalisedClause(R$string.hotels_choose_rooms_filters_amenities_multiple, zhm.u.c(Integer.valueOf(arrayList5.size())), null, 12) : new TextLocalisedClause(R$string.hotels_choose_rooms_filters_amenities_none, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, null, Boolean.valueOf(!zIsEmpty2), null, DG11File.TITLE_TAG)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }
}
