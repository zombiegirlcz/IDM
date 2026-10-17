package lr6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d0[] $VALUES;
    public static final d0 APPLE_PAY;
    public static final d0 BANK_TRANSFER;
    public static final d0 CARD;
    public static final d0 CARD_PRESENT;
    public static final d0 CLICK_TO_PAY;
    public static final d0 GOOGLE_PAY;
    public static final d0 OPEN_BANKING;
    public static final d0 REVOLUT_PAY;

    static {
        d0 d0Var = new d0("CARD", 0);
        CARD = d0Var;
        d0 d0Var2 = new d0("CARD_PRESENT", 1);
        CARD_PRESENT = d0Var2;
        d0 d0Var3 = new d0("BANK_TRANSFER", 2);
        BANK_TRANSFER = d0Var3;
        d0 d0Var4 = new d0("OPEN_BANKING", 3);
        OPEN_BANKING = d0Var4;
        d0 d0Var5 = new d0("APPLE_PAY", 4);
        APPLE_PAY = d0Var5;
        d0 d0Var6 = new d0("GOOGLE_PAY", 5);
        GOOGLE_PAY = d0Var6;
        d0 d0Var7 = new d0("REVOLUT_PAY", 6);
        REVOLUT_PAY = d0Var7;
        d0 d0Var8 = new d0("CLICK_TO_PAY", 7);
        CLICK_TO_PAY = d0Var8;
        d0[] d0VarArr = {d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8};
        $VALUES = d0VarArr;
        $ENTRIES = vc.s.n(d0VarArr);
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }
}
