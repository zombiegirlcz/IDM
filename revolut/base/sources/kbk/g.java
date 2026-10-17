package kbk;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g IDENTITY_NOT_ACTIVE;
    public static final g KYC_NOT_PASSED;
    public static final g NOT_TRUSTED_CONTACT;
    public static final g PENDING_GIFT_ALREADY_EXISTS;
    public static final g PRICING_PLAN_GIFTING_DISABLED;
    public static final g PRICING_PLAN_REVEALING_DISABLED;
    public static final g TOO_MANY_PRICING_PLAN_GIFTS_EXIST;

    static {
        g gVar = new g("KYC_NOT_PASSED", 0);
        KYC_NOT_PASSED = gVar;
        g gVar2 = new g("IDENTITY_NOT_ACTIVE", 1);
        IDENTITY_NOT_ACTIVE = gVar2;
        g gVar3 = new g("PRICING_PLAN_REVEALING_DISABLED", 2);
        PRICING_PLAN_REVEALING_DISABLED = gVar3;
        g gVar4 = new g("NOT_TRUSTED_CONTACT", 3);
        NOT_TRUSTED_CONTACT = gVar4;
        g gVar5 = new g("PENDING_GIFT_ALREADY_EXISTS", 4);
        PENDING_GIFT_ALREADY_EXISTS = gVar5;
        g gVar6 = new g("TOO_MANY_PRICING_PLAN_GIFTS_EXIST", 5);
        TOO_MANY_PRICING_PLAN_GIFTS_EXIST = gVar6;
        g gVar7 = new g("PRICING_PLAN_GIFTING_DISABLED", 6);
        PRICING_PLAN_GIFTING_DISABLED = gVar7;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
