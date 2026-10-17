package rcf;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a RETAIL_POCKET;
    public static final a TRADING_GIA_CBP;
    public static final a TRADING_POCKET;

    static {
        a aVar = new a("TRADING_GIA_CBP", 0);
        TRADING_GIA_CBP = aVar;
        a aVar2 = new a("TRADING_POCKET", 1);
        TRADING_POCKET = aVar2;
        a aVar3 = new a("RETAIL_POCKET", 2);
        RETAIL_POCKET = aVar3;
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
