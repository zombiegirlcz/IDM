package a2l;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e AIRLINE;
    public static final e CAR_RENTAL;
    public static final e HOTEL;

    static {
        e eVar = new e("CAR_RENTAL", 0);
        CAR_RENTAL = eVar;
        e eVar2 = new e("HOTEL", 1);
        HOTEL = eVar2;
        e eVar3 = new e("AIRLINE", 2);
        AIRLINE = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        $VALUES = eVarArr;
        $ENTRIES = vc.s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
