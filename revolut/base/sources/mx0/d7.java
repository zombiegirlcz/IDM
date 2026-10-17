package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class d7 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d7[] $VALUES;
    public static final d7 DEFAULT;
    public static final d7 DISCLAIMER;

    static {
        d7 d7Var = new d7("DEFAULT", 0);
        DEFAULT = d7Var;
        d7 d7Var2 = new d7("DISCLAIMER", 1);
        DISCLAIMER = d7Var2;
        d7[] d7VarArr = {d7Var, d7Var2};
        $VALUES = d7VarArr;
        $ENTRIES = vc.s.n(d7VarArr);
    }

    public static d7 valueOf(String str) {
        return (d7) Enum.valueOf(d7.class, str);
    }

    public static d7[] values() {
        return (d7[]) $VALUES.clone();
    }
}
