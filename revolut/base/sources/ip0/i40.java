package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class i40 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i40[] $VALUES;
    public static final i40 NORMAL;
    public static final i40 PENDING;

    static {
        i40 i40Var = new i40("NORMAL", 0);
        NORMAL = i40Var;
        i40 i40Var2 = new i40("PENDING", 1);
        PENDING = i40Var2;
        i40[] i40VarArr = {i40Var, i40Var2};
        $VALUES = i40VarArr;
        $ENTRIES = vc.s.n(i40VarArr);
    }

    public static i40 valueOf(String str) {
        return (i40) Enum.valueOf(i40.class, str);
    }

    public static i40[] values() {
        return (i40[]) $VALUES.clone();
    }
}
