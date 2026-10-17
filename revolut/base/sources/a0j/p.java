package a0j;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class p implements s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p IMPROVE_YOUR_CHANCES;
    public static final p UNLOCK_BETTER_OFFERS;

    static {
        p pVar = new p("IMPROVE_YOUR_CHANCES", 0);
        IMPROVE_YOUR_CHANCES = pVar;
        p pVar2 = new p("UNLOCK_BETTER_OFFERS", 1);
        UNLOCK_BETTER_OFFERS = pVar2;
        p[] pVarArr = {pVar, pVar2};
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
