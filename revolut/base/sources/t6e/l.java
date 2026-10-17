package t6e;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l BIWEEKLY;
    public static final l DAILY;
    public static final l EVERY_6_MONTH;
    public static final l MONTHLY;
    public static final l QUARTERLY;
    public static final l UNKNOWN;
    public static final l WEEKLY;
    public static final l YEARLY;
    private final int index;

    static {
        l lVar = new l("DAILY", 0, 0);
        DAILY = lVar;
        l lVar2 = new l("WEEKLY", 1, 1);
        WEEKLY = lVar2;
        l lVar3 = new l("BIWEEKLY", 2, 2);
        BIWEEKLY = lVar3;
        l lVar4 = new l("MONTHLY", 3, 3);
        MONTHLY = lVar4;
        l lVar5 = new l("QUARTERLY", 4, 4);
        QUARTERLY = lVar5;
        l lVar6 = new l("EVERY_6_MONTH", 5, 5);
        EVERY_6_MONTH = lVar6;
        l lVar7 = new l("YEARLY", 6, 6);
        YEARLY = lVar7;
        l lVar8 = new l("UNKNOWN", 7, -1);
        UNKNOWN = lVar8;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
    }

    public l(String str, int i, int i2) {
        this.index = i2;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    public final int a() {
        return this.index;
    }
}
