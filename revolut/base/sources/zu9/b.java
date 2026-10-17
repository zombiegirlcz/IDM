package zu9;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.messaging.common.api.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements iu9.a {
    public final y a(iu9.c validationState) {
        Pair pair;
        Intrinsics.checkNotNullParameter(validationState, "validationState");
        int i = a.f325420a[validationState.ordinal()];
        if (i == 1) {
            pair = new Pair(new TextLocalisedClause(R$string.social_payments_chat_profile_privacy_messaging_url_prohibited_disclaimer_title, null, null, 14), new TextLocalisedClause(R$string.social_payments_chat_profile_privacy_messaging_url_prohibited_disclaimer_subtitle, null, null, 14));
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Valid state shouldn't be used for showing disclaimer");
            }
            pair = new Pair(new TextLocalisedClause(R$string.social_payments_chat_profile_privacy_messaging_url_prohibited_disclaimer_title, null, null, 14), new TextLocalisedClause(R$string.payments_chat_length_restriction_description, null, null, 14));
        }
        TextLocalisedClause textLocalisedClause = (TextLocalisedClause) pair.f186385a;
        TextLocalisedClause textLocalisedClause2 = (TextLocalisedClause) pair.f186386b;
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.social_payments_chat_profile_privacy_messaging_messaging_with_friends_disclaimer_action_ok, null, null, 14);
        int i2 = R$attr.uikit_dp24;
        int i3 = R$attr.uikit_dp16;
        return new y(u.c(new LargeActionButtonDelegate.Model("MESSAGING_BOTTOM_DIALOG_ACTION_OK", defaultFilledButton, null, textLocalisedClause3, false, null, null, i2, i2, i3, i3, 496)), new t(textLocalisedClause, textLocalisedClause2, null, 28), null, null, null, null, 1020);
    }
}
