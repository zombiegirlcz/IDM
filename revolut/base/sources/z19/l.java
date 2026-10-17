package z19;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l HIGHEST_EARNING_DATE;
    public static final l MOST_COMMON_DAY_FOR_EARNING;
    public static final l POINTS_EARNED;
    public static final l POINTS_REDEEMED;
    public static final l REDEEM_RECOMMENDATION;
    public static final l STREAK_DAYS;
    public static final l STREAK_WEEKS;
    public static final l TOP_EARNING_PRODUCT;
    public static final l TRY_THIS_PRODUCT;
    public static final l UNKNOWN;
    public static final l WEEKEND_EARNING;

    static {
        l lVar = new l("POINTS_EARNED", 0);
        POINTS_EARNED = lVar;
        l lVar2 = new l("POINTS_REDEEMED", 1);
        POINTS_REDEEMED = lVar2;
        l lVar3 = new l("TOP_EARNING_PRODUCT", 2);
        TOP_EARNING_PRODUCT = lVar3;
        l lVar4 = new l("WEEKEND_EARNING", 3);
        WEEKEND_EARNING = lVar4;
        l lVar5 = new l("STREAK_WEEKS", 4);
        STREAK_WEEKS = lVar5;
        l lVar6 = new l("STREAK_DAYS", 5);
        STREAK_DAYS = lVar6;
        l lVar7 = new l("HIGHEST_EARNING_DATE", 6);
        HIGHEST_EARNING_DATE = lVar7;
        l lVar8 = new l("MOST_COMMON_DAY_FOR_EARNING", 7);
        MOST_COMMON_DAY_FOR_EARNING = lVar8;
        l lVar9 = new l("REDEEM_RECOMMENDATION", 8);
        REDEEM_RECOMMENDATION = lVar9;
        l lVar10 = new l("TRY_THIS_PRODUCT", 9);
        TRY_THIS_PRODUCT = lVar10;
        l lVar11 = new l("UNKNOWN", 10);
        UNKNOWN = lVar11;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11};
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
