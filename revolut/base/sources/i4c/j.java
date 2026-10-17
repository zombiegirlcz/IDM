package i4c;

import aw0.c7;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.revolut_shop.api.R$string;
import com.revolut.feature.revolut_shop.api.domain.model.IppProductType;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.t0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements g3c.b {
    public static TimeClause a(long j2) {
        com.revolut.core.ui_kit.models.j jVar = c7.Companion;
        LocalDate localDate = Instant.ofEpochMilli(j2).atZone(ZoneId.systemDefault()).toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        return com.revolut.core.ui_kit.models.j.b(jVar, localDate, new LocalDateClause$DateFormat.DateMedium(n0.HIDE_CURRENT_YEAR));
    }

    public final TextLocalisedClause b(long j2) {
        return new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_order_history_order_estimated, u.c(a(j2)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
    }

    public final Image c(d3c.h order) {
        Object next;
        String str;
        Intrinsics.checkNotNullParameter(order, "order");
        ArrayList arrayList = order.f111024l;
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((d3c.j) next).f111035b.equals(IppProductType.AndroidTerminal.f84195a)) {
                break;
            }
        }
        d3c.j jVar = (d3c.j) next;
        if (jVar == null) {
            jVar = (d3c.j) d0.d0(arrayList);
        }
        return (jVar == null || (str = jVar.f111038h.f111015b) == null) ? com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D231", null, null, null, 30) : new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    public final Clause d(List orderProductItems, d3c.m mVar) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(orderProductItems, "orderProductItems");
        if (mVar != null) {
            arrayList = new ArrayList();
            for (Object obj2 : orderProductItems) {
                d3c.j jVar = (d3c.j) obj2;
                ArrayList arrayList2 = mVar.f;
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                Iterator it8 = arrayList2.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(((d3c.n) it8.next()).f111047a);
                }
                if (arrayList3.contains(jVar.f111034a)) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = orderProductItems;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : (Iterable) arrayList) {
            IppProductType ippProductType = ((d3c.j) obj3).f111035b;
            Object arrayList4 = linkedHashMap.get(ippProductType);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(ippProductType, arrayList4);
            }
            ((List) arrayList4).add(obj3);
        }
        List listP0 = d0.P0(t0.C(linkedHashMap), new i());
        int size = listP0.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            List list = (List) ((Pair) d0.b0(listP0)).f186386b;
            String str = ((d3c.j) d0.b0(list)).f111037g.f111016a;
            List list2 = list;
            ArrayList arrayList5 = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList5.add(Long.valueOf(((d3c.j) it9.next()).f111036c));
            }
            return z3c.i.b(d0.U0(arrayList5), str);
        }
        String str2 = ((d3c.j) d0.b0((List) ((Pair) d0.b0(listP0)).f186386b)).f111037g.f111016a;
        int i = R$string.revolut_shop_flow_home_screen_order_history_order_description_named_item_and_more;
        Clause clauseB = z3c.i.b(0L, str2);
        List list3 = orderProductItems;
        ArrayList arrayList6 = new ArrayList(w.t(list3, 10));
        Iterator it10 = list3.iterator();
        while (it10.hasNext()) {
            arrayList6.add(Long.valueOf(((d3c.j) it10.next()).f111036c));
        }
        Object[] elements = {clauseB, Long.valueOf(d0.U0(arrayList6) - 1)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new TextLocalisedClause(i, kotlin.collections.d.L(elements), null, 12);
    }
}
