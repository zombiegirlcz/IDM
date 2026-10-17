package myf;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CM;
    public static final d FT;
    public static final d KG;
    public static final d LB;
    public static final d LOCATION_REF;
    public static final d TEXT;
    public static final d UNKNOWN;

    static {
        d dVar = new d("CM", 0);
        CM = dVar;
        d dVar2 = new d("FT", 1);
        FT = dVar2;
        d dVar3 = new d("KG", 2);
        KG = dVar3;
        d dVar4 = new d("LB", 3);
        LB = dVar4;
        d dVar5 = new d("TEXT", 4);
        TEXT = dVar5;
        d dVar6 = new d("LOCATION_REF", 5);
        LOCATION_REF = dVar6;
        d dVar7 = new d("UNKNOWN", 6);
        UNKNOWN = dVar7;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
