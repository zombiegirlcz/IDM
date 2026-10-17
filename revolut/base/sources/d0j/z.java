package d0j;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class z {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z CUSTOM;
    public static final z EMPTY;
    public static final z POINTS;
    public static final z UNKNOWN;

    static {
        z zVar = new z("POINTS", 0);
        POINTS = zVar;
        z zVar2 = new z("CUSTOM", 1);
        CUSTOM = zVar2;
        z zVar3 = new z("EMPTY", 2);
        EMPTY = zVar3;
        z zVar4 = new z("UNKNOWN", 3);
        UNKNOWN = zVar4;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4};
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
