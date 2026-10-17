package fge;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends we0.g {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public e() {
        super(5, 6, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        String string = sharedPref.getString("LAST_SELECTED_ACCOUNT_DESCRIPTOR_KEY_V2", null);
        if (string == null || !d0.J(string, "_:_PAY_LATER_PRODUCT_ID", false)) {
            return;
        }
        ij.e eVarEdit = sharedPref.edit();
        eVarEdit.i("LAST_SELECTED_ACCOUNT_DESCRIPTOR_KEY_V2");
        eVarEdit.i("LAST_SELECTED_ACCOUNT_PAYLOAD_KEY");
        eVarEdit.i("LAST_SELECTED_ACCOUNT_METADATA_KEY");
        eVarEdit.commit();
    }
}
