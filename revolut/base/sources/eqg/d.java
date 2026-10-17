package eqg;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import we0.g;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends g {
    public d() {
        super(4, 5, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        ij.e eVarEdit = sharedPref.edit();
        eVarEdit.i("storage_key_best_product_per_plan");
        eVarEdit.i("storage_key_non_direct_invested_products");
        eVarEdit.commit();
    }
}
