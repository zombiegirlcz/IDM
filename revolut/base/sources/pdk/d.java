package pdk;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.internal.views.timer.TimerViewLabels;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.plan_rewards.impl.R$string;
import ip0.gd;
import ip0.id;
import koi.j;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements Function2 {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static j a(long j2, boolean z) {
        if (!z) {
            return new id("LIST_ID_COUNT_DOWN_TIMER", new TextLocalisedClause(R$string.premium_plan_reward_list_reveal_in, null, null, 14), new gd(j2), ev0.c.UP_TO_DAYS, new TimerViewLabels(new TextLocalisedClause(R$string.premium_plan_reward_list_countdown_days_label, null, null, 14), new TextLocalisedClause(R$string.premium_plan_reward_list_countdown_hours_label, null, null, 14), new TextLocalisedClause(R$string.premium_plan_reward_list_countdown_minutes_label, null, null, 14), new TextLocalisedClause(R$string.premium_plan_reward_list_countdown_seconds_label, null, null, 14)));
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.premium_plan_reward_list_reveal, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        int i = R$attr.uikit_dp16;
        return new LargeActionButtonDelegate.Model("LIST_ID_REVEAL_BUTTON", defaultFilledButton, null, textLocalisedClause, false, null, null, i, R$attr.uikit_dp32, i, i, 496);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        return a(((Number) obj3).longValue(), ((Boolean) obj2).booleanValue());
    }
}
