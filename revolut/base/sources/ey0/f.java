package ey0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f CENTER;
    public static final f START;
    private final int gravity;

    static {
        f fVar = new f("START", 0, 8388611);
        START = fVar;
        f fVar2 = new f("CENTER", 1, 1);
        CENTER = fVar2;
        f[] fVarArr = {fVar, fVar2};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public f(String str, int i, int i2) {
        this.gravity = i2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final int a() {
        return this.gravity;
    }
}
