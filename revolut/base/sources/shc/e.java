package shc;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import we0.g;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends g {
    public static final e d = new e();

    private e() {
        super(5, 6, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Set setB = sharedPref.b();
        Intrinsics.checkNotNullExpressionValue(setB, "keys(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : setB) {
            String str = (String) obj2;
            Intrinsics.h(str);
            if (a0.H(str, "REWARDS_PREVIEW_CACHE_KEY_", false)) {
                arrayList.add(obj2);
            }
        }
        ij.e eVarEdit = sharedPref.edit();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            eVarEdit.i((String) it8.next());
        }
        eVarEdit.commit();
    }
}
