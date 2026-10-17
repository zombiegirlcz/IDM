package sil;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l CREDIT_ONBOARDING_VIEW;
    public static final l DECLARATION;
    public static final l ELIGIBILITY_STEPS;
    public static final l FORM;
    public static final l LOADING_STEP;
    public static final l NAVIGATION_HUB;
    public static final l ONBOARDING_STEP;
    public static final l QES;
    public static final l SDK_FLOW;

    static {
        l lVar = new l("DECLARATION", 0);
        DECLARATION = lVar;
        l lVar2 = new l("ELIGIBILITY_STEPS", 1);
        ELIGIBILITY_STEPS = lVar2;
        l lVar3 = new l("QES", 2);
        QES = lVar3;
        l lVar4 = new l("ONBOARDING_STEP", 3);
        ONBOARDING_STEP = lVar4;
        l lVar5 = new l("CREDIT_ONBOARDING_VIEW", 4);
        CREDIT_ONBOARDING_VIEW = lVar5;
        l lVar6 = new l("SDK_FLOW", 5);
        SDK_FLOW = lVar6;
        l lVar7 = new l("FORM", 6);
        FORM = lVar7;
        l lVar8 = new l("LOADING_STEP", 7);
        LOADING_STEP = lVar8;
        l lVar9 = new l("NAVIGATION_HUB", 8);
        NAVIGATION_HUB = lVar9;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
