package zme;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j ANOTHER_TAX_RESIDENCY;
    public static final j CAN_NOT_PROVIDE_NOW;
    public static final j DIPLOMAT;
    public static final j DIPLOMAT_FAMILY;
    public static final j EXCHANGE_STUDENT;
    public static final j NOT_US_PERSON;
    public static final j OTHER;
    public static final j STUDENT;
    public static final j TEACHER;
    public static final j TEMPORARY_RESIDENT;

    static {
        j jVar = new j("OTHER", 0);
        OTHER = jVar;
        j jVar2 = new j("NOT_US_PERSON", 1);
        NOT_US_PERSON = jVar2;
        j jVar3 = new j("TEACHER", 2);
        TEACHER = jVar3;
        j jVar4 = new j("EXCHANGE_STUDENT", 3);
        EXCHANGE_STUDENT = jVar4;
        j jVar5 = new j("STUDENT", 4);
        STUDENT = jVar5;
        j jVar6 = new j("DIPLOMAT", 5);
        DIPLOMAT = jVar6;
        j jVar7 = new j("DIPLOMAT_FAMILY", 6);
        DIPLOMAT_FAMILY = jVar7;
        j jVar8 = new j("TEMPORARY_RESIDENT", 7);
        TEMPORARY_RESIDENT = jVar8;
        j jVar9 = new j("ANOTHER_TAX_RESIDENCY", 8);
        ANOTHER_TAX_RESIDENCY = jVar9;
        j jVar10 = new j("CAN_NOT_PROVIDE_NOW", 9);
        CAN_NOT_PROVIDE_NOW = jVar10;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
