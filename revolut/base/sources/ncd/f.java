package ncd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f DATE;
    public static final f INSTANT;
    public static final f NON_INSTANT;
    public static final f UNKNOWN;

    static {
        f fVar = new f("INSTANT", 0);
        INSTANT = fVar;
        f fVar2 = new f("NON_INSTANT", 1);
        NON_INSTANT = fVar2;
        f fVar3 = new f("DATE", 2);
        DATE = fVar3;
        f fVar4 = new f("UNKNOWN", 3);
        UNKNOWN = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
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
