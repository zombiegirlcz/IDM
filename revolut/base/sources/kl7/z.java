package kl7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class z {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z DRIVER_NUMBER;
    public static final z DRIVING_LICENCE_NUMBER;

    static {
        z zVar = new z("DRIVER_NUMBER", 0);
        DRIVER_NUMBER = zVar;
        z zVar2 = new z("DRIVING_LICENCE_NUMBER", 1);
        DRIVING_LICENCE_NUMBER = zVar2;
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
