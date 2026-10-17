package zzg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h COMMODITY;
    public static final h CRYPTO;
    public static final h SECURITY;

    static {
        h hVar = new h("COMMODITY", 0);
        COMMODITY = hVar;
        h hVar2 = new h("SECURITY", 1);
        SECURITY = hVar2;
        h hVar3 = new h("CRYPTO", 2);
        CRYPTO = hVar3;
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
