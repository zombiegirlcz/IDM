package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class q5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q5[] $VALUES;
    public static final q5 APPLE_PAY;
    public static final q5 BANK_TRANSFER;
    public static final q5 CARD;
    public static final q5 CARD_PRESENT;
    public static final q5 GOOGLE_PAY;
    public static final q5 OPEN_BANKING;
    public static final q5 PAY_WITH_REVOLUT;
    public static final q5 UNKNOWN;

    static {
        q5 q5Var = new q5("CARD", 0);
        CARD = q5Var;
        q5 q5Var2 = new q5("CARD_PRESENT", 1);
        CARD_PRESENT = q5Var2;
        q5 q5Var3 = new q5("PAY_WITH_REVOLUT", 2);
        PAY_WITH_REVOLUT = q5Var3;
        q5 q5Var4 = new q5("BANK_TRANSFER", 3);
        BANK_TRANSFER = q5Var4;
        q5 q5Var5 = new q5("APPLE_PAY", 4);
        APPLE_PAY = q5Var5;
        q5 q5Var6 = new q5("GOOGLE_PAY", 5);
        GOOGLE_PAY = q5Var6;
        q5 q5Var7 = new q5("OPEN_BANKING", 6);
        OPEN_BANKING = q5Var7;
        q5 q5Var8 = new q5("UNKNOWN", 7);
        UNKNOWN = q5Var8;
        q5[] q5VarArr = {q5Var, q5Var2, q5Var3, q5Var4, q5Var5, q5Var6, q5Var7, q5Var8};
        $VALUES = q5VarArr;
        $ENTRIES = vc.s.n(q5VarArr);
    }

    public static q5 valueOf(String str) {
        return (q5) Enum.valueOf(q5.class, str);
    }

    public static q5[] values() {
        return (q5[]) $VALUES.clone();
    }
}
