package oq9;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 MARK_AS_PAID;
    public static final b0 TRANSFER;

    static {
        b0 b0Var = new b0("MARK_AS_PAID", 0);
        MARK_AS_PAID = b0Var;
        b0 b0Var2 = new b0("TRANSFER", 1);
        TRANSFER = b0Var2;
        b0[] b0VarArr = {b0Var, b0Var2};
        $VALUES = b0VarArr;
        $ENTRIES = vc.s.n(b0VarArr);
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }
}
