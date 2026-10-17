package vl4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CLOSED;
    public static final c FUTURE;
    public static final c ONGOING;
    public static final c PAST;
    public static final c UNKNOWN;

    static {
        c cVar = new c("PAST", 0);
        PAST = cVar;
        c cVar2 = new c("ONGOING", 1);
        ONGOING = cVar2;
        c cVar3 = new c("CLOSED", 2);
        CLOSED = cVar3;
        c cVar4 = new c("FUTURE", 3);
        FUTURE = cVar4;
        c cVar5 = new c("UNKNOWN", 4);
        UNKNOWN = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        $ENTRIES = vc.s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
