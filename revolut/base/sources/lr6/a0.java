package lr6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 APPLE_PAY;
    public static final a0 APPLE_TAP_TO_PAY;
    public static final a0 BANK_TRANSFER;
    public static final a0 CARD;
    public static final a0 CARD_PRESENT;
    public static final a0 CLICK_TO_PAY;
    public static final a0 GOOGLE_PAY;
    public static final a0 OPEN_BANKING;
    public static final a0 PAY_WITH_REVOLUT;

    static {
        a0 a0Var = new a0("APPLE_PAY", 0);
        APPLE_PAY = a0Var;
        a0 a0Var2 = new a0("APPLE_TAP_TO_PAY", 1);
        APPLE_TAP_TO_PAY = a0Var2;
        a0 a0Var3 = new a0("BANK_TRANSFER", 2);
        BANK_TRANSFER = a0Var3;
        a0 a0Var4 = new a0("CARD", 3);
        CARD = a0Var4;
        a0 a0Var5 = new a0("CARD_PRESENT", 4);
        CARD_PRESENT = a0Var5;
        a0 a0Var6 = new a0("CLICK_TO_PAY", 5);
        CLICK_TO_PAY = a0Var6;
        a0 a0Var7 = new a0("GOOGLE_PAY", 6);
        GOOGLE_PAY = a0Var7;
        a0 a0Var8 = new a0("OPEN_BANKING", 7);
        OPEN_BANKING = a0Var8;
        a0 a0Var9 = new a0("PAY_WITH_REVOLUT", 8);
        PAY_WITH_REVOLUT = a0Var9;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3, a0Var4, a0Var5, a0Var6, a0Var7, a0Var8, a0Var9};
        $VALUES = a0VarArr;
        $ENTRIES = vc.s.n(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}
