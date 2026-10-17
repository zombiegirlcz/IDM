package sa6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ya6.e f261302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ya6.q f261303b;

    public b(ya6.e charityCollectionsRepository, ya6.q donationsRepository) {
        Intrinsics.checkNotNullParameter(charityCollectionsRepository, "charityCollectionsRepository");
        Intrinsics.checkNotNullParameter(donationsRepository, "donationsRepository");
        this.f261302a = charityCollectionsRepository;
        this.f261303b = donationsRepository;
    }

    public static ArrayList a(LinkedHashMap linkedHashMap, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            ba6.l lVar = (ba6.l) linkedHashMap.get((String) it8.next());
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        return arrayList;
    }
}
