package wga;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j BANK_TRANSFER;
    public static final j CARD_TRANSFER;
    public static final j CRYPTO_EXCHANGE_BREAKDOWN;
    public static final j EXCHANGE_BREAKDOWN;
    public static final j LOUNGE_CHECKOUT;
    public static final j LOYALTY_TRANSACTION;
    public static final j REMITTANCE_ROUTES;
    public static final j RENT_AND_BILLS;
    public static final j TRANSACTION_DETAILS;

    static {
        j jVar = new j("EXCHANGE_BREAKDOWN", 0);
        EXCHANGE_BREAKDOWN = jVar;
        j jVar2 = new j("BANK_TRANSFER", 1);
        BANK_TRANSFER = jVar2;
        j jVar3 = new j("CARD_TRANSFER", 2);
        CARD_TRANSFER = jVar3;
        j jVar4 = new j("REMITTANCE_ROUTES", 3);
        REMITTANCE_ROUTES = jVar4;
        j jVar5 = new j("TRANSACTION_DETAILS", 4);
        TRANSACTION_DETAILS = jVar5;
        j jVar6 = new j("RENT_AND_BILLS", 5);
        RENT_AND_BILLS = jVar6;
        j jVar7 = new j("LOUNGE_CHECKOUT", 6);
        LOUNGE_CHECKOUT = jVar7;
        j jVar8 = new j("LOYALTY_TRANSACTION", 7);
        LOYALTY_TRANSACTION = jVar8;
        j jVar9 = new j("CRYPTO_EXCHANGE_BREAKDOWN", 8);
        CRYPTO_EXCHANGE_BREAKDOWN = jVar9;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
