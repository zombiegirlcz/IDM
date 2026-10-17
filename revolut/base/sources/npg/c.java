package npg;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACTIVE_PHYSICAL_CARD;
    public static final c ADDRESS;
    public static final c IDENTITY_DOCUMENT;
    public static final c KYC;
    public static final c LEXIS_NEXIS;
    public static final c OCCUPATION;
    public static final c TAX_RESIDENCY;
    public static final c TERM_AND_CONDITIONS;
    public static final c TIN;
    public static final c TIN_AND_IDENTITY_DOCUMENT;
    public static final c USER_COUNTRY;

    static {
        c cVar = new c("TAX_RESIDENCY", 0);
        TAX_RESIDENCY = cVar;
        c cVar2 = new c("TERM_AND_CONDITIONS", 1);
        TERM_AND_CONDITIONS = cVar2;
        c cVar3 = new c("USER_COUNTRY", 2);
        USER_COUNTRY = cVar3;
        c cVar4 = new c("OCCUPATION", 3);
        OCCUPATION = cVar4;
        c cVar5 = new c("LEXIS_NEXIS", 4);
        LEXIS_NEXIS = cVar5;
        c cVar6 = new c("IDENTITY_DOCUMENT", 5);
        IDENTITY_DOCUMENT = cVar6;
        c cVar7 = new c("TIN_AND_IDENTITY_DOCUMENT", 6);
        TIN_AND_IDENTITY_DOCUMENT = cVar7;
        c cVar8 = new c("TIN", 7);
        TIN = cVar8;
        c cVar9 = new c("KYC", 8);
        KYC = cVar9;
        c cVar10 = new c("ADDRESS", 9);
        ADDRESS = cVar10;
        c cVar11 = new c("ACTIVE_PHYSICAL_CARD", 10);
        ACTIVE_PHYSICAL_CARD = cVar11;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
