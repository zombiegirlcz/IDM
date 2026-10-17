package yld;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c BAR_CHART;
    public static final c LINE_CHART;
    public static final c PIE_CHART;

    static {
        c cVar = new c("PIE_CHART", 0);
        PIE_CHART = cVar;
        c cVar2 = new c("BAR_CHART", 1);
        BAR_CHART = cVar2;
        c cVar3 = new c("LINE_CHART", 2);
        LINE_CHART = cVar3;
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
