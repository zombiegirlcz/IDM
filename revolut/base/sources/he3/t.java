package he3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t DAY_AFTER;
    public static final t DAY_BEFORE;
    public static final t SAME_DAY;

    static {
        t tVar = new t("SAME_DAY", 0);
        SAME_DAY = tVar;
        t tVar2 = new t("DAY_BEFORE", 1);
        DAY_BEFORE = tVar2;
        t tVar3 = new t("DAY_AFTER", 2);
        DAY_AFTER = tVar3;
        t[] tVarArr = {tVar, tVar2, tVar3};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
