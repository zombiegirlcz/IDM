package es0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p NOT_INITIALISED;
    public static final p PERIOD_VISIBLE;
    public static final p SHOWING_PERIOD;
    public static final p SHOWING_TABS;
    public static final p TABS_VISIBLE;

    static {
        p pVar = new p("NOT_INITIALISED", 0);
        NOT_INITIALISED = pVar;
        p pVar2 = new p("TABS_VISIBLE", 1);
        TABS_VISIBLE = pVar2;
        p pVar3 = new p("PERIOD_VISIBLE", 2);
        PERIOD_VISIBLE = pVar3;
        p pVar4 = new p("SHOWING_TABS", 3);
        SHOWING_TABS = pVar4;
        p pVar5 = new p("SHOWING_PERIOD", 4);
        SHOWING_PERIOD = pVar5;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5};
        $VALUES = pVarArr;
        $ENTRIES = vc.s.n(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    public final p a() {
        int i = o.f128842a[ordinal()];
        if (i == 1) {
            return NOT_INITIALISED;
        }
        if (i == 2 || i == 3) {
            return TABS_VISIBLE;
        }
        if (i == 4 || i == 5) {
            return PERIOD_VISIBLE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean b() {
        return a() == PERIOD_VISIBLE;
    }
}
