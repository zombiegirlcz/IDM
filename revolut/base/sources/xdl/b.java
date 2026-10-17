package xdl;

import android.content.SharedPreferences;
import ij.e;
import kotlin.jvm.internal.Intrinsics;
import we0.g;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends g {
    public static final b d = new b();

    private b() {
        super(3, 4, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        e eVarEdit = sharedPref.edit();
        eVarEdit.i("STOCK_CONFIG");
        eVarEdit.i("STOCK_CONFIG_LAST_UPDATE_TIMESTAMP_KEY");
        eVarEdit.commit();
    }
}
