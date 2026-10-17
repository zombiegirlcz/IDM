package grk;

import drk.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jrk.g0;
import jrk.j0;
import kotlin.Pair;
import le.u1;
import uqk.g;
import uqk.h;
import uqk.i;
import uqk.j;
import uqk.k;
import uqk.l;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f146055a = r0.k(new Pair("INCOME_STATEMENT", l.INCOME_STATEMENT), new Pair("BALANCE_SHEET", l.BALANCE_SHEET), new Pair("CASH_FLOWS", l.CASH_FLOWS));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f146056b = r0.k(new Pair("HEADING", h.HEADING), new Pair("REGULAR", h.REGULAR), new Pair("UNKNOWN", h.UNKNOWN));

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final f a(g gVar) {
        String str = gVar.f282213a;
        String str2 = gVar.f282214b;
        String strG = u1.g(gVar.f282215c, f146056b);
        k kVar = gVar.d;
        drk.g gVar2 = null;
        if (kVar != null) {
            i iVar = kVar instanceof i ? (i) kVar : null;
            jo3.b bVarA = iVar != null ? hx7.a.A(iVar.f282216a) : null;
            j jVar = kVar instanceof j ? (j) kVar : null;
            gVar2 = new drk.g(bVarA, jVar != null ? Long.valueOf(jVar.f282217a) : null);
        }
        ArrayList arrayList = gVar.e;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(a((g) it8.next()));
        }
        return new f(str, str2, strG, gVar2, arrayList2);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final g b(f fVar) {
        String str = fVar.f117166a;
        String str2 = fVar.f117167b;
        h hVar = (h) u1.t(fVar.f117168c, h.UNKNOWN, f146056b);
        drk.g gVar = fVar.d;
        k jVar = null;
        if (gVar != null) {
            jo3.b bVar = gVar.f117169a;
            if (bVar != null) {
                jVar = new i(hx7.a.v(bVar));
            } else {
                Long l2 = gVar.f117170b;
                if (l2 != null) {
                    jVar = new j(l2.longValue());
                }
            }
        }
        ArrayList arrayList = fVar.e;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(b((f) it8.next()));
        }
        return new g(str, str2, hVar, jVar, arrayList2);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final g c(g0 g0Var) {
        String str = g0Var.f178054a;
        String str2 = g0Var.f178055b;
        h hVar = (h) u1.t(g0Var.f178056c, h.UNKNOWN, f146056b);
        j0 j0Var = g0Var.d;
        k jVar = null;
        if (j0Var != null) {
            jo3.a aVar = j0Var.f178063b;
            if (aVar != null) {
                jVar = new i(mo3.a.o(aVar));
            } else {
                Long l2 = j0Var.f178064c;
                if (l2 != null) {
                    jVar = new j(l2.longValue());
                }
            }
        }
        List list = g0Var.e;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(c((g0) it8.next()));
        }
        return new g(str, str2, hVar, jVar, arrayList);
    }
}
