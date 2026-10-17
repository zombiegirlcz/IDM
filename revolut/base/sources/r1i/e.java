package r1i;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e AMOUNT_TOO_SMALL;
    public static final e BRL_LOWER_LIMIT_EXCEEDED;
    public static final e BRL_UPPER_LIMIT_EXCEEDED;
    public static final e BRL_USAGE_LIMIT_EXCEEDED;
    public static final e ESTIMATED;
    public static final e EXCEEDED_BALANCE;
    public static final e EXCEEDED_CRYPTO_LIMIT;
    public static final e FAILED_COMMODITY_LOWER_LIMIT;
    public static final e FAILED_CRYPTO_LOWER_LIMIT;
    public static final e LIMIT_PRICE_NEEDED;
    public static final e MX_BALANCE_LIMIT_EXCEEDED;
    public static final e NOT_DEALABLE_CURRENCIES;
    public static final e STOP_PRICE_NEEDED;

    static {
        e eVar = new e("EXCEEDED_BALANCE", 0);
        EXCEEDED_BALANCE = eVar;
        e eVar2 = new e("AMOUNT_TOO_SMALL", 1);
        AMOUNT_TOO_SMALL = eVar2;
        e eVar3 = new e("LIMIT_PRICE_NEEDED", 2);
        LIMIT_PRICE_NEEDED = eVar3;
        e eVar4 = new e("STOP_PRICE_NEEDED", 3);
        STOP_PRICE_NEEDED = eVar4;
        e eVar5 = new e("ESTIMATED", 4);
        ESTIMATED = eVar5;
        e eVar6 = new e("EXCEEDED_CRYPTO_LIMIT", 5);
        EXCEEDED_CRYPTO_LIMIT = eVar6;
        e eVar7 = new e("FAILED_CRYPTO_LOWER_LIMIT", 6);
        FAILED_CRYPTO_LOWER_LIMIT = eVar7;
        e eVar8 = new e("FAILED_COMMODITY_LOWER_LIMIT", 7);
        FAILED_COMMODITY_LOWER_LIMIT = eVar8;
        e eVar9 = new e("MX_BALANCE_LIMIT_EXCEEDED", 8);
        MX_BALANCE_LIMIT_EXCEEDED = eVar9;
        e eVar10 = new e("BRL_USAGE_LIMIT_EXCEEDED", 9);
        BRL_USAGE_LIMIT_EXCEEDED = eVar10;
        e eVar11 = new e("BRL_UPPER_LIMIT_EXCEEDED", 10);
        BRL_UPPER_LIMIT_EXCEEDED = eVar11;
        e eVar12 = new e("BRL_LOWER_LIMIT_EXCEEDED", 11);
        BRL_LOWER_LIMIT_EXCEEDED = eVar12;
        e eVar13 = new e("NOT_DEALABLE_CURRENCIES", 12);
        NOT_DEALABLE_CURRENCIES = eVar13;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
