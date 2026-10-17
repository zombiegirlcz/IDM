package mgh;

import aw0.o9;
import aw0.p9;
import aw0.t3;
import aw0.u3;
import aw0.w3;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.private_equity.impl.R$string;
import d9.e1;
import java.math.BigDecimal;
import java.util.List;
import jel.q0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vfh.a f205287a;

    public l(vfh.a commonMapper) {
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        this.f205287a = commonMapper;
    }

    public static w3 a(BigDecimal bigDecimal) {
        return new w3(e1.Z(bigDecimal).longValue(), e1.G(bigDecimal) ? u3.f10555a : e1.C(bigDecimal) ? t3.f10540a : null);
    }

    public static CompositeClause b(BigDecimal bigDecimal, q0 q0Var) {
        int i;
        int i2 = k.f205285a[q0Var.ordinal()];
        if (i2 == 1) {
            i = R$string.wealth_private_equity_fund_details_performance_details_scenarios_favourable;
        } else if (i2 == 2) {
            i = R$string.wealth_private_equity_fund_details_performance_details_scenarios_moderate;
        } else if (i2 == 3) {
            i = R$string.wealth_private_equity_fund_details_performance_details_scenarios_unfavourable;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_private_equity_fund_details_performance_details_scenarios_stress;
        }
        return yoj.b.m(new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new PercentageClause(e1.Z(bigDecimal), new PercentageClause.Format.Custom(1, 10, p9.ALWAYS, null, null), new Custom(Integer.valueOf(e1.G(bigDecimal) ? R$attr.uikit_colorPerformancePositive : e1.C(bigDecimal) ? R$attr.uikit_colorPerformanceNegative : R$attr.uikit_colorGreyTone50), false, null, false, null, 254))));
    }
}
