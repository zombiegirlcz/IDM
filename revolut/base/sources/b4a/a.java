package b4a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static ArrayList a(List dtoStrings) {
        Intrinsics.checkNotNullParameter(dtoStrings, "dtoStrings");
        List list = dtoStrings;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            List listN0 = d0.n0((String) it8.next(), new String[]{"%"}, 0, 6);
            arrayList.add(new c4a.a((String) listN0.get(0), (String) listN0.get(1)));
        }
        return arrayList;
    }

    public static ArrayList b(ArrayList dtos) {
        Intrinsics.checkNotNullParameter(dtos, "dtos");
        ArrayList arrayList = new ArrayList(w.t(dtos, 10));
        Iterator it8 = dtos.iterator();
        while (it8.hasNext()) {
            c4a.a aVar = (c4a.a) it8.next();
            arrayList.add(aVar.getType() + "%" + aVar.getId());
        }
        return arrayList;
    }
}
