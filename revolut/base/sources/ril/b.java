package ril;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CREDIT_ONBOARDING_VIEW;
    public static final b DECLARATION;
    public static final b DOCUMENTS;
    public static final b ELIGIBILITY_STEPS;
    public static final b FORM;
    public static final b IDENTITY_DECLARATION;
    public static final b LOADING_STEP;
    public static final b NAVIGATION_HUB;
    public static final b ONBOARDING_STEP;
    public static final b QES;
    public static final b SDK_FLOW;
    public static final b TAX_RESIDENCY;
    public static final b WORKFLOW;

    static {
        b bVar = new b("IDENTITY_DECLARATION", 0);
        IDENTITY_DECLARATION = bVar;
        b bVar2 = new b("DOCUMENTS", 1);
        DOCUMENTS = bVar2;
        b bVar3 = new b("TAX_RESIDENCY", 2);
        TAX_RESIDENCY = bVar3;
        b bVar4 = new b("QES", 3);
        QES = bVar4;
        b bVar5 = new b("ELIGIBILITY_STEPS", 4);
        ELIGIBILITY_STEPS = bVar5;
        b bVar6 = new b("SDK_FLOW", 5);
        SDK_FLOW = bVar6;
        b bVar7 = new b("FORM", 6);
        FORM = bVar7;
        b bVar8 = new b("DECLARATION", 7);
        DECLARATION = bVar8;
        b bVar9 = new b("ONBOARDING_STEP", 8);
        ONBOARDING_STEP = bVar9;
        b bVar10 = new b("CREDIT_ONBOARDING_VIEW", 9);
        CREDIT_ONBOARDING_VIEW = bVar10;
        b bVar11 = new b("WORKFLOW", 10);
        WORKFLOW = bVar11;
        b bVar12 = new b("LOADING_STEP", 11);
        LOADING_STEP = bVar12;
        b bVar13 = new b("NAVIGATION_HUB", 12);
        NAVIGATION_HUB = bVar13;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
