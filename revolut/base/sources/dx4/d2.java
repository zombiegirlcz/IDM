package dx4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class d2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d2[] $VALUES;
    public static final d2 ICON;
    public static final d2 NONE;
    public static final d2 NUMBERED;

    static {
        d2 d2Var = new d2("NUMBERED", 0);
        NUMBERED = d2Var;
        d2 d2Var2 = new d2("ICON", 1);
        ICON = d2Var2;
        d2 d2Var3 = new d2("NONE", 2);
        NONE = d2Var3;
        d2[] d2VarArr = {d2Var, d2Var2, d2Var3};
        $VALUES = d2VarArr;
        $ENTRIES = vc.s.n(d2VarArr);
    }

    public static d2 valueOf(String str) {
        return (d2) Enum.valueOf(d2.class, str);
    }

    public static d2[] values() {
        return (d2[]) $VALUES.clone();
    }
}
