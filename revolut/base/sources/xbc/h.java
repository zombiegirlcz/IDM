package xbc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ARRIVED;
    public static final h CANCELLED;
    public static final h DEPARTED;
    public static final h DIVERTED;
    public static final h SCHEDULED;

    static {
        h hVar = new h("SCHEDULED", 0);
        SCHEDULED = hVar;
        h hVar2 = new h("DEPARTED", 1);
        DEPARTED = hVar2;
        h hVar3 = new h("ARRIVED", 2);
        ARRIVED = hVar3;
        h hVar4 = new h("CANCELLED", 3);
        CANCELLED = hVar4;
        h hVar5 = new h("DIVERTED", 4);
        DIVERTED = hVar5;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5};
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
