package hx2;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h BRAZIL_GLOBAL;
    public static final h BRAZIL_LOCAL;
    public static final h INDIA_GLOBAL;
    public static final h INDIA_LOCAL;

    static {
        h hVar = new h("BRAZIL_LOCAL", 0);
        BRAZIL_LOCAL = hVar;
        h hVar2 = new h("BRAZIL_GLOBAL", 1);
        BRAZIL_GLOBAL = hVar2;
        h hVar3 = new h("INDIA_LOCAL", 2);
        INDIA_LOCAL = hVar3;
        h hVar4 = new h("INDIA_GLOBAL", 3);
        INDIA_GLOBAL = hVar4;
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
