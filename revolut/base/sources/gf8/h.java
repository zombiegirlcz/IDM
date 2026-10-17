package gf8;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends we0.g {
    public h() {
        super(3, 4, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        ij.e eVarEdit = sharedPref.edit();
        eVarEdit.i("KEY_ACCOUNT_CONFIGURATIONS");
        eVarEdit.i("CACHE_KEY_ACCOUNT_CONFIGURATIONS_LAST_MODIFIED");
        eVarEdit.commit();
    }
}
