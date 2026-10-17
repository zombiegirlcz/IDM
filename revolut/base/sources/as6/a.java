package as6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CUSTOMER_NOT_PRESENT;
    public static final a CUSTOMER_PRESENT;
    public static final a OPEN_BANKING;
    public static final a REVOLUT_PAY_IN_PERSON;
    public static final a REVOLUT_PAY_ONLINE;
    public static final a TAP_TO_PAY;

    static {
        a aVar = new a("CUSTOMER_PRESENT", 0);
        CUSTOMER_PRESENT = aVar;
        a aVar2 = new a("CUSTOMER_NOT_PRESENT", 1);
        CUSTOMER_NOT_PRESENT = aVar2;
        a aVar3 = new a("TAP_TO_PAY", 2);
        TAP_TO_PAY = aVar3;
        a aVar4 = new a("REVOLUT_PAY_ONLINE", 3);
        REVOLUT_PAY_ONLINE = aVar4;
        a aVar5 = new a("REVOLUT_PAY_IN_PERSON", 4);
        REVOLUT_PAY_IN_PERSON = aVar5;
        a aVar6 = new a("OPEN_BANKING", 5);
        OPEN_BANKING = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
