package lr6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public static final i0 APPLE_PAY;
    public static final i0 APPLE_TAP_TO_PAY;
    public static final i0 BANK_TRANSFER;
    public static final i0 CARD;
    public static final i0 CARD_PRESENT;
    public static final i0 GOOGLE_PAY;
    public static final i0 OPEN_BANKING;
    public static final i0 PAY_WITH_REVOLUT;
    public static final i0 UNKNOWN;

    static {
        i0 i0Var = new i0("CARD", 0);
        CARD = i0Var;
        i0 i0Var2 = new i0("CARD_PRESENT", 1);
        CARD_PRESENT = i0Var2;
        i0 i0Var3 = new i0("PAY_WITH_REVOLUT", 2);
        PAY_WITH_REVOLUT = i0Var3;
        i0 i0Var4 = new i0("BANK_TRANSFER", 3);
        BANK_TRANSFER = i0Var4;
        i0 i0Var5 = new i0("APPLE_PAY", 4);
        APPLE_PAY = i0Var5;
        i0 i0Var6 = new i0("GOOGLE_PAY", 5);
        GOOGLE_PAY = i0Var6;
        i0 i0Var7 = new i0("OPEN_BANKING", 6);
        OPEN_BANKING = i0Var7;
        i0 i0Var8 = new i0("APPLE_TAP_TO_PAY", 7);
        APPLE_TAP_TO_PAY = i0Var8;
        i0 i0Var9 = new i0("UNKNOWN", 8);
        UNKNOWN = i0Var9;
        i0[] i0VarArr = {i0Var, i0Var2, i0Var3, i0Var4, i0Var5, i0Var6, i0Var7, i0Var8, i0Var9};
        $VALUES = i0VarArr;
        $ENTRIES = vc.s.n(i0VarArr);
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }
}
