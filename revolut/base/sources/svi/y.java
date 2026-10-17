package svi;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class y {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;
    public static final y LIMITED;
    public static final y UNKNOWN;
    public static final y UNLIMITED;

    static {
        y yVar = new y("LIMITED", 0);
        LIMITED = yVar;
        y yVar2 = new y("UNLIMITED", 1);
        UNLIMITED = yVar2;
        y yVar3 = new y("UNKNOWN", 2);
        UNKNOWN = yVar3;
        y[] yVarArr = {yVar, yVar2, yVar3};
        $VALUES = yVarArr;
        $ENTRIES = vc.s.n(yVarArr);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
