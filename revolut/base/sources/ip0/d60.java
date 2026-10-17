package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d60 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d60[] $VALUES;
    public static final d60 DEFAULT;
    public static final d60 NO_SUBTITLE;

    static {
        d60 d60Var = new d60("DEFAULT", 0);
        DEFAULT = d60Var;
        d60 d60Var2 = new d60("NO_SUBTITLE", 1);
        NO_SUBTITLE = d60Var2;
        d60[] d60VarArr = {d60Var, d60Var2};
        $VALUES = d60VarArr;
        $ENTRIES = vc.s.n(d60VarArr);
    }

    public static d60 valueOf(String str) {
        return (d60) Enum.valueOf(d60.class, str);
    }

    public static d60[] values() {
        return (d60[]) $VALUES.clone();
    }
}
