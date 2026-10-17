package qa1;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f BATTERY_FULL;
    public static final f PLUGGED;
    public static final f UNKNOWN;
    public static final f UNPLUGGED;

    static {
        f fVar = new f("UNPLUGGED", 0);
        UNPLUGGED = fVar;
        f fVar2 = new f("PLUGGED", 1);
        PLUGGED = fVar2;
        f fVar3 = new f("BATTERY_FULL", 2);
        BATTERY_FULL = fVar3;
        f fVar4 = new f("UNKNOWN", 3);
        UNKNOWN = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
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
