package ufi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c AMENITIES;
    public static final c CLEANLINESS;
    public static final c COMFORT;
    public static final c CONDITION;
    public static final c LOCATION;
    public static final c NEIGHBORHOOD;
    public static final c OVERALL;
    public static final c QUALITY;
    public static final c SERVICE;
    public static final c UNKNOWN;
    public static final c VALUE;

    static {
        c cVar = new c("CLEANLINESS", 0);
        CLEANLINESS = cVar;
        c cVar2 = new c("SERVICE", 1);
        SERVICE = cVar2;
        c cVar3 = new c("COMFORT", 2);
        COMFORT = cVar3;
        c cVar4 = new c("CONDITION", 3);
        CONDITION = cVar4;
        c cVar5 = new c("LOCATION", 4);
        LOCATION = cVar5;
        c cVar6 = new c("NEIGHBORHOOD", 5);
        NEIGHBORHOOD = cVar6;
        c cVar7 = new c("QUALITY", 6);
        QUALITY = cVar7;
        c cVar8 = new c("VALUE", 7);
        VALUE = cVar8;
        c cVar9 = new c("AMENITIES", 8);
        AMENITIES = cVar9;
        c cVar10 = new c("OVERALL", 9);
        OVERALL = cVar10;
        c cVar11 = new c("UNKNOWN", 10);
        UNKNOWN = cVar11;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
