package lha;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l ALREADY_PART_OF_FAMILY;
    public static final l APP_VERSION_NOT_SUPPORTED;
    public static final l DIFFERENT_MARKETS;
    public static final l FORBIDDEN;
    public static final l KYC_NOT_PASSED;
    public static final l PLAN_PRIVACY_CONFLICT;
    public static final l REQUIRES_HIGHER_TIER_PLAN;

    static {
        l lVar = new l("KYC_NOT_PASSED", 0);
        KYC_NOT_PASSED = lVar;
        l lVar2 = new l("DIFFERENT_MARKETS", 1);
        DIFFERENT_MARKETS = lVar2;
        l lVar3 = new l("PLAN_PRIVACY_CONFLICT", 2);
        PLAN_PRIVACY_CONFLICT = lVar3;
        l lVar4 = new l("REQUIRES_HIGHER_TIER_PLAN", 3);
        REQUIRES_HIGHER_TIER_PLAN = lVar4;
        l lVar5 = new l("ALREADY_PART_OF_FAMILY", 4);
        ALREADY_PART_OF_FAMILY = lVar5;
        l lVar6 = new l("APP_VERSION_NOT_SUPPORTED", 5);
        APP_VERSION_NOT_SUPPORTED = lVar6;
        l lVar7 = new l("FORBIDDEN", 6);
        FORBIDDEN = lVar7;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
