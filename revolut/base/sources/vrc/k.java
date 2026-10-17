package vrc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;

    @yhm.d
    public static final k MANDATORY_TO_TRADE;
    public static final k OPTIONAL_TO_SKIP_2FA;
    public static final k TRADE_WITH_WARNING;

    static {
        k kVar = new k("OPTIONAL_TO_SKIP_2FA", 0);
        OPTIONAL_TO_SKIP_2FA = kVar;
        k kVar2 = new k("MANDATORY_TO_TRADE", 1);
        MANDATORY_TO_TRADE = kVar2;
        k kVar3 = new k("TRADE_WITH_WARNING", 2);
        TRADE_WITH_WARNING = kVar3;
        k[] kVarArr = {kVar, kVar2, kVar3};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
