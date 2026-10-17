package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CREDIT;
    public static final c GROUP_VAULT;
    public static final c INVEST_CUSTODIAN_JISA;
    public static final c INVEST_GIA;
    public static final c INVEST_GIA_JOINT;
    public static final c INVEST_ISA;
    public static final c INVEST_PERSONAL_JISA;
    public static final c JOINT;
    public static final c JOINT_INHERITANCE;
    public static final c JOINT_SAVINGS;
    public static final c JOINT_VAULT;
    public static final c JUNIOR_PERSONAL;
    public static final c JUNIOR_SAVINGS;
    public static final c JUNIOR_VAULT;
    public static final c LOYALTY_VAULT;
    public static final c PERSONAL;
    public static final c PRO;
    public static final c PRO_VAULT;
    public static final c REVX_FIAT;
    public static final c SAVINGS;
    public static final c UNKNOWN;
    public static final c VAULT;

    static {
        c cVar = new c("PERSONAL", 0);
        PERSONAL = cVar;
        c cVar2 = new c("PRO", 1);
        PRO = cVar2;
        c cVar3 = new c("PRO_VAULT", 2);
        PRO_VAULT = cVar3;
        c cVar4 = new c("VAULT", 3);
        VAULT = cVar4;
        c cVar5 = new c("GROUP_VAULT", 4);
        GROUP_VAULT = cVar5;
        c cVar6 = new c("SAVINGS", 5);
        SAVINGS = cVar6;
        c cVar7 = new c("JOINT", 6);
        JOINT = cVar7;
        c cVar8 = new c("JOINT_VAULT", 7);
        JOINT_VAULT = cVar8;
        c cVar9 = new c("JOINT_SAVINGS", 8);
        JOINT_SAVINGS = cVar9;
        c cVar10 = new c("JOINT_INHERITANCE", 9);
        JOINT_INHERITANCE = cVar10;
        c cVar11 = new c("LOYALTY_VAULT", 10);
        LOYALTY_VAULT = cVar11;
        c cVar12 = new c("CREDIT", 11);
        CREDIT = cVar12;
        c cVar13 = new c("JUNIOR_PERSONAL", 12);
        JUNIOR_PERSONAL = cVar13;
        c cVar14 = new c("JUNIOR_VAULT", 13);
        JUNIOR_VAULT = cVar14;
        c cVar15 = new c("JUNIOR_SAVINGS", 14);
        JUNIOR_SAVINGS = cVar15;
        c cVar16 = new c("INVEST_GIA", 15);
        INVEST_GIA = cVar16;
        c cVar17 = new c("INVEST_GIA_JOINT", 16);
        INVEST_GIA_JOINT = cVar17;
        c cVar18 = new c("INVEST_ISA", 17);
        INVEST_ISA = cVar18;
        c cVar19 = new c("INVEST_CUSTODIAN_JISA", 18);
        INVEST_CUSTODIAN_JISA = cVar19;
        c cVar20 = new c("INVEST_PERSONAL_JISA", 19);
        INVEST_PERSONAL_JISA = cVar20;
        c cVar21 = new c("REVX_FIAT", 20);
        REVX_FIAT = cVar21;
        c cVar22 = new c("UNKNOWN", 21);
        UNKNOWN = cVar22;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22};
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
