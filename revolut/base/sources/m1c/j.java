package m1c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j CALENDAR;
    public static final j CASHBACK;
    public static final j DISCOUNT;
    public static final j LOYALTY;
    public static final j LOYALTY_BOOSTED;

    static {
        j jVar = new j("LOYALTY", 0);
        LOYALTY = jVar;
        j jVar2 = new j("LOYALTY_BOOSTED", 1);
        LOYALTY_BOOSTED = jVar2;
        j jVar3 = new j("CASHBACK", 2);
        CASHBACK = jVar3;
        j jVar4 = new j("DISCOUNT", 3);
        DISCOUNT = jVar4;
        j jVar5 = new j("CALENDAR", 4);
        CALENDAR = jVar5;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
