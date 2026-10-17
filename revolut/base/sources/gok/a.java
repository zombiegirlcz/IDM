package gok;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ENTRY_COMPLETED;
    public static final a EXPIRED;
    public static final a INVITE_COUNT_LIMIT;
    public static final a REGION_UNAVAILABLE;
    public static final a UNKNOWN;

    static {
        a aVar = new a("EXPIRED", 0);
        EXPIRED = aVar;
        a aVar2 = new a("INVITE_COUNT_LIMIT", 1);
        INVITE_COUNT_LIMIT = aVar2;
        a aVar3 = new a("REGION_UNAVAILABLE", 2);
        REGION_UNAVAILABLE = aVar3;
        a aVar4 = new a("ENTRY_COMPLETED", 3);
        ENTRY_COMPLETED = aVar4;
        a aVar5 = new a("UNKNOWN", 4);
        UNKNOWN = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
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
