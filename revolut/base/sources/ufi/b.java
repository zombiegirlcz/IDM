package ufi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b EXTRA_PERSON_FEE;
    public static final b MANDATORY_EXTRA_TAX_AND_FEE;
    public static final b PROPERTY_FEE;
    public static final b REFUNDABLE_DAMAGE_DEPOSIT;
    public static final b TAX_AND_SERVICE_FEE;
    public static final b TRAVELLER_SERVICE_FEE;

    static {
        b bVar = new b("EXTRA_PERSON_FEE", 0);
        EXTRA_PERSON_FEE = bVar;
        b bVar2 = new b("TAX_AND_SERVICE_FEE", 1);
        TAX_AND_SERVICE_FEE = bVar2;
        b bVar3 = new b("PROPERTY_FEE", 2);
        PROPERTY_FEE = bVar3;
        b bVar4 = new b("MANDATORY_EXTRA_TAX_AND_FEE", 3);
        MANDATORY_EXTRA_TAX_AND_FEE = bVar4;
        b bVar5 = new b("REFUNDABLE_DAMAGE_DEPOSIT", 4);
        REFUNDABLE_DAMAGE_DEPOSIT = bVar5;
        b bVar6 = new b("TRAVELLER_SERVICE_FEE", 5);
        TRAVELLER_SERVICE_FEE = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
