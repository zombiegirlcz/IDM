package h3b;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ADD_MONEY;
    public static final h WITHDRAW;

    static {
        h hVar = new h("ADD_MONEY", 0);
        ADD_MONEY = hVar;
        h hVar2 = new h("WITHDRAW", 1);
        WITHDRAW = hVar2;
        h[] hVarArr = {hVar, hVar2};
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
