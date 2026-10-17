package nr6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 AUTHORISED;
    public static final c0 CANCELLED;
    public static final c0 DISPUTED;
    public static final c0 FAILED;
    public static final c0 PAID;
    public static final c0 PARTIALLY_DISPUTED;
    public static final c0 PARTIALLY_PAID;
    public static final c0 PARTIAL_REFUND;
    public static final c0 PENDING;
    public static final c0 REFUNDED;

    static {
        c0 c0Var = new c0("PAID", 0);
        PAID = c0Var;
        c0 c0Var2 = new c0("PENDING", 1);
        PENDING = c0Var2;
        c0 c0Var3 = new c0("REFUNDED", 2);
        REFUNDED = c0Var3;
        c0 c0Var4 = new c0("FAILED", 3);
        FAILED = c0Var4;
        c0 c0Var5 = new c0("PARTIAL_REFUND", 4);
        PARTIAL_REFUND = c0Var5;
        c0 c0Var6 = new c0("AUTHORISED", 5);
        AUTHORISED = c0Var6;
        c0 c0Var7 = new c0("CANCELLED", 6);
        CANCELLED = c0Var7;
        c0 c0Var8 = new c0("PARTIALLY_PAID", 7);
        PARTIALLY_PAID = c0Var8;
        c0 c0Var9 = new c0("DISPUTED", 8);
        DISPUTED = c0Var9;
        c0 c0Var10 = new c0("PARTIALLY_DISPUTED", 9);
        PARTIALLY_DISPUTED = c0Var10;
        c0[] c0VarArr = {c0Var, c0Var2, c0Var3, c0Var4, c0Var5, c0Var6, c0Var7, c0Var8, c0Var9, c0Var10};
        $VALUES = c0VarArr;
        $ENTRIES = vc.s.n(c0VarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }
}
