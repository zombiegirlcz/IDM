package d1i;

import android.content.SharedPreferences;
import ij.e;
import je0.d;
import kotlin.jvm.internal.Intrinsics;
import we0.g;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends g {
    public a() {
        super(1, 2, 1);
    }

    public static void d(e eVar, String str, ij.a aVar, d dVar) {
        b bVar;
        String str2 = null;
        try {
            String string = aVar.getString(str, null);
            if (string != null && (bVar = (b) dVar.b(string, b.class)) != null) {
                str2 = bVar.f306286a;
            }
            eVar.g(str, str2);
        } catch (NullPointerException unused) {
            eVar.i(str);
        }
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        e eVarEdit = sharedPref.edit();
        c1i.a aVar = c1i.b.Companion;
        wd6.e eVar = wd6.e.BUY;
        aVar.getClass();
        d(eVarEdit, c1i.a.a(eVar), sharedPref, mapper);
        d(eVarEdit, c1i.a.a(wd6.e.SELL), sharedPref, mapper);
        eVarEdit.commit();
    }
}
