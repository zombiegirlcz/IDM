package gz8;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u09.y;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public static ArrayList a(List progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        List<String> list = progress;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (String value : list) {
            Intrinsics.checkNotNullParameter(value, "value");
            arrayList.add(y.valueOf(value));
        }
        return arrayList;
    }
}
