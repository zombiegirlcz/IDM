package g00;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DOCUMENT_INVALID;
    public static final a GENERAL;
    public static final a NO_FIT_DATA;
    public static final a NO_MODEL;

    static {
        a aVar = new a("NO_FIT_DATA", 0);
        NO_FIT_DATA = aVar;
        a aVar2 = new a("NO_MODEL", 1);
        NO_MODEL = aVar2;
        a aVar3 = new a("DOCUMENT_INVALID", 2);
        DOCUMENT_INVALID = aVar3;
        a aVar4 = new a("GENERAL", 3);
        GENERAL = aVar4;
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
