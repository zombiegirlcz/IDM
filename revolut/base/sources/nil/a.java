package nil;

import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private a() {
    }

    public static ArrayList a(String... values) {
        Intrinsics.checkNotNullParameter(values, "values");
        ArrayList arrayList = new ArrayList(values.length);
        for (String str : values) {
            arrayList.add(new BigDecimal(str));
        }
        return arrayList;
    }
}
