package jxe;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CENTRAL_GOOD_AND_SERVICES;
    public static final d GMF;
    public static final d INTEGRATED_GOOD_AND_SERVICES;
    public static final d STAMP_DUTY;
    public static final d STATE_GOOD_AND_SERVICES;
    public static final d UNKNOWN;
    public static final d VAT;

    static {
        d dVar = new d("VAT", 0);
        VAT = dVar;
        d dVar2 = new d("CENTRAL_GOOD_AND_SERVICES", 1);
        CENTRAL_GOOD_AND_SERVICES = dVar2;
        d dVar3 = new d("INTEGRATED_GOOD_AND_SERVICES", 2);
        INTEGRATED_GOOD_AND_SERVICES = dVar3;
        d dVar4 = new d("STATE_GOOD_AND_SERVICES", 3);
        STATE_GOOD_AND_SERVICES = dVar4;
        d dVar5 = new d("GMF", 4);
        GMF = dVar5;
        d dVar6 = new d("STAMP_DUTY", 5);
        STAMP_DUTY = dVar6;
        d dVar7 = new d("UNKNOWN", 6);
        UNKNOWN = dVar7;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
