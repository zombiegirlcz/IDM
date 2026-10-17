package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class z1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z1[] $VALUES;
    public static final z1 Marker24;
    public static final z1 Marker40;
    private final float borderWidthDp;
    private final float bottomArrowHeightDp;
    private final float circleSizeDp;

    static {
        z1 z1Var = new z1("Marker24", 0, 24.0f, 4.0f, 2.0f);
        Marker24 = z1Var;
        z1 z1Var2 = new z1("Marker40", 1, 40.0f, 8.0f, 4.0f);
        Marker40 = z1Var2;
        z1[] z1VarArr = {z1Var, z1Var2};
        $VALUES = z1VarArr;
        $ENTRIES = vc.s.n(z1VarArr);
    }

    public z1(String str, int i, float f, float f4, float f5) {
        this.circleSizeDp = f;
        this.bottomArrowHeightDp = f4;
        this.borderWidthDp = f5;
    }

    public static z1 valueOf(String str) {
        return (z1) Enum.valueOf(z1.class, str);
    }

    public static z1[] values() {
        return (z1[]) $VALUES.clone();
    }

    public final float a() {
        return this.borderWidthDp;
    }

    public final float b() {
        return this.bottomArrowHeightDp;
    }

    public final float c() {
        return this.circleSizeDp;
    }
}
