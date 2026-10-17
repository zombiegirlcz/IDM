package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class z {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z LOAN;
    public static final z UNKNOWN;

    static {
        z zVar = new z("LOAN", 0);
        LOAN = zVar;
        z zVar2 = new z("UNKNOWN", 1);
        UNKNOWN = zVar2;
        z[] zVarArr = {zVar, zVar2};
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
