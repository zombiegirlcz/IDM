package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class c4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c4[] $VALUES;
    public static final c4 CHAT;
    public static final c4 SEARCH;

    static {
        c4 c4Var = new c4("CHAT", 0);
        CHAT = c4Var;
        c4 c4Var2 = new c4("SEARCH", 1);
        SEARCH = c4Var2;
        c4[] c4VarArr = {c4Var, c4Var2};
        $VALUES = c4VarArr;
        $ENTRIES = vc.s.n(c4VarArr);
    }

    public static c4 valueOf(String str) {
        return (c4) Enum.valueOf(c4.class, str);
    }

    public static c4[] values() {
        return (c4[]) $VALUES.clone();
    }
}
