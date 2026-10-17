package rj8;

import android.content.SharedPreferences;
import h30.l;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import we0.g;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends g {
    public b() {
        super(2, 3, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        l.C(sharedPref, "CACHE_KEY_PROFILE");
    }
}
