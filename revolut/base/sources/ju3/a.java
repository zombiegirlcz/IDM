package ju3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AUTO_PAY;
    public static final a CARD_ORDERING_INTRO;
    public static final a CARD_ORDERING_SPINNER;
    public static final a CHECK_B;
    public static final a CONSENTS_V1;
    public static final a DOCUMENTS_AGREEMENTS;
    public static final a DOCUMENT_VIEWER;
    public static final a IDENTITY_VERIFICATION;
    public static final a LINKED_ACCOUNT_INTRO;
    public static final a MANUAL_UNDERWRITING;
    public static final a OFFER;
    public static final a SPOUSAL_CONSENT_INITIATOR_CHECKING;
    public static final a SPOUSAL_CONSENT_INITIATOR_FAILED;
    public static final a SPOUSAL_CONSENT_INITIATOR_FAILED_POPUP;
    public static final a SPOUSAL_CONSENT_INITIATOR_PARTNER_DECLINED;
    public static final a SPOUSAL_CONSENT_INITIATOR_PARTNER_DECLINED_POPUP;
    public static final a SPOUSAL_CONSENT_INITIATOR_PARTNER_NOT_MATCHED_POPUP;
    public static final a SPOUSAL_CONSENT_INITIATOR_REQUEST_CONSENT;
    public static final a SPOUSAL_CONSENT_INITIATOR_REQUEST_CONSENT_ERROR;
    public static final a SPOUSAL_CONSENT_INITIATOR_WAITING;
    public static final a SPOUSAL_CONSENT_INITIATOR_WAITING_POPUP;
    public static final a SPOUSAL_CONSENT_PARTNER;
    public static final a SPOUSAL_CONSENT_PARTNER_INIT_POPUP;
    public static final a SPOUSAL_CONSENT_PARTNER_WAITING_POPUP;

    static {
        a aVar = new a("CONSENTS_V1", 0);
        CONSENTS_V1 = aVar;
        a aVar2 = new a("CHECK_B", 1);
        CHECK_B = aVar2;
        a aVar3 = new a("OFFER", 2);
        OFFER = aVar3;
        a aVar4 = new a("IDENTITY_VERIFICATION", 3);
        IDENTITY_VERIFICATION = aVar4;
        a aVar5 = new a("DOCUMENTS_AGREEMENTS", 4);
        DOCUMENTS_AGREEMENTS = aVar5;
        a aVar6 = new a("DOCUMENT_VIEWER", 5);
        DOCUMENT_VIEWER = aVar6;
        a aVar7 = new a("AUTO_PAY", 6);
        AUTO_PAY = aVar7;
        a aVar8 = new a("SPOUSAL_CONSENT_INITIATOR_FAILED", 7);
        SPOUSAL_CONSENT_INITIATOR_FAILED = aVar8;
        a aVar9 = new a("SPOUSAL_CONSENT_INITIATOR_FAILED_POPUP", 8);
        SPOUSAL_CONSENT_INITIATOR_FAILED_POPUP = aVar9;
        a aVar10 = new a("SPOUSAL_CONSENT_INITIATOR_CHECKING", 9);
        SPOUSAL_CONSENT_INITIATOR_CHECKING = aVar10;
        a aVar11 = new a("SPOUSAL_CONSENT_INITIATOR_REQUEST_CONSENT", 10);
        SPOUSAL_CONSENT_INITIATOR_REQUEST_CONSENT = aVar11;
        a aVar12 = new a("SPOUSAL_CONSENT_INITIATOR_REQUEST_CONSENT_ERROR", 11);
        SPOUSAL_CONSENT_INITIATOR_REQUEST_CONSENT_ERROR = aVar12;
        a aVar13 = new a("SPOUSAL_CONSENT_INITIATOR_WAITING", 12);
        SPOUSAL_CONSENT_INITIATOR_WAITING = aVar13;
        a aVar14 = new a("SPOUSAL_CONSENT_INITIATOR_WAITING_POPUP", 13);
        SPOUSAL_CONSENT_INITIATOR_WAITING_POPUP = aVar14;
        a aVar15 = new a("SPOUSAL_CONSENT_INITIATOR_PARTNER_DECLINED", 14);
        SPOUSAL_CONSENT_INITIATOR_PARTNER_DECLINED = aVar15;
        a aVar16 = new a("SPOUSAL_CONSENT_INITIATOR_PARTNER_DECLINED_POPUP", 15);
        SPOUSAL_CONSENT_INITIATOR_PARTNER_DECLINED_POPUP = aVar16;
        a aVar17 = new a("SPOUSAL_CONSENT_INITIATOR_PARTNER_NOT_MATCHED_POPUP", 16);
        SPOUSAL_CONSENT_INITIATOR_PARTNER_NOT_MATCHED_POPUP = aVar17;
        a aVar18 = new a("SPOUSAL_CONSENT_PARTNER", 17);
        SPOUSAL_CONSENT_PARTNER = aVar18;
        a aVar19 = new a("SPOUSAL_CONSENT_PARTNER_INIT_POPUP", 18);
        SPOUSAL_CONSENT_PARTNER_INIT_POPUP = aVar19;
        a aVar20 = new a("SPOUSAL_CONSENT_PARTNER_WAITING_POPUP", 19);
        SPOUSAL_CONSENT_PARTNER_WAITING_POPUP = aVar20;
        a aVar21 = new a("LINKED_ACCOUNT_INTRO", 20);
        LINKED_ACCOUNT_INTRO = aVar21;
        a aVar22 = new a("CARD_ORDERING_INTRO", 21);
        CARD_ORDERING_INTRO = aVar22;
        a aVar23 = new a("CARD_ORDERING_SPINNER", 22);
        CARD_ORDERING_SPINNER = aVar23;
        a aVar24 = new a("MANUAL_UNDERWRITING", 23);
        MANUAL_UNDERWRITING = aVar24;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24};
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
