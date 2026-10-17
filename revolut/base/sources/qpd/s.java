package qpd;

import aw0.j0;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import tof.v6;
import zhm.a0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.l f248370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9l.a f248371b;

    public s(thf.l transactionMapper, j9l.a moneyCalculator) {
        Intrinsics.checkNotNullParameter(transactionMapper, "transactionMapper");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        this.f248370a = transactionMapper;
        this.f248371b = moneyCalculator;
    }

    public final ArrayList a(List list, k71.q qVar, boolean z) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            k71.q qVar2 = qVar;
            arrayList.add(((anf.o) this.f248370a).p(((he3.h) it8.next()).f151559a, qVar2, new thf.k(102, true, z, false, false, true), null, null));
            qVar = qVar2;
        }
        return arrayList;
    }

    public final ArrayList b(ie3.a content, boolean z) {
        Intrinsics.checkNotNullParameter(content, "content");
        List list = content.f160626a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            he3.h hVar = (he3.h) obj2;
            Integer numValueOf = Integer.valueOf(hVar.f151559a.f272593h.getDayOfYear() + (hVar.f151559a.f272593h.getYear() * 1000));
            Object objU = linkedHashMap.get(numValueOf);
            if (objU == null) {
                objU = v7.u(linkedHashMap, numValueOf);
            }
            ((List) objU).add(obj2);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = linkedHashMap.entrySet().iterator();
        while (it8.hasNext()) {
            List<he3.h> list2 = (List) ((Map.Entry) it8.next()).getValue();
            List list3 = content.f160627b;
            xi0.b bVar = content.d;
            he3.h hVar2 = (he3.h) d0.b0(list2);
            ArrayList arrayList2 = new ArrayList();
            for (he3.h hVar3 : list2) {
                v6 v6Var = hVar3.f151559a.f;
                if (v6Var == v6.PENDING || v6Var == v6.COMPLETED) {
                    a0.x(hVar3.a(bVar, z), arrayList2);
                }
            }
            dj0.d dVarA = this.f248371b.a(bVar, arrayList2, list3);
            MoneyClause moneyClause = dVarA != null ? new MoneyClause(dVarA, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null;
            arrayList.add(new ListSubheaderDelegate.Model(hVar2.f151559a.f272579a, null, new TimeClause(hVar2.f151559a.f272593h.getMillis(), TimeClause.Format.DateLong.f57962b, null, null, 12), null, moneyClause, null, j0.TRANSPARENT, null, null, false, false, null, null, R$attr.uikit_dp32, R$attr.uikit_dp16, 0, 0, 13631402));
            ArrayList arrayListA = a(list2, content.f160628c, true);
            yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
            arrayList.addAll(arrayListA);
        }
        return arrayList;
    }
}
