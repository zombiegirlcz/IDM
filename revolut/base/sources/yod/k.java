package yod;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.api.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    @NotNull
    private static final g Companion = new g();

    public static List b(List list) {
        List<amd.j> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (amd.j jVar : list2) {
            arrayList.add(new h(jVar, mra.d.o0(jVar)));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((h) obj2).f315660b.k()) {
                arrayList2.add(obj2);
            }
        }
        return d0.P0(arrayList2, new j());
    }

    public static i c(List list, xi0.b bVar) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.analytics_dashboard_widget_total_wealth_others, null, null, 14);
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((h) it8.next()).f315659a);
        }
        return new i(textLocalisedClause, otd.f.c(2, null, new MoneyClause.Format.Shorts(false, 63), otd.f.a(hx7.e.m(arrayList, bVar).a())));
    }

    public final i a(h hVar) {
        return new i(fsd.c.e(hVar.f315659a), otd.f.c(2, null, new MoneyClause.Format.Shorts(false, 63), otd.f.a(hVar.f315660b.a())));
    }
}
