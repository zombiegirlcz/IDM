package f29;

import android.content.SharedPreferences;
import ij.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import we0.g;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends g {
    public static final b d = new b();
    public static final List e = v.k("CACHE_KEY_HOME_FEED_STORAGE_KEY", "CACHE_KEY_HOME_PRODUCTS_STORAGE_KEY", "CACHE_KEY_HOME_HEADER_STORAGE_KEY", "CACHE_KEY_HOME_S4U_STORAGE_KEY");

    private b() {
        super(1, 2, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        e eVarEdit = sharedPref.edit();
        Set setB = sharedPref.b();
        Intrinsics.checkNotNullExpressionValue(setB, "keys(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setB) {
            String str = (String) obj2;
            List list = e;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        String str2 = (String) it8.next();
                        Intrinsics.h(str);
                        if (a0.H(str, str2, false)) {
                            arrayList.add(obj2);
                            break;
                        }
                    }
                }
            }
        }
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            eVarEdit.i((String) it9.next());
        }
        eVarEdit.commit();
    }
}
