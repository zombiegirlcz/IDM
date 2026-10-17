package akd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DISCARD;
    public static final a OPEN;
    public static final a SECONDARY_ACTION;
    public static final a VIEW;

    static {
        a aVar = new a("OPEN", 0);
        OPEN = aVar;
        a aVar2 = new a("DISCARD", 1);
        DISCARD = aVar2;
        a aVar3 = new a("SECONDARY_ACTION", 2);
        SECONDARY_ACTION = aVar3;
        a aVar4 = new a("VIEW", 3);
        VIEW = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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
