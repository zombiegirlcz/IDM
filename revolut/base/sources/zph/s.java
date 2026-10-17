package zph;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import ip0.r70;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nd.o f324312a;

    public s(nd.o rangeTitleMapper, u rangeValueExplainerMapper) {
        Intrinsics.checkNotNullParameter(rangeTitleMapper, "rangeTitleMapper");
        Intrinsics.checkNotNullParameter(rangeValueExplainerMapper, "rangeValueExplainerMapper");
        this.f324312a = rangeTitleMapper;
    }

    public final r70 a(soh.d filter, List unsavedFilters) {
        Object next;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(unsavedFilters, "unsavedFilters");
        Iterator it8 = unsavedFilters.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((ScreenerSelectedFilter) next).getF105167a() == filter.f264833a) {
                break;
            }
        }
        ScreenerSelectedFilter.Range range = next instanceof ScreenerSelectedFilter.Range ? (ScreenerSelectedFilter.Range) next : null;
        soh.i iVarA = (range == null || (bigDecimal2 = range.f105168b) == null) ? filter.d.f264836a : soh.i.a(filter.d.f264836a, bigDecimal2);
        soh.i iVarA2 = (range == null || (bigDecimal = range.f105169c) == null) ? filter.d.f264837b : soh.i.a(filter.d.f264837b, bigDecimal);
        soh.f fVar = filter.d;
        zel.g gVar = filter.f264833a;
        soh.i iVar = fVar.f264836a;
        soh.i iVar2 = fVar.f264837b;
        BigDecimal step = fVar.f264838c;
        soh.i iVar3 = Intrinsics.f(iVarA.f264839a, fVar.f264836a.f264839a) ? null : iVarA;
        soh.i iVar4 = Intrinsics.f(iVarA2.f264839a, iVar2.f264839a) ? null : iVarA2;
        Intrinsics.checkNotNullParameter(step, "step");
        if (iVar3 == null && iVar4 == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.screener_section_value_all, null, null, 14);
        } else if (iVar3 == null && iVar4 != null) {
            textLocalisedClause = new TextLocalisedClause(R$string.screener_section_value_min_opened, zhm.u.c(m.a(iVar4, step.scale())), null, 12);
        } else if (iVar3 != null && iVar4 == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.screener_section_value_max_opened, zhm.u.c(m.a(iVar3, step.scale())), null, 12);
        } else {
            if (iVar3 == null || iVar4 == null) {
                throw new IllegalStateException("Unreachable");
            }
            textLocalisedClause = new TextLocalisedClause(R$string.screener_section_value_range, v.k(m.a(iVar3, step.scale()), m.a(iVar4, step.scale())), null, 12);
        }
        TextLocalisedClause textLocalisedClause4 = textLocalisedClause;
        List explainers = filter.e;
        Intrinsics.checkNotNullParameter(explainers, "explainers");
        if ((iVar3 == null && iVar4 == null) || explainers.isEmpty()) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.screener_section_value_explainer_empty, null, null, 14);
        } else {
            int iA = iVar3 != null ? u.a(explainers, iVar3.f264839a) : ((Number) ((Pair) d0.b0(explainers)).f186386b).intValue();
            int iA2 = iVar4 != null ? u.a(explainers, iVar4.f264839a) : ((Number) ((Pair) d0.m0(explainers)).f186386b).intValue();
            if (iA != iA2) {
                textLocalisedClause3 = new TextLocalisedClause(R$string.screener_section_value_explainer_divider, v.k(new TextLocalisedClause(iA, null, null, 14), new TextLocalisedClause(iA2, null, null, 14)), null, 12);
                String str = "range_" + gVar;
                k kVar = k.START;
                nd.o oVar = this.f324312a;
                return new r70(str, textLocalisedClause4, textLocalisedClause3, oVar.f(iVar, kVar), oVar.f(iVar2, k.END), gc0.c.g(iVar, step), gc0.c.g(iVar2, step), gc0.c.g(iVarA, step), gc0.c.g(iVarA2, step), new yph.j(gVar, fVar));
            }
            textLocalisedClause2 = new TextLocalisedClause(iA, null, null, 14);
        }
        textLocalisedClause3 = textLocalisedClause2;
        String str2 = "range_" + gVar;
        k kVar2 = k.START;
        nd.o oVar2 = this.f324312a;
        return new r70(str2, textLocalisedClause4, textLocalisedClause3, oVar2.f(iVar, kVar2), oVar2.f(iVar2, k.END), gc0.c.g(iVar, step), gc0.c.g(iVar2, step), gc0.c.g(iVarA, step), gc0.c.g(iVarA2, step), new yph.j(gVar, fVar));
    }
}
