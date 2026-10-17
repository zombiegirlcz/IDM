package t48;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h AGREED;
    public static final h NOT_AGREED;
    public static final h NOT_REQUIRED;

    static {
        h hVar = new h("NOT_REQUIRED", 0);
        NOT_REQUIRED = hVar;
        h hVar2 = new h("AGREED", 1);
        AGREED = hVar2;
        h hVar3 = new h("NOT_AGREED", 2);
        NOT_AGREED = hVar3;
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
