package ru0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h CLOSING_SCROLL;
    public static final h CLOSING_SCROLL_CANCELLED;
    public static final h INITIAL;
    public static final h OTHER_SCROLL;

    static {
        h hVar = new h("INITIAL", 0);
        INITIAL = hVar;
        h hVar2 = new h("CLOSING_SCROLL", 1);
        CLOSING_SCROLL = hVar2;
        h hVar3 = new h("CLOSING_SCROLL_CANCELLED", 2);
        CLOSING_SCROLL_CANCELLED = hVar3;
        h hVar4 = new h("OTHER_SCROLL", 3);
        OTHER_SCROLL = hVar4;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
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
