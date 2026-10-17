package bti;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p ALLOWED;
    public static final p ALTERNATIVE_BOOKING;
    public static final p NOT_ALLOWED;

    static {
        p pVar = new p("ALLOWED", 0);
        ALLOWED = pVar;
        p pVar2 = new p("NOT_ALLOWED", 1);
        NOT_ALLOWED = pVar2;
        p pVar3 = new p("ALTERNATIVE_BOOKING", 2);
        ALTERNATIVE_BOOKING = pVar3;
        p[] pVarArr = {pVar, pVar2, pVar3};
        $VALUES = pVarArr;
        $ENTRIES = s.n(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
