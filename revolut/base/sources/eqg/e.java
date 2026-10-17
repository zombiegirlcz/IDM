package eqg;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import we0.g;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends g {
    public e() {
        super(5, 6, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        ij.e eVarEdit = sharedPref.edit();
        eVarEdit.i("STORAGE_KEY_STATEMENT_OPTIONS");
        eVarEdit.i("STORAGE_KEY_SAVINGS_TAX_YEARS");
        eVarEdit.commit();
    }
}
