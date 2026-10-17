package zgc;

import com.revolut.feature.rewards.api.model.concierge.Cell;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ygc.k;
import ygc.l;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final ArrayList a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<l> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (l lVar : list2) {
            Intrinsics.checkNotNullParameter(lVar, "<this>");
            String str = lVar.f313622a;
            String str2 = lVar.f313623b;
            k kVar = lVar.f313624c;
            Cell.Subtitle subtitle = null;
            com.revolut.feature.rewards.api.model.concierge.a aVar = null;
            if (kVar != null) {
                Intrinsics.checkNotNullParameter(kVar, "<this>");
                String str3 = kVar.f313620a;
                String str4 = kVar.f313621b;
                com.revolut.feature.rewards.api.model.concierge.a[] aVarArrValues = com.revolut.feature.rewards.api.model.concierge.a.values();
                int length = aVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    com.revolut.feature.rewards.api.model.concierge.a aVar2 = aVarArrValues[i];
                    if (a0.z(aVar2.name(), str4, true)) {
                        aVar = aVar2;
                        break;
                    }
                    i++;
                }
                if (aVar == null) {
                    aVar = com.revolut.feature.rewards.api.model.concierge.a.DEFAULT;
                }
                subtitle = new Cell.Subtitle(str3, aVar);
            }
            arrayList.add(new Cell(str, str2, subtitle, lVar.d));
        }
        return arrayList;
    }

    public static final ArrayList b(List list) {
        k kVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<Cell> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (Cell cell : list2) {
            Intrinsics.checkNotNullParameter(cell, "<this>");
            String str = cell.f84772a;
            String str2 = cell.f84773b;
            Cell.Subtitle subtitle = cell.f84774c;
            if (subtitle != null) {
                Intrinsics.checkNotNullParameter(subtitle, "<this>");
                kVar = new k(subtitle.f84775a, subtitle.f84776b.name());
            } else {
                kVar = null;
            }
            arrayList.add(new l(str, str2, kVar, cell.d));
        }
        return arrayList;
    }
}
