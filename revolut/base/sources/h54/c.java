package h54;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c KYC_VERIFICATION;
    public static final c PLAN_SELECTION;
    public static final c PRE_APPLICATION_CHECKS;
    public static final c PRODUCT_ARTICLES;
    public static final c PRODUCT_ELIGIBILITY_VERIFICATION;
    public static final c PRODUCT_INTRO;
    public static final c RESUME_APPLICATION;
    public static final c RESUME_INTRO;
    public static final c START_APPLICATION;

    static {
        c cVar = new c("RESUME_APPLICATION", 0);
        RESUME_APPLICATION = cVar;
        c cVar2 = new c("PRODUCT_INTRO", 1);
        PRODUCT_INTRO = cVar2;
        c cVar3 = new c("RESUME_INTRO", 2);
        RESUME_INTRO = cVar3;
        c cVar4 = new c("KYC_VERIFICATION", 3);
        KYC_VERIFICATION = cVar4;
        c cVar5 = new c("PRODUCT_ELIGIBILITY_VERIFICATION", 4);
        PRODUCT_ELIGIBILITY_VERIFICATION = cVar5;
        c cVar6 = new c("PRODUCT_ARTICLES", 5);
        PRODUCT_ARTICLES = cVar6;
        c cVar7 = new c("PLAN_SELECTION", 6);
        PLAN_SELECTION = cVar7;
        c cVar8 = new c("PRE_APPLICATION_CHECKS", 7);
        PRE_APPLICATION_CHECKS = cVar8;
        c cVar9 = new c("START_APPLICATION", 8);
        START_APPLICATION = cVar9;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9};
        $VALUES = cVarArr;
        $ENTRIES = vc.s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
