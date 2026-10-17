package t6i;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BALANCE_BASED;
    public static final a EXCHANGE_RATE_BASED;
    public static final a SCHEDULING;

    static {
        a aVar = new a("SCHEDULING", 0);
        SCHEDULING = aVar;
        a aVar2 = new a("BALANCE_BASED", 1);
        BALANCE_BASED = aVar2;
        a aVar3 = new a("EXCHANGE_RATE_BASED", 2);
        EXCHANGE_RATE_BASED = aVar3;
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
