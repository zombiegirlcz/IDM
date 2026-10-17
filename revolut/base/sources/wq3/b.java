package wq3;

import android.content.SharedPreferences;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import we0.g;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends g {
    public b() {
        super(2, 3, 0);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPref, d mapper) {
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        sharedPref.edit().clear().commit();
    }
}
