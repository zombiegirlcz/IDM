package p9b;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CLOSE;
    public static final a GET_DOCUMENTS;
    public static final a SET_DEFAULT;

    static {
        a aVar = new a("SET_DEFAULT", 0);
        SET_DEFAULT = aVar;
        a aVar2 = new a("CLOSE", 1);
        CLOSE = aVar2;
        a aVar3 = new a("GET_DOCUMENTS", 2);
        GET_DOCUMENTS = aVar3;
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
