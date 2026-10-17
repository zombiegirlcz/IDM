package v1e;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACTIVE;
    public static final b INACTIVE;
    public static final b NOT_AVAILABLE;
    public static final b SOLD_OUT;
    public static final b UNKNOWN;

    static {
        b bVar = new b("ACTIVE", 0);
        ACTIVE = bVar;
        b bVar2 = new b("INACTIVE", 1);
        INACTIVE = bVar2;
        b bVar3 = new b("NOT_AVAILABLE", 2);
        NOT_AVAILABLE = bVar3;
        b bVar4 = new b("SOLD_OUT", 3);
        SOLD_OUT = bVar4;
        b bVar5 = new b("UNKNOWN", 4);
        UNKNOWN = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
