package zo4;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends we0.g {
    public p() {
        super(24, 25, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Set setB = sharedPref.b();
        Intrinsics.checkNotNullExpressionValue(setB, "keys(...)");
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj2 : setB) {
            String str = (String) obj2;
            Intrinsics.h(str);
            if (kotlin.text.a0.H(str, "credit-card-auto-pay", false)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (String str2 : arrayList) {
            ij.e eVarEdit = sharedPref.edit();
            eVarEdit.i(str2);
            arrayList2.add(Boolean.valueOf(eVarEdit.commit()));
        }
    }
}
