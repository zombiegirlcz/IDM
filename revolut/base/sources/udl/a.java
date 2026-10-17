package udl;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import we0.g;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends g {
    public static final a d = new a();

    private a() {
        super(1, 2, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Set setB = sharedPref.b();
        Intrinsics.checkNotNullExpressionValue(setB, "keys(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setB) {
            String str = (String) obj2;
            Intrinsics.h(str);
            if (a0.H(str, "PORTFOLIO_LAST_MODIFIED_DATE_", false)) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            sharedPref.edit().i((String) it8.next());
        }
    }
}
