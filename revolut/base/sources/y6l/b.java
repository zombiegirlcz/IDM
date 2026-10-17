package y6l;

import android.content.SharedPreferences;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import we0.g;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends g {
    public b() {
        super(2, 3, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
    }
}
