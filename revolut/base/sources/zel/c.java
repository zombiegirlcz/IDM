package zel;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c MOST_BOUGHT;
    public static final c MOST_SOLD;
    public static final c MOST_TRADED;

    static {
        c cVar = new c("MOST_TRADED", 0);
        MOST_TRADED = cVar;
        c cVar2 = new c("MOST_BOUGHT", 1);
        MOST_BOUGHT = cVar2;
        c cVar3 = new c("MOST_SOLD", 2);
        MOST_SOLD = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
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
