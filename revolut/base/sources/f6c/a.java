package f6c;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a REGULAR;
    public static final a SDK_EXPORTED;
    public static final a WEB_PAYMENT;

    static {
        a aVar = new a("REGULAR", 0);
        REGULAR = aVar;
        a aVar2 = new a("SDK_EXPORTED", 1);
        SDK_EXPORTED = aVar2;
        a aVar3 = new a("WEB_PAYMENT", 2);
        WEB_PAYMENT = aVar3;
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
