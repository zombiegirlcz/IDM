package ggk;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class w0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w0[] $VALUES;
    public static final w0 CELL;
    public static final w0 DETAILS;
    public static final w0 MEDIA;
    public static final w0 TEXT;

    static {
        w0 w0Var = new w0("CELL", 0);
        CELL = w0Var;
        w0 w0Var2 = new w0("DETAILS", 1);
        DETAILS = w0Var2;
        w0 w0Var3 = new w0("TEXT", 2);
        TEXT = w0Var3;
        w0 w0Var4 = new w0("MEDIA", 3);
        MEDIA = w0Var4;
        w0[] w0VarArr = {w0Var, w0Var2, w0Var3, w0Var4};
        $VALUES = w0VarArr;
        $ENTRIES = vc.s.n(w0VarArr);
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) $VALUES.clone();
    }
}
