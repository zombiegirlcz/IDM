package zx9;

import android.content.SharedPreferences;
import ij.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import we0.g;
import wim.z;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends g {
    public final y80.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y80.a permissionProvider) {
        super(2, 3, 1);
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        this.d = permissionProvider;
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        e eVarEdit = sharedPref.edit();
        eVarEdit.g("UDATED_WITH_CONTACT_PERMISSION", (String) mapper.c(Boolean.valueOf(this.d.c("android.permission.READ_CONTACTS")), z.d(o0.b(Boolean.TYPE))));
        eVarEdit.commit();
    }
}
