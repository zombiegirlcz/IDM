package u2f;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j HOTEL_LOYALTY_TRANSFERS;
    public static final j MILES;
    public static final j TRAINS_POINTS;
    public static final j UNKNOWN;

    static {
        j jVar = new j("MILES", 0);
        MILES = jVar;
        j jVar2 = new j("HOTEL_LOYALTY_TRANSFERS", 1);
        HOTEL_LOYALTY_TRANSFERS = jVar2;
        j jVar3 = new j("TRAINS_POINTS", 2);
        TRAINS_POINTS = jVar3;
        j jVar4 = new j("UNKNOWN", 3);
        UNKNOWN = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
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
