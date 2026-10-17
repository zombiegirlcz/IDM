package hha;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class y {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;
    public static final y DISABLED;
    public static final y ENABLED;
    public static final y INACTIVE;
    public static final y LOCKED;
    public static final y PENDING;

    static {
        y yVar = new y("DISABLED", 0);
        DISABLED = yVar;
        y yVar2 = new y("INACTIVE", 1);
        INACTIVE = yVar2;
        y yVar3 = new y("LOCKED", 2);
        LOCKED = yVar3;
        y yVar4 = new y("PENDING", 3);
        PENDING = yVar4;
        y yVar5 = new y("ENABLED", 4);
        ENABLED = yVar5;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4, yVar5};
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
