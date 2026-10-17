package jjk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import hha.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {
    public static TextLocalisedClause a(hha.d plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        return s.j(plan) ? new TextLocalisedClause(R$string.dashboard_upgrade_info_terms_and_conditions_metal, null, null, 14) : new TextLocalisedClause(R$string.dashboard_upgrade_info_terms_and_conditions_premium, null, null, 14);
    }
}
