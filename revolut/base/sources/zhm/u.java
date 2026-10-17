package zhm;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class u {
    public static aim.e a(List builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        aim.e eVar = (aim.e) builder;
        eVar.d();
        eVar.f5318c = true;
        return eVar.f5317b > 0 ? eVar : aim.e.d;
    }

    public static aim.e b() {
        return new aim.e((Object) null);
    }

    public static List c(Object obj2) {
        List listSingletonList = Collections.singletonList(obj2);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static void d(int i, Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (i < array.length) {
            array[i] = null;
        }
    }
}
