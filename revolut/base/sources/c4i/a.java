package c4i;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BILL_ACCOUNTS;
    public static final a COMMODITY_ORDER;
    public static final a CREDIT_CARD;
    public static final a DONATIONS;
    public static final a EXCHANGE;
    public static final a ROBO_TOPUP;
    public static final a SAVINGS;
    public static final a TRADING_FUND_ORDER;
    public static final a TRADING_ORDER;
    public static final a VAULT_TRANSFER;

    static {
        a aVar = new a("EXCHANGE", 0);
        EXCHANGE = aVar;
        a aVar2 = new a("COMMODITY_ORDER", 1);
        COMMODITY_ORDER = aVar2;
        a aVar3 = new a("TRADING_ORDER", 2);
        TRADING_ORDER = aVar3;
        a aVar4 = new a("TRADING_FUND_ORDER", 3);
        TRADING_FUND_ORDER = aVar4;
        a aVar5 = new a("VAULT_TRANSFER", 4);
        VAULT_TRANSFER = aVar5;
        a aVar6 = new a("BILL_ACCOUNTS", 5);
        BILL_ACCOUNTS = aVar6;
        a aVar7 = new a("ROBO_TOPUP", 6);
        ROBO_TOPUP = aVar7;
        a aVar8 = new a("DONATIONS", 7);
        DONATIONS = aVar8;
        a aVar9 = new a("SAVINGS", 8);
        SAVINGS = aVar9;
        a aVar10 = new a("CREDIT_CARD", 9);
        CREDIT_CARD = aVar10;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
