package qo2;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BIWEEKLY;
    public static final c DAILY;
    public static final c MONTHLY;
    public static final c WEEKLY;
    public static final c YEARLY;

    static {
        c cVar = new c("DAILY", 0);
        DAILY = cVar;
        c cVar2 = new c("WEEKLY", 1);
        WEEKLY = cVar2;
        c cVar3 = new c("BIWEEKLY", 2);
        BIWEEKLY = cVar3;
        c cVar4 = new c("MONTHLY", 3);
        MONTHLY = cVar4;
        c cVar5 = new c("YEARLY", 4);
        YEARLY = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
