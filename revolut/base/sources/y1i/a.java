package y1i;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a IDLE;
    public static final a PRICE_CLOSE;
    public static final a PRICE_SHOULD_BE_HIGHER;
    public static final a PRICE_SHOULD_BE_LOWER;

    static {
        a aVar = new a("PRICE_CLOSE", 0);
        PRICE_CLOSE = aVar;
        a aVar2 = new a("PRICE_SHOULD_BE_LOWER", 1);
        PRICE_SHOULD_BE_LOWER = aVar2;
        a aVar3 = new a("PRICE_SHOULD_BE_HIGHER", 2);
        PRICE_SHOULD_BE_HIGHER = aVar3;
        a aVar4 = new a("IDLE", 3);
        IDLE = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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
