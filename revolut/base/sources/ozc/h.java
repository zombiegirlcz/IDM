package ozc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h AMOUNT;
    public static final h BANK_STATEMENT_EVIDENCE_LIST;
    public static final h DESCRIPTION;
    public static final h DOCUMENT_LIST;
    public static final h EVIDENCE_LIST;
    public static final h EVIDENCE_TYPES;
    public static final h FREQUENCY;
    public static final h HELP;
    public static final h INCOME_DESTINATION;
    public static final h NOTE;
    public static final h OTHER_DOCUMENT;
    public static final h QUESTION;
    public static final h REQUEST_DOCUMENTS;
    public static final h RESUBMIT_SUMMARY;
    public static final h STATE;
    public static final h SUMMARY;

    static {
        h hVar = new h("STATE", 0);
        STATE = hVar;
        h hVar2 = new h("HELP", 1);
        HELP = hVar2;
        h hVar3 = new h("EVIDENCE_TYPES", 2);
        EVIDENCE_TYPES = hVar3;
        h hVar4 = new h("EVIDENCE_LIST", 3);
        EVIDENCE_LIST = hVar4;
        h hVar5 = new h("DOCUMENT_LIST", 4);
        DOCUMENT_LIST = hVar5;
        h hVar6 = new h("OTHER_DOCUMENT", 5);
        OTHER_DOCUMENT = hVar6;
        h hVar7 = new h("INCOME_DESTINATION", 6);
        INCOME_DESTINATION = hVar7;
        h hVar8 = new h("BANK_STATEMENT_EVIDENCE_LIST", 7);
        BANK_STATEMENT_EVIDENCE_LIST = hVar8;
        h hVar9 = new h("FREQUENCY", 8);
        FREQUENCY = hVar9;
        h hVar10 = new h("NOTE", 9);
        NOTE = hVar10;
        h hVar11 = new h("DESCRIPTION", 10);
        DESCRIPTION = hVar11;
        h hVar12 = new h("AMOUNT", 11);
        AMOUNT = hVar12;
        h hVar13 = new h("SUMMARY", 12);
        SUMMARY = hVar13;
        h hVar14 = new h("REQUEST_DOCUMENTS", 13);
        REQUEST_DOCUMENTS = hVar14;
        h hVar15 = new h("RESUBMIT_SUMMARY", 14);
        RESUBMIT_SUMMARY = hVar15;
        h hVar16 = new h("QUESTION", 15);
        QUESTION = hVar16;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14, hVar15, hVar16};
        $VALUES = hVarArr;
        $ENTRIES = vc.s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
