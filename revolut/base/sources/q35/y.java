package q35;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class y {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;
    public static final y Completed;
    public static final y InProgress;

    static {
        y yVar = new y("InProgress", 0);
        InProgress = yVar;
        y yVar2 = new y("Completed", 1);
        Completed = yVar2;
        y[] yVarArr = {yVar, yVar2};
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
