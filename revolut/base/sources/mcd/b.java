package mcd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BALANCE_SHEET;
    public static final b CALENDAR;
    public static final b CASH;
    public static final b CHEVRON_RIGHT;
    public static final b DOCUMENT;
    public static final b INFO_OUTLINE;
    public static final b LIGHTNING;
    public static final b PLAN_METAL;
    public static final b PLAN_PLUS;
    public static final b PLAN_ULTRA;
    public static final b SALARY;
    public static final b STUDENT;
    public static final b UNKNOWN;

    static {
        b bVar = new b("INFO_OUTLINE", 0);
        INFO_OUTLINE = bVar;
        b bVar2 = new b("DOCUMENT", 1);
        DOCUMENT = bVar2;
        b bVar3 = new b("CHEVRON_RIGHT", 2);
        CHEVRON_RIGHT = bVar3;
        b bVar4 = new b("CASH", 3);
        CASH = bVar4;
        b bVar5 = new b("BALANCE_SHEET", 4);
        BALANCE_SHEET = bVar5;
        b bVar6 = new b("LIGHTNING", 5);
        LIGHTNING = bVar6;
        b bVar7 = new b("CALENDAR", 6);
        CALENDAR = bVar7;
        b bVar8 = new b("PLAN_ULTRA", 7);
        PLAN_ULTRA = bVar8;
        b bVar9 = new b("PLAN_METAL", 8);
        PLAN_METAL = bVar9;
        b bVar10 = new b("PLAN_PLUS", 9);
        PLAN_PLUS = bVar10;
        b bVar11 = new b("SALARY", 10);
        SALARY = bVar11;
        b bVar12 = new b("STUDENT", 11);
        STUDENT = bVar12;
        b bVar13 = new b("UNKNOWN", 12);
        UNKNOWN = bVar13;
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
