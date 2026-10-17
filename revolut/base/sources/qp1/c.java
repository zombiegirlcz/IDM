package qp1;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ADDRESS;
    public static final c DATE;
    public static final c DATE_MONTH;
    public static final c DATE_OF_BIRTH;
    public static final c DATE_YEAR;
    public static final c FORM_NAME;
    public static final c MONEY;
    public static final c SECTION;
    public static final c SUBFORM;
    public static final c TEXT;

    static {
        c cVar = new c("ADDRESS", 0);
        ADDRESS = cVar;
        c cVar2 = new c("DATE", 1);
        DATE = cVar2;
        c cVar3 = new c("DATE_OF_BIRTH", 2);
        DATE_OF_BIRTH = cVar3;
        c cVar4 = new c("DATE_YEAR", 3);
        DATE_YEAR = cVar4;
        c cVar5 = new c("DATE_MONTH", 4);
        DATE_MONTH = cVar5;
        c cVar6 = new c("FORM_NAME", 5);
        FORM_NAME = cVar6;
        c cVar7 = new c("MONEY", 6);
        MONEY = cVar7;
        c cVar8 = new c("TEXT", 7);
        TEXT = cVar8;
        c cVar9 = new c("SECTION", 8);
        SECTION = cVar9;
        c cVar10 = new c("SUBFORM", 9);
        SUBFORM = cVar10;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
