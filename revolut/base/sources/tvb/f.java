package tvb;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f C128A;
    public static final f C128B;
    public static final f C39;
    public static final f EAN13;
    public static final f UNKNOWN;

    static {
        f fVar = new f("C39", 0);
        C39 = fVar;
        f fVar2 = new f("C128A", 1);
        C128A = fVar2;
        f fVar3 = new f("C128B", 2);
        C128B = fVar3;
        f fVar4 = new f("EAN13", 3);
        EAN13 = fVar4;
        f fVar5 = new f("UNKNOWN", 4);
        UNKNOWN = fVar5;
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
