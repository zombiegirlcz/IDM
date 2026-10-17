package gbm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f142275a = System.getProperty("line.separator");

    public static final String a(Object obj2) {
        if (obj2 == null) {
            obj2 = "null";
        }
        return "\t\t" + obj2 + f142275a;
    }

    public static final String b(Set set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        StringBuilder sb6 = new StringBuilder();
        Set set2 = set;
        ArrayList arrayList = new ArrayList(w.t(set2, 10));
        Iterator it8 = set2.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            String str = f142275a;
            if (!zHasNext) {
                sb6.append(arrayList);
                sb6.append(str);
                return sb6.toString();
            }
            arrayList.add(str + "\t\t" + it8.next());
        }
    }
}
