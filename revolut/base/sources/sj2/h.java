package sj2;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h AVAILABLE;
    public static final h UNAVAILABLE;
    public static final h UNKNOWN;

    static {
        h hVar = new h("AVAILABLE", 0);
        AVAILABLE = hVar;
        h hVar2 = new h("UNAVAILABLE", 1);
        UNAVAILABLE = hVar2;
        h hVar3 = new h("UNKNOWN", 2);
        UNKNOWN = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
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
