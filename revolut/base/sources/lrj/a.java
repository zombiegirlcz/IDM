package lrj;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qf1.d;
import qf1.h;
import qf1.j;
import qf1.k;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements pf1.a {
    @Override // pf1.a
    public final k a(d dVar) {
        qzi.d item = (qzi.d) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new k(R$drawable.uikit_icn_24_pie_chart, new TextLocalisedClause(R$string.analytics_add_new_budget_title, null, null, 14), new TextLocalisedClause(R$string.analytics_add_new_budget_subtitle, null, null, 14), null, null, null, 56);
    }

    @Override // pf1.a
    public final /* bridge */ List b(d dVar) {
        return super.b((qzi.d) dVar);
    }

    @Override // pf1.a
    public final j c(d dVar) {
        qzi.d item = (qzi.d) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return new h(u0.c(new AnalyticsFeatureConfig.Budget(AccountId.Personal.f51414a, item.f250651b)));
    }
}
