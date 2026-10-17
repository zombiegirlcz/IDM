package yel;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a A;
    public static final a AA;
    public static final a AAA;
    public static final a AA_MINUS;
    public static final a AA_PLUS;
    public static final a A_MINUS;
    public static final a A_PLUS;
    public static final a B;
    public static final a BB;
    public static final a BBB;
    public static final a BBB_MINUS;
    public static final a BBB_PLUS;
    public static final a BB_MINUS;
    public static final a BB_PLUS;
    public static final a B_MINUS;
    public static final a B_PLUS;
    public static final a C;
    public static final a CC;
    public static final a CCC;
    public static final a CCC_MINUS;
    public static final a CCC_PLUS;
    public static final a D;
    public static final a RD;
    public static final a UNKNOWN;

    static {
        a aVar = new a("AAA", 0);
        AAA = aVar;
        a aVar2 = new a("AA_PLUS", 1);
        AA_PLUS = aVar2;
        a aVar3 = new a("AA", 2);
        AA = aVar3;
        a aVar4 = new a("AA_MINUS", 3);
        AA_MINUS = aVar4;
        a aVar5 = new a("A_PLUS", 4);
        A_PLUS = aVar5;
        a aVar6 = new a("A", 5);
        A = aVar6;
        a aVar7 = new a("A_MINUS", 6);
        A_MINUS = aVar7;
        a aVar8 = new a("BBB_PLUS", 7);
        BBB_PLUS = aVar8;
        a aVar9 = new a("BBB", 8);
        BBB = aVar9;
        a aVar10 = new a("BBB_MINUS", 9);
        BBB_MINUS = aVar10;
        a aVar11 = new a("BB_PLUS", 10);
        BB_PLUS = aVar11;
        a aVar12 = new a("BB", 11);
        BB = aVar12;
        a aVar13 = new a("BB_MINUS", 12);
        BB_MINUS = aVar13;
        a aVar14 = new a("B_PLUS", 13);
        B_PLUS = aVar14;
        a aVar15 = new a("B", 14);
        B = aVar15;
        a aVar16 = new a("B_MINUS", 15);
        B_MINUS = aVar16;
        a aVar17 = new a("CCC_PLUS", 16);
        CCC_PLUS = aVar17;
        a aVar18 = new a("CCC", 17);
        CCC = aVar18;
        a aVar19 = new a("CCC_MINUS", 18);
        CCC_MINUS = aVar19;
        a aVar20 = new a("CC", 19);
        CC = aVar20;
        a aVar21 = new a("C", 20);
        C = aVar21;
        a aVar22 = new a("RD", 21);
        RD = aVar22;
        a aVar23 = new a("D", 22);
        D = aVar23;
        a aVar24 = new a("UNKNOWN", 23);
        UNKNOWN = aVar24;
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
