package al4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a COMBO;
    public static final a GLOBAL_DEBIT;
    public static final a LOCAL_DEBIT;

    static {
        a aVar = new a("LOCAL_DEBIT", 0);
        LOCAL_DEBIT = aVar;
        a aVar2 = new a("GLOBAL_DEBIT", 1);
        GLOBAL_DEBIT = aVar2;
        a aVar3 = new a("COMBO", 2);
        COMBO = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
