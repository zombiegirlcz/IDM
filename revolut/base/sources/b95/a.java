package b95;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a MORTGAGE_LOAN;
    public static final a PERSONAL_LOAN;
    public static final a REFINANCING_LOAN;

    static {
        a aVar = new a("PERSONAL_LOAN", 0);
        PERSONAL_LOAN = aVar;
        a aVar2 = new a("REFINANCING_LOAN", 1);
        REFINANCING_LOAN = aVar2;
        a aVar3 = new a("MORTGAGE_LOAN", 2);
        MORTGAGE_LOAN = aVar3;
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
