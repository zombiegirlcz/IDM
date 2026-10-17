package ril;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ADDRESS_SUGGESTION;
    public static final h CLOSE_CONNECTIONS;
    public static final h CONTACT_SELECTION;
    public static final h CREDIT_CONSENT;
    public static final h DATA_SHARING_CONSENT;
    public static final h DOCUMENT_SELECTION;
    public static final h EMPLOYER;
    public static final h PEP_ASSOCIATES;
    public static final h PERIODIC_REVIEW;
    public static final h POD_BENEFICIARIES;
    public static final h PRICING_PLANS_PROMPT;
    public static final h PRODUCT_OBSTACLES;
    public static final h RESIDENTIAL_ADDRESS_COLLECTION;
    public static final h RESIDENTIAL_ADDRESS_COLLECTION_V2;
    public static final h RISK_ASSESSMENT;
    public static final h SEND_GUARDIAN_INVITATION;
    public static final h TAX_RESIDENCIES_COLLECTION;
    public static final h TERMS_REVIEW;
    public static final h TRANSACTION_ACTIVITY;

    static {
        h hVar = new h("EMPLOYER", 0);
        EMPLOYER = hVar;
        h hVar2 = new h("RISK_ASSESSMENT", 1);
        RISK_ASSESSMENT = hVar2;
        h hVar3 = new h("PERIODIC_REVIEW", 2);
        PERIODIC_REVIEW = hVar3;
        h hVar4 = new h("TERMS_REVIEW", 3);
        TERMS_REVIEW = hVar4;
        h hVar5 = new h("DATA_SHARING_CONSENT", 4);
        DATA_SHARING_CONSENT = hVar5;
        h hVar6 = new h("CONTACT_SELECTION", 5);
        CONTACT_SELECTION = hVar6;
        h hVar7 = new h("DOCUMENT_SELECTION", 6);
        DOCUMENT_SELECTION = hVar7;
        h hVar8 = new h("RESIDENTIAL_ADDRESS_COLLECTION", 7);
        RESIDENTIAL_ADDRESS_COLLECTION = hVar8;
        h hVar9 = new h("RESIDENTIAL_ADDRESS_COLLECTION_V2", 8);
        RESIDENTIAL_ADDRESS_COLLECTION_V2 = hVar9;
        h hVar10 = new h("TRANSACTION_ACTIVITY", 9);
        TRANSACTION_ACTIVITY = hVar10;
        h hVar11 = new h("CLOSE_CONNECTIONS", 10);
        CLOSE_CONNECTIONS = hVar11;
        h hVar12 = new h("PEP_ASSOCIATES", 11);
        PEP_ASSOCIATES = hVar12;
        h hVar13 = new h("PRODUCT_OBSTACLES", 12);
        PRODUCT_OBSTACLES = hVar13;
        h hVar14 = new h("POD_BENEFICIARIES", 13);
        POD_BENEFICIARIES = hVar14;
        h hVar15 = new h("ADDRESS_SUGGESTION", 14);
        ADDRESS_SUGGESTION = hVar15;
        h hVar16 = new h("CREDIT_CONSENT", 15);
        CREDIT_CONSENT = hVar16;
        h hVar17 = new h("TAX_RESIDENCIES_COLLECTION", 16);
        TAX_RESIDENCIES_COLLECTION = hVar17;
        h hVar18 = new h("SEND_GUARDIAN_INVITATION", 17);
        SEND_GUARDIAN_INVITATION = hVar18;
        h hVar19 = new h("PRICING_PLANS_PROMPT", 18);
        PRICING_PLANS_PROMPT = hVar19;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14, hVar15, hVar16, hVar17, hVar18, hVar19};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
