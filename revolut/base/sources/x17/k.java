package x17;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static List a(List list, List list2, Function1 function1) {
        if (list.isEmpty() || list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (list2.contains(function1.invoke(obj2))) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
