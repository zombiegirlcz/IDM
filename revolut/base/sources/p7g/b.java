package p7g;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final b DATE_OF_BIRTH;
    public static final b EMAIL;
    public static final b EMERGENCY_CONTACT_LAST_NAME;
    public static final b EMERGENCY_CONTACT_PHONE_NUMBER;
    public static final b FIRST_NAME;
    public static final b GENDER;
    public static final b LAST_NAME;
    public static final b PASSPORT_EXPIRY_DATE;
    public static final b PASSPORT_ISSUING_CITY;
    public static final b PASSPORT_ISSUING_COUNTRY;
    public static final b PASSPORT_ISSUING_DATE;
    public static final b PASSPORT_NUMBER;
    public static final b PHONE_NUMBER;
    public static final b UNKNOWN;

    static {
        b bVar = new b("FIRST_NAME", 0);
        FIRST_NAME = bVar;
        b bVar2 = new b("LAST_NAME", 1);
        LAST_NAME = bVar2;
        b bVar3 = new b("GENDER", 2);
        GENDER = bVar3;
        b bVar4 = new b("EMAIL", 3);
        EMAIL = bVar4;
        b bVar5 = new b("PHONE_NUMBER", 4);
        PHONE_NUMBER = bVar5;
        b bVar6 = new b("EMERGENCY_CONTACT_LAST_NAME", 5);
        EMERGENCY_CONTACT_LAST_NAME = bVar6;
        b bVar7 = new b("EMERGENCY_CONTACT_PHONE_NUMBER", 6);
        EMERGENCY_CONTACT_PHONE_NUMBER = bVar7;
        b bVar8 = new b("DATE_OF_BIRTH", 7);
        DATE_OF_BIRTH = bVar8;
        b bVar9 = new b("PASSPORT_NUMBER", 8);
        PASSPORT_NUMBER = bVar9;
        b bVar10 = new b("PASSPORT_ISSUING_COUNTRY", 9);
        PASSPORT_ISSUING_COUNTRY = bVar10;
        b bVar11 = new b("PASSPORT_ISSUING_DATE", 10);
        PASSPORT_ISSUING_DATE = bVar11;
        b bVar12 = new b("PASSPORT_EXPIRY_DATE", 11);
        PASSPORT_EXPIRY_DATE = bVar12;
        b bVar13 = new b("PASSPORT_ISSUING_CITY", 12);
        PASSPORT_ISSUING_CITY = bVar13;
        b bVar14 = new b("UNKNOWN", 13);
        UNKNOWN = bVar14;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
