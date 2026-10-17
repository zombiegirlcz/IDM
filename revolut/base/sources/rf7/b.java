package rf7;

import android.content.SharedPreferences;
import ij.e;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import we0.g;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends g {
    public static final b d = new b();

    private b() {
        super(6, 7, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        String string = sharedPref.getString("SALARY_PROMOTION_KEY", null);
        if (string == null) {
            return;
        }
        e eVarEdit = sharedPref.edit();
        eVarEdit.i("SALARY_PROMOTION_KEY");
        eVarEdit.g("SALARY_PROMOTION_KEY_null_null", string);
        eVarEdit.commit();
    }
}
