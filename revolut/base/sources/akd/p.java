package akd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;

    @rlm.r(names = {"DARK", "dark"})
    public static final p DARK;

    @rlm.r(names = {"LIGHT", "light"})
    public static final p LIGHT;

    static {
        p pVar = new p("DARK", 0);
        DARK = pVar;
        p pVar2 = new p("LIGHT", 1);
        LIGHT = pVar2;
        p[] pVarArr = {pVar, pVar2};
        $VALUES = pVarArr;
        $ENTRIES = vc.s.n(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
