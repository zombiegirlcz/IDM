package m89;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a EMAIL;
    public static final a LT_PERSONAL_CODE;
    public static final a OCCUPATION;
    public static final a PURPOSE_OF_ACCOUNT;
    public static final a TAX_RESIDENCY;
    public static final a US_CODES;

    static {
        a aVar = new a("PURPOSE_OF_ACCOUNT", 0);
        PURPOSE_OF_ACCOUNT = aVar;
        a aVar2 = new a("EMAIL", 1);
        EMAIL = aVar2;
        a aVar3 = new a("TAX_RESIDENCY", 2);
        TAX_RESIDENCY = aVar3;
        a aVar4 = new a("LT_PERSONAL_CODE", 3);
        LT_PERSONAL_CODE = aVar4;
        a aVar5 = new a("US_CODES", 4);
        US_CODES = aVar5;
        a aVar6 = new a("OCCUPATION", 5);
        OCCUPATION = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
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
