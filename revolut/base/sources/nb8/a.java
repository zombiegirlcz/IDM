package nb8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a STANDING_ORDER_INSUFFICIENT_FUNDS;
    public static final a STANDING_ORDER_TOPUP_LIMIT_EXCEEDED;

    static {
        a aVar = new a("STANDING_ORDER_INSUFFICIENT_FUNDS", 0);
        STANDING_ORDER_INSUFFICIENT_FUNDS = aVar;
        a aVar2 = new a("STANDING_ORDER_TOPUP_LIMIT_EXCEEDED", 1);
        STANDING_ORDER_TOPUP_LIMIT_EXCEEDED = aVar2;
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
