package npg;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ELIGIBLE;
    public static final f INCOMPLETE;
    public static final f INELIGIBLE;

    static {
        f fVar = new f("ELIGIBLE", 0);
        ELIGIBLE = fVar;
        f fVar2 = new f("INELIGIBLE", 1);
        INELIGIBLE = fVar2;
        f fVar3 = new f("INCOMPLETE", 2);
        INCOMPLETE = fVar3;
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
