package tu3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a REFRESH_APPLICATION_STATUS;
    public static final a SUBMIT_KYC_DOCUMENTS;

    static {
        a aVar = new a("REFRESH_APPLICATION_STATUS", 0);
        REFRESH_APPLICATION_STATUS = aVar;
        a aVar2 = new a("SUBMIT_KYC_DOCUMENTS", 1);
        SUBMIT_KYC_DOCUMENTS = aVar2;
        a[] aVarArr = {aVar, aVar2};
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
