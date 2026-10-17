package vyg;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ALL;
    public static final c DAILY;
    public static final c HALF_YEARLY;
    public static final c MONTHLY;
    public static final c WEEKLY;
    public static final c YEARLY;

    static {
        c cVar = new c("DAILY", 0);
        DAILY = cVar;
        c cVar2 = new c("WEEKLY", 1);
        WEEKLY = cVar2;
        c cVar3 = new c("MONTHLY", 2);
        MONTHLY = cVar3;
        c cVar4 = new c("HALF_YEARLY", 3);
        HALF_YEARLY = cVar4;
        c cVar5 = new c("YEARLY", 4);
        YEARLY = cVar5;
        c cVar6 = new c("ALL", 5);
        ALL = cVar6;
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

    public final eel.c b() {
        switch (b.f293318a[ordinal()]) {
            case 1:
                return eel.c.ONE_DAY;
            case 2:
                return eel.c.ONE_WEEK;
            case 3:
                return eel.c.ONE_MONTH;
            case 4:
                return eel.c.SIX_MONTHS;
            case 5:
                return eel.c.ONE_YEAR;
            case 6:
                return eel.c.ALL;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
