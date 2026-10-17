package ffi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AIRPORT;
    public static final a CITY;
    public static final a COUNTRY;
    public static final a NEIGHBORHOOD;
    public static final a PLACE;
    public static final a REGION;
    public static final a UNKNOWN;

    static {
        a aVar = new a("COUNTRY", 0);
        COUNTRY = aVar;
        a aVar2 = new a("REGION", 1);
        REGION = aVar2;
        a aVar3 = new a("CITY", 2);
        CITY = aVar3;
        a aVar4 = new a("NEIGHBORHOOD", 3);
        NEIGHBORHOOD = aVar4;
        a aVar5 = new a("PLACE", 4);
        PLACE = aVar5;
        a aVar6 = new a("AIRPORT", 5);
        AIRPORT = aVar6;
        a aVar7 = new a("UNKNOWN", 6);
        UNKNOWN = aVar7;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
