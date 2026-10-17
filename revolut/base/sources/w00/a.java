package w00;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a MATCH_MASK;
    public static final a NOT_MATCH_MASK;
    public static final a TOO_CLOSE;
    public static final a TOO_FAR;

    static {
        a aVar = new a("TOO_FAR", 0);
        TOO_FAR = aVar;
        a aVar2 = new a("TOO_CLOSE", 1);
        TOO_CLOSE = aVar2;
        a aVar3 = new a("MATCH_MASK", 2);
        MATCH_MASK = aVar3;
        a aVar4 = new a("NOT_MATCH_MASK", 3);
        NOT_MATCH_MASK = aVar4;
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
