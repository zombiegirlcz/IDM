package eu6;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends we0.g {
    public c() {
        super(2, 3, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        ij.e eVarEdit = sharedPref.edit();
        eVarEdit.i("STORAGE_KEY_HOME_WIDGET_SELECTED_ACCOUNT_ID");
        eVarEdit.i("KEY_VALID_PRO_ACCOUNT_DETAILS");
        eVarEdit.i("STORAGE_KEY_IS_MERCHANT_ONBOARDED");
        eVarEdit.commit();
    }
}
