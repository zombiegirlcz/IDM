package mxb;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends we0.g {
    public static final a d = new a();

    private a() {
        super(1, 2, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        ij.e eVarEdit = sharedPref.edit();
        eVarEdit.i("REV_POINTS_MAIN_CHALLENGES_STORAGE_KEY");
        eVarEdit.i("REV_POINTS_CHALLENGES_STORAGE_KEY");
        eVarEdit.commit();
    }
}
