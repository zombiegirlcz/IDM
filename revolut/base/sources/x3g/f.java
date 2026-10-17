package x3g;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f TRIPADVISOR;
    public static final f UNKNOWN;
    public static final f VIATOR;

    static {
        f fVar = new f("VIATOR", 0);
        VIATOR = fVar;
        f fVar2 = new f("TRIPADVISOR", 1);
        TRIPADVISOR = fVar2;
        f fVar3 = new f("UNKNOWN", 2);
        UNKNOWN = fVar3;
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
