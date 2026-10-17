package m1c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class t1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t1[] $VALUES;
    public static final t1 EXPIRATION;
    public static final t1 REDEMPTION;
    public static final t1 REDEMPTION_REVERT;
    public static final t1 REWARD;
    public static final t1 REWARD_RETURN;
    public static final t1 TOPUP;
    public static final t1 TOPUP_RETURN;
    public static final t1 TRANSFER;
    public static final t1 UNKNOWN;

    static {
        t1 t1Var = new t1("REWARD", 0);
        REWARD = t1Var;
        t1 t1Var2 = new t1("REWARD_RETURN", 1);
        REWARD_RETURN = t1Var2;
        t1 t1Var3 = new t1("TOPUP", 2);
        TOPUP = t1Var3;
        t1 t1Var4 = new t1("TOPUP_RETURN", 3);
        TOPUP_RETURN = t1Var4;
        t1 t1Var5 = new t1("REDEMPTION", 4);
        REDEMPTION = t1Var5;
        t1 t1Var6 = new t1("REDEMPTION_REVERT", 5);
        REDEMPTION_REVERT = t1Var6;
        t1 t1Var7 = new t1("EXPIRATION", 6);
        EXPIRATION = t1Var7;
        t1 t1Var8 = new t1("TRANSFER", 7);
        TRANSFER = t1Var8;
        t1 t1Var9 = new t1("UNKNOWN", 8);
        UNKNOWN = t1Var9;
        t1[] t1VarArr = {t1Var, t1Var2, t1Var3, t1Var4, t1Var5, t1Var6, t1Var7, t1Var8, t1Var9};
        $VALUES = t1VarArr;
        $ENTRIES = vc.s.n(t1VarArr);
    }

    public static t1 valueOf(String str) {
        return (t1) Enum.valueOf(t1.class, str);
    }

    public static t1[] values() {
        return (t1[]) $VALUES.clone();
    }
}
