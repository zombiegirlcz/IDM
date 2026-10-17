package u6c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class d0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d0[] $VALUES;
    public static final d0 ADVANCED_STATE_ORDER;
    public static final d0 GAMBLING_BLOCK_ACTIVE;
    public static final d0 INSUFFICIENT_BALANCE;
    public static final d0 PAYMENT_METHOD_NOT_AVAILABLE;

    static {
        d0 d0Var = new d0("INSUFFICIENT_BALANCE", 0);
        INSUFFICIENT_BALANCE = d0Var;
        d0 d0Var2 = new d0("PAYMENT_METHOD_NOT_AVAILABLE", 1);
        PAYMENT_METHOD_NOT_AVAILABLE = d0Var2;
        d0 d0Var3 = new d0("GAMBLING_BLOCK_ACTIVE", 2);
        GAMBLING_BLOCK_ACTIVE = d0Var3;
        d0 d0Var4 = new d0("ADVANCED_STATE_ORDER", 3);
        ADVANCED_STATE_ORDER = d0Var4;
        d0[] d0VarArr = {d0Var, d0Var2, d0Var3, d0Var4};
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
