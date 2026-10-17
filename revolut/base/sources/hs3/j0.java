package hs3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class j0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j0[] $VALUES;
    public static final j0 DEFAULT;
    public static final j0 TOP_ITEM;
    public static final j0 WITH_IMAGE_HEADER;

    static {
        j0 j0Var = new j0("WITH_IMAGE_HEADER", 0);
        WITH_IMAGE_HEADER = j0Var;
        j0 j0Var2 = new j0("TOP_ITEM", 1);
        TOP_ITEM = j0Var2;
        j0 j0Var3 = new j0("DEFAULT", 2);
        DEFAULT = j0Var3;
        j0[] j0VarArr = {j0Var, j0Var2, j0Var3};
        $VALUES = j0VarArr;
        $ENTRIES = vc.s.n(j0VarArr);
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}
