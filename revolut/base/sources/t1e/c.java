package t1e;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CALENDAR;
    public static final c CASHBACK;
    public static final c DISCOUNT;
    public static final c LOYALTY;
    public static final c LOYALTY_BOOSTED;
    public static final c UNKNOWN;

    static {
        c cVar = new c("LOYALTY", 0);
        LOYALTY = cVar;
        c cVar2 = new c("LOYALTY_BOOSTED", 1);
        LOYALTY_BOOSTED = cVar2;
        c cVar3 = new c("CASHBACK", 2);
        CASHBACK = cVar3;
        c cVar4 = new c("DISCOUNT", 3);
        DISCOUNT = cVar4;
        c cVar5 = new c("CALENDAR", 4);
        CALENDAR = cVar5;
        c cVar6 = new c("UNKNOWN", 5);
        UNKNOWN = cVar6;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
        $VALUES = cVarArr;
        $ENTRIES = vc.s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
