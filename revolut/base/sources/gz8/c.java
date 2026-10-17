package gz8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.serialization.json.Json;
import qlm.v1;
import u09.v;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public static List a(String str) {
        if (str == null) {
            return null;
        }
        Json jsonA = mz8.a.a();
        jsonA.getClass();
        return (List) jsonA.b(new qlm.e(v1.f247718a), str);
    }

    public static v b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return v.valueOf(value);
    }

    public static List c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (d0.W(value)) {
            return f0.f322471a;
        }
        List listN0 = d0.n0(value, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(w.t(listN0, 10));
        Iterator it8 = listN0.iterator();
        while (it8.hasNext()) {
            arrayList.add(v.valueOf((String) it8.next()));
        }
        return arrayList;
    }

    public static String d(List list) {
        if (list == null) {
            return null;
        }
        Json jsonA = mz8.a.a();
        jsonA.getClass();
        return jsonA.c(new qlm.e(v1.f247718a), list);
    }
}
