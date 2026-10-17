package ou6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a E_COMMERCE;
    public static final a IN_PERSON;
    public static final a REGULAR;

    static {
        a aVar = new a("REGULAR", 0);
        REGULAR = aVar;
        a aVar2 = new a("IN_PERSON", 1);
        IN_PERSON = aVar2;
        a aVar3 = new a("E_COMMERCE", 2);
        E_COMMERCE = aVar3;
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
