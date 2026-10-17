package hij;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimGetPlanScreenContract$InputData f152617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gej.a f152618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ynj.e f152619c;
    public final i d;

    public k(EsimGetPlanScreenContract$InputData inputData, gej.a bytesFormatter, ynj.e commonUiBuilder, i highlightedFeaturesItemsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bytesFormatter, "bytesFormatter");
        Intrinsics.checkNotNullParameter(commonUiBuilder, "commonUiBuilder");
        Intrinsics.checkNotNullParameter(highlightedFeaturesItemsMapper, "highlightedFeaturesItemsMapper");
        this.f152617a = inputData;
        this.f152618b = bytesFormatter;
        this.f152619c = commonUiBuilder;
        this.d = highlightedFeaturesItemsMapper;
    }

    public static RowDelegate.Model.c.b a(EsimDataPlan esimDataPlan) {
        return new RowDelegate.Model.c.b(new MoneyClause(esimDataPlan.e, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), new TextLocalisedClause(R$string.esim_mobile_plans_plan_item_per_month, null, null, 14), null, false, 124);
    }

    public final Clause b(EsimDataPlan esimDataPlan) {
        if (esimDataPlan.f100217j) {
            return new TextLocalisedClause(R$string.esim_mobile_plans_plan_item_unlimited_gb_title, null, null, 14);
        }
        Long l2 = esimDataPlan.f100215g;
        if (l2 != null) {
            return gej.a.a(this.f152618b, l2.longValue(), null, 6);
        }
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
