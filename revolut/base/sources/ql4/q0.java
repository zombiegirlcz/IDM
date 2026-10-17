package ql4;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class q0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q0[] $VALUES;

    @NotNull
    public static final p0 Companion;
    public static final q0 DEBIT_POST_PURCHASE_PLAN;
    public static final q0 INTEREST_FREE;
    public static final q0 POST_PURCHASE;
    public static final q0 PRE_PURCHASE;
    public static final q0 STATEMENT_DEFERRAL;
    public static final q0 UNSUPPORTED;

    static {
        q0 q0Var = new q0("POST_PURCHASE", 0);
        POST_PURCHASE = q0Var;
        q0 q0Var2 = new q0("DEBIT_POST_PURCHASE_PLAN", 1);
        DEBIT_POST_PURCHASE_PLAN = q0Var2;
        q0 q0Var3 = new q0("PRE_PURCHASE", 2);
        PRE_PURCHASE = q0Var3;
        q0 q0Var4 = new q0("STATEMENT_DEFERRAL", 3);
        STATEMENT_DEFERRAL = q0Var4;
        q0 q0Var5 = new q0("INTEREST_FREE", 4);
        INTEREST_FREE = q0Var5;
        q0 q0Var6 = new q0("UNSUPPORTED", 5);
        UNSUPPORTED = q0Var6;
        q0[] q0VarArr = {q0Var, q0Var2, q0Var3, q0Var4, q0Var5, q0Var6};
        $VALUES = q0VarArr;
        $ENTRIES = vc.s.n(q0VarArr);
        Companion = new p0();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) $VALUES.clone();
    }
}
