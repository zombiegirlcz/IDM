package we0;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g {
    @Override // we0.g
    public final void c(SharedPreferences sharedPref, je0.d mapper) {
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        sharedPref.edit().clear().commit();
    }
}
