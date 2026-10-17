package ilc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a EEA;
    public static final a GB;
    public static final a SG;
    public static final a US;

    static {
        a aVar = new a("US", 0);
        US = aVar;
        a aVar2 = new a("EEA", 1);
        EEA = aVar2;
        a aVar3 = new a("GB", 2);
        GB = aVar3;
        a aVar4 = new a("SG", 3);
        SG = aVar4;
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
