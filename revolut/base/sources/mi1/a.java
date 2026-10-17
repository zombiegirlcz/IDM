package mi1;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a GRANTED;
    public static final a NOT_ASKED;
    public static final a REJECTED;

    static {
        a aVar = new a("GRANTED", 0);
        GRANTED = aVar;
        a aVar2 = new a("REJECTED", 1);
        REJECTED = aVar2;
        a aVar3 = new a("NOT_ASKED", 2);
        NOT_ASKED = aVar3;
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
