package f0a;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.messaging.common.api.R$string;

/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static LargeActionButtonDelegate.Model a(LargeActionButton.ButtonStyle buttonStyle, int i) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.social_payments_chat_profile_privacy_messaging_messaging_with_friends_disclaimer_action_ok, null, null, 14);
        int i2 = R$attr.uikit_dp24;
        int i3 = R$attr.uikit_dp16;
        return new LargeActionButtonDelegate.Model("MESSAGING_BOTTOM_DIALOG_ACTION_OK", buttonStyle, null, textLocalisedClause, false, null, null, i, i2, i3, i3, 496);
    }
}
