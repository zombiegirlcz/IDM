package m21;

import android.content.SharedPreferences;
import ij.e;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import we0.g;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g {
    public a() {
        super(1, 2, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        e eVarEdit = sharedPref.edit();
        eVarEdit.i("IS_ANDROID_PAY_AVAILABLE_CACHE");
        eVarEdit.commit();
        e eVarEdit2 = sharedPref.edit();
        eVarEdit2.g("IS_GOOGLE_PAY_SELECTED", sharedPref.getString("android_pay_selected", ""));
        eVarEdit2.commit();
        e eVarEdit3 = sharedPref.edit();
        eVarEdit3.i("android_pay_selected");
        eVarEdit3.commit();
    }
}
