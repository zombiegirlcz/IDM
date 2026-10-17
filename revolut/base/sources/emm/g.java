package emm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ulm.h1;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class g {
    public static ArrayList a(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : protocols) {
            if (((h1) obj2) != h1.HTTP_1_0) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((h1) it8.next()).toString());
        }
        return arrayList2;
    }

    public static byte[] b(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        mmm.h hVar = new mmm.h();
        for (String str : a(protocols)) {
            hVar.w(str.length());
            hVar.D(str);
        }
        return hVar.o(hVar.f207266b);
    }
}
