package ah0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f HYBRID;
    public static final f NONE;
    public static final f NORMAL;
    public static final f SATELLITE;
    public static final f TERRAIN;

    static {
        f fVar = new f("NONE", 0);
        NONE = fVar;
        f fVar2 = new f("NORMAL", 1);
        NORMAL = fVar2;
        f fVar3 = new f("SATELLITE", 2);
        SATELLITE = fVar3;
        f fVar4 = new f("TERRAIN", 3);
        TERRAIN = fVar4;
        f fVar5 = new f("HYBRID", 4);
        HYBRID = fVar5;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
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
