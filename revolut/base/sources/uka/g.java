package uka;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.a0;
import wim.z;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends we0.g {
    public static final g d = new g();

    private g() {
        super(1, 2, 1);
    }

    @Override // we0.g
    public final void c(SharedPreferences sharedPreferences, je0.d mapper) {
        ij.a sharedPref = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(sharedPref, "sharedPref");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        ij.e eVarEdit = sharedPref.edit();
        Set setB = sharedPref.b();
        Intrinsics.checkNotNullExpressionValue(setB, "keys(...)");
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj2 : setB) {
            String str = (String) obj2;
            if (!Intrinsics.f(str, "file_version") && !Intrinsics.f(str, "PRODUCT_ARTICLE_CONFIG_KEY")) {
                Intrinsics.h(str);
                if (!a0.H(str, "PRODUCT_ARTICLE_SHOWN_KEY", false)) {
                    arrayList.add(obj2);
                }
            }
        }
        for (String str2 : arrayList) {
            String string = sharedPref.getString(str2, null);
            if (string != null) {
                f fVar = (f) mapper.b(string, z.d(o0.b(f.class)));
                String str3 = fVar.f280717a;
                List list = fVar.f280718b;
                List<d> list2 = fVar.f280719c;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                for (d dVar : list2) {
                    arrayList2.add(new aka.g(dVar.f280715a, dVar.f280716b, "default"));
                }
                eVarEdit.g(str2, (String) mapper.c(new aka.i(str3, list, arrayList2, f0.f322471a), z.d(o0.b(aka.i.class))));
            }
        }
        eVarEdit.apply();
    }
}
