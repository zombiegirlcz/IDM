package com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BLACK;
    public static final b BLUE;
    public static final b DISABLED_PRIMARY;
    public static final b DISABLED_SECONDARY;
    public static final b GREEN;
    public static final b HIGHLIGHTED;
    public static final b ORANGE;
    public static final b PINK;
    public static final b RED;
    public static final b REGULAR_PRIMARY;
    public static final b REGULAR_SECONDARY;
    public static final b WHITE;

    static {
        b bVar = new b("HIGHLIGHTED", 0);
        HIGHLIGHTED = bVar;
        b bVar2 = new b("REGULAR_PRIMARY", 1);
        REGULAR_PRIMARY = bVar2;
        b bVar3 = new b("REGULAR_SECONDARY", 2);
        REGULAR_SECONDARY = bVar3;
        b bVar4 = new b("DISABLED_PRIMARY", 3);
        DISABLED_PRIMARY = bVar4;
        b bVar5 = new b("DISABLED_SECONDARY", 4);
        DISABLED_SECONDARY = bVar5;
        b bVar6 = new b("PINK", 5);
        PINK = bVar6;
        b bVar7 = new b("ORANGE", 6);
        ORANGE = bVar7;
        b bVar8 = new b("WHITE", 7);
        WHITE = bVar8;
        b bVar9 = new b("RED", 8);
        RED = bVar9;
        b bVar10 = new b("BLACK", 9);
        BLACK = bVar10;
        b bVar11 = new b("BLUE", 10);
        BLUE = bVar11;
        b bVar12 = new b("GREEN", 11);
        GREEN = bVar12;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12};
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
