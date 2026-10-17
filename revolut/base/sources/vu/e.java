package vu;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e business_referrals_active_campaign_header_subtitle;
    public static final e business_referrals_active_campaign_reward_section_cell_subtitle;
    public static final e business_referrals_invitee_details_no_reward_counter_subtitle;

    static {
        e eVar = new e("business_referrals_invitee_details_no_reward_counter_subtitle", 0);
        business_referrals_invitee_details_no_reward_counter_subtitle = eVar;
        e eVar2 = new e("business_referrals_active_campaign_header_subtitle", 1);
        business_referrals_active_campaign_header_subtitle = eVar2;
        e eVar3 = new e("business_referrals_active_campaign_reward_section_cell_subtitle", 2);
        business_referrals_active_campaign_reward_section_cell_subtitle = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
