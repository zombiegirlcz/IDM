package jel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class e2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e2[] $VALUES;
    public static final e2 AVERAGE;
    public static final e2 SINGLE_ASSET;
    public static final e2 WORST_PERFORMING;

    static {
        e2 e2Var = new e2("AVERAGE", 0);
        AVERAGE = e2Var;
        e2 e2Var2 = new e2("WORST_PERFORMING", 1);
        WORST_PERFORMING = e2Var2;
        e2 e2Var3 = new e2("SINGLE_ASSET", 2);
        SINGLE_ASSET = e2Var3;
        e2[] e2VarArr = {e2Var, e2Var2, e2Var3};
        $VALUES = e2VarArr;
        $ENTRIES = vc.s.n(e2VarArr);
    }

    public static e2 valueOf(String str) {
        return (e2) Enum.valueOf(e2.class, str);
    }

    public static e2[] values() {
        return (e2[]) $VALUES.clone();
    }
}
