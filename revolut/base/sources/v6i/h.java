package v6i;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h PRICE_CLOSE;
    public static final h PRICE_SHOULD_BE_HIGHER;
    public static final h PRICE_SHOULD_BE_LOWER;

    static {
        h hVar = new h("PRICE_CLOSE", 0);
        PRICE_CLOSE = hVar;
        h hVar2 = new h("PRICE_SHOULD_BE_LOWER", 1);
        PRICE_SHOULD_BE_LOWER = hVar2;
        h hVar3 = new h("PRICE_SHOULD_BE_HIGHER", 2);
        PRICE_SHOULD_BE_HIGHER = hVar3;
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
