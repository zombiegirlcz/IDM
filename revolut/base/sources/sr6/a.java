package sr6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FIRST_DAY_OF_CURRENT_MONTH;
    public static final a FIRST_DAY_OF_NEXT_MONTH;
    public static final a TODAY;

    static {
        a aVar = new a("TODAY", 0);
        TODAY = aVar;
        a aVar2 = new a("FIRST_DAY_OF_CURRENT_MONTH", 1);
        FIRST_DAY_OF_CURRENT_MONTH = aVar2;
        a aVar3 = new a("FIRST_DAY_OF_NEXT_MONTH", 2);
        FIRST_DAY_OF_NEXT_MONTH = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
