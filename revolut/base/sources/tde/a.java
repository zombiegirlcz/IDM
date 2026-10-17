package tde;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a SEE_REQUIRED_DETAILS;
    public static final a SUBMIT_CONFIRMATION;
    public static final a VIEW_ACCOUNT_DETAILS;

    static {
        a aVar = new a("VIEW_ACCOUNT_DETAILS", 0);
        VIEW_ACCOUNT_DETAILS = aVar;
        a aVar2 = new a("SEE_REQUIRED_DETAILS", 1);
        SEE_REQUIRED_DETAILS = aVar2;
        a aVar3 = new a("SUBMIT_CONFIRMATION", 2);
        SUBMIT_CONFIRMATION = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
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
