package mxb;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends we0.g {
    public static final f d = new f();

    private f() {
        super(6, 7, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        ij.e eVarEdit = sharedPref.edit();
        eVarEdit.i("REV_POINTS_CHALLENGES_PREVIEW_STORAGE_KEY");
        eVarEdit.i("REV_POINTS_FEATURED_CHALLENGES_STORAGE_KEY");
        eVarEdit.i("REV_POINTS_CHALLENGES_SECTION_STORAGE_KEY");
        eVarEdit.i("REV_POINTS_CHALLENGES_V3_BREAKDOWN_STORAGE_KEY");
        eVarEdit.apply();
    }
}
