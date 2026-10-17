package zph;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c AFRICA;
    public static final c ASIA_PACIFIC;
    public static final c EUROPE;
    public static final c MIDDLE_EAST;
    public static final c NORTH_AMERICA;
    public static final c OTHER;
    public static final c SOUTH_AMERICA;

    static {
        c cVar = new c("NORTH_AMERICA", 0);
        NORTH_AMERICA = cVar;
        c cVar2 = new c("EUROPE", 1);
        EUROPE = cVar2;
        c cVar3 = new c("ASIA_PACIFIC", 2);
        ASIA_PACIFIC = cVar3;
        c cVar4 = new c("MIDDLE_EAST", 3);
        MIDDLE_EAST = cVar4;
        c cVar5 = new c("SOUTH_AMERICA", 4);
        SOUTH_AMERICA = cVar5;
        c cVar6 = new c("AFRICA", 5);
        AFRICA = cVar6;
        c cVar7 = new c("OTHER", 6);
        OTHER = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
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
