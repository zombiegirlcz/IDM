package puj;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CUSTOM;
    public static final c EXPERIENCE;
    public static final c FLIGHT;
    public static final c STAY;
    public static final c UNKNOWN;

    static {
        c cVar = new c("FLIGHT", 0);
        FLIGHT = cVar;
        c cVar2 = new c("EXPERIENCE", 1);
        EXPERIENCE = cVar2;
        c cVar3 = new c("STAY", 2);
        STAY = cVar3;
        c cVar4 = new c("CUSTOM", 3);
        CUSTOM = cVar4;
        c cVar5 = new c("UNKNOWN", 4);
        UNKNOWN = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
