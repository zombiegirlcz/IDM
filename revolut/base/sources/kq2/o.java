package kq2;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o DIRECT_DEBIT_TOPUP;
    public static final o SAVINGS_WITHDRAWAL;
    public static final o TRADING_WITHDRAWAL;

    static {
        o oVar = new o("DIRECT_DEBIT_TOPUP", 0);
        DIRECT_DEBIT_TOPUP = oVar;
        o oVar2 = new o("TRADING_WITHDRAWAL", 1);
        TRADING_WITHDRAWAL = oVar2;
        o oVar3 = new o("SAVINGS_WITHDRAWAL", 2);
        SAVINGS_WITHDRAWAL = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        $VALUES = oVarArr;
        $ENTRIES = s.n(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
