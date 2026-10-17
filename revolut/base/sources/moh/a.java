package moh;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DUPLICATE;
    public static final a HAS_INVALID_CHARS;
    public static final a INITIAL;
    public static final a TOO_LONG;
    public static final a TOO_SHORT;
    public static final a VALID;

    static {
        a aVar = new a("INITIAL", 0);
        INITIAL = aVar;
        a aVar2 = new a("VALID", 1);
        VALID = aVar2;
        a aVar3 = new a("TOO_LONG", 2);
        TOO_LONG = aVar3;
        a aVar4 = new a("TOO_SHORT", 3);
        TOO_SHORT = aVar4;
        a aVar5 = new a("HAS_INVALID_CHARS", 4);
        HAS_INVALID_CHARS = aVar5;
        a aVar6 = new a("DUPLICATE", 5);
        DUPLICATE = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
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
