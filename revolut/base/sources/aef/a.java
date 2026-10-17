package aef;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ARBITRATION;
    public static final a CANCELLED;
    public static final a INELIGIBLE;
    public static final a INFORMATION_PROVIDED;
    public static final a INFORMATION_PROVIDED_SECOND_STAGE;
    public static final a INFORMATION_REQUIRED;
    public static final a INVALID;
    public static final a IN_REVIEW;
    public static final a MERCHANT_REFUND;
    public static final a PENDING_TRANSACTION;
    public static final a PENDING_USER_CONFIRMATION;
    public static final a PENDING_USER_SECOND_STAGE;
    public static final a PRE_ARBITRATION;
    public static final a PROVISIONAL_REFUND;
    public static final a PROVISIONAL_REFUND_REVERTED;
    public static final a RAISED_TO_CARD_SCHEME;
    public static final a REFUNDED;
    public static final a REVIEWING_EVIDENCE;
    public static final a SENT_BACK_TO_CARD_SCHEME;
    public static final a SUBMITTED;
    public static final a SUCCESSFUL;
    public static final a UNSUCCESSFUL;

    static {
        a aVar = new a("SUBMITTED", 0);
        SUBMITTED = aVar;
        a aVar2 = new a("IN_REVIEW", 1);
        IN_REVIEW = aVar2;
        a aVar3 = new a("INVALID", 2);
        INVALID = aVar3;
        a aVar4 = new a("REFUNDED", 3);
        REFUNDED = aVar4;
        a aVar5 = new a("RAISED_TO_CARD_SCHEME", 4);
        RAISED_TO_CARD_SCHEME = aVar5;
        a aVar6 = new a("CANCELLED", 5);
        CANCELLED = aVar6;
        a aVar7 = new a("UNSUCCESSFUL", 6);
        UNSUCCESSFUL = aVar7;
        a aVar8 = new a("SUCCESSFUL", 7);
        SUCCESSFUL = aVar8;
        a aVar9 = new a("PROVISIONAL_REFUND_REVERTED", 8);
        PROVISIONAL_REFUND_REVERTED = aVar9;
        a aVar10 = new a("MERCHANT_REFUND", 9);
        MERCHANT_REFUND = aVar10;
        a aVar11 = new a("PROVISIONAL_REFUND", 10);
        PROVISIONAL_REFUND = aVar11;
        a aVar12 = new a("REVIEWING_EVIDENCE", 11);
        REVIEWING_EVIDENCE = aVar12;
        a aVar13 = new a("SENT_BACK_TO_CARD_SCHEME", 12);
        SENT_BACK_TO_CARD_SCHEME = aVar13;
        a aVar14 = new a("INELIGIBLE", 13);
        INELIGIBLE = aVar14;
        a aVar15 = new a("PENDING_TRANSACTION", 14);
        PENDING_TRANSACTION = aVar15;
        a aVar16 = new a("INFORMATION_PROVIDED", 15);
        INFORMATION_PROVIDED = aVar16;
        a aVar17 = new a("INFORMATION_PROVIDED_SECOND_STAGE", 16);
        INFORMATION_PROVIDED_SECOND_STAGE = aVar17;
        a aVar18 = new a("INFORMATION_REQUIRED", 17);
        INFORMATION_REQUIRED = aVar18;
        a aVar19 = new a("PENDING_USER_CONFIRMATION", 18);
        PENDING_USER_CONFIRMATION = aVar19;
        a aVar20 = new a("PENDING_USER_SECOND_STAGE", 19);
        PENDING_USER_SECOND_STAGE = aVar20;
        a aVar21 = new a("PRE_ARBITRATION", 20);
        PRE_ARBITRATION = aVar21;
        a aVar22 = new a("ARBITRATION", 21);
        ARBITRATION = aVar22;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22};
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
