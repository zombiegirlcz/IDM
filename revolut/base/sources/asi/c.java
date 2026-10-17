package asi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ABSENT;
    public static final c EXIST;
    public static final c EXPIRED;
    public static final c SCOPED;
    public static final c UNAUTHORIZED;

    static {
        c cVar = new c("EXIST", 0);
        EXIST = cVar;
        c cVar2 = new c("SCOPED", 1);
        SCOPED = cVar2;
        c cVar3 = new c("ABSENT", 2);
        ABSENT = cVar3;
        c cVar4 = new c("EXPIRED", 3);
        EXPIRED = cVar4;
        c cVar5 = new c("UNAUTHORIZED", 4);
        UNAUTHORIZED = cVar5;
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
