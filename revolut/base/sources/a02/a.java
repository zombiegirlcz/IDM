package a02;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AU_BUSINESS_REGISTRY_NUMBER;
    public static final a DOCUMENT_ID;
    public static final a EMAIL;
    public static final a PAYID_ORG_ID;
    public static final a PHONE;
    public static final a TAX_NUMBER;
    public static final a UPI_ID;

    static {
        a aVar = new a("EMAIL", 0);
        EMAIL = aVar;
        a aVar2 = new a("PHONE", 1);
        PHONE = aVar2;
        a aVar3 = new a("AU_BUSINESS_REGISTRY_NUMBER", 2);
        AU_BUSINESS_REGISTRY_NUMBER = aVar3;
        a aVar4 = new a("PAYID_ORG_ID", 3);
        PAYID_ORG_ID = aVar4;
        a aVar5 = new a("UPI_ID", 4);
        UPI_ID = aVar5;
        a aVar6 = new a("TAX_NUMBER", 5);
        TAX_NUMBER = aVar6;
        a aVar7 = new a("DOCUMENT_ID", 6);
        DOCUMENT_ID = aVar7;
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
