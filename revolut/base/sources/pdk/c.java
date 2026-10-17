package pdk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.plan_rewards.impl.R$string;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements Function1 {
    public static ldk.g a(String planName) {
        Intrinsics.checkNotNullParameter(planName, "planName");
        return new ldk.g(new TextLocalisedClause(R$string.premium_plan_reward_list_title, null, null, 14), new TextLocalisedClause(R$string.premium_plan_reward_list_header_subtitle, u.c(planName), null, 12));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        return a((String) obj2);
    }
}
