package wk5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h EXCHANGE;
    public static final h SELF_HOSTED;
    public static final h UNKNOWN;

    static {
        h hVar = new h("EXCHANGE", 0);
        EXCHANGE = hVar;
        h hVar2 = new h("SELF_HOSTED", 1);
        SELF_HOSTED = hVar2;
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
