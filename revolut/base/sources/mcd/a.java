package mcd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACCENT;
    public static final a FOREGROUND;
    public static final a GREEN;
    public static final a GREY_TON_100;
    public static final a GREY_TON_50;
    public static final a ORANGE;
    public static final a PERFORMANCE_POSITIVE;
    public static final a UNKNOWN;

    static {
        a aVar = new a("GREY_TON_50", 0);
        GREY_TON_50 = aVar;
        a aVar2 = new a("GREY_TON_100", 1);
        GREY_TON_100 = aVar2;
        a aVar3 = new a("PERFORMANCE_POSITIVE", 2);
        PERFORMANCE_POSITIVE = aVar3;
        a aVar4 = new a("ACCENT", 3);
        ACCENT = aVar4;
        a aVar5 = new a("ORANGE", 4);
        ORANGE = aVar5;
        a aVar6 = new a("FOREGROUND", 5);
        FOREGROUND = aVar6;
        a aVar7 = new a("GREEN", 6);
        GREEN = aVar7;
        a aVar8 = new a("UNKNOWN", 7);
        UNKNOWN = aVar8;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
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
