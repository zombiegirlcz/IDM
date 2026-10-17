package x4b;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a implements c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a OUTSIDE_OF_AVAILABLE_RANGE;
    public static final a ZERO_VALUE;

    static {
        a aVar = new a("ZERO_VALUE", 0);
        ZERO_VALUE = aVar;
        a aVar2 = new a("OUTSIDE_OF_AVAILABLE_RANGE", 1);
        OUTSIDE_OF_AVAILABLE_RANGE = aVar2;
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
