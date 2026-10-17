package cn3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ALL_TOGETHER;
    public static final h GROUPED_BY_FIRST_CHAR;

    static {
        h hVar = new h("ALL_TOGETHER", 0);
        ALL_TOGETHER = hVar;
        h hVar2 = new h("GROUPED_BY_FIRST_CHAR", 1);
        GROUPED_BY_FIRST_CHAR = hVar2;
        h[] hVarArr = {hVar, hVar2};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
