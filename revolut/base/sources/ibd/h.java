package ibd;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ACQUIRING_ONE_OFF;
    public static final h ACQUIRING_SUBSCRIPTION;
    public static final h BILL;
    public static final h BILL_MONEY_BOX;
    public static final h BIZUM_MANDATE;
    public static final h BOLETO;
    public static final h BPAY;
    public static final h CARD_MANDATE;
    public static final h COBRANDS;
    public static final h COMMODITY;
    public static final h CREDIT_CARD_PAYMENT;
    public static final h CRYPTO;

    @NotNull
    public static final g Companion;
    public static final h DIRECT_DEBIT_TOPUP;
    public static final h EXTERNAL;
    public static final h EXTERNAL_MANDATE;
    public static final h GIRO_HU_DIRECT_DEBIT;
    public static final h INTERNAL;
    public static final h INTERNAL_CHARITY;
    public static final h LOAN_PAYMENT;
    public static final h MANUAL_CARD_MANDATE;
    public static final h MASAV_IL_DIRECT_DEBIT;
    public static final h MOBILE_PLAN_SUBSCRIPTION;
    public static final h MORTGAGE_PAYMENT;
    public static final h NZ_BILLS;
    public static final h PAID_PLAN;
    public static final h PAY_LATER_PAYMENT;
    public static final h PIX_MANDATE;
    public static final h PREDEFINED_CARD_MANDATE;
    public static final h QR_CODE;
    public static final h REFUND;
    public static final h SAVINGS_POCKET;
    public static final h UAE_BILLS;
    public static final h UNKNOWN;
    public static final h UPI;
    public static final h UPI_MANDATE;
    public static final h VAULT;
    public static final h WALLET;
    public static final h YOUTH_ALLOWANCE;

    @NotNull
    private final String typeName;

    static {
        h hVar = new h("SAVINGS_POCKET", 0, "SAVINGS_POCKET");
        SAVINGS_POCKET = hVar;
        h hVar2 = new h("VAULT", 1, "VAULT");
        VAULT = hVar2;
        h hVar3 = new h("BILL_MONEY_BOX", 2, "BILL_MONEY_BOX");
        BILL_MONEY_BOX = hVar3;
        h hVar4 = new h("INTERNAL", 3, "INTERNAL");
        INTERNAL = hVar4;
        h hVar5 = new h("EXTERNAL_MANDATE", 4, "EXTERNAL_MANDATE");
        EXTERNAL_MANDATE = hVar5;
        h hVar6 = new h("EXTERNAL", 5, "EXTERNAL");
        EXTERNAL = hVar6;
        h hVar7 = new h("INTERNAL_CHARITY", 6, "INTERNAL_CHARITY");
        INTERNAL_CHARITY = hVar7;
        h hVar8 = new h("YOUTH_ALLOWANCE", 7, "YOUTH_ALLOWANCE");
        YOUTH_ALLOWANCE = hVar8;
        h hVar9 = new h("CARD_MANDATE", 8, "CARD_MANDATE");
        CARD_MANDATE = hVar9;
        h hVar10 = new h("MANUAL_CARD_MANDATE", 9, "MANUAL_CARD_MANDATE");
        MANUAL_CARD_MANDATE = hVar10;
        h hVar11 = new h("PREDEFINED_CARD_MANDATE", 10, "PREDEFINED_CARD_MANDATE");
        PREDEFINED_CARD_MANDATE = hVar11;
        h hVar12 = new h("COBRANDS", 11, "COBRANDS");
        COBRANDS = hVar12;
        h hVar13 = new h("COMMODITY", 12, "COMMODITY");
        COMMODITY = hVar13;
        h hVar14 = new h("CRYPTO", 13, "CRYPTO");
        CRYPTO = hVar14;
        h hVar15 = new h("CREDIT_CARD_PAYMENT", 14, "CREDIT_CARD_PAYMENT");
        CREDIT_CARD_PAYMENT = hVar15;
        h hVar16 = new h("PAY_LATER_PAYMENT", 15, "INSTALMENT_PAYMENT");
        PAY_LATER_PAYMENT = hVar16;
        h hVar17 = new h("DIRECT_DEBIT_TOPUP", 16, "DIRECT_DEBIT_TOPUP");
        DIRECT_DEBIT_TOPUP = hVar17;
        h hVar18 = new h("LOAN_PAYMENT", 17, "LOAN_PAYMENT");
        LOAN_PAYMENT = hVar18;
        h hVar19 = new h("MORTGAGE_PAYMENT", 18, "MORTGAGE_PAYMENT");
        MORTGAGE_PAYMENT = hVar19;
        h hVar20 = new h("ACQUIRING_ONE_OFF", 19, "ACQUIRING_ONE_OFF");
        ACQUIRING_ONE_OFF = hVar20;
        h hVar21 = new h("ACQUIRING_SUBSCRIPTION", 20, "ACQUIRING_SUBSCRIPTION");
        ACQUIRING_SUBSCRIPTION = hVar21;
        h hVar22 = new h("PAID_PLAN", 21, "PAID_PLAN");
        PAID_PLAN = hVar22;
        h hVar23 = new h("WALLET", 22, "WALLET");
        WALLET = hVar23;
        h hVar24 = new h("REFUND", 23, "REFUND");
        REFUND = hVar24;
        h hVar25 = new h("BIZUM_MANDATE", 24, "BIZUM_MANDATE");
        BIZUM_MANDATE = hVar25;
        h hVar26 = new h("BILL", 25, "BILL");
        BILL = hVar26;
        h hVar27 = new h("NZ_BILLS", 26, "NZ_BILLS");
        NZ_BILLS = hVar27;
        h hVar28 = new h("UAE_BILLS", 27, "UAE_BILLS");
        UAE_BILLS = hVar28;
        h hVar29 = new h("BPAY", 28, "BPAY");
        BPAY = hVar29;
        h hVar30 = new h("QR_CODE", 29, "QR_CODE");
        QR_CODE = hVar30;
        h hVar31 = new h("PIX_MANDATE", 30, "PIX_MANDATE");
        PIX_MANDATE = hVar31;
        h hVar32 = new h("UPI", 31, "UPI");
        UPI = hVar32;
        h hVar33 = new h("UPI_MANDATE", 32, "UPI_MANDATE");
        UPI_MANDATE = hVar33;
        h hVar34 = new h("GIRO_HU_DIRECT_DEBIT", 33, "GIRO_HU_DIRECT_DEBIT");
        GIRO_HU_DIRECT_DEBIT = hVar34;
        h hVar35 = new h("MASAV_IL_DIRECT_DEBIT", 34, "MASAV_IL_DIRECT_DEBIT");
        MASAV_IL_DIRECT_DEBIT = hVar35;
        h hVar36 = new h("BOLETO", 35, "BOLETO");
        BOLETO = hVar36;
        h hVar37 = new h("MOBILE_PLAN_SUBSCRIPTION", 36, "MOBILE_PLAN_SUBSCRIPTION");
        MOBILE_PLAN_SUBSCRIPTION = hVar37;
        h hVar38 = new h("UNKNOWN", 37, "UNKNOWN");
        UNKNOWN = hVar38;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14, hVar15, hVar16, hVar17, hVar18, hVar19, hVar20, hVar21, hVar22, hVar23, hVar24, hVar25, hVar26, hVar27, hVar28, hVar29, hVar30, hVar31, hVar32, hVar33, hVar34, hVar35, hVar36, hVar37, hVar38};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
        Companion = new g();
    }

    public h(String str, int i, String str2) {
        this.typeName = str2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final String a() {
        return this.typeName;
    }

    public final boolean b() {
        return this == PIX_MANDATE || this == UPI_MANDATE;
    }

    public final boolean c() {
        h[] elements = {BPAY, NZ_BILLS, UAE_BILLS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements).contains(this);
    }

    public final boolean d() {
        h[] elements = {CARD_MANDATE, MANUAL_CARD_MANDATE, PREDEFINED_CARD_MANDATE, BIZUM_MANDATE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements).contains(this);
    }

    public final boolean e() {
        return this == EXTERNAL_MANDATE;
    }
}
