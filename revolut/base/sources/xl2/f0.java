package xl2;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class f0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f0[] $VALUES;
    public static final f0 DEFAULT;
    public static final f0 UPPERCASE;

    static {
        f0 f0Var = new f0("DEFAULT", 0);
        DEFAULT = f0Var;
        f0 f0Var2 = new f0("UPPERCASE", 1);
        UPPERCASE = f0Var2;
        f0[] f0VarArr = {f0Var, f0Var2};
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
