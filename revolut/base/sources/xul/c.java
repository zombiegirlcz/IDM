package xul;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CANCELLED_OR_DECLINED;
    public static final c COMPLETED;
    public static final c PENDING;

    static {
        c cVar = new c("PENDING", 0);
        PENDING = cVar;
        c cVar2 = new c("CANCELLED_OR_DECLINED", 1);
        CANCELLED_OR_DECLINED = cVar2;
        c cVar3 = new c("COMPLETED", 2);
        COMPLETED = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
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
