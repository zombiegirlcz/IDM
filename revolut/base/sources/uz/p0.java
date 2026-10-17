package uz;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public abstract class p0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p0[] $VALUES;
    public static final p0 CAPTURE;
    public static final p0 CAPTURE_FAILED;
    public static final p0 MATCHED;
    public static final p0 WAITING_FOR_MATCH;
    private final boolean showsPlaceholder = true;

    static {
        o0 o0Var = new o0("WAITING_FOR_MATCH", 0);
        WAITING_FOR_MATCH = o0Var;
        n0 n0Var = new n0("MATCHED", 1);
        MATCHED = n0Var;
        l0 l0Var = new l0("CAPTURE", 2);
        CAPTURE = l0Var;
        m0 m0Var = new m0("CAPTURE_FAILED", 3);
        CAPTURE_FAILED = m0Var;
        p0[] p0VarArr = {o0Var, n0Var, l0Var, m0Var};
        $VALUES = p0VarArr;
        $ENTRIES = vc.s.n(p0VarArr);
    }

    public p0(String str, int i) {
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.showsPlaceholder;
    }

    public abstract int b(int i, int i2);
}
