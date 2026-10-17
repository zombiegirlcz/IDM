package sei;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AVAILABLE;
    public static final a PRICE_CHANGED;
    public static final a UNAVAILABLE;

    static {
        a aVar = new a("AVAILABLE", 0);
        AVAILABLE = aVar;
        a aVar2 = new a("PRICE_CHANGED", 1);
        PRICE_CHANGED = aVar2;
        a aVar3 = new a("UNAVAILABLE", 2);
        UNAVAILABLE = aVar3;
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
