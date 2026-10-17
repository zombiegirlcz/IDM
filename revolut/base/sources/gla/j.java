package gla;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.d0;
import wim.z;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends we0.g {
    public j() {
        super(1, 2, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        Map map;
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Map mapG = null;
        String string = sharedPref.getString("PRODUCT_CATALOGUE_CACHE_KEY", null);
        if (string == null || d0.W(string)) {
            string = null;
        }
        f fVar = string != null ? (f) mapper.b(string, z.d(o0.b(f.class))) : null;
        if (fVar != null && (map = fVar.f144588a) != null) {
            mapG = new LinkedHashMap(q0.b(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                mapG.put(entry.getKey(), new c((bla.c) entry.getValue()));
            }
        }
        if (mapG == null) {
            mapG = r0.g();
        }
        String str = (String) mapper.c(new i(mapG), z.d(o0.b(i.class)));
        ij.e eVarEdit = sharedPref.edit();
        eVarEdit.g("PRODUCT_CATALOGUE_CACHE_KEY", str);
        eVarEdit.apply();
    }
}
