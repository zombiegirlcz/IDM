package my8;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r ADDRESS;
    public static final r CREDIT_ONBOARDING;
    public static final r DEFAULT;
    public static final r DIPLOMAT_FAMILY_TIN_ABSENCE_PROOF;
    public static final r DIPLOMAT_TIN_ABSENCE_PROOF;
    public static final r DOCUMENT_ID;
    public static final r JP_MY_NUMBER;
    public static final r NAME_VERIFICATION;
    public static final r SAVINGS;
    public static final r STUDENT_TIN_ABSENCE_PROOF;
    public static final r TAX_RESIDENCY;
    public static final r TEMPORARY_RESIDENT_TIN_ABSENCE_PROOF;

    static {
        r rVar = new r("DEFAULT", 0);
        DEFAULT = rVar;
        r rVar2 = new r("JP_MY_NUMBER", 1);
        JP_MY_NUMBER = rVar2;
        r rVar3 = new r("ADDRESS", 2);
        ADDRESS = rVar3;
        r rVar4 = new r("DOCUMENT_ID", 3);
        DOCUMENT_ID = rVar4;
        r rVar5 = new r("TAX_RESIDENCY", 4);
        TAX_RESIDENCY = rVar5;
        r rVar6 = new r("NAME_VERIFICATION", 5);
        NAME_VERIFICATION = rVar6;
        r rVar7 = new r("CREDIT_ONBOARDING", 6);
        CREDIT_ONBOARDING = rVar7;
        r rVar8 = new r("STUDENT_TIN_ABSENCE_PROOF", 7);
        STUDENT_TIN_ABSENCE_PROOF = rVar8;
        r rVar9 = new r("DIPLOMAT_TIN_ABSENCE_PROOF", 8);
        DIPLOMAT_TIN_ABSENCE_PROOF = rVar9;
        r rVar10 = new r("DIPLOMAT_FAMILY_TIN_ABSENCE_PROOF", 9);
        DIPLOMAT_FAMILY_TIN_ABSENCE_PROOF = rVar10;
        r rVar11 = new r("TEMPORARY_RESIDENT_TIN_ABSENCE_PROOF", 10);
        TEMPORARY_RESIDENT_TIN_ABSENCE_PROOF = rVar11;
        r rVar12 = new r("SAVINGS", 11);
        SAVINGS = rVar12;
        r[] rVarArr = {rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11, rVar12};
        $VALUES = rVarArr;
        $ENTRIES = vc.s.n(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
