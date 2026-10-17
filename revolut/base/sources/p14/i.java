package p14;

import dx4.a1;
import dx4.y0;
import ht3.l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p14.b;
import xy3.a;
import xy3.l;
import xy3.m;
import xy3.n;
import xy3.o;
import xy3.p;
import xy3.q;
import xy3.r;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f231869a;

    public i(j stepMapper) {
        Intrinsics.checkNotNullParameter(stepMapper, "stepMapper");
        this.f231869a = stepMapper;
    }

    public final xy3.b a(b.C1272b dto) {
        a.b rVar;
        q pVar;
        a.b nVar;
        Object jVar;
        Intrinsics.checkNotNullParameter(dto, "dto");
        b.c dto2 = dto.getStep();
        Intrinsics.checkNotNullParameter(dto2, "dto");
        if (dto2 instanceof b.c.a) {
            b.c.a aVar = (b.c.a) dto2;
            String strC = aVar.getId();
            b.c.a.C1274b c1274bB = aVar.getConfirmation();
            xy3.d dVar = new xy3.d(c1274bB.getTitle(), c1274bB.getPrimaryButtonText(), c1274bB.getSecondaryButtonText());
            b.c.a.C1273a c1273aA = aVar.getChange();
            nVar = new xy3.e(strC, dVar, new xy3.c(c1273aA.getTitle(), c1273aA.getSecondDescription(), c1273aA.getPrimaryButtonText()));
        } else if (dto2 instanceof b.c.C1276c) {
            b.c.C1276c c1276c = (b.c.C1276c) dto2;
            String strC2 = c1276c.getId();
            String strF = c1276c.getTitle();
            String strE = c1276c.getSecondDescription();
            String strD = c1276c.getInputLabel();
            xi0.a aVar2 = xi0.b.Companion;
            String strB = c1276c.getCurrency();
            aVar2.getClass();
            nVar = new xy3.h(strC2, strF, strE, strD, xi0.a.a(strB), c1276c.getButtonText());
        } else {
            if (dto2 instanceof b.c.C1275b) {
                b.c.C1275b c1275b = (b.c.C1275b) dto2;
                String strB2 = c1275b.getId();
                String strE2 = c1275b.getTitle();
                String strD2 = c1275b.getSecondDescription();
                List<b.c.C1275b.a> listC = c1275b.getLoans();
                ArrayList arrayList = new ArrayList(w.t(listC, 10));
                for (b.c.C1275b.a aVar3 : listC) {
                    String strC3 = aVar3.getId();
                    y0 y0Var = a1.Companion;
                    String strB3 = aVar3.getIcon();
                    y0Var.getClass();
                    arrayList.add(new xy3.f(strC3, y0.a(strB3), aVar3.getTitle(), aVar3.getDescription(), mo3.a.o(aVar3.getLeftToRepay())));
                }
                rVar = new xy3.g(strB2, strE2, strD2, arrayList, c1275b.getTotalToRefinanceLabel(), c1275b.getValueRequired(), c1275b.getButtonText());
            } else if (dto2 instanceof b.c.d) {
                b.c.d dVar2 = (b.c.d) dto2;
                String strC4 = dVar2.getId();
                l0 l0VarA = this.f231869a.f231870a.a(dVar2.getContent(), new p0g.b(2));
                HashMap map = new HashMap();
                Map mapA = dVar2.getActions();
                ArrayList arrayList2 = new ArrayList(mapA.size());
                for (Map.Entry entry : mapA.entrySet()) {
                    String str = (String) entry.getKey();
                    e eVar = (e) entry.getValue();
                    m mVar = new m(str);
                    if (eVar instanceof c) {
                        jVar = new xy3.i(((c) eVar).getValue());
                    } else {
                        if (!(eVar instanceof d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d dVar3 = (d) eVar;
                        jVar = new xy3.j(new l(dVar3.getTitle(), dVar3.getDescription(), dVar3.getPrimaryButtonText(), dVar3.getSecondaryButtonText()));
                    }
                    arrayList2.add(new Pair(mVar, jVar));
                }
                r0.r(map, arrayList2);
                Unit unit = Unit.f186387a;
                nVar = new n(strC4, l0VarA, map);
            } else {
                if (!(dto2 instanceof b.c.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                b.c.e eVar2 = (b.c.e) dto2;
                String strB4 = eVar2.getId();
                String strE3 = eVar2.getTitle();
                String strA = eVar2.getDescription();
                String strD3 = eVar2.getSecondDescription();
                List<h> listC2 = eVar2.getItems();
                ArrayList arrayList3 = new ArrayList(w.t(listC2, 10));
                for (h hVar : listC2) {
                    if (hVar instanceof f) {
                        f fVar = (f) hVar;
                        String strC5 = fVar.getId();
                        y0 y0Var2 = a1.Companion;
                        String strB5 = fVar.getIcon();
                        y0Var2.getClass();
                        pVar = new o(y0.a(strB5), strC5, fVar.getTitle(), fVar.getDescription());
                    } else {
                        if (!(hVar instanceof g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        g gVar = (g) hVar;
                        pVar = new p(gVar.getId(), gVar.getTitle());
                    }
                    arrayList3.add(pVar);
                }
                rVar = new r(strB4, strE3, strA, strD3, arrayList3);
            }
            nVar = rVar;
        }
        return new xy3.b(nVar);
    }
}
