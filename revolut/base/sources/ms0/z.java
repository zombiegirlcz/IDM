package ms0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class z {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z SIZE_48;
    public static final z SIZE_56;
    private final float containerDp;
    private final float iconDp;

    static {
        z zVar = new z("SIZE_48", 0, 48.0f, 24.0f);
        SIZE_48 = zVar;
        z zVar2 = new z("SIZE_56", 1, 56.0f, 32.0f);
        SIZE_56 = zVar2;
        z[] zVarArr = {zVar, zVar2};
        $VALUES = zVarArr;
        $ENTRIES = vc.s.n(zVarArr);
    }

    public z(String str, int i, float f, float f4) {
        this.containerDp = f;
        this.iconDp = f4;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }

    public final float a() {
        return this.containerDp;
    }

    public final float b() {
        return this.iconDp;
    }
}
