package dki;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c INTERCEPTED;
    public static final c POP_BACK_STACK;
    public static final c UNHANDLED;

    static {
        c cVar = new c("INTERCEPTED", 0);
        INTERCEPTED = cVar;
        c cVar2 = new c("POP_BACK_STACK", 1);
        POP_BACK_STACK = cVar2;
        c cVar3 = new c("UNHANDLED", 2);
        UNHANDLED = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
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
