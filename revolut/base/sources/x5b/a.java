package x5b;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import w5b.r;
import w5b.u;
import w5b.x;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f302925a = q0.c(new Pair("PLAN_SWITCH", r5b.c.PLAN_SWITCH));

    public static final r5b.a a(u uVar) {
        r5b.c cVar;
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        String str = uVar.f295027a;
        List<x> list = uVar.f295028b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (x xVar : list) {
            Intrinsics.checkNotNullParameter(xVar, "<this>");
            arrayList.add(new r5b.d(xVar.f295062a, xVar.f295063b, xVar.f295064c));
        }
        List<r> list2 = uVar.f295029c;
        ArrayList arrayList2 = new ArrayList();
        for (r rVar : list2) {
            Intrinsics.checkNotNullParameter(rVar, "<this>");
            String upperCase = rVar.f294993b.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            r5b.c[] cVarArrValues = r5b.c.values();
            int length = cVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cVar = null;
                    break;
                }
                cVar = cVarArrValues[i];
                if (a0.z(cVar.name(), upperCase, true)) {
                    break;
                }
                i++;
            }
            r5b.b bVar = cVar != null ? new r5b.b(rVar.f294992a, cVar) : null;
            if (bVar != null) {
                arrayList2.add(bVar);
            }
        }
        return new r5b.a(str, arrayList, arrayList2, md7.a.a(uVar.d));
    }
}
