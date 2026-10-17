package qfk;

import com.revolut.feature.pricingplans.models.PricingPlanTextDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    public final List a(String str, ArrayList arrayList) {
        PricingPlanTextDescriptor.Action.UrlNavigation urlNavigation;
        Object next;
        String strB;
        if (str == null) {
            return f0.f322471a;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return u.c(new PricingPlanTextDescriptor(str));
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            eha.a aVar = (eha.a) it8.next();
            str = a0.F(str, aVar.a(), p.a.p("{{::}}", aVar.a(), "{{::}}"), false);
        }
        List listN0 = d0.n0(str, new String[]{"{{::}}"}, 0, 6);
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj2 : listN0) {
            if (!d0.W((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        for (String str2 : arrayList2) {
            Iterator it9 = arrayList.iterator();
            while (true) {
                urlNavigation = null;
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                if (Intrinsics.f(((eha.a) next).a(), str2)) {
                    break;
                }
            }
            eha.a aVar2 = (eha.a) next;
            if (aVar2 != null && (strB = aVar2.b()) != null) {
                urlNavigation = new PricingPlanTextDescriptor.Action.UrlNavigation(strB);
            }
            arrayList3.add(new PricingPlanTextDescriptor(str2, urlNavigation));
        }
        return arrayList3;
    }
}
