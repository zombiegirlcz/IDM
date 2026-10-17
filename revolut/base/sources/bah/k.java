package bah;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.impl.R$string;
import com.revolut.shared.feature.wealth.models.config.Links;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import z0h.f1;
import z0h.m1;
import z0h.n1;
import z0h.x;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements pzg.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TextClause f14085a;

    public static final class a {
        private a() {
        }
    }

    static {
        t0 t0Var = t0.f186434a;
        f14085a = new TextClause(a0.d.r(m70.a.o(t0Var), m70.a.o(t0Var)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static CompositeClause c(Links links) {
        return new CompositeClause(v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_private_markets_eea_target_returns, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_services_are_provided_by_revolut, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_car_text, v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_car_link, null, new Click(28, (Integer) null, (Object) new n1(links.d), "SECURITIES_CAR", false), 10), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_eea_stock_trading_disclosures_link, null, new Click(28, (Integer) null, (Object) m1.f318535a, "SECURITIES_DISCLOSURES", false), 10)), null, 12)), f14085a, null, null, 12);
    }

    @Override // pzg.a
    public final Clause a(f1 disclaimer) throws Throwable {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        x xVar = (x) disclaimer;
        if (xVar == null) {
            throw new NoWhenBranchMatchedException();
        }
        Links links = xVar.f318573a;
        hel.b bVar = xVar.f318574b;
        int i = l.f14086a[bVar.ordinal()];
        if (i == 1) {
            return new CompositeClause(v.k(new TextLocalisedClause(R$string.wealth_footer_disclosure_private_markets_gb_chart_data, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_securities_gb_services_are_provided_by_revolut, null, null, 14), new TextLocalisedClause(R$string.wealth_footer_disclosure_gb_read_our_disclosure, u.c(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealthcore_footer_disclosure_general_uk_services_provided_by_revolut_link, null, new Click(28, (Integer) null, (Object) m1.f318535a, "SECURITIES_DISCLOSURES", false), 10)), null, 12)), f14085a, null, null, 12);
        }
        if (i == 2) {
            return c(links);
        }
        hx7.e.n(new IllegalStateException("Unsupported context " + bVar));
        return c(links);
    }

    @Override // pzg.a
    public final boolean b(f1 disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        return disclaimer instanceof x;
    }
}
