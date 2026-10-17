package wq3;

import android.content.SharedPreferences;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import we0.g;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends g {
    public a() {
        super(1, 2, 0);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPref, d mapper) {
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        sharedPref.edit().clear().commit();
    }
}
