package uka;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends we0.g {
    public static final h d = new h();

    private h() {
        super(2, 3, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        ij.e eVarEdit = sharedPref.edit();
        Set setB = sharedPref.b();
        Intrinsics.checkNotNullExpressionValue(setB, "keys(...)");
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj2 : setB) {
            String str = (String) obj2;
            Intrinsics.h(str);
            if (a0.H(str, "PRODUCT_ARTICLE_SHOWN_KEY", false)) {
                arrayList.add(obj2);
            }
        }
        for (String str2 : arrayList) {
            Intrinsics.h(str2);
            String string = sharedPref.getString(str2, null);
            if (pd.b.j(string != null ? d0.E0(string) : null)) {
                eVarEdit.g(str2, "0");
            } else {
                eVarEdit.i(str2);
            }
        }
        eVarEdit.apply();
    }
}
