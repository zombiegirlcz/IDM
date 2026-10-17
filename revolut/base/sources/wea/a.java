package wea;

import android.content.SharedPreferences;
import ij.e;
import java.util.Set;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import we0.g;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends g {

    @NotNull
    private static final C1637a Companion = new C1637a();

    /* JADX INFO: renamed from: wea.a$a, reason: collision with other inner class name */
    public static final class C1637a {
        private C1637a() {
        }
    }

    public a() {
        super(2, 3, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        e eVarEdit = sharedPref.edit();
        Set<String> setB = sharedPref.b();
        Intrinsics.checkNotNullExpressionValue(setB, "keys(...)");
        for (String str : setB) {
            Intrinsics.h(str);
            if (a0.H(str, "ACCOUNT_DETAILS_STORAGE_KEY", false) || a0.H(str, "ALL_ACCOUNT_DETAILS_STORAGE_KEY", false)) {
                eVarEdit.i(str);
            }
        }
        eVarEdit.commit();
    }
}
