package weg;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.ActionsView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ms0.e4;
import zfi.r;
import zfi.v;
import zfi.w;
import zfi.x;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final peg.a f296784a;

    public i(meg.i filtersUIMapper, peg.a appliedFiltersMapper) {
        Intrinsics.checkNotNullParameter(filtersUIMapper, "filtersUIMapper");
        Intrinsics.checkNotNullParameter(appliedFiltersMapper, "appliedFiltersMapper");
        this.f296784a = appliedFiltersMapper;
    }

    public static ActionsView.Item a(String str, Clause clause, meg.g gVar, e4 e4Var) {
        return new ActionsView.Item(j6.a.q("APPLIED_FILTER_", str), mx0.d.ON_MEDIA_STATIC, false, e4Var, null, clause, null, null, null, null, false, null, null, gVar, null, 24468);
    }

    public final ActionsView.Item b(zfi.b bVar, x xVar, zfi.a aVar, e4 e4Var) {
        zfi.n nVar;
        zfi.n nVar2;
        if (bVar instanceof zfi.g) {
            zfi.g gVar = (zfi.g) bVar;
            if (!s.t(aVar, gVar)) {
                return a(gVar.f321967a, new TextClause(gVar.f321968b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), meg.i.a(false, gVar), e4Var);
            }
        } else if (bVar instanceof zfi.j) {
            v vVar = xVar instanceof v ? (v) xVar : null;
            if (vVar != null && (nVar2 = vVar.f322003a) != null) {
                zfi.j jVar = (zfi.j) bVar;
                if (!s.u(aVar, jVar, nVar2)) {
                    return a(a0.d.r(jVar.f321975a, nVar2.f321982a), new TextClause(nVar2.f321983b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), meg.i.c(false, jVar, nVar2), e4Var);
                }
            }
        } else if (bVar instanceof r) {
            v vVar2 = xVar instanceof v ? (v) xVar : null;
            if (vVar2 != null && (nVar = vVar2.f322003a) != null) {
                r rVar = (r) bVar;
                if (!s.v(aVar, nVar, rVar)) {
                    return a(a0.d.r(rVar.f321994a, nVar.f321982a), new TextClause(nVar.f321983b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), meg.i.g(rVar, nVar), e4Var);
                }
            }
        } else {
            if (!(bVar instanceof zfi.o)) {
                throw new NoWhenBranchMatchedException();
            }
            w wVar = xVar instanceof w ? (w) xVar : null;
            if (wVar != null) {
                dj0.d dVar = wVar.f322005b;
                dj0.d dVar2 = wVar.f322004a;
                zfi.o oVar = (zfi.o) bVar;
                String str = oVar.f321985a;
                boolean zW = s.w(aVar, oVar, dVar2, dVar);
                if (!zW) {
                    zfi.q qVar = new zfi.q(oVar.f321987c, dVar2, dVar);
                    return a(str, meg.i.d(qVar), meg.i.e(str, zW, qVar), e4Var);
                }
            }
        }
        return null;
    }
}
