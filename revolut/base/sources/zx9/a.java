package zx9;

import android.content.SharedPreferences;
import ij.e;
import kotlin.jvm.internal.Intrinsics;
import we0.g;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends g {
    public a() {
        super(1, 2, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        e eVarEdit = sharedPref.edit();
        eVarEdit.i("CONTACTS_UPDATE_KEY");
        eVarEdit.i("KEY_REMOTE_CONTACTS_LAST_UPDATE");
        eVarEdit.i("KEY_VIRTUAL_CONTACTS_TRANSACTION_LAST_UPDATE");
        eVarEdit.i("KEY_VIRTUAL_CONTACTS_INTERACTION_LAST_UPDATE");
        eVarEdit.commit();
    }
}
