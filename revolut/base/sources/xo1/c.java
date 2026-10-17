package xo1;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ADDRESS;
    public static final c BARCODE;
    public static final c CHECKBOX;
    public static final c DATE_MONTH;
    public static final c DATE_OF_BIRTH;
    public static final c DATE_YEAR;
    public static final c DROPDOWN;
    public static final c FORM_NAME;
    public static final c INFO;
    public static final c MONEY;
    public static final c NESTED_ITEM;
    public static final c NUMBER;
    public static final c QRCODE;
    public static final c QRCODE_OR_BARCODE;
    public static final c REPEATER;
    public static final c REPEATER_DROPDOWN;
    public static final c SEARCH;
    public static final c TEXT;

    static {
        c cVar = new c("ADDRESS", 0);
        ADDRESS = cVar;
        c cVar2 = new c("BARCODE", 1);
        BARCODE = cVar2;
        c cVar3 = new c("CHECKBOX", 2);
        CHECKBOX = cVar3;
        c cVar4 = new c("DATE_MONTH", 3);
        DATE_MONTH = cVar4;
        c cVar5 = new c("DATE_OF_BIRTH", 4);
        DATE_OF_BIRTH = cVar5;
        c cVar6 = new c("DATE_YEAR", 5);
        DATE_YEAR = cVar6;
        c cVar7 = new c("DROPDOWN", 6);
        DROPDOWN = cVar7;
        c cVar8 = new c("FORM_NAME", 7);
        FORM_NAME = cVar8;
        c cVar9 = new c("INFO", 8);
        INFO = cVar9;
        c cVar10 = new c("MONEY", 9);
        MONEY = cVar10;
        c cVar11 = new c("NESTED_ITEM", 10);
        NESTED_ITEM = cVar11;
        c cVar12 = new c("NUMBER", 11);
        NUMBER = cVar12;
        c cVar13 = new c("REPEATER", 12);
        REPEATER = cVar13;
        c cVar14 = new c("REPEATER_DROPDOWN", 13);
        REPEATER_DROPDOWN = cVar14;
        c cVar15 = new c("QRCODE", 14);
        QRCODE = cVar15;
        c cVar16 = new c("QRCODE_OR_BARCODE", 15);
        QRCODE_OR_BARCODE = cVar16;
        c cVar17 = new c("TEXT", 16);
        TEXT = cVar17;
        c cVar18 = new c("SEARCH", 17);
        SEARCH = cVar18;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18};
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
