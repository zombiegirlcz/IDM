package yzi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c COMPLETED;
    public static final c CREATED;
    public static final c FAILED;
    public static final c PENDING;
    public static final c SKIPPED;
    public static final c UNKNOWN;

    static {
        c cVar = new c("SKIPPED", 0);
        SKIPPED = cVar;
        c cVar2 = new c("PENDING", 1);
        PENDING = cVar2;
        c cVar3 = new c("CREATED", 2);
        CREATED = cVar3;
        c cVar4 = new c("COMPLETED", 3);
        COMPLETED = cVar4;
        c cVar5 = new c("FAILED", 4);
        FAILED = cVar5;
        c cVar6 = new c("UNKNOWN", 5);
        UNKNOWN = cVar6;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
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
