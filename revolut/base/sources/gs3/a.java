package gs3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CREDIT_CARD;
    public static final a LOAN;
    public static final a PAY_LATER;

    static {
        a aVar = new a("LOAN", 0);
        LOAN = aVar;
        a aVar2 = new a("CREDIT_CARD", 1);
        CREDIT_CARD = aVar2;
        a aVar3 = new a("PAY_LATER", 2);
        PAY_LATER = aVar3;
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
