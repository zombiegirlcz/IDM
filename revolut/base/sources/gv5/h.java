package gv5;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ACTIVE;
    public static final h AVAILABLE;
    public static final h UNAVAILABLE;

    static {
        h hVar = new h("UNAVAILABLE", 0);
        UNAVAILABLE = hVar;
        h hVar2 = new h("AVAILABLE", 1);
        AVAILABLE = hVar2;
        h hVar3 = new h("ACTIVE", 2);
        ACTIVE = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
        $VALUES = hVarArr;
        $ENTRIES = vc.s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
