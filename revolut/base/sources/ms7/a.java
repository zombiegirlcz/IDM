package ms7;

import es7.b;
import es7.e;
import es7.f;
import es7.g;
import es7.i;
import es7.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rd0.d;
import ts7.c;
import ts7.h;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final c a(f fVar) {
        ArrayList arrayList;
        List list;
        h hVar;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String str = fVar.f128884a;
        String str2 = fVar.f128885b;
        e eVar = fVar.f128886c;
        ts7.a aVar = null;
        if (eVar == null || (list = eVar.f128882a) == null) {
            arrayList = null;
        } else {
            List<g> list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            for (g gVar : list2) {
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                List<l> list3 = gVar.f128888a;
                ArrayList arrayList2 = new ArrayList();
                for (l lVar : list3) {
                    Intrinsics.checkNotNullParameter(lVar, "<this>");
                    try {
                        String str3 = lVar.f128899a;
                        String str4 = lVar.f128900b;
                        String str5 = lVar.f128901c;
                        String str6 = lVar.d;
                        i iVar = lVar.e;
                        ts7.g gVarA = iVar != null ? b.a(iVar) : null;
                        if (gVarA == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        hVar = new h(str3, str4, str5, str6, gVarA);
                    } catch (Exception e) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                        d.a(rd0.c.ERROR, null, null, e, h0Var);
                        hVar = null;
                    }
                    if (hVar != null) {
                        arrayList2.add(hVar);
                    }
                }
                arrayList.add(new ts7.i(arrayList2));
            }
        }
        es7.b bVar = fVar.d;
        if (bVar != null) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            if (bVar instanceof b.C0748b) {
                aVar = new ts7.a(((b.C0748b) bVar).f128878b);
            } else if (!(bVar instanceof b.c)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new c(str, str2, arrayList, aVar, fVar.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    public static final f b(c cVar) {
        ?? arrayList;
        l lVar;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String str = cVar.f274042a;
        String str2 = cVar.f274043b;
        List list = cVar.f274044c;
        b.C0748b c0748b = null;
        if (list != null) {
            List<ts7.i> list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            for (ts7.i iVar : list2) {
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                ArrayList<h> arrayList2 = iVar.f274051a;
                ArrayList arrayList3 = new ArrayList();
                for (h hVar : arrayList2) {
                    Intrinsics.checkNotNullParameter(hVar, "<this>");
                    try {
                        lVar = new l(hVar.f274048a, hVar.f274049b, hVar.f274050c, hVar.d, b.b(hVar.e));
                    } catch (Exception e) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                        d.a(rd0.c.ERROR, null, null, e, h0Var);
                        lVar = null;
                    }
                    if (lVar != null) {
                        arrayList3.add(lVar);
                    }
                }
                arrayList.add(new g(arrayList3));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        e eVar = new e(arrayList);
        ts7.b bVar = cVar.d;
        if (bVar != null) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            if (!(bVar instanceof ts7.a)) {
                throw new NoWhenBranchMatchedException();
            }
            c0748b = new b.C0748b(((ts7.a) bVar).f274041a);
        }
        return new f(str, str2, eVar, c0748b, cVar.e);
    }
}
