package pcd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class h0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h0[] $VALUES;
    public static final h0 ACTIVE;
    public static final h0 CLOSED;
    public static final h0 CREATED;
    public static final h0 PENDING_ACTIVATION;

    static {
        h0 h0Var = new h0("CREATED", 0);
        CREATED = h0Var;
        h0 h0Var2 = new h0("PENDING_ACTIVATION", 1);
        PENDING_ACTIVATION = h0Var2;
        h0 h0Var3 = new h0("ACTIVE", 2);
        ACTIVE = h0Var3;
        h0 h0Var4 = new h0("CLOSED", 3);
        CLOSED = h0Var4;
        h0[] h0VarArr = {h0Var, h0Var2, h0Var3, h0Var4};
        $VALUES = h0VarArr;
        $ENTRIES = vc.s.n(h0VarArr);
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) $VALUES.clone();
    }
}
