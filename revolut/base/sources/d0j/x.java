package d0j;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;
    public static final x COMPLETED;
    public static final x EXPIRED;
    public static final x IN_PROGRESS;
    public static final x LOCKED;
    public static final x UNKNOWN;
    public static final x UNLOCKED;

    static {
        x xVar = new x("LOCKED", 0);
        LOCKED = xVar;
        x xVar2 = new x("UNLOCKED", 1);
        UNLOCKED = xVar2;
        x xVar3 = new x("IN_PROGRESS", 2);
        IN_PROGRESS = xVar3;
        x xVar4 = new x("COMPLETED", 3);
        COMPLETED = xVar4;
        x xVar5 = new x("EXPIRED", 4);
        EXPIRED = xVar5;
        x xVar6 = new x("UNKNOWN", 5);
        UNKNOWN = xVar6;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4, xVar5, xVar6};
        $VALUES = xVarArr;
        $ENTRIES = vc.s.n(xVarArr);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }
}
