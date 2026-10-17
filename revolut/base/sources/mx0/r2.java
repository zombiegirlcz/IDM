package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class r2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r2[] $VALUES;
    public static final r2 CENTER;
    public static final r2 START;
    private final int gravity;

    static {
        r2 r2Var = new r2("START", 0, 8388611);
        START = r2Var;
        r2 r2Var2 = new r2("CENTER", 1, 17);
        CENTER = r2Var2;
        r2[] r2VarArr = {r2Var, r2Var2};
        $VALUES = r2VarArr;
        $ENTRIES = vc.s.n(r2VarArr);
    }

    public r2(String str, int i, int i2) {
        this.gravity = i2;
    }

    public static r2 valueOf(String str) {
        return (r2) Enum.valueOf(r2.class, str);
    }

    public static r2[] values() {
        return (r2[]) $VALUES.clone();
    }

    public final int a() {
        return this.gravity;
    }
}
