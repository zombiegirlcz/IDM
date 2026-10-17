package hj9;

import android.content.SharedPreferences;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends we0.g {
    public f() {
        super(6, 7, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        l.C(sharedPref, "FEE_SETTINGS");
    }
}
