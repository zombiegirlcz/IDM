package vi9;

import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_later.api.R$string;
import ip0.y10;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zh9.j1;

/* JADX INFO: loaded from: classes5.dex */
public final class i {
    public final sa a(h93.f0 card, j1 state) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(state, "state");
        if (card.S()) {
            if (card.D()) {
                return new sa("PAY_LATER_CARD_DEACTIVATED_NOTIFICATION", (Clause) new TextLocalisedClause(R$string.pay_later_card_deactivated_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.pay_later_card_deactivated_description, null, null, 14), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4040);
            }
            if (card.Z()) {
                return new sa("PAY_LATER_CARD_SUSPENDED_NOTIFICATION", (Clause) new TextLocalisedClause(R$string.card_action_pay_later_card_suspended_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.card_action_pay_later_card_suspended_description, null, null, 14), zhm.u.c(new ActionsView.Item("PAY_LATER_CARD_SUSPENDED_NOTIFICATION_REPAY_ACTION", null, false, null, null, new TextLocalisedClause(R$string.pay_later_switch_warning_repay_balance, null, null, 14), null, null, null, null, false, null, null, null, null, 32670)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4032);
            }
            if (card.w() && card.A == null) {
                return new sa("HOW_TO_USE_PAY_LATER_CARD_NOTIFICATION", (Clause) new TextLocalisedClause(R$string.card_action_pay_later_card_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.card_action_pay_later_card_description, null, null, 14), zhm.u.c(new ActionsView.Item("HOW_TO_USE_PAY_LATER_CARD_NOTIFICATION_ACTION", null, false, null, null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_learn_more, null, null, 14), null, null, null, null, false, null, null, null, null, 32670)), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4032);
            }
        }
        return null;
    }
}
