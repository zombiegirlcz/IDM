package xbc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f EARLY;
    public static final f LATE;
    public static final f ON_TIME;

    static {
        f fVar = new f("EARLY", 0);
        EARLY = fVar;
        f fVar2 = new f("ON_TIME", 1);
        ON_TIME = fVar2;
        f fVar3 = new f("LATE", 2);
        LATE = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
