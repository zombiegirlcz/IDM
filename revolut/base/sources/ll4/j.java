package ll4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j CREDIT_ACCOUNT;
    public static final j FREELANCER;
    public static final j FREELANCER_SUB_ACCOUNT;
    public static final j INVESTMENT_GIA;
    public static final j INVESTMENT_TAA;
    public static final j JOINT_ACCOUNT;
    public static final j JOINT_SAVINGS;
    public static final j JOINT_SUB_ACCOUNT;
    public static final j LOYALTY_ACCOUNT;
    public static final j PERSONAL_CURRENCY;
    public static final j SAVINGS;
    public static final j SUB_ACCOUNT;
    public static final j UNKNOWN;
    public static final j YOUTH_MAIN;
    public static final j YOUTH_SAVINGS;
    public static final j YOUTH_SUB_ACCOUNT;

    static {
        j jVar = new j("PERSONAL_CURRENCY", 0);
        PERSONAL_CURRENCY = jVar;
        j jVar2 = new j("JOINT_ACCOUNT", 1);
        JOINT_ACCOUNT = jVar2;
        j jVar3 = new j("JOINT_SUB_ACCOUNT", 2);
        JOINT_SUB_ACCOUNT = jVar3;
        j jVar4 = new j("JOINT_SAVINGS", 3);
        JOINT_SAVINGS = jVar4;
        j jVar5 = new j("SUB_ACCOUNT", 4);
        SUB_ACCOUNT = jVar5;
        j jVar6 = new j("FREELANCER", 5);
        FREELANCER = jVar6;
        j jVar7 = new j("FREELANCER_SUB_ACCOUNT", 6);
        FREELANCER_SUB_ACCOUNT = jVar7;
        j jVar8 = new j("SAVINGS", 7);
        SAVINGS = jVar8;
        j jVar9 = new j("CREDIT_ACCOUNT", 8);
        CREDIT_ACCOUNT = jVar9;
        j jVar10 = new j("LOYALTY_ACCOUNT", 9);
        LOYALTY_ACCOUNT = jVar10;
        j jVar11 = new j("YOUTH_MAIN", 10);
        YOUTH_MAIN = jVar11;
        j jVar12 = new j("YOUTH_SUB_ACCOUNT", 11);
        YOUTH_SUB_ACCOUNT = jVar12;
        j jVar13 = new j("YOUTH_SAVINGS", 12);
        YOUTH_SAVINGS = jVar13;
        j jVar14 = new j("INVESTMENT_GIA", 13);
        INVESTMENT_GIA = jVar14;
        j jVar15 = new j("INVESTMENT_TAA", 14);
        INVESTMENT_TAA = jVar15;
        j jVar16 = new j("UNKNOWN", 15);
        UNKNOWN = jVar16;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12, jVar13, jVar14, jVar15, jVar16};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
