package uka;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends we0.g {
    public static final j d = new j();

    private j() {
        super(4, 5, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        ij.e eVarEdit = sharedPref.edit();
        Set<String> setB = sharedPref.b();
        Intrinsics.checkNotNullExpressionValue(setB, "keys(...)");
        for (String str : setB) {
            Intrinsics.h(str);
            if (a0.H(str, "PRODUCT_ARTICLE_SHOWN_KEY", false) || a0.H(str, "V2_PRODUCT_ARTICLE_SHOWN_KEY", false)) {
                eVarEdit.i(str);
            }
        }
        eVarEdit.apply();
    }
}
