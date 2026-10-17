package n6c;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a EEA_BUAB;
    public static final a REVOLUT_BANK;
    public static final a REVOLUT_LTD;
    public static final a UNKNOWN;

    static {
        a aVar = new a("REVOLUT_LTD", 0);
        REVOLUT_LTD = aVar;
        a aVar2 = new a("REVOLUT_BANK", 1);
        REVOLUT_BANK = aVar2;
        a aVar3 = new a("EEA_BUAB", 2);
        EEA_BUAB = aVar3;
        a aVar4 = new a("UNKNOWN", 3);
        UNKNOWN = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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
