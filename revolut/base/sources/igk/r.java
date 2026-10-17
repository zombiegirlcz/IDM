package igk;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r BOTTOM_SHEET;
    public static final r FULL_SCREEN;

    static {
        r rVar = new r("BOTTOM_SHEET", 0);
        BOTTOM_SHEET = rVar;
        r rVar2 = new r("FULL_SCREEN", 1);
        FULL_SCREEN = rVar2;
        r[] rVarArr = {rVar, rVar2};
        $VALUES = rVarArr;
        $ENTRIES = vc.s.n(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
