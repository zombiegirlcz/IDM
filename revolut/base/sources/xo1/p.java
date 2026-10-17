package xo1;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p BIWEEKLY;
    public static final p DAILY;
    public static final p MONTHLY;
    public static final p WEEKLY;
    public static final p YEARLY;

    static {
        p pVar = new p("DAILY", 0);
        DAILY = pVar;
        p pVar2 = new p("WEEKLY", 1);
        WEEKLY = pVar2;
        p pVar3 = new p("BIWEEKLY", 2);
        BIWEEKLY = pVar3;
        p pVar4 = new p("MONTHLY", 3);
        MONTHLY = pVar4;
        p pVar5 = new p("YEARLY", 4);
        YEARLY = pVar5;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5};
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
