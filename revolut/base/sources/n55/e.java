package n55;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends we0.g {
    public static final e d = new e();

    private e() {
        super(1, 2, 1);
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
            if (a0.H(str, "loan_details", false)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayListF0 = d0.F0("loans-management", arrayList);
        ij.e eVarEdit = sharedPref.edit();
        Iterator it8 = arrayListF0.iterator();
        while (it8.hasNext()) {
            eVarEdit.i((String) it8.next());
        }
        eVarEdit.commit();
    }
}
