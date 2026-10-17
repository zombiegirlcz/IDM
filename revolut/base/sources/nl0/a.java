package nl0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FALLBACK_TO_TEXT;
    public static final a HANDLED_CUSTOM;
    public static final a STANDARD_LINK;

    static {
        a aVar = new a("STANDARD_LINK", 0);
        STANDARD_LINK = aVar;
        a aVar2 = new a("FALLBACK_TO_TEXT", 1);
        FALLBACK_TO_TEXT = aVar2;
        a aVar3 = new a("HANDLED_CUSTOM", 2);
        HANDLED_CUSTOM = aVar3;
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
