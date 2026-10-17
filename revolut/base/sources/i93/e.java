package i93;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ATM_WITHDRAWAL;
    public static final e CONTACTLESS;
    public static final e ECOMMERCE;
    public static final e LOCATION;
    public static final e MAGNET;
    public static final e POINT_OF_SALE;

    static {
        e eVar = new e("ECOMMERCE", 0);
        ECOMMERCE = eVar;
        e eVar2 = new e("LOCATION", 1);
        LOCATION = eVar2;
        e eVar3 = new e("MAGNET", 2);
        MAGNET = eVar3;
        e eVar4 = new e("ATM_WITHDRAWAL", 3);
        ATM_WITHDRAWAL = eVar4;
        e eVar5 = new e("CONTACTLESS", 4);
        CONTACTLESS = eVar5;
        e eVar6 = new e("POINT_OF_SALE", 5);
        POINT_OF_SALE = eVar6;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6};
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
