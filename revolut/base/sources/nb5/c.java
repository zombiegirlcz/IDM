package nb5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACTIVE;
    public static final c CANCELED;
    public static final c DISABLED;
    public static final c FAILED;
    public static final c PENDING;

    static {
        c cVar = new c("ACTIVE", 0);
        ACTIVE = cVar;
        c cVar2 = new c("PENDING", 1);
        PENDING = cVar2;
        c cVar3 = new c("FAILED", 2);
        FAILED = cVar3;
        c cVar4 = new c("CANCELED", 3);
        CANCELED = cVar4;
        c cVar5 = new c("DISABLED", 4);
        DISABLED = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
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
