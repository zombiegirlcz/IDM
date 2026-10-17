package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ap0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ap0[] $VALUES;
    public static final ap0 DEFAULT;
    public static final ap0 SOFTWARE;
    private final int layerType;

    static {
        ap0 ap0Var = new ap0("DEFAULT", 0, 0);
        DEFAULT = ap0Var;
        ap0 ap0Var2 = new ap0("SOFTWARE", 1, 1);
        SOFTWARE = ap0Var2;
        ap0[] ap0VarArr = {ap0Var, ap0Var2};
        $VALUES = ap0VarArr;
        $ENTRIES = vc.s.n(ap0VarArr);
    }

    public ap0(String str, int i, int i2) {
        this.layerType = i2;
    }

    public static ap0 valueOf(String str) {
        return (ap0) Enum.valueOf(ap0.class, str);
    }

    public static ap0[] values() {
        return (ap0[]) $VALUES.clone();
    }

    public final int a() {
        return this.layerType;
    }
}
