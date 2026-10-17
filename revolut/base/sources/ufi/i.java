package ufi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i AMENITIES;
    public static final i ATTRACTIONS;
    public static final i BUSINESS_AMENITIES;
    public static final i DINING;
    public static final i HEADLINE;
    public static final i LOCATION;
    public static final i NATIONAL_RATINGS;
    public static final i OVERALL;
    public static final i RENOVATIONS;
    public static final i ROOMS;
    public static final i UNKNOWN;

    static {
        i iVar = new i("AMENITIES", 0);
        AMENITIES = iVar;
        i iVar2 = new i("DINING", 1);
        DINING = iVar2;
        i iVar3 = new i("RENOVATIONS", 2);
        RENOVATIONS = iVar3;
        i iVar4 = new i("NATIONAL_RATINGS", 3);
        NATIONAL_RATINGS = iVar4;
        i iVar5 = new i("BUSINESS_AMENITIES", 4);
        BUSINESS_AMENITIES = iVar5;
        i iVar6 = new i("ROOMS", 5);
        ROOMS = iVar6;
        i iVar7 = new i("ATTRACTIONS", 6);
        ATTRACTIONS = iVar7;
        i iVar8 = new i("LOCATION", 7);
        LOCATION = iVar8;
        i iVar9 = new i("HEADLINE", 8);
        HEADLINE = iVar9;
        i iVar10 = new i("OVERALL", 9);
        OVERALL = iVar10;
        i iVar11 = new i("UNKNOWN", 10);
        UNKNOWN = iVar11;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11};
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
