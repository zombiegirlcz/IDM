package ekd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;

    @rlm.r(names = {"AMOUNT", "amount"})
    public static final t AMOUNT;

    @rlm.r(names = {"COUNT", "count"})
    public static final t COUNT;

    static {
        t tVar = new t("COUNT", 0);
        COUNT = tVar;
        t tVar2 = new t("AMOUNT", 1);
        AMOUNT = tVar2;
        t[] tVarArr = {tVar, tVar2};
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
