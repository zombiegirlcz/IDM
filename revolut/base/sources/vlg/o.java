package vlg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o ADDRESS;
    public static final o APARTMENT_SUITE;
    public static final o CITY;
    public static final o COMPANY_NAME;
    public static final o FIRST_AND_MIDDLE_NAME;
    public static final o LAST_NAME;
    public static final o STATE;
    public static final o ZIP_CODE;

    static {
        o oVar = new o("FIRST_AND_MIDDLE_NAME", 0);
        FIRST_AND_MIDDLE_NAME = oVar;
        o oVar2 = new o("LAST_NAME", 1);
        LAST_NAME = oVar2;
        o oVar3 = new o("COMPANY_NAME", 2);
        COMPANY_NAME = oVar3;
        o oVar4 = new o("CITY", 3);
        CITY = oVar4;
        o oVar5 = new o("ADDRESS", 4);
        ADDRESS = oVar5;
        o oVar6 = new o("ZIP_CODE", 5);
        ZIP_CODE = oVar6;
        o oVar7 = new o("STATE", 6);
        STATE = oVar7;
        o oVar8 = new o("APARTMENT_SUITE", 7);
        APARTMENT_SUITE = oVar8;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8};
        $VALUES = oVarArr;
        $ENTRIES = vc.s.n(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
