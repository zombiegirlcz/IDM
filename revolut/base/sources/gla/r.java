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
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends we0.g {
    public r() {
        super(2, 3, 1);
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
        q qVar = string != null ? (q) mapper.b(string, z.d(o0.b(q.class))) : null;
        if (qVar != null && (map = qVar.f144599a) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                n nVar = (n) entry.getValue();
                linkedHashMap.put(key, u.c(new jla.c(nVar.f144595a, nVar.f144596b, null)));
            }
            mapG = linkedHashMap;
        }
        if (mapG == null) {
            mapG = r0.g();
        }
        String str = (String) mapper.c(new jla.f(mapG), z.d(o0.b(jla.f.class)));
        ij.e eVarEdit = sharedPref.edit();
        eVarEdit.g("PRODUCT_CATALOGUE_CACHE_KEY", str);
        eVarEdit.apply();
    }
}
