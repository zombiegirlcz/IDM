package h93;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e AVAILABLE_FOR_PICKUP;
    public static final e DELIVERED;
    public static final e EXCEPTION;
    public static final e FAILED_ATTEMPT;
    public static final e IN_TRANSIT;
    public static final e OUT_FOR_DELIVERY;
    public static final e UNKNOWN;

    static {
        e eVar = new e("IN_TRANSIT", 0);
        IN_TRANSIT = eVar;
        e eVar2 = new e("OUT_FOR_DELIVERY", 1);
        OUT_FOR_DELIVERY = eVar2;
        e eVar3 = new e("AVAILABLE_FOR_PICKUP", 2);
        AVAILABLE_FOR_PICKUP = eVar3;
        e eVar4 = new e("DELIVERED", 3);
        DELIVERED = eVar4;
        e eVar5 = new e("EXCEPTION", 4);
        EXCEPTION = eVar5;
        e eVar6 = new e("FAILED_ATTEMPT", 5);
        FAILED_ATTEMPT = eVar6;
        e eVar7 = new e("UNKNOWN", 6);
        UNKNOWN = eVar7;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
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
