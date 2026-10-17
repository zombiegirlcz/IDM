package d04;

import d04.a;
import dx4.a1;
import dx4.y0;
import fu3.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import rd0.d;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public abstract class b {
    public static final c a(a aVar) {
        fu3.a aVar2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String title = aVar.getTitle();
        String description = aVar.getDescription();
        List<a.C0651a> items = aVar.getItems();
        ArrayList arrayList = new ArrayList(w.t(items, 10));
        for (a.C0651a c0651a : items) {
            String id10 = c0651a.getId();
            String id11 = c0651a.getId();
            fu3.a[] aVarArrValues = fu3.a.values();
            int length = aVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aVar2 = null;
                    break;
                }
                aVar2 = aVarArrValues[i];
                if (a0.z(aVar2.name(), id11, true)) {
                    break;
                }
                i++;
            }
            if (aVar2 == null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(rd0.c.ERROR, "CreditOfferDtoMapper.kt", j6.a.q("Unsupported repaymentType ", c0651a.getId()), null, h0Var);
                aVar2 = fu3.a.EQUAL_INSTALLMENTS;
            }
            fu3.a aVar3 = aVar2;
            String title2 = c0651a.getTitle();
            String subtitle = c0651a.getSubtitle();
            String value = c0651a.getValue();
            String secondaryValue = c0651a.getSecondaryValue();
            y0 y0Var = a1.Companion;
            String icon = c0651a.getIcon();
            y0Var.getClass();
            arrayList.add(new fu3.b(id10, aVar3, title2, subtitle, value, secondaryValue, y0.a(icon), c0651a.getSelected(), c0651a.getEnabled()));
        }
        return new c(title, description, arrayList, aVar.getFooter());
    }
}
