package n5j;

import com.revolut.retail.feature.business.referrals.shared.impl.R$plurals;
import com.revolut.retail.feature.business.referrals.shared.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements vu.g {
    public final int a(vu.e resourceId) {
        Intrinsics.checkNotNullParameter(resourceId, "resourceId");
        int i = a.f212614b[resourceId.ordinal()];
        if (i == 1) {
            return R$plurals.business_referrals_invitee_details_no_reward_counter_subtitle;
        }
        if (i == 2) {
            return R$plurals.business_referrals_active_campaign_header_subtitle;
        }
        if (i == 3) {
            return R$plurals.business_referrals_active_campaign_reward_section_cell_subtitle;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int b(vu.f resourceId) {
        Intrinsics.checkNotNullParameter(resourceId, "resourceId");
        switch (a.f212613a[resourceId.ordinal()]) {
            case 1:
                return R$string.referrals_actions_item;
            case 2:
                return R$string.business_referrals_active_campaign_active_invitees_section_empty_cell_title;
            case 3:
                return R$string.business_referrals_active_campaign_active_invitees_section_empty_cell_subtitle;
            case 4:
                return R$string.business_referrals_active_campaign_active_invitees_cell_status_in_progress;
            case 5:
                return R$string.business_referrals_active_campaign_active_invitees_cell_status_processing;
            case 6:
                return R$string.business_referrals_active_campaign_inactive_invitees_cell_status_deadline_missed;
            case 7:
                return R$string.business_referrals_active_campaign_active_invitees_cell_status_completed;
            case 8:
                return R$string.business_referrals_active_campaign_inactive_invitees_cell_status_not_eligible;
            case 9:
                return R$string.business_referrals_active_campaign_referral_account_action;
            case 10:
                return R$string.business_referrals_referral_account_personal;
            case 11:
                return R$string.business_referrals_referral_account_business;
            case 12:
                return R$string.business_referrals_active_campaign_steps_not_eligible_see_criteria;
            case 13:
                return R$string.business_referrals_active_campaign_steps_not_eligible_review_criteria;
            case 14:
                return R$string.business_referrals_invitee_benefits_section_send_request_money_title;
            case 15:
                return R$string.business_referrals_invitee_benefits_section_send_request_money_subtitle;
            case 16:
                return R$string.business_referrals_invitee_benefits_section_more_title;
            case 17:
                return R$string.business_referrals_invitee_benefits_section_more_subtitle;
            case 18:
                return R$string.business_referrals_eligibility_criteria_prompt_title;
            case 19:
                return R$string.business_referrals_eligibility_criteria_prompt_action;
            case 20:
                return R$string.business_referrals_invite_contacts_no_permission_prompt_title;
            case 21:
                return R$string.business_referrals_invite_contacts_no_permission_prompt_subtitle;
            case 22:
                return R$string.business_referrals_invite_contacts_no_permission_prompt_action;
            case 23:
                return R$string.business_referrals_invite_contacts_invite_sent;
            case 24:
                return R$string.business_referrals_invite_contacts_title;
            case 25:
                return R$string.referrals_invite_screen;
            case 26:
                return R$string.business_referrals_invite_contacts_text;
            case 27:
                return R$string.business_referrals_invite_contacts_no_permission_widget_title;
            case 28:
                return R$string.business_referrals_invite_contacts_no_permission_widget_subtitle;
            case 29:
                return R$string.business_referrals_invite_contacts_no_permission_widget_action;
            case 30:
                return R$string.business_referrals_campaign_widget_button;
            case 31:
                return R$string.business_referrals_contacts_list_empty;
            case 32:
                return R$string.business_referrals_invite_contacts_copy_link;
            case 33:
                return R$string.business_referrals_invite_contacts_whatsapp;
            case 34:
                return R$string.business_referrals_invite_contacts_messenger;
            case 35:
                return R$string.business_referrals_invite_contacts_more;
            case 36:
                return R$string.referrals_actions_share;
            case 37:
                return R$string.business_referrals_referral_account_title;
            case 38:
                return R$string.business_referrals_referral_account_search_hint;
            case 39:
                return R$string.referrals_select_retail_account_success;
            case 40:
                return R$string.referrals_select_retail_account_refer_a_business;
            case 41:
                return R$string.referrals_select_retail_account_error;
            case 42:
                return R$string.referrals_select_retail_account_try_again;
            case 43:
                return R$string.business_referrals_referral_account_sign_up_action;
            case 44:
                return R$string.business_referrals_referral_account_sign_up_title;
            case 45:
                return R$string.business_referrals_referral_account_send_to_business_title;
            case 46:
                return R$string.business_referrals_referral_account_recent_title;
            case 47:
                return R$string.business_referrals_referral_account_search_title;
            case 48:
                return R$string.referrals_select_retail_account_no_results_title;
            case 49:
                return R$string.referrals_select_retail_account_no_results_subtitle;
            case 50:
                return R$string.referrals_select_retail_account_no_results_clear;
            case 51:
                return R$string.business_referrals_invitees_active_title;
            case 52:
                return R$string.business_referrals_invitees_past_title;
            case 53:
                return R$string.referrals_active_screen;
            case 54:
                return R$string.referrals_past_screen;
            case 55:
                return R$string.business_referrals_invitees_reward_counter_title;
            case 56:
                return R$string.business_referrals_invitees_reward_counter_subtitle;
            case 57:
                return R$string.business_referrals_invitee_loading_counter_title;
            case 58:
                return R$string.business_referrals_invitee_loading_counter_subtitle;
            case 59:
                return R$string.business_referrals_invitee_details_in_progress_counter_title;
            case 60:
                return R$string.business_referrals_invitee_details_processing_counter_title;
            case 61:
                return R$string.business_referrals_invitee_details_processing_counter_subtitle;
            case 62:
                return R$string.business_referrals_invitee_details_expired_counter_title;
            case 63:
                return R$string.business_referrals_invitee_details_expired_counter_subtitle;
            case 64:
                return R$string.business_referrals_invitee_details_no_reward_counter_title;
            case 65:
                return R$string.business_referrals_invitee_details_completed_counter_title;
            case 66:
                return R$string.business_referrals_invitee_details_completed_counter_subtitle;
            case 67:
                return R$string.business_referrals_invitee_details_not_eligible_counter_title;
            case 68:
                return R$string.business_referrals_invitee_details_not_eligible_counter_subtitle;
            case 69:
                return R$string.business_referrals_invitee_completed_steps_section_title;
            case 70:
                return R$string.business_referrals_invitee_benefits_section_title;
            case 71:
                return R$string.business_referrals_active_campaign_active_invitees_section_title;
            case 72:
                return R$string.business_referrals_active_campaign_active_invitees_section_empty_title;
            case 73:
                return R$string.referrals_actions_refer_business;
            case 74:
                return R$string.referrals_screen;
            case 75:
                return R$string.business_referrals_c2b_business_navigation_invite_button;
            case 76:
                return R$string.business_referrals_active_campaign_header_no_reward_title;
            case 77:
                return R$string.business_referrals_active_campaign_invited_cell_title;
            case 78:
                return R$string.business_referrals_active_campaign_invited_cell_rewarded_title;
            case 79:
                return R$string.business_referrals_active_campaign_inactive_invitees_empty_cell_title;
            case 80:
                return R$string.business_referrals_c2b_explore_section;
            case 81:
                return R$string.business_referrals_active_campaign_reward_section_cell_title;
            case 82:
                return R$string.business_referrals_active_campaign_reward_section_title;
            case 83:
                return R$string.business_referrals_active_campaign_referral_account_title;
            case 84:
                return R$string.business_referrals_active_campaign_terms_and_conditions_disclaimer;
            case 85:
                return R$string.business_referrals_active_campaign_terms_and_conditions_button;
            case 86:
                return R$string.business_referrals_active_campaign_add_account_banner;
            case 87:
                return R$string.business_referrals_active_campaign_add_account_banner_description;
            case 88:
                return R$string.business_referrals_active_campaign_add_account_banner_action;
            case 89:
                return R$string.referrals_select_retail_account_invalid_revtag;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
