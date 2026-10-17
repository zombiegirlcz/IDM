package yyf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import lyf.e;
import lyf.f;
import lyf.g;
import nzf.b;
import nzf.c;
import nzf.d;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final e a(c cVar) {
        lyf.c cVar2;
        qyf.a aVar;
        String str = "<this>";
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String value = cVar.getDestinationId();
        Intrinsics.checkNotNullParameter(value, "value");
        String type = cVar.getType();
        qyf.a[] aVarArrValues = qyf.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            cVar2 = null;
            if (i2 >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i2];
            if (a0.z(aVar.name(), type, true)) {
                break;
            }
            i2++;
        }
        if (aVar == null) {
            aVar = qyf.a.UNKNOWN;
        }
        String name = cVar.getName();
        String image = cVar.getImage();
        nzf.e stats = cVar.getStats();
        Intrinsics.checkNotNullParameter(stats, "<this>");
        int totalCount = stats.getTotalCount();
        String countStatus = stats.getCountStatus();
        lyf.c[] cVarArrValues = lyf.c.values();
        int length2 = cVarArrValues.length;
        while (true) {
            if (i >= length2) {
                break;
            }
            lyf.c cVar3 = cVarArrValues[i];
            if (a0.z(cVar3.name(), countStatus, true)) {
                cVar2 = cVar3;
                break;
            }
            i++;
        }
        if (cVar2 == null) {
            cVar2 = lyf.c.UNKNOWN;
        }
        g gVar = new g(totalCount, cVar2);
        List<d> attractions = cVar.getAttractions();
        int i3 = 10;
        ArrayList arrayList = new ArrayList(w.t(attractions, 10));
        for (d dVar : attractions) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            String value2 = dVar.getId();
            Intrinsics.checkNotNullParameter(value2, "value");
            arrayList.add(new f(value2, dVar.getName(), dVar.getImage()));
        }
        List categories = cVar.getCategories();
        ArrayList arrayList2 = new ArrayList(w.t(categories, 10));
        Iterator it8 = categories.iterator();
        while (it8.hasNext()) {
            b bVar = (b) it8.next();
            Intrinsics.checkNotNullParameter(bVar, str);
            String id10 = bVar.getId();
            String name2 = bVar.getName();
            List<nzf.a> experiences = bVar.getExperiences();
            ArrayList arrayList3 = new ArrayList(w.t(experiences, i3));
            for (nzf.a aVar2 : experiences) {
                Intrinsics.checkNotNullParameter(aVar2, str);
                arrayList3.add(new lyf.a(aVar2.getId(), aVar2.getName(), aVar2.getImage(), cp5.c.G(aVar2.getStartingPrice())));
                it8 = it8;
                str = str;
            }
            arrayList2.add(new lyf.b(id10, name2, arrayList3));
            str = str;
            i3 = 10;
        }
        return new e(value, aVar, name, image, gVar, arrayList, arrayList2);
    }
}
