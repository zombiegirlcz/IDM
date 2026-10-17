package o5l;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h MAESTRO;
    public static final h MC;
    public static final h MULTIBANCO;
    public static final h UNKNOWN;
    public static final h VISA;

    static {
        h hVar = new h("MC", 0);
        MC = hVar;
        h hVar2 = new h("VISA", 1);
        VISA = hVar2;
        h hVar3 = new h("MAESTRO", 2);
        MAESTRO = hVar3;
        h hVar4 = new h("MULTIBANCO", 3);
        MULTIBANCO = hVar4;
        h hVar5 = new h("UNKNOWN", 4);
        UNKNOWN = hVar5;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5};
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
