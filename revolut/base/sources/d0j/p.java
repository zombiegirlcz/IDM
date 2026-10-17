package d0j;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p COMPLETED;
    public static final p EXPIRED;
    public static final p IN_PROGRESS;
    public static final p LOCKED;
    public static final p NOT_STARTED;

    static {
        p pVar = new p("NOT_STARTED", 0);
        NOT_STARTED = pVar;
        p pVar2 = new p("IN_PROGRESS", 1);
        IN_PROGRESS = pVar2;
        p pVar3 = new p("LOCKED", 2);
        LOCKED = pVar3;
        p pVar4 = new p("COMPLETED", 3);
        COMPLETED = pVar4;
        p pVar5 = new p("EXPIRED", 4);
        EXPIRED = pVar5;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5};
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
