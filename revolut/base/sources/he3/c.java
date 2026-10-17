package he3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c DONT_EXCLUDE;
    public static final c EXCLUDE_INCLUDED_AND_PARTIALLY_EXCLUDED;
    public static final c EXCLUDE_ONLY_FULLY_EXCLUDED;

    static {
        c cVar = new c("EXCLUDE_ONLY_FULLY_EXCLUDED", 0);
        EXCLUDE_ONLY_FULLY_EXCLUDED = cVar;
        c cVar2 = new c("EXCLUDE_INCLUDED_AND_PARTIALLY_EXCLUDED", 1);
        EXCLUDE_INCLUDED_AND_PARTIALLY_EXCLUDED = cVar2;
        c cVar3 = new c("DONT_EXCLUDE", 2);
        DONT_EXCLUDE = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = vc.s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
