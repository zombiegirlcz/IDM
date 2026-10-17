package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class db {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ db[] $VALUES;
    public static final db BODY1;
    public static final db BODY2;
    public static final db BODY3;
    public static final db DISPLAY1;
    public static final db DISPLAY2;
    public static final db EMPHASIS1;
    public static final db EMPHASIS2;
    public static final db EMPHASIS3;
    public static final db EMPHASIS4;
    public static final db HEADING1;
    public static final db HEADING2;
    public static final db HEADING3;

    static {
        db dbVar = new db("DISPLAY1", 0);
        DISPLAY1 = dbVar;
        db dbVar2 = new db("DISPLAY2", 1);
        DISPLAY2 = dbVar2;
        db dbVar3 = new db("HEADING1", 2);
        HEADING1 = dbVar3;
        db dbVar4 = new db("HEADING2", 3);
        HEADING2 = dbVar4;
        db dbVar5 = new db("HEADING3", 4);
        HEADING3 = dbVar5;
        db dbVar6 = new db("EMPHASIS1", 5);
        EMPHASIS1 = dbVar6;
        db dbVar7 = new db("EMPHASIS2", 6);
        EMPHASIS2 = dbVar7;
        db dbVar8 = new db("EMPHASIS3", 7);
        EMPHASIS3 = dbVar8;
        db dbVar9 = new db("EMPHASIS4", 8);
        EMPHASIS4 = dbVar9;
        db dbVar10 = new db("BODY1", 9);
        BODY1 = dbVar10;
        db dbVar11 = new db("BODY2", 10);
        BODY2 = dbVar11;
        db dbVar12 = new db("BODY3", 11);
        BODY3 = dbVar12;
        db[] dbVarArr = {dbVar, dbVar2, dbVar3, dbVar4, dbVar5, dbVar6, dbVar7, dbVar8, dbVar9, dbVar10, dbVar11, dbVar12};
        $VALUES = dbVarArr;
        $ENTRIES = vc.s.n(dbVarArr);
    }

    public static db valueOf(String str) {
        return (db) Enum.valueOf(db.class, str);
    }

    public static db[] values() {
        return (db[]) $VALUES.clone();
    }
}
