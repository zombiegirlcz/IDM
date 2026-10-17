package wnh;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a MOST_BOUGHT;
    public static final a MOST_SOLD;
    public static final a MOST_TRADED;

    static {
        a aVar = new a("MOST_TRADED", 0);
        MOST_TRADED = aVar;
        a aVar2 = new a("MOST_BOUGHT", 1);
        MOST_BOUGHT = aVar2;
        a aVar3 = new a("MOST_SOLD", 2);
        MOST_SOLD = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
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
