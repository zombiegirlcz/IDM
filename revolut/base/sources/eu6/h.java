package eu6;

import android.content.SharedPreferences;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends we0.g {
    public h() {
        super(7, 8, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        l.C(sharedPref, "CACHE_KEY_FREELANCER_PRICING_PLAN");
    }
}
