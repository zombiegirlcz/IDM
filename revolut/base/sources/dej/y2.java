package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class y2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y2[] $VALUES;
    public static final y2 CANCELLED;
    public static final y2 COMPLETED;
    public static final y2 DRAFT;
    public static final y2 ELIGIBLE;
    public static final y2 FAILED;
    public static final y2 PENDING;
    public static final y2 UNKNOWN;

    static {
        y2 y2Var = new y2("DRAFT", 0);
        DRAFT = y2Var;
        y2 y2Var2 = new y2("ELIGIBLE", 1);
        ELIGIBLE = y2Var2;
        y2 y2Var3 = new y2("PENDING", 2);
        PENDING = y2Var3;
        y2 y2Var4 = new y2("CANCELLED", 3);
        CANCELLED = y2Var4;
        y2 y2Var5 = new y2("COMPLETED", 4);
        COMPLETED = y2Var5;
        y2 y2Var6 = new y2("FAILED", 5);
        FAILED = y2Var6;
        y2 y2Var7 = new y2("UNKNOWN", 6);
        UNKNOWN = y2Var7;
        y2[] y2VarArr = {y2Var, y2Var2, y2Var3, y2Var4, y2Var5, y2Var6, y2Var7};
        $VALUES = y2VarArr;
        $ENTRIES = vc.s.n(y2VarArr);
    }

    public static y2 valueOf(String str) {
        return (y2) Enum.valueOf(y2.class, str);
    }

    public static y2[] values() {
        return (y2[]) $VALUES.clone();
    }
}
