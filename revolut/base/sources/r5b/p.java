package r5b;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p DOWNGRADE_PLAN;
    public static final p FREEZE_CARD;
    public static final p NONE;
    public static final p SCHEDULE_CARD_TERMINATION;
    public static final p TERMINATE_CARD;

    static {
        p pVar = new p("NONE", 0);
        NONE = pVar;
        p pVar2 = new p("FREEZE_CARD", 1);
        FREEZE_CARD = pVar2;
        p pVar3 = new p("TERMINATE_CARD", 2);
        TERMINATE_CARD = pVar3;
        p pVar4 = new p("SCHEDULE_CARD_TERMINATION", 3);
        SCHEDULE_CARD_TERMINATION = pVar4;
        p pVar5 = new p("DOWNGRADE_PLAN", 4);
        DOWNGRADE_PLAN = pVar5;
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
