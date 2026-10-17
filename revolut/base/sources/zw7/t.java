package zw7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t PAYMENT_OVERDUE;
    public static final t UNKNOWN;

    static {
        t tVar = new t("PAYMENT_OVERDUE", 0);
        PAYMENT_OVERDUE = tVar;
        t tVar2 = new t("UNKNOWN", 1);
        UNKNOWN = tVar2;
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
