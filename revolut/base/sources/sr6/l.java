package sr6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l DAY;
    public static final l MONTH;
    public static final l WEEK;
    public static final l YEAR;

    static {
        l lVar = new l("DAY", 0);
        DAY = lVar;
        l lVar2 = new l("WEEK", 1);
        WEEK = lVar2;
        l lVar3 = new l("MONTH", 2);
        MONTH = lVar3;
        l lVar4 = new l("YEAR", 3);
        YEAR = lVar4;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
