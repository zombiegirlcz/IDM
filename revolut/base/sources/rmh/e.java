package rmh;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e BONDS;
    public static final e CFD;
    public static final e ETFS;
    public static final e STOCKS;

    static {
        e eVar = new e("STOCKS", 0);
        STOCKS = eVar;
        e eVar2 = new e("ETFS", 1);
        ETFS = eVar2;
        e eVar3 = new e("BONDS", 2);
        BONDS = eVar3;
        e eVar4 = new e("CFD", 3);
        CFD = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
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
