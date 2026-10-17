package jel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class q0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q0[] $VALUES;
    public static final q0 FAVOURABLE;
    public static final q0 MODERATE;
    public static final q0 STRESS;
    public static final q0 UNFAVOURABLE;

    static {
        q0 q0Var = new q0("FAVOURABLE", 0);
        FAVOURABLE = q0Var;
        q0 q0Var2 = new q0("MODERATE", 1);
        MODERATE = q0Var2;
        q0 q0Var3 = new q0("UNFAVOURABLE", 2);
        UNFAVOURABLE = q0Var3;
        q0 q0Var4 = new q0("STRESS", 3);
        STRESS = q0Var4;
        q0[] q0VarArr = {q0Var, q0Var2, q0Var3, q0Var4};
        $VALUES = q0VarArr;
        $ENTRIES = vc.s.n(q0VarArr);
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) $VALUES.clone();
    }
}
