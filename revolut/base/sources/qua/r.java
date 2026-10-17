package qua;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r PORTFOLIO;
    public static final r SAVINGS_ACCOUNT;
    public static final r UNKNOWN;

    static {
        r rVar = new r("SAVINGS_ACCOUNT", 0);
        SAVINGS_ACCOUNT = rVar;
        r rVar2 = new r("PORTFOLIO", 1);
        PORTFOLIO = rVar2;
        r rVar3 = new r("UNKNOWN", 2);
        UNKNOWN = rVar3;
        r[] rVarArr = {rVar, rVar2, rVar3};
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
