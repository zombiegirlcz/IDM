package t1e;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACTIVATED;
    public static final b NOT_ACTIVATED;
    public static final b NOT_REQUIRED;
    public static final b PENDING;
    public static final b UNKNOWN;

    static {
        b bVar = new b("ACTIVATED", 0);
        ACTIVATED = bVar;
        b bVar2 = new b("NOT_ACTIVATED", 1);
        NOT_ACTIVATED = bVar2;
        b bVar3 = new b("NOT_REQUIRED", 2);
        NOT_REQUIRED = bVar3;
        b bVar4 = new b("PENDING", 3);
        PENDING = bVar4;
        b bVar5 = new b("UNKNOWN", 4);
        UNKNOWN = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
