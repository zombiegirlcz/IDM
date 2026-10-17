package km5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f DATE_PLACE_OF_BIRTH;
    public static final f LEGAL_ENTITY_ID;
    public static final f MESH;

    static {
        f fVar = new f("MESH", 0);
        MESH = fVar;
        f fVar2 = new f("DATE_PLACE_OF_BIRTH", 1);
        DATE_PLACE_OF_BIRTH = fVar2;
        f fVar3 = new f("LEGAL_ENTITY_ID", 2);
        LEGAL_ENTITY_ID = fVar3;
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
