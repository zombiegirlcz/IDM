package uqh;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 {
    public static y a(String query, List instruments) {
        nel.n nVar;
        String str;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        String lowerCase = kotlin.text.d0.F0(query).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : instruments) {
                vel.f fVar = ((g0h.a) obj2).f139493b;
                String lowerCase2 = null;
                vel.e eVar = fVar instanceof vel.e ? (vel.e) fVar : null;
                if (eVar != null && (nVar = eVar.f288355a.f214560a) != null && (str = nVar.d) != null) {
                    lowerCase2 = str.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                }
                if (kotlin.text.d0.J(fVar.c(), lowerCase, true) || (lowerCase2 != null && kotlin.text.d0.J(lowerCase2, lowerCase, false))) {
                    arrayList.add(obj2);
                }
            }
            instruments = arrayList;
        }
        return new y(lowerCase, instruments);
    }
}
