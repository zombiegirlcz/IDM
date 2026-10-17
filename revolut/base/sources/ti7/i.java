package ti7;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i CFAC;
    public static final i EVERYDAY_PROTECTION;
    public static final i TRAVEL;
    public static final i UNKNOWN;

    static {
        i iVar = new i("TRAVEL", 0);
        TRAVEL = iVar;
        i iVar2 = new i("EVERYDAY_PROTECTION", 1);
        EVERYDAY_PROTECTION = iVar2;
        i iVar3 = new i("CFAC", 2);
        CFAC = iVar3;
        i iVar4 = new i("UNKNOWN", 3);
        UNKNOWN = iVar4;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
