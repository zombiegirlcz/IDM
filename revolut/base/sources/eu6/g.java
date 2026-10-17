package eu6;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends we0.g {
    public g() {
        super(6, 7, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        ij.e eVarEdit = sharedPref.edit();
        eVarEdit.i("STORAGE_CACHE_KEY_CASHBACK_BOOSTER_INFO");
        eVarEdit.i("STORAGE_CACHE_KEY_CASHBACK_INFO");
        eVarEdit.commit();
    }
}
