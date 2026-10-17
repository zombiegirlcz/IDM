package nfk;

import gfk.j0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class f {
    public static final rha.b a(j0 j0Var) {
        Map mapG;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        List workflows = j0Var.getWorkflows();
        if (workflows != null) {
            List<j0.a> list = workflows;
            int iB = q0.b(w.t(list, 10));
            if (iB < 16) {
                iB = 16;
            }
            mapG = new LinkedHashMap(iB);
            for (j0.a aVar : list) {
                String lowerCase = aVar.getType().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                mapG.put(lowerCase, Boolean.valueOf(aVar.getEnabled()));
            }
        } else {
            mapG = r0.g();
        }
        return new rha.b(mapG);
    }
}
