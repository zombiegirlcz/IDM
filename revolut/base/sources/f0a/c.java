package f0a;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transfer.core.R$string;
import hx7.q;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import wl3.u;
import yji.n;
import zhm.v;
import zz9.s;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f131068l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f131069m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y21.c f131070n;
    public final u o;

    public c(b eligibilityDialogMapper, j60.a bottomExpandableDialog, y21.c optOutRepository, u revolutContactPaymentsSettingsInteractor) {
        Intrinsics.checkNotNullParameter(eligibilityDialogMapper, "eligibilityDialogMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(optOutRepository, "optOutRepository");
        Intrinsics.checkNotNullParameter(revolutContactPaymentsSettingsInteractor, "revolutContactPaymentsSettingsInteractor");
        this.f131068l = eligibilityDialogMapper;
        this.f131069m = bottomExpandableDialog;
        this.f131070n = optOutRepository;
        this.o = revolutContactPaymentsSettingsInteractor;
    }

    public final void Z2(s messagingEligibility, zm3.a contact) {
        TextLocalisedClause textLocalisedClause;
        List listK;
        Intrinsics.checkNotNullParameter(messagingEligibility, "eligibity");
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f131068l.getClass();
        Intrinsics.checkNotNullParameter(messagingEligibility, "messagingEligibility");
        Intrinsics.checkNotNullParameter(contact, "contact");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.payments_chat_messaging_eligibility_unsupported_title, null, null, 14);
        int[] iArr = a.f131067a;
        switch (iArr[messagingEligibility.ordinal()]) {
            case 1:
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.payments.social.impl.R$string.social_payments_chat_profile_privacy_messaging_messaging_with_friends_disclaimer_user_blocked_subtitle, null, null, 14);
                break;
            case 2:
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.payments.social.impl.R$string.social_payments_chat_profile_privacy_messaging_messaging_with_friends_disclaimer_privacy_subtitle, null, null, 14);
                break;
            case 3:
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.payments.social.impl.R$string.social_payments_chat_profile_privacy_messaging_messaging_with_friends_disclaimer_contact_subtitle, zhm.u.c(q.v(contact)), null, 12);
                break;
            case 4:
            case 5:
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.payments.social.impl.R$string.social_payments_chat_profile_privacy_messaging_messaging_with_friends_disclaimer_disabled_description, null, null, 14);
                break;
            case 6:
            case 7:
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.payments.social.impl.R$string.payments_chat_messaging_eligibility_unsupported_description, null, null, 14);
                break;
            case 8:
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.payments.social.impl.R$string.payments_chat_messaging_eligibility_sheet_description_blocked_by_many_users, null, null, 14);
                break;
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(("The dialog can't be shown for this state, " + messagingEligibility).toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (iArr[messagingEligibility.ordinal()]) {
            case 1:
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.payments.social.impl.R$string.social_payments_chat_profile_privacy_messaging_messaging_with_friends_disclaimer_action_unblock, null, null, 14);
                int i = R$attr.uikit_dp24;
                int i2 = R$attr.uikit_dp16;
                listK = v.k(new LargeActionButtonDelegate.Model("ACTION_SHOW_DISABLED_INPUT_VIEW_DISCLAIMER_ACTION_UNBLOCK_ID", defaultFilledButton, null, textLocalisedClause3, false, null, null, i, i2, i2, i2, 496), b.a(LargeActionButton.ButtonStyle.f58726b, R$attr.uikit_dp0));
                break;
            case 2:
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58725a;
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.payments.social.impl.R$string.social_payments_chat_profile_privacy_messaging_messaging_with_friends_disclaimer_action_turn_on_messaging, null, null, 14);
                int i3 = R$attr.uikit_dp24;
                int i5 = R$attr.uikit_dp16;
                listK = v.k(new LargeActionButtonDelegate.Model("ACTION_SHOW_DISABLED_INPUT_VIEW_DISCLAIMER_ACTION_TURN_ON_GLOBAL_ID", defaultFilledButton2, null, textLocalisedClause4, false, null, null, i3, i5, i5, i5, 496), b.a(LargeActionButton.ButtonStyle.f58726b, R$attr.uikit_dp0));
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                listK = zhm.u.c(b.a(LargeActionButton.ButtonStyle.f58725a, R$attr.uikit_dp24));
                break;
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(("The dialog can't be shown for this state, " + messagingEligibility).toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f131069m.x(new y(listK, new t(textLocalisedClause2, textLocalisedClause, null, 28), null, null, null, null, 1020));
    }
}
