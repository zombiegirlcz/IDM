package mzg;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ONE_DAY;
    public static final c ONE_MONTH;
    public static final c ONE_WEEK;
    public static final c ONE_YEAR;

    static {
        c cVar = new c("ONE_DAY", 0);
        ONE_DAY = cVar;
        c cVar2 = new c("ONE_WEEK", 1);
        ONE_WEEK = cVar2;
        c cVar3 = new c("ONE_MONTH", 2);
        ONE_MONTH = cVar3;
        c cVar4 = new c("ONE_YEAR", 3);
        ONE_YEAR = cVar4;
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
