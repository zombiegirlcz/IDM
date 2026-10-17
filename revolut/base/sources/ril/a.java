package ril;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACCEPTED_TERMS;
    public static final a ACCOUNT_PURPOSES;
    public static final a ALIAS;
    public static final a DATE_OF_BIRTH;
    public static final a DOCUMENT;
    public static final a FIRST_NAME;
    public static final a FIRST_SURNAME;
    public static final a GENDER;
    public static final a LAST_NAME;
    public static final a MIDDLE_NAME;
    public static final a NAME;
    public static final a NATIVE_NAME;
    public static final a OCCUPATION;
    public static final a PERSONAL_CODE;
    public static final a PLACE_OF_BIRTH;
    public static final a SECOND_SURNAME;
    public static final a TAX_RESIDENCY;

    static {
        a aVar = new a("ALIAS", 0);
        ALIAS = aVar;
        a aVar2 = new a("NAME", 1);
        NAME = aVar2;
        a aVar3 = new a("NATIVE_NAME", 2);
        NATIVE_NAME = aVar3;
        a aVar4 = new a("FIRST_NAME", 3);
        FIRST_NAME = aVar4;
        a aVar5 = new a("LAST_NAME", 4);
        LAST_NAME = aVar5;
        a aVar6 = new a("MIDDLE_NAME", 5);
        MIDDLE_NAME = aVar6;
        a aVar7 = new a("FIRST_SURNAME", 6);
        FIRST_SURNAME = aVar7;
        a aVar8 = new a("SECOND_SURNAME", 7);
        SECOND_SURNAME = aVar8;
        a aVar9 = new a("DATE_OF_BIRTH", 8);
        DATE_OF_BIRTH = aVar9;
        a aVar10 = new a("DOCUMENT", 9);
        DOCUMENT = aVar10;
        a aVar11 = new a("OCCUPATION", 10);
        OCCUPATION = aVar11;
        a aVar12 = new a("GENDER", 11);
        GENDER = aVar12;
        a aVar13 = new a("PLACE_OF_BIRTH", 12);
        PLACE_OF_BIRTH = aVar13;
        a aVar14 = new a("ACCOUNT_PURPOSES", 13);
        ACCOUNT_PURPOSES = aVar14;
        a aVar15 = new a("TAX_RESIDENCY", 14);
        TAX_RESIDENCY = aVar15;
        a aVar16 = new a("ACCEPTED_TERMS", 15);
        ACCEPTED_TERMS = aVar16;
        a aVar17 = new a("PERSONAL_CODE", 16);
        PERSONAL_CODE = aVar17;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17};
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
