package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class t0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t0[] $VALUES;
    public static final t0 FRAUDULENT;
    public static final t0 JUSTIFIED;
    public static final t0 NONE;
    public static final t0 SUSPICIOUS;

    static {
        t0 t0Var = new t0("SUSPICIOUS", 0);
        SUSPICIOUS = t0Var;
        t0 t0Var2 = new t0("JUSTIFIED", 1);
        JUSTIFIED = t0Var2;
        t0 t0Var3 = new t0("FRAUDULENT", 2);
        FRAUDULENT = t0Var3;
        t0 t0Var4 = new t0("NONE", 3);
        NONE = t0Var4;
        t0[] t0VarArr = {t0Var, t0Var2, t0Var3, t0Var4};
        $VALUES = t0VarArr;
        $ENTRIES = vc.s.n(t0VarArr);
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) $VALUES.clone();
    }
}
