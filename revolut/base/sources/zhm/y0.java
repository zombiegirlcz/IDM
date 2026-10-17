package zhm;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class y0 {
    public static aim.o a(Set builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        aim.o oVar = (aim.o) builder;
        oVar.f5338a.b();
        return oVar.size() > 0 ? oVar : aim.o.f5337b;
    }

    public static Set b(Object obj2) {
        Set setSingleton = Collections.singleton(obj2);
        Intrinsics.checkNotNullExpressionValue(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static TreeSet c(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        TreeSet treeSet = new TreeSet();
        kotlin.collections.d.p0(elements, treeSet);
        return treeSet;
    }
}
