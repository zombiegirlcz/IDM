package uka;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends we0.g {
    public static final i d = new i();

    private i() {
        super(3, 4, 1);
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
            if (!Intrinsics.f(str, "file_version") && !Intrinsics.f(str, "PRODUCT_ARTICLE_CONFIG_KEY")) {
                Intrinsics.h(str);
                if (!a0.H(str, "PRODUCT_ARTICLE_SHOWN_KEY", false)) {
                    arrayList.add(obj2);
                }
            }
        }
        for (String str2 : arrayList) {
            String string = sharedPref.getString(str2, null);
            if (string != null) {
                eVarEdit.i(str2);
                eVarEdit.g("PRODUCT_ARTICLE_KEY_PREFIX-" + str2, string);
            }
        }
        eVarEdit.apply();
    }
}
