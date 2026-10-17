package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class a9 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a9[] $VALUES;
    public static final a9 LOOP;
    public static final a9 PLAY_ONCE;

    static {
        a9 a9Var = new a9("PLAY_ONCE", 0);
        PLAY_ONCE = a9Var;
        a9 a9Var2 = new a9("LOOP", 1);
        LOOP = a9Var2;
        a9[] a9VarArr = {a9Var, a9Var2};
        $VALUES = a9VarArr;
        $ENTRIES = vc.s.n(a9VarArr);
    }

    public static a9 valueOf(String str) {
        return (a9) Enum.valueOf(a9.class, str);
    }

    public static a9[] values() {
        return (a9[]) $VALUES.clone();
    }
}
