package jli;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c PERIOD_SELECTION_BI_WEEKLY;
    public static final c PERIOD_SELECTION_DAY;
    public static final c PERIOD_SELECTION_MONTH;
    public static final c PERIOD_SELECTION_NONE;
    public static final c PERIOD_SELECTION_WEEK;
    public static final c PERIOD_SELECTION_YEAR;

    static {
        c cVar = new c("PERIOD_SELECTION_NONE", 0);
        PERIOD_SELECTION_NONE = cVar;
        c cVar2 = new c("PERIOD_SELECTION_DAY", 1);
        PERIOD_SELECTION_DAY = cVar2;
        c cVar3 = new c("PERIOD_SELECTION_WEEK", 2);
        PERIOD_SELECTION_WEEK = cVar3;
        c cVar4 = new c("PERIOD_SELECTION_BI_WEEKLY", 3);
        PERIOD_SELECTION_BI_WEEKLY = cVar4;
        c cVar5 = new c("PERIOD_SELECTION_MONTH", 4);
        PERIOD_SELECTION_MONTH = cVar5;
        c cVar6 = new c("PERIOD_SELECTION_YEAR", 5);
        PERIOD_SELECTION_YEAR = cVar6;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
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
