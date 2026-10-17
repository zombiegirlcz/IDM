package ba6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p CARD_ORDERED;
    public static final p LOCKED;
    public static final p UNKNOWN;
    public static final p UNLOCKED;

    static {
        p pVar = new p("LOCKED", 0);
        LOCKED = pVar;
        p pVar2 = new p("UNLOCKED", 1);
        UNLOCKED = pVar2;
        p pVar3 = new p("CARD_ORDERED", 2);
        CARD_ORDERED = pVar3;
        p pVar4 = new p("UNKNOWN", 3);
        UNKNOWN = pVar4;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4};
        $VALUES = pVarArr;
        $ENTRIES = vc.s.n(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
