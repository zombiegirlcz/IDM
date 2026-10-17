package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class r6 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r6[] $VALUES;
    public static final r6 COMPRESSED;
    public static final r6 NONE;
    public static final r6 VISIBILITY;

    static {
        r6 r6Var = new r6("VISIBILITY", 0);
        VISIBILITY = r6Var;
        r6 r6Var2 = new r6("COMPRESSED", 1);
        COMPRESSED = r6Var2;
        r6 r6Var3 = new r6("NONE", 2);
        NONE = r6Var3;
        r6[] r6VarArr = {r6Var, r6Var2, r6Var3};
        $VALUES = r6VarArr;
        $ENTRIES = vc.s.n(r6VarArr);
    }

    public static r6 valueOf(String str) {
        return (r6) Enum.valueOf(r6.class, str);
    }

    public static r6[] values() {
        return (r6[]) $VALUES.clone();
    }
}
