package fr2;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d BLACK;
    public static final d BLUE;
    public static final d BLUE_WITHOUT_SHADOW;
    public static final d FLAT_TEXT;
    public static final d FLAT_WHITE_TEXT;
    public static final d SEMIBLUE;
    public static final d UNKNOWN;
    public static final d WHITE;
    public static final d WIDGET;

    static {
        d dVar = new d("BLUE", 0);
        BLUE = dVar;
        d dVar2 = new d("BLUE_WITHOUT_SHADOW", 1);
        BLUE_WITHOUT_SHADOW = dVar2;
        d dVar3 = new d("BLACK", 2);
        BLACK = dVar3;
        d dVar4 = new d("SEMIBLUE", 3);
        SEMIBLUE = dVar4;
        d dVar5 = new d("FLAT_TEXT", 4);
        FLAT_TEXT = dVar5;
        d dVar6 = new d("FLAT_WHITE_TEXT", 5);
        FLAT_WHITE_TEXT = dVar6;
        d dVar7 = new d("WHITE", 6);
        WHITE = dVar7;
        d dVar8 = new d("WIDGET", 7);
        WIDGET = dVar8;
        d dVar9 = new d("UNKNOWN", 8);
        UNKNOWN = dVar9;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
