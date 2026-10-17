package u1m;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class f0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f0[] $VALUES;
    public static final f0 DEBUG;
    public static final f0 ERROR;
    public static final f0 INFO;
    public static final f0 VERBOSE;
    public static final f0 WARN;

    static {
        f0 f0Var = new f0("VERBOSE", 0);
        VERBOSE = f0Var;
        f0 f0Var2 = new f0("DEBUG", 1);
        DEBUG = f0Var2;
        f0 f0Var3 = new f0("INFO", 2);
        INFO = f0Var3;
        f0 f0Var4 = new f0("WARN", 3);
        WARN = f0Var4;
        f0 f0Var5 = new f0("ERROR", 4);
        ERROR = f0Var5;
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
