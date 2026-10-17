package f5j;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h SEND_INTERNATIONAL_WITH_REVOLUT;
    public static final h SEND_MONEY_INSTANTLY_ABROAD;

    static {
        h hVar = new h("SEND_INTERNATIONAL_WITH_REVOLUT", 0);
        SEND_INTERNATIONAL_WITH_REVOLUT = hVar;
        h hVar2 = new h("SEND_MONEY_INSTANTLY_ABROAD", 1);
        SEND_MONEY_INSTANTLY_ABROAD = hVar2;
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
