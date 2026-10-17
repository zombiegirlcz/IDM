package xdb;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class z {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z AVAILABLE;
    public static final z UNAVAILABLE;

    static {
        z zVar = new z("AVAILABLE", 0);
        AVAILABLE = zVar;
        z zVar2 = new z("UNAVAILABLE", 1);
        UNAVAILABLE = zVar2;
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
