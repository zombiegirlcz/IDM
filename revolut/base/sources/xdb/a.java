package xdb;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CANCELLED;
    public static final a COMPLETED;
    public static final a CONFIRMED;
    public static final a CREATED;
    public static final a EXPIRED;
    public static final a SERVICE_STARTED;
    public static final a UNKNOWN;

    static {
        a aVar = new a("CREATED", 0);
        CREATED = aVar;
        a aVar2 = new a("CONFIRMED", 1);
        CONFIRMED = aVar2;
        a aVar3 = new a("SERVICE_STARTED", 2);
        SERVICE_STARTED = aVar3;
        a aVar4 = new a("COMPLETED", 3);
        COMPLETED = aVar4;
        a aVar5 = new a("EXPIRED", 4);
        EXPIRED = aVar5;
        a aVar6 = new a("CANCELLED", 5);
        CANCELLED = aVar6;
        a aVar7 = new a("UNKNOWN", 6);
        UNKNOWN = aVar7;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
