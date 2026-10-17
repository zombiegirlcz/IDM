package vs3;

import kotlin.enums.EnumEntries;
import ks3.c;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a implements c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BLOCKED;
    public static final a DISPLAYING;
    public static final a FETCH_ERROR;
    public static final a POST_FETCH;
    public static final a PROCESSING;
    public static final a VALIDATION_FAILED;

    static {
        a aVar = new a("DISPLAYING", 0);
        DISPLAYING = aVar;
        a aVar2 = new a("PROCESSING", 1);
        PROCESSING = aVar2;
        a aVar3 = new a("POST_FETCH", 2);
        POST_FETCH = aVar3;
        a aVar4 = new a("FETCH_ERROR", 3);
        FETCH_ERROR = aVar4;
        a aVar5 = new a("BLOCKED", 4);
        BLOCKED = aVar5;
        a aVar6 = new a("VALIDATION_FAILED", 5);
        VALIDATION_FAILED = aVar6;
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
