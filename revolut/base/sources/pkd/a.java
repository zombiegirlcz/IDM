package pkd;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends we0.g {
    public a() {
        super(1, 2, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        String string;
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        ij.e eVarEdit = sharedPref.edit();
        Set<String> setB = sharedPref.b();
        Intrinsics.checkNotNullExpressionValue(setB, "keys(...)");
        for (String str : setB) {
            if (!Intrinsics.f(str, "file_version") && (string = sharedPref.getString(str, null)) != null) {
                Intrinsics.h(str);
                String str2 = (String) d0.e0(1, kotlin.text.d0.n0(str, new String[]{"-"}, 2, 2));
                if (str2 == null || kotlin.text.d0.W(str2)) {
                    eVarEdit.i(str);
                } else {
                    eVarEdit.i(str);
                    eVarEdit.g(str2, string);
                }
            }
        }
        eVarEdit.commit();
    }
}
