package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class da0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ da0[] $VALUES;
    public static final da0 Icon;
    public static final da0 IconAndText;

    static {
        da0 da0Var = new da0("Icon", 0);
        Icon = da0Var;
        da0 da0Var2 = new da0("IconAndText", 1);
        IconAndText = da0Var2;
        da0[] da0VarArr = {da0Var, da0Var2};
        $VALUES = da0VarArr;
        $ENTRIES = vc.s.n(da0VarArr);
    }

    public static da0 valueOf(String str) {
        return (da0) Enum.valueOf(da0.class, str);
    }

    public static da0[] values() {
        return (da0[]) $VALUES.clone();
    }
}
