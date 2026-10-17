package unj;

import aw0.o9;
import aw0.u0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.impl.R$plurals;
import com.revolut.retail.feature.esim.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    public e(ynj.e commonUiBuilder) {
        Intrinsics.checkNotNullParameter(commonUiBuilder, "commonUiBuilder");
    }

    public final CellDetailsDelegate.Model a(Clause clause, EsimCoverage esimCoverage) {
        return new CellDetailsDelegate.Model("COVERAGE_ITEM", new TextLocalisedClause(R$string.esim_checkout_coverage_title, null, null, 14), clause, 0, esimCoverage, null, j2.H6, u0.LARGE, ynj.e.f(esimCoverage, ynj.c.NOT_BORDERED), false, 0, 0, 32040);
    }

    public final CellDetailsDelegate.Model b(EsimCoverage coverage) {
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        if (coverage instanceof EsimCoverage.Country) {
            EsimCoverage.Country country = (EsimCoverage.Country) coverage;
            String str = country.f100205b;
            CellDetailsDelegate.Model modelA = a(str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new CountryClause(country.f100204a, null), country);
            Intrinsics.checkNotNullParameter(modelA, "<this>");
            return CellDetailsDelegate.Model.e(modelA, null, null, false, 67106815);
        }
        if (coverage instanceof EsimCoverage.Regional) {
            EsimCoverage.Regional regional = (EsimCoverage.Regional) coverage;
            String str2 = regional.f100210c;
            return str2 != null ? a(new TextClause(str2, (Style) new Click(30, (Integer) null, (Object) null, "coverageClauseId", false), (Integer) null, false, (o9) null, (List) null, 124), regional) : a(new CompositeClause(v.k(ynj.e.l(regional.f100209b), new TextLocalisedQuantityClause(R$plurals.esim_data_plans_number_of_countries, Integer.valueOf(regional.f100208a.size()), (List) null, (Style) null, 28)), new DotDividerClause((Integer) null), new Click(30, (Integer) null, (Object) null, "coverageClauseId", false), null, 8), regional);
        }
        if (coverage instanceof EsimCoverage.Global) {
            EsimCoverage.Global global = (EsimCoverage.Global) coverage;
            String str3 = global.f100207b;
            return str3 != null ? a(new TextClause(str3, (Style) new Click(30, (Integer) null, (Object) null, "coverageClauseId", false), (Integer) null, false, (o9) null, (List) null, 124), global) : a(new CompositeClause(v.k(new TextLocalisedClause(R$string.esim_checkout_coverage_global, null, null, 14), new TextLocalisedQuantityClause(R$plurals.esim_data_plans_number_of_countries, Integer.valueOf(global.f100206a.size()), (List) null, (Style) null, 28)), new DotDividerClause((Integer) null), new Click(30, (Integer) null, (Object) null, "coverageClauseId", false), null, 8), global);
        }
        if (coverage instanceof EsimCoverage.Undefined) {
            throw new IllegalStateException("Undefined coverage, unable to build coverage item");
        }
        throw new NoWhenBranchMatchedException();
    }
}
