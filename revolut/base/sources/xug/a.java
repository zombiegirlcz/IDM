package xug;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a OPEN_POSITIONS;
    public static final a OPEN_POSITIONS_AND_UPCOMING_DIVIDENDS;
    public static final a UPCOMING_DIVIDENDS;

    static {
        a aVar = new a("UPCOMING_DIVIDENDS", 0);
        UPCOMING_DIVIDENDS = aVar;
        a aVar2 = new a("OPEN_POSITIONS", 1);
        OPEN_POSITIONS = aVar2;
        a aVar3 = new a("OPEN_POSITIONS_AND_UPCOMING_DIVIDENDS", 2);
        OPEN_POSITIONS_AND_UPCOMING_DIVIDENDS = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
