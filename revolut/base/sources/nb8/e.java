package nb8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e P14D;
    public static final e P1D;
    public static final e P1M;
    public static final e P1W;
    public static final e P1Y;
    public static final e P2W;
    public static final e P7D;

    static {
        e eVar = new e("P1D", 0);
        P1D = eVar;
        e eVar2 = new e("P7D", 1);
        P7D = eVar2;
        e eVar3 = new e("P1W", 2);
        P1W = eVar3;
        e eVar4 = new e("P2W", 3);
        P2W = eVar4;
        e eVar5 = new e("P14D", 4);
        P14D = eVar5;
        e eVar6 = new e("P1M", 5);
        P1M = eVar6;
        e eVar7 = new e("P1Y", 6);
        P1Y = eVar7;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
