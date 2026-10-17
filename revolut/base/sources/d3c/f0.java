package d3c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class f0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f0[] $VALUES;
    public static final f0 ACTIVE;
    public static final f0 AVAILABLE;
    public static final f0 PENDING;
    public static final f0 UNAVAILABLE;
    public static final f0 UNKNOWN;

    static {
        f0 f0Var = new f0("AVAILABLE", 0);
        AVAILABLE = f0Var;
        f0 f0Var2 = new f0("PENDING", 1);
        PENDING = f0Var2;
        f0 f0Var3 = new f0("ACTIVE", 2);
        ACTIVE = f0Var3;
        f0 f0Var4 = new f0("UNAVAILABLE", 3);
        UNAVAILABLE = f0Var4;
        f0 f0Var5 = new f0("UNKNOWN", 4);
        UNKNOWN = f0Var5;
        f0[] f0VarArr = {f0Var, f0Var2, f0Var3, f0Var4, f0Var5};
        $VALUES = f0VarArr;
        $ENTRIES = vc.s.n(f0VarArr);
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }
}
