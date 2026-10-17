package dmd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a NEGATIVE_SURPLUS_TREND;
    public static final a POSITIVE_SURPLUS_TREND;

    static {
        a aVar = new a("POSITIVE_SURPLUS_TREND", 0);
        POSITIVE_SURPLUS_TREND = aVar;
        a aVar2 = new a("NEGATIVE_SURPLUS_TREND", 1);
        NEGATIVE_SURPLUS_TREND = aVar2;
        a[] aVarArr = {aVar, aVar2};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
