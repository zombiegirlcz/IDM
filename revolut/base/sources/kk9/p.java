package kk9;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p CancelledAndWithdrawal;
    public static final p Healthy;
    public static final p Outstanding;
    public static final p Overdue;

    static {
        p pVar = new p("Healthy", 0);
        Healthy = pVar;
        p pVar2 = new p("Outstanding", 1);
        Outstanding = pVar2;
        p pVar3 = new p("Overdue", 2);
        Overdue = pVar3;
        p pVar4 = new p("CancelledAndWithdrawal", 3);
        CancelledAndWithdrawal = pVar4;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4};
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
