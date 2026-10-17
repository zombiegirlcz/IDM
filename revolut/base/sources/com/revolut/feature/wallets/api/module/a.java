package com.revolut.feature.wallets.api.module;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ANNUAL_LRS;
    public static final a ATM_ROLLING_DAY;
    public static final a ATM_ROLLING_MONTH;
    public static final a BALANCE_MCY;
    public static final a BRL_TO_USD_EXCHANGE_YEARLY;
    public static final a DAILY_INBOUND_MCY;
    public static final a DIRECT_DEBIT_MONTHLY;
    public static final a FLOW;
    public static final a INBOUND_TRANSFER_YEARLY;
    public static final a MONETISATION;
    public static final a MX_FCY_BALANCE;
    public static final a STOCK;
    public static final a TRANSFER_DAILY;
    public static final a TRANSFER_WEEKLY;
    public static final a TRANSFER_YEARLY;

    @NotNull
    private final String value;

    static {
        a aVar = new a("TRANSFER_DAILY", 0, "DAILY_OUTBOUND");
        TRANSFER_DAILY = aVar;
        a aVar2 = new a("TRANSFER_WEEKLY", 1, "WEEKLY_OUTBOUND");
        TRANSFER_WEEKLY = aVar2;
        a aVar3 = new a("TRANSFER_YEARLY", 2, "ANNUAL_OUTBOUND");
        TRANSFER_YEARLY = aVar3;
        a aVar4 = new a("DIRECT_DEBIT_MONTHLY", 3, "MONTHLY_DIRECT_DEBIT_TOPUP");
        DIRECT_DEBIT_MONTHLY = aVar4;
        a aVar5 = new a("BRL_TO_USD_EXCHANGE_YEARLY", 4, "BRL_USD_YEARLY_EXCHANGE");
        BRL_TO_USD_EXCHANGE_YEARLY = aVar5;
        a aVar6 = new a("INBOUND_TRANSFER_YEARLY", 5, "ANNUAL_INBOUND");
        INBOUND_TRANSFER_YEARLY = aVar6;
        a aVar7 = new a("ATM_ROLLING_MONTH", 6, "ATM_ROLLING_MONTH");
        ATM_ROLLING_MONTH = aVar7;
        a aVar8 = new a("ATM_ROLLING_DAY", 7, "ATM_ROLLING_DAY");
        ATM_ROLLING_DAY = aVar8;
        a aVar9 = new a("STOCK", 8, "STOCK");
        STOCK = aVar9;
        a aVar10 = new a("FLOW", 9, "FLOW");
        FLOW = aVar10;
        a aVar11 = new a("BALANCE_MCY", 10, "BALANCE_MCY");
        BALANCE_MCY = aVar11;
        a aVar12 = new a("DAILY_INBOUND_MCY", 11, "DAILY_INBOUND_MCY");
        DAILY_INBOUND_MCY = aVar12;
        a aVar13 = new a("ANNUAL_LRS", 12, "ANNUAL_LRS");
        ANNUAL_LRS = aVar13;
        a aVar14 = new a("MX_FCY_BALANCE", 13, "MX_FCY_BALANCE");
        MX_FCY_BALANCE = aVar14;
        a aVar15 = new a("MONETISATION", 14, "MONETISATION");
        MONETISATION = aVar15;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.value = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
