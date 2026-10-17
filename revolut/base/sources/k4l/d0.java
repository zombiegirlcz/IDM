package k4l;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class d0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d0[] $VALUES;
    public static final d0 ACTIVE;
    public static final d0 INACTIVE;

    static {
        d0 d0Var = new d0("ACTIVE", 0);
        ACTIVE = d0Var;
        d0 d0Var2 = new d0("INACTIVE", 1);
        INACTIVE = d0Var2;
        d0[] d0VarArr = {d0Var, d0Var2};
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
