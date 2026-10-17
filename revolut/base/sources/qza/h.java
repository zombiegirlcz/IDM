package qza;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ERROR;
    public static final h INITIAL;
    public static final h LOADED;
    public static final h LOADING;

    static {
        h hVar = new h("LOADING", 0);
        LOADING = hVar;
        h hVar2 = new h("ERROR", 1);
        ERROR = hVar2;
        h hVar3 = new h("INITIAL", 2);
        INITIAL = hVar3;
        h hVar4 = new h("LOADED", 3);
        LOADED = hVar4;
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
