package tya;

import android.os.Parcelable;
import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInvitesRewardInfo;
import com.revolut.feature.referrals.common.data.api.domain.model.common.MaxRewardInfo;
import com.revolut.feature.shared.referrals.ui.impl.R$plurals;
import com.revolut.feature.shared.referrals.ui.impl.R$string;
import ip0.pb0;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import pwa.n;
import yp0.e0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cya.i f275534a;

    public c(cya.i separateDeadlineSubtitleProvider) {
        Intrinsics.checkNotNullParameter(separateDeadlineSubtitleProvider, "separateDeadlineSubtitleProvider");
        this.f275534a = separateDeadlineSubtitleProvider;
    }

    public static FullScreenStateDelegate.Model b(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        return new FullScreenStateDelegate.Model(listId, new TextLocalisedClause(R$string.referrals_error_generic, null, null, 14), null, null, new l6(12, new TextLocalisedClause(R$string.referrals_invites_list_load_failed_link, null, null, 14), null, h4.ACCENT), null, false, null, null, null, 1892);
    }

    public static aim.e c(boolean z, boolean z3) {
        boolean z4 = (z || z3) ? false : true;
        boolean z6 = z || z4;
        boolean z11 = z3 || z4;
        aim.e eVarB = u.b();
        if (z6) {
            eVarB.addAll(yp0.b.i(new pb0("loading_item_".concat("0")), i(R$string.referrals_invites_list_title_active, "active"), e0.OUTSIDE_BOX, 0, 0, 124));
        }
        if (z11) {
            eVarB.addAll(yp0.b.i(new pb0("loading_item_".concat("1")), i(R$string.referrals_invites_list_title_past, "past"), e0.OUTSIDE_BOX, 0, 0, 124));
        }
        return u.a(eVarB);
    }

    public static List d(ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo, MaxRewardInfo maxRewardInfo, n referralCampaignV4Type) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        Clause moneyClause;
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        if (activeOrPastInvitesRewardInfo == null) {
            return f0.f322471a;
        }
        dj0.d dVar = activeOrPastInvitesRewardInfo.f81708a;
        xi0.b bVar = activeOrPastInvitesRewardInfo.f81709b;
        CounterTextDelegate.Model model = null;
        if (bVar != null || referralCampaignV4Type != n.CRYPTO_INTERNAL) {
            if (maxRewardInfo != null && maxRewardInfo.f81744b && referralCampaignV4Type == n.CRYPTO_INTERNAL) {
                textLocalisedClause = new TextLocalisedClause(R$string.referrals_invites_list_max_earned_title, null, null, 14);
                textLocalisedClause3 = new TextLocalisedClause(R$string.referrals_invites_list_max_earned_subtitle, u.c(Integer.valueOf(maxRewardInfo.f81743a)), null, 12);
            } else {
                if (maxRewardInfo != null && maxRewardInfo.f81744b) {
                    textLocalisedClause = new TextLocalisedClause(R$string.referrals_invites_list_earned_title, null, null, 14);
                    textLocalisedClause2 = new TextLocalisedClause(R$string.referrals_invites_list_header_max_reward_subtitle, null, null, 14);
                } else if (referralCampaignV4Type == n.CRYPTO_INTERNAL) {
                    textLocalisedClause = new TextLocalisedClause(R$string.referrals_invites_list_earned_title, null, null, 14);
                    textLocalisedClause2 = new TextLocalisedClause(R$string.referrals_invites_list_crypto_earned_subtitle, null, null, 14);
                } else {
                    textLocalisedClause = new TextLocalisedClause(R$string.referrals_invites_list_earned_title, null, null, 14);
                    textLocalisedClause2 = new TextLocalisedClause(R$string.referrals_invites_list_earned_subtitle, null, null, 14);
                }
                textLocalisedClause3 = textLocalisedClause2;
            }
            TextLocalisedClause textLocalisedClause4 = textLocalisedClause;
            if (referralCampaignV4Type == n.CRYPTO_INTERNAL) {
                int i = R$string.referrals_invites_earned_of;
                MoneyClause moneyClause2 = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
                Intrinsics.h(bVar);
                moneyClause = new TextLocalisedClause(i, v.k(moneyClause2, bVar.f306286a), null, 12);
            } else {
                moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
            }
            CounterTextDelegate.Model model2 = new CounterTextDelegate.Model("REWARD_EARNED_LIST_ID", textLocalisedClause4, new t4(moneyClause), textLocalisedClause3, false, null, null, 0, 0, 0, 0, 2032);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            model = model2;
        }
        return v.l(model);
    }

    public static RowDelegate.Model.c.b f(n referralCampaignV4Type, ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo, pwa.b inviteStatus, boolean z) {
        Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
        Intrinsics.checkNotNullParameter(inviteStatus, "inviteStatus");
        if (activeOrPastInvitesRewardInfo == null) {
            return null;
        }
        dj0.d dVar = activeOrPastInvitesRewardInfo.f81708a;
        if (z) {
            int i = b.f275532a[inviteStatus.ordinal()];
            return new RowDelegate.Model.c.b(new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), new Custom(Integer.valueOf((i == 1 || i == 2) ? R$attr.uikit_colorForeground : R$attr.uikit_colorStatusSuccess), false, null, false, null, 254), o9.NON_SENSITIVE), null, null, false, 126);
        }
        if (inviteStatus != pwa.b.REDEEMED) {
            return null;
        }
        if (b.f275533b[referralCampaignV4Type.ordinal()] != 1) {
            return new RowDelegate.Model.c.b(new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorStatusSuccess), false, null, false, null, 254), o9.NON_SENSITIVE), null, null, false, 126);
        }
        xi0.b bVar = activeOrPastInvitesRewardInfo.f81709b;
        if (bVar == null) {
            return null;
        }
        return new RowDelegate.Model.c.b(new TextLocalisedClause(R$string.referrals_invites_earned_of, v.k(new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, o9.NON_SENSITIVE, 4), bVar.f306286a), new Custom(Integer.valueOf(R$attr.uikit_colorStatusSuccess), false, null, false, null, 254), 8), null, null, false, 126);
    }

    public static ArrayList g() {
        boolean z = false;
        boolean z3 = false;
        return yp0.b.g(v.k(new RowDelegate.Model("LEARN_MORE_ITEM_ID_steps", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_questionnaire, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), new TextLocalisedClause(R$string.referrals_quick_help_all_invitees_learn_more_steps_info_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.referrals_quick_help_all_invitees_learn_more_steps_info_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("LEARN_MORE_ITEM_ID_deadline", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_calendar_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, 6), new TextLocalisedClause(R$string.referrals_quick_help_all_invitees_learn_more_deadline_info_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.referrals_quick_help_all_invitees_learn_more_deadline_info_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)), j(new TextLocalisedClause(R$string.referrals_quick_help_all_invitees_learn_more_title, null, null, 14)), e0.OUTSIDE_BOX, 0, 0, 124);
    }

    public static ListSubheaderDelegate.Model i(int i, String suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return new ListSubheaderDelegate.Model("LIST_SUB_HEADER_LIST_ID_".concat(suffix), (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static ListSubheaderDelegate.Model j(Clause header) {
        Intrinsics.checkNotNullParameter(header, "header");
        return new ListSubheaderDelegate.Model("HEADER_ITEM_ID", (Image) null, header, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public final Clause a(TextLocalisedClause initialText, Instant deadline, pwa.b inviteStatus, d type) {
        Intrinsics.checkNotNullParameter(initialText, "initialText");
        Intrinsics.checkNotNullParameter(inviteStatus, "inviteStatus");
        Intrinsics.checkNotNullParameter(type, "type");
        if (inviteStatus == pwa.b.ACTIVE && type == d.RECENT_UI_TYPE && deadline != null) {
            cya.j jVar = (cya.j) this.f275534a;
            jVar.getClass();
            Intrinsics.checkNotNullParameter(deadline, "deadline");
            Intrinsics.checkNotNullParameter(initialText, "initialText");
            Duration durationBetween = Duration.between(((l80.f) jVar.f110074a).b(), deadline);
            TextLocalisedQuantityClause textLocalisedQuantityClause = durationBetween.toMillis() <= 0 ? null : durationBetween.toMinutes() < 60 ? new TextLocalisedQuantityClause(R$plurals.referrals_invite_campaign_minutes_left, Integer.valueOf((int) durationBetween.toMinutes()), u.c(Integer.valueOf((int) durationBetween.toMinutes())), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8) : durationBetween.toHours() < 24 ? new TextLocalisedQuantityClause(R$plurals.referrals_invite_campaign_hours_left, Integer.valueOf((int) durationBetween.toHours()), u.c(Integer.valueOf((int) durationBetween.toHours())), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8) : new TextLocalisedQuantityClause(R$plurals.referrals_invite_campaign_days_left, Integer.valueOf((int) durationBetween.toDays()), u.c(Integer.valueOf((int) durationBetween.toDays())), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
            if (textLocalisedQuantityClause != null) {
                return new CompositeClause(v.k(initialText, textLocalisedQuantityClause), new DotDividerClause((Integer) null), null, null, 12);
            }
        }
        return initialText;
    }

    public final Clause e(pwa.b inviteStatus, Instant instant, d type, pwa.f fVar, ActiveOrPastInvitesRewardInfo activeOrPastInvitesRewardInfo, boolean z) {
        Intrinsics.checkNotNullParameter(inviteStatus, "inviteStatus");
        Intrinsics.checkNotNullParameter(type, "type");
        if (!z) {
            return h(inviteStatus, instant, type);
        }
        switch (b.f275532a[inviteStatus.ordinal()]) {
            case 1:
            case 2:
                return fVar != null ? a(new TextLocalisedClause(R$string.referrals_invite_status_completed_steps, v.k(Integer.valueOf(fVar.f240357b), Integer.valueOf(fVar.f240356a)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), instant, inviteStatus, type) : h(inviteStatus, instant, type);
            case 3:
                return new TextLocalisedClause(R$string.referrals_invite_status_ineligible, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return activeOrPastInvitesRewardInfo != null ? new TextLocalisedClause(R$string.referrals_invite_status_redeemed, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusSuccess), false, null, false, null, 254), 10) : h(inviteStatus, instant, type);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Clause h(pwa.b inviteStatus, Instant instant, d type) {
        Pair pair;
        Intrinsics.checkNotNullParameter(inviteStatus, "inviteStatus");
        Intrinsics.checkNotNullParameter(type, "type");
        switch (b.f275532a[inviteStatus.ordinal()]) {
            case 1:
                pair = new Pair(Integer.valueOf(R$string.referrals_invite_status_active), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254));
                break;
            case 2:
                pair = new Pair(Integer.valueOf(R$string.referrals_invite_status_verifying), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254));
                break;
            case 3:
                pair = new Pair(Integer.valueOf(R$string.referrals_invite_status_ineligible), new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254));
                break;
            case 4:
                pair = new Pair(Integer.valueOf(R$string.referrals_invite_status_redeemed), new Custom(Integer.valueOf(R$attr.uikit_colorStatusSuccess), false, null, false, null, 254));
                break;
            case 5:
                pair = new Pair(Integer.valueOf(R$string.referrals_invite_status_reward_available), new Custom(Integer.valueOf(R$attr.uikit_colorStatusSuccess), false, null, false, null, 254));
                break;
            case 6:
            case 8:
                pair = new Pair(null, null);
                break;
            case 7:
                pair = new Pair(Integer.valueOf(R$string.referrals_invite_status_expired), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Integer num = (Integer) pair.f186385a;
        Custom custom = (Custom) pair.f186386b;
        if (num != null) {
            return a(new TextLocalisedClause(num.intValue(), null, custom, 10), instant, inviteStatus, type);
        }
        return null;
    }
}
