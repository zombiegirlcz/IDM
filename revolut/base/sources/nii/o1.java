package nii;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class o1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o1[] $VALUES;
    public static final o1 LIMITED;
    public static final o1 UNLIMITED;
    private final int value;

    static {
        o1 o1Var = new o1("LIMITED", 0, 4);
        LIMITED = o1Var;
        o1 o1Var2 = new o1("UNLIMITED", 1, Integer.MAX_VALUE);
        UNLIMITED = o1Var2;
        o1[] o1VarArr = {o1Var, o1Var2};
        $VALUES = o1VarArr;
        $ENTRIES = vc.s.n(o1VarArr);
    }

    public o1(String str, int i, int i2) {
        this.value = i2;
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) $VALUES.clone();
    }

    public final int a() {
        return this.value;
    }
}
