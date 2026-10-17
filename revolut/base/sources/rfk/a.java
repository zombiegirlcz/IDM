package rfk;

import android.content.SharedPreferences;
import ij.e;
import java.util.ArrayList;
import java.util.Set;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import we0.g;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends g {
    public a() {
        super(1, 2, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Set setB = sharedPref.b();
        Intrinsics.checkNotNullExpressionValue(setB, "keys(...)");
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj2 : setB) {
            String str = (String) obj2;
            Intrinsics.h(str);
            if (a0.H(str, "family_plan_invitation_info_key_prefix_", false) || a0.H(str, "FAMILY_CURRENT", false)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (String str2 : arrayList) {
            e eVarEdit = sharedPref.edit();
            eVarEdit.i(str2);
            arrayList2.add(Boolean.valueOf(eVarEdit.commit()));
        }
    }
}
