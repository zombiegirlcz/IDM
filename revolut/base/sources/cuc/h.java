package cuc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h COUNT;
    public static final h TRANSACTION;
    public static final h UNKNOWN;
    public static final h VOLUME;

    static {
        h hVar = new h("VOLUME", 0);
        VOLUME = hVar;
        h hVar2 = new h("TRANSACTION", 1);
        TRANSACTION = hVar2;
        h hVar3 = new h("COUNT", 2);
        COUNT = hVar3;
        h hVar4 = new h("UNKNOWN", 3);
        UNKNOWN = hVar4;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
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
