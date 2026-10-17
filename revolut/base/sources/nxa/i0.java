package nxa;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class i0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public static final i0 ACTIVE;
    public static final i0 CREATED;
    public static final i0 EXPIRED;
    public static final i0 REDEEMED;

    static {
        i0 i0Var = new i0("CREATED", 0);
        CREATED = i0Var;
        i0 i0Var2 = new i0("ACTIVE", 1);
        ACTIVE = i0Var2;
        i0 i0Var3 = new i0("EXPIRED", 2);
        EXPIRED = i0Var3;
        i0 i0Var4 = new i0("REDEEMED", 3);
        REDEEMED = i0Var4;
        i0[] i0VarArr = {i0Var, i0Var2, i0Var3, i0Var4};
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
