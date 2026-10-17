package w7c;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a PAY_IN_FULL_SELECTION;
    public static final a PAY_LATER_SELECTION;
    public static final a SINGLE_ENTRY;

    static {
        a aVar = new a("PAY_LATER_SELECTION", 0);
        PAY_LATER_SELECTION = aVar;
        a aVar2 = new a("PAY_IN_FULL_SELECTION", 1);
        PAY_IN_FULL_SELECTION = aVar2;
        a aVar3 = new a("SINGLE_ENTRY", 2);
        SINGLE_ENTRY = aVar3;
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
