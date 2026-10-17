package lw7;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CAR_INSURANCE;
    public static final a EMBEDDED_INSURANCE;
    public static final a KYC;
    public static final a PET_INSURANCE;
    public static final a PURCHASE_INSURANCE;
    public static final a SCHEME_INSURANCE;
    public static final a TRAVEL_INSURANCE;
    public static final a UNKNOWN;
    public static final a UPGRADE_PURCHASE;
    public static final a UPGRADE_SCHEME_INSURANCE;
    public static final a UPGRADE_TRAVEL;

    static {
        a aVar = new a("KYC", 0);
        KYC = aVar;
        a aVar2 = new a("CAR_INSURANCE", 1);
        CAR_INSURANCE = aVar2;
        a aVar3 = new a("PET_INSURANCE", 2);
        PET_INSURANCE = aVar3;
        a aVar4 = new a("TRAVEL_INSURANCE", 3);
        TRAVEL_INSURANCE = aVar4;
        a aVar5 = new a("PURCHASE_INSURANCE", 4);
        PURCHASE_INSURANCE = aVar5;
        a aVar6 = new a("UPGRADE_TRAVEL", 5);
        UPGRADE_TRAVEL = aVar6;
        a aVar7 = new a("EMBEDDED_INSURANCE", 6);
        EMBEDDED_INSURANCE = aVar7;
        a aVar8 = new a("UPGRADE_PURCHASE", 7);
        UPGRADE_PURCHASE = aVar8;
        a aVar9 = new a("SCHEME_INSURANCE", 8);
        SCHEME_INSURANCE = aVar9;
        a aVar10 = new a("UPGRADE_SCHEME_INSURANCE", 9);
        UPGRADE_SCHEME_INSURANCE = aVar10;
        a aVar11 = new a("UNKNOWN", 10);
        UNKNOWN = aVar11;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11};
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
