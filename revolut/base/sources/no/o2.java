package no;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o2[] $VALUES;
    public static final o2 SEND_ALWAYS;
    public static final o2 SEND_ONLY_CHANGES;
    public static final o2 SEND_ONLY_CHANGES_IN_SCOPE_OF_SESSION;
    public static final o2 SEND_PER_DAY_OR_CHANGES;

    static {
        o2 o2Var = new o2("SEND_ALWAYS", 0);
        SEND_ALWAYS = o2Var;
        o2 o2Var2 = new o2("SEND_ONLY_CHANGES_IN_SCOPE_OF_SESSION", 1);
        SEND_ONLY_CHANGES_IN_SCOPE_OF_SESSION = o2Var2;
        o2 o2Var3 = new o2("SEND_ONLY_CHANGES", 2);
        SEND_ONLY_CHANGES = o2Var3;
        o2 o2Var4 = new o2("SEND_PER_DAY_OR_CHANGES", 3);
        SEND_PER_DAY_OR_CHANGES = o2Var4;
        o2[] o2VarArr = {o2Var, o2Var2, o2Var3, o2Var4};
        $VALUES = o2VarArr;
        $ENTRIES = vc.s.n(o2VarArr);
    }

    public static o2 valueOf(String str) {
        return (o2) Enum.valueOf(o2.class, str);
    }

    public static o2[] values() {
        return (o2[]) $VALUES.clone();
    }
}
