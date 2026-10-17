package ugb;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b DATA_SHARING;
    public static final b EMPLOYMENT_CONTRACT;
    public static final b FIT_FOR_WORK;
    public static final b OTHER_INCOME_INSURANCE;
    public static final b SELF_EMPLOYMENT;
    public static final b TAX_RESIDENCY;

    static {
        b bVar = new b("TAX_RESIDENCY", 0);
        TAX_RESIDENCY = bVar;
        b bVar2 = new b("EMPLOYMENT_CONTRACT", 1);
        EMPLOYMENT_CONTRACT = bVar2;
        b bVar3 = new b("SELF_EMPLOYMENT", 2);
        SELF_EMPLOYMENT = bVar3;
        b bVar4 = new b("FIT_FOR_WORK", 3);
        FIT_FOR_WORK = bVar4;
        b bVar5 = new b("DATA_SHARING", 4);
        DATA_SHARING = bVar5;
        b bVar6 = new b("OTHER_INCOME_INSURANCE", 5);
        OTHER_INCOME_INSURANCE = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
