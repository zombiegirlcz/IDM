package ko5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACTIVE;
    public static final c FAILED_SCREENING;
    public static final c SCREENING;
    public static final c UNKNOWN;

    static {
        c cVar = new c("ACTIVE", 0);
        ACTIVE = cVar;
        c cVar2 = new c("FAILED_SCREENING", 1);
        FAILED_SCREENING = cVar2;
        c cVar3 = new c("SCREENING", 2);
        SCREENING = cVar3;
        c cVar4 = new c("UNKNOWN", 3);
        UNKNOWN = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
