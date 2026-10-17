package d80;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f SENSITIVITY_HARD;
    public static final f SENSITIVITY_LIGHT;
    public static final f SENSITIVITY_MEDIUM;
    private final int value;

    static {
        f fVar = new f("SENSITIVITY_LIGHT", 0, 11);
        SENSITIVITY_LIGHT = fVar;
        f fVar2 = new f("SENSITIVITY_MEDIUM", 1, 13);
        SENSITIVITY_MEDIUM = fVar2;
        f fVar3 = new f("SENSITIVITY_HARD", 2, 15);
        SENSITIVITY_HARD = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public f(String str, int i, int i2) {
        this.value = i2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final int a() {
        return this.value;
    }
}
