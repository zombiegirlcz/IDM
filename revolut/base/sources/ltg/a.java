package ltg;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FOUND;
    public static final a NOT_FOUND;
    public static final a SKIPPED;

    static {
        a aVar = new a("FOUND", 0);
        FOUND = aVar;
        a aVar2 = new a("NOT_FOUND", 1);
        NOT_FOUND = aVar2;
        a aVar3 = new a("SKIPPED", 2);
        SKIPPED = aVar3;
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
