package u6c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k CARDHOLDER_NAME_MISSING;
    public static final k CUSTOMER_NAME_MISMATCH;
    public static final k DO_NOT_HONOUR;
    public static final k EXPIRED_CARD;
    public static final k HIGH_RISK;
    public static final k INSUFFICIENT_FUNDS;
    public static final k INVALID_AMOUNT;
    public static final k INVALID_CARD;
    public static final k INVALID_EMAIL;
    public static final k PAYMENT_ATTEMPT_BLOCKED;
    public static final k PICK_UP_CARD;
    public static final k REJECTED_BY_CUSTOMER;
    public static final k RESTRICTED_CARD;
    public static final k SUSPECTED_FRAUD;
    public static final k THREE_DS_CHALLENGE_ABANDONED;
    public static final k THREE_DS_CHALLENGE_FAILED;
    public static final k THREE_DS_CHALLENGE_FAILED_MANUALLY;
    public static final k TRANSACTION_NOT_ALLOWED_FOR_CARDHOLDER;
    public static final k UNKNOWN_CARD;
    public static final k WITHDRAWAL_LIMIT_EXCEEDED;

    static {
        k kVar = new k("HIGH_RISK", 0);
        HIGH_RISK = kVar;
        k kVar2 = new k("UNKNOWN_CARD", 1);
        UNKNOWN_CARD = kVar2;
        k kVar3 = new k("PICK_UP_CARD", 2);
        PICK_UP_CARD = kVar3;
        k kVar4 = new k("INVALID_CARD", 3);
        INVALID_CARD = kVar4;
        k kVar5 = new k("EXPIRED_CARD", 4);
        EXPIRED_CARD = kVar5;
        k kVar6 = new k("DO_NOT_HONOUR", 5);
        DO_NOT_HONOUR = kVar6;
        k kVar7 = new k("INVALID_EMAIL", 6);
        INVALID_EMAIL = kVar7;
        k kVar8 = new k("INVALID_AMOUNT", 7);
        INVALID_AMOUNT = kVar8;
        k kVar9 = new k("RESTRICTED_CARD", 8);
        RESTRICTED_CARD = kVar9;
        k kVar10 = new k("INSUFFICIENT_FUNDS", 9);
        INSUFFICIENT_FUNDS = kVar10;
        k kVar11 = new k("REJECTED_BY_CUSTOMER", 10);
        REJECTED_BY_CUSTOMER = kVar11;
        k kVar12 = new k("CARDHOLDER_NAME_MISSING", 11);
        CARDHOLDER_NAME_MISSING = kVar12;
        k kVar13 = new k("WITHDRAWAL_LIMIT_EXCEEDED", 12);
        WITHDRAWAL_LIMIT_EXCEEDED = kVar13;
        k kVar14 = new k("THREE_DS_CHALLENGE_FAILED", 13);
        THREE_DS_CHALLENGE_FAILED = kVar14;
        k kVar15 = new k("THREE_DS_CHALLENGE_ABANDONED", 14);
        THREE_DS_CHALLENGE_ABANDONED = kVar15;
        k kVar16 = new k("THREE_DS_CHALLENGE_FAILED_MANUALLY", 15);
        THREE_DS_CHALLENGE_FAILED_MANUALLY = kVar16;
        k kVar17 = new k("TRANSACTION_NOT_ALLOWED_FOR_CARDHOLDER", 16);
        TRANSACTION_NOT_ALLOWED_FOR_CARDHOLDER = kVar17;
        k kVar18 = new k("PAYMENT_ATTEMPT_BLOCKED", 17);
        PAYMENT_ATTEMPT_BLOCKED = kVar18;
        k kVar19 = new k("CUSTOMER_NAME_MISMATCH", 18);
        CUSTOMER_NAME_MISMATCH = kVar19;
        k kVar20 = new k("SUSPECTED_FRAUD", 19);
        SUSPECTED_FRAUD = kVar20;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16, kVar17, kVar18, kVar19, kVar20};
        $VALUES = kVarArr;
        $ENTRIES = vc.s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
