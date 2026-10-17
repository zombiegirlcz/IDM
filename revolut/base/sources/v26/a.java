package v26;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AMOUNT_ABOVE_MAXIMUM;
    public static final a AMOUNT_BELOW_MINIMUM;

    static {
        a aVar = new a("AMOUNT_BELOW_MINIMUM", 0);
        AMOUNT_BELOW_MINIMUM = aVar;
        a aVar2 = new a("AMOUNT_ABOVE_MAXIMUM", 1);
        AMOUNT_ABOVE_MAXIMUM = aVar2;
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
