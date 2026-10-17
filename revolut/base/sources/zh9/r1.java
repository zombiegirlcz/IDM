package zh9;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class r1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r1[] $VALUES;
    public static final r1 Cancelled;
    public static final r1 CancelledAndOutstanding;
    public static final r1 CancelledAndOverdue;
    public static final r1 CancelledAndWithdrawal;
    public static final r1 CancelledPendingClosure;
    public static final r1 Healthy;
    public static final r1 Outstanding;
    public static final r1 Overdue;
    public static final r1 TerminatedAndOverdue;
    public static final r1 TerminatedPendingClosure;

    static {
        r1 r1Var = new r1("Healthy", 0);
        Healthy = r1Var;
        r1 r1Var2 = new r1("Outstanding", 1);
        Outstanding = r1Var2;
        r1 r1Var3 = new r1("Overdue", 2);
        Overdue = r1Var3;
        r1 r1Var4 = new r1("Cancelled", 3);
        Cancelled = r1Var4;
        r1 r1Var5 = new r1("CancelledAndOutstanding", 4);
        CancelledAndOutstanding = r1Var5;
        r1 r1Var6 = new r1("CancelledAndWithdrawal", 5);
        CancelledAndWithdrawal = r1Var6;
        r1 r1Var7 = new r1("CancelledAndOverdue", 6);
        CancelledAndOverdue = r1Var7;
        r1 r1Var8 = new r1("CancelledPendingClosure", 7);
        CancelledPendingClosure = r1Var8;
        r1 r1Var9 = new r1("TerminatedAndOverdue", 8);
        TerminatedAndOverdue = r1Var9;
        r1 r1Var10 = new r1("TerminatedPendingClosure", 9);
        TerminatedPendingClosure = r1Var10;
        r1[] r1VarArr = {r1Var, r1Var2, r1Var3, r1Var4, r1Var5, r1Var6, r1Var7, r1Var8, r1Var9, r1Var10};
        $VALUES = r1VarArr;
        $ENTRIES = vc.s.n(r1VarArr);
    }

    public static r1 valueOf(String str) {
        return (r1) Enum.valueOf(r1.class, str);
    }

    public static r1[] values() {
        return (r1[]) $VALUES.clone();
    }
}
