package com.revolut.data.database.models.recurringpayments;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lg.b;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentTypeEmbeddedEntity;", "", "<init>", "(Ljava/lang/String;I)V", "SAVINGS_POCKET", "VAULT", "BILL_MONEY_BOX", "INTERNAL", "EXTERNAL_MANDATE", "CARD_MANDATE", "MANUAL_CARD_MANDATE", "EXTERNAL", "YOUTH_ALLOWANCE", "CRYPTO", "TRIAL", "PAY_LATER_PAYMENT", "ACQUIRING_ONE_OFF", "ACQUIRING_SUBSCRIPTION", "PAID_PLAN", "COBRANDS", "WALLET", "BPAY", "NZ_BILLS", "UAE_BILLS", "PIX_MANDATE", "UPI", "UPI_MANDATE", "GIRO_HU_DIRECT_DEBIT", "MASAV_IL_DIRECT_DEBIT", "BOLETO", "MOBILE_PLAN_SUBSCRIPTION", "UNKNOWN", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringPaymentTypeEmbeddedEntity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RecurringPaymentTypeEmbeddedEntity[] $VALUES;

    @b("SAVINGS_POCKET")
    public static final RecurringPaymentTypeEmbeddedEntity SAVINGS_POCKET = new RecurringPaymentTypeEmbeddedEntity("SAVINGS_POCKET", 0);

    @b("VAULT")
    public static final RecurringPaymentTypeEmbeddedEntity VAULT = new RecurringPaymentTypeEmbeddedEntity("VAULT", 1);

    @b("BILL_MONEY_BOX")
    public static final RecurringPaymentTypeEmbeddedEntity BILL_MONEY_BOX = new RecurringPaymentTypeEmbeddedEntity("BILL_MONEY_BOX", 2);

    @b("INTERNAL")
    public static final RecurringPaymentTypeEmbeddedEntity INTERNAL = new RecurringPaymentTypeEmbeddedEntity("INTERNAL", 3);

    @b("EXTERNAL_MANDATE")
    public static final RecurringPaymentTypeEmbeddedEntity EXTERNAL_MANDATE = new RecurringPaymentTypeEmbeddedEntity("EXTERNAL_MANDATE", 4);

    @b("CARD_MANDATE")
    public static final RecurringPaymentTypeEmbeddedEntity CARD_MANDATE = new RecurringPaymentTypeEmbeddedEntity("CARD_MANDATE", 5);

    @b("MANUAL_CARD_MANDATE")
    public static final RecurringPaymentTypeEmbeddedEntity MANUAL_CARD_MANDATE = new RecurringPaymentTypeEmbeddedEntity("MANUAL_CARD_MANDATE", 6);

    @b("EXTERNAL")
    public static final RecurringPaymentTypeEmbeddedEntity EXTERNAL = new RecurringPaymentTypeEmbeddedEntity("EXTERNAL", 7);

    @b("YOUTH_ALLOWANCE")
    public static final RecurringPaymentTypeEmbeddedEntity YOUTH_ALLOWANCE = new RecurringPaymentTypeEmbeddedEntity("YOUTH_ALLOWANCE", 8);

    @b("CRYPTO")
    public static final RecurringPaymentTypeEmbeddedEntity CRYPTO = new RecurringPaymentTypeEmbeddedEntity("CRYPTO", 9);

    @b("TRIAL")
    public static final RecurringPaymentTypeEmbeddedEntity TRIAL = new RecurringPaymentTypeEmbeddedEntity("TRIAL", 10);

    @b("INSTALMENT_PAYMENT")
    public static final RecurringPaymentTypeEmbeddedEntity PAY_LATER_PAYMENT = new RecurringPaymentTypeEmbeddedEntity("PAY_LATER_PAYMENT", 11);

    @b("ACQUIRING_ONE_OFF")
    public static final RecurringPaymentTypeEmbeddedEntity ACQUIRING_ONE_OFF = new RecurringPaymentTypeEmbeddedEntity("ACQUIRING_ONE_OFF", 12);

    @b("ACQUIRING_SUBSCRIPTION")
    public static final RecurringPaymentTypeEmbeddedEntity ACQUIRING_SUBSCRIPTION = new RecurringPaymentTypeEmbeddedEntity("ACQUIRING_SUBSCRIPTION", 13);

    @b("PAID_PLAN")
    public static final RecurringPaymentTypeEmbeddedEntity PAID_PLAN = new RecurringPaymentTypeEmbeddedEntity("PAID_PLAN", 14);

    @b("COBRANDS")
    public static final RecurringPaymentTypeEmbeddedEntity COBRANDS = new RecurringPaymentTypeEmbeddedEntity("COBRANDS", 15);

    @b("WALLET")
    public static final RecurringPaymentTypeEmbeddedEntity WALLET = new RecurringPaymentTypeEmbeddedEntity("WALLET", 16);

    @b("BPAY")
    public static final RecurringPaymentTypeEmbeddedEntity BPAY = new RecurringPaymentTypeEmbeddedEntity("BPAY", 17);

    @b("NZ_BILLS")
    public static final RecurringPaymentTypeEmbeddedEntity NZ_BILLS = new RecurringPaymentTypeEmbeddedEntity("NZ_BILLS", 18);

    @b("UAE_BILLS")
    public static final RecurringPaymentTypeEmbeddedEntity UAE_BILLS = new RecurringPaymentTypeEmbeddedEntity("UAE_BILLS", 19);

    @b("PIX_MANDATE")
    public static final RecurringPaymentTypeEmbeddedEntity PIX_MANDATE = new RecurringPaymentTypeEmbeddedEntity("PIX_MANDATE", 20);

    @b("UPI")
    public static final RecurringPaymentTypeEmbeddedEntity UPI = new RecurringPaymentTypeEmbeddedEntity("UPI", 21);

    @b("UPI_MANDATE")
    public static final RecurringPaymentTypeEmbeddedEntity UPI_MANDATE = new RecurringPaymentTypeEmbeddedEntity("UPI_MANDATE", 22);

    @b("GIRO_HU_DIRECT_DEBIT")
    public static final RecurringPaymentTypeEmbeddedEntity GIRO_HU_DIRECT_DEBIT = new RecurringPaymentTypeEmbeddedEntity("GIRO_HU_DIRECT_DEBIT", 23);

    @b("MASAV_IL_DIRECT_DEBIT")
    public static final RecurringPaymentTypeEmbeddedEntity MASAV_IL_DIRECT_DEBIT = new RecurringPaymentTypeEmbeddedEntity("MASAV_IL_DIRECT_DEBIT", 24);

    @b("BOLETO")
    public static final RecurringPaymentTypeEmbeddedEntity BOLETO = new RecurringPaymentTypeEmbeddedEntity("BOLETO", 25);

    @b("MOBILE_PLAN_SUBSCRIPTION")
    public static final RecurringPaymentTypeEmbeddedEntity MOBILE_PLAN_SUBSCRIPTION = new RecurringPaymentTypeEmbeddedEntity("MOBILE_PLAN_SUBSCRIPTION", 26);

    @b("UNKNOWN")
    public static final RecurringPaymentTypeEmbeddedEntity UNKNOWN = new RecurringPaymentTypeEmbeddedEntity("UNKNOWN", 27);

    private static final /* synthetic */ RecurringPaymentTypeEmbeddedEntity[] $values() {
        return new RecurringPaymentTypeEmbeddedEntity[]{SAVINGS_POCKET, VAULT, BILL_MONEY_BOX, INTERNAL, EXTERNAL_MANDATE, CARD_MANDATE, MANUAL_CARD_MANDATE, EXTERNAL, YOUTH_ALLOWANCE, CRYPTO, TRIAL, PAY_LATER_PAYMENT, ACQUIRING_ONE_OFF, ACQUIRING_SUBSCRIPTION, PAID_PLAN, COBRANDS, WALLET, BPAY, NZ_BILLS, UAE_BILLS, PIX_MANDATE, UPI, UPI_MANDATE, GIRO_HU_DIRECT_DEBIT, MASAV_IL_DIRECT_DEBIT, BOLETO, MOBILE_PLAN_SUBSCRIPTION, UNKNOWN};
    }

    static {
        RecurringPaymentTypeEmbeddedEntity[] recurringPaymentTypeEmbeddedEntityArr$values = $values();
        $VALUES = recurringPaymentTypeEmbeddedEntityArr$values;
        $ENTRIES = s.n(recurringPaymentTypeEmbeddedEntityArr$values);
    }

    private RecurringPaymentTypeEmbeddedEntity(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static RecurringPaymentTypeEmbeddedEntity valueOf(String str) {
        return (RecurringPaymentTypeEmbeddedEntity) Enum.valueOf(RecurringPaymentTypeEmbeddedEntity.class, str);
    }

    public static RecurringPaymentTypeEmbeddedEntity[] values() {
        return (RecurringPaymentTypeEmbeddedEntity[]) $VALUES.clone();
    }
}
