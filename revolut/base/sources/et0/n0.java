package et0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class n0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 EIGHTY_PERCENT;
    public static final n0 FULL;
    public static final n0 NINETY_PERCENT;
    private final float value;

    static {
        n0 n0Var = new n0(1.0f, 0, "FULL");
        FULL = n0Var;
        n0 n0Var2 = new n0(0.9f, 1, "NINETY_PERCENT");
        NINETY_PERCENT = n0Var2;
        n0 n0Var3 = new n0(0.8f, 2, "EIGHTY_PERCENT");
        EIGHTY_PERCENT = n0Var3;
        n0[] n0VarArr = {n0Var, n0Var2, n0Var3};
        $VALUES = n0VarArr;
        $ENTRIES = vc.s.n(n0VarArr);
    }

    public n0(float f, int i, String str) {
        this.value = f;
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }

    public final float a() {
        return this.value;
    }
}
