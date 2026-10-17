package hnd;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import fmd.f;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qf1.d;
import qf1.h;
import qf1.j;
import qf1.k;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements pf1.a {
    @Override // pf1.a
    public final k a(d dVar) {
        f item = (f) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new k(R$drawable.uikit_icn_24_split, new TextLocalisedClause(R$string.analytics_add_new_income_sorter_title, null, null, 14), new TextLocalisedClause(R$string.analytics_add_new_income_sorter_subtitle, null, null, 14), null, null, null, 56);
    }

    @Override // pf1.a
    public final /* bridge */ List b(d dVar) {
        return super.b((f) dVar);
    }

    @Override // pf1.a
    public final j c(d dVar) {
        f item = (f) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.f136375b instanceof fmd.d) {
            return new h(u0.c(AnalyticsFeatureConfig.IncomeSortersList.f87417h));
        }
        throw new NoWhenBranchMatchedException();
    }
}
