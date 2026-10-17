package tde;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h CREDITED;
    public static final h DELAYED;
    public static final h IN_TRANSIT;
    public static final h NOT_FOUND;
    public static final h ON_HOLD;
    public static final h RETURNED;

    static {
        h hVar = new h("NOT_FOUND", 0);
        NOT_FOUND = hVar;
        h hVar2 = new h("IN_TRANSIT", 1);
        IN_TRANSIT = hVar2;
        h hVar3 = new h("DELAYED", 2);
        DELAYED = hVar3;
        h hVar4 = new h("RETURNED", 3);
        RETURNED = hVar4;
        h hVar5 = new h("ON_HOLD", 4);
        ON_HOLD = hVar5;
        h hVar6 = new h("CREDITED", 5);
        CREDITED = hVar6;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6};
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
