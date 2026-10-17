package zca;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.retail.common.ui.R$string;
import io3.d;
import ip0.tm0;
import ip0.um0;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public final y a(d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        long j2 = pocket.i;
        String str = pocket.f163147c;
        if (j2 == 0) {
            String str2 = null;
            int i = 56;
            AnimatedResourceImage animatedResourceImage = null;
            boolean z = false;
            String str3 = null;
            return new y(u.c(new um0("hide_pocket_options", new tm0(LargeActionButton.ButtonStyle.f58726b, animatedResourceImage, new TextLocalisedClause(R$string.common_action_cancel, null, null, 14), z, str3, str2, i), new tm0(LargeActionButton.ButtonStyle.f58725a, animatedResourceImage, new TextLocalisedClause(R$string.common_action_yes, null, null, 14), z, str3, str2, i), (Object) pocket, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new t(new TextLocalisedClause(com.revolut.feature.pocket_actions.common.R$string.revolut_accounts_change_pocket_state_warning_hide_title, u.c(str), null, 12), new TextLocalisedClause(com.revolut.feature.pocket_actions.common.R$string.revolut_accounts_change_pocket_state_warning_hide_description, null, null, 14), null, 28), null, null, null, null, "POCKET_ACTIONS_DIALOG", null, null, null, 3836);
        }
        String str4 = null;
        int i2 = 56;
        AnimatedResourceImage animatedResourceImage2 = null;
        boolean z3 = false;
        String str5 = null;
        return new y(u.c(new um0("deactivate_pocket_options", new tm0(LargeActionButton.ButtonStyle.f58726b, animatedResourceImage2, new TextLocalisedClause(R$string.common_action_cancel, null, null, 14), z3, str5, str4, i2), new tm0(LargeActionButton.ButtonStyle.f58725a, animatedResourceImage2, new TextLocalisedClause(R$string.common_action_yes, null, null, 14), z3, str5, str4, i2), (Object) pocket, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new t(new TextLocalisedClause(com.revolut.feature.pocket_actions.common.R$string.revolut_accounts_change_pocket_state_warning_deactivate_title, u.c(str), null, 12), new TextLocalisedClause(com.revolut.feature.pocket_actions.common.R$string.revolut_accounts_change_pocket_state_warning_deactivate_description, null, null, 14), null, 28), null, null, null, null, "POCKET_ACTIONS_DIALOG", null, null, null, 3836);
    }
}
