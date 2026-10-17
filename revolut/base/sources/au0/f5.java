package au0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class f5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f5[] $VALUES;
    public static final f5 FULL;
    public static final f5 LITE;
    private final float opacity;

    static {
        f5 f5Var = new f5(1.0f, 0, "FULL");
        FULL = f5Var;
        f5 f5Var2 = new f5(0.2f, 1, "LITE");
        LITE = f5Var2;
        f5[] f5VarArr = {f5Var, f5Var2};
        $VALUES = f5VarArr;
        $ENTRIES = vc.s.n(f5VarArr);
    }

    public f5(float f, int i, String str) {
        this.opacity = f;
    }

    public static f5 valueOf(String str) {
        return (f5) Enum.valueOf(f5.class, str);
    }

    public static f5[] values() {
        return (f5[]) $VALUES.clone();
    }

    public final float a() {
        return this.opacity;
    }
}
