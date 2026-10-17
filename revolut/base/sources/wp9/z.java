package wp9;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class z {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z DESELECT_ALL;
    public static final z INVISIBLE;
    public static final z SELECT_ALL;

    static {
        z zVar = new z("INVISIBLE", 0);
        INVISIBLE = zVar;
        z zVar2 = new z("SELECT_ALL", 1);
        SELECT_ALL = zVar2;
        z zVar3 = new z("DESELECT_ALL", 2);
        DESELECT_ALL = zVar3;
        z[] zVarArr = {zVar, zVar2, zVar3};
        $VALUES = zVarArr;
        $ENTRIES = vc.s.n(zVarArr);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }
}
