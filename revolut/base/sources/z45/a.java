package z45;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a implements ht3.a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CLOSE;
    public static final a CONFIRM_WITHDRAWAL;
    public static final a KEEP_LOAN;
    public static final a OPEN_REPAYMENT;
    public static final a PROCEED;
    public static final a UNKNOWN;

    static {
        a aVar = new a("CONFIRM_WITHDRAWAL", 0);
        CONFIRM_WITHDRAWAL = aVar;
        a aVar2 = new a("KEEP_LOAN", 1);
        KEEP_LOAN = aVar2;
        a aVar3 = new a("PROCEED", 2);
        PROCEED = aVar3;
        a aVar4 = new a("CLOSE", 3);
        CLOSE = aVar4;
        a aVar5 = new a("OPEN_REPAYMENT", 4);
        OPEN_REPAYMENT = aVar5;
        a aVar6 = new a("UNKNOWN", 5);
        UNKNOWN = aVar6;
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
