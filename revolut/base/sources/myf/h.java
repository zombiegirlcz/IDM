package myf;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h MOBILE;
    public static final h MOBILE_OR_PAPER;
    public static final h PAPER;

    static {
        h hVar = new h("PAPER", 0);
        PAPER = hVar;
        h hVar2 = new h("MOBILE", 1);
        MOBILE = hVar2;
        h hVar3 = new h("MOBILE_OR_PAPER", 2);
        MOBILE_OR_PAPER = hVar3;
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
