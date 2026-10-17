package eqg;

import android.content.SharedPreferences;
import h30.l;
import kotlin.jvm.internal.Intrinsics;
import we0.g;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends g {
    public c() {
        super(3, 4, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        l.C(sharedPref, "storage_key_best_product_per_plan");
    }
}
