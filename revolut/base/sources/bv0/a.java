package bv0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACTIVE_CONTEXTUAL_THEME;
    public static final a ACTIVE_NOT_CLICKABLE;
    public static final a ACTIVE_SYSTEM_THEME;
    public static final a ERROR;
    public static final a INACTIVE_CONTEXTUAL_THEME;
    public static final a INACTIVE_PRIMARY_WHITE;
    public static final a LOADING_LONG;
    public static final a LOADING_SHORT;
    public static final a PRIMARY_WHITE;

    static {
        a aVar = new a("ERROR", 0);
        ERROR = aVar;
        a aVar2 = new a("LOADING_SHORT", 1);
        LOADING_SHORT = aVar2;
        a aVar3 = new a("LOADING_LONG", 2);
        LOADING_LONG = aVar3;
        a aVar4 = new a("PRIMARY_WHITE", 3);
        PRIMARY_WHITE = aVar4;
        a aVar5 = new a("INACTIVE_PRIMARY_WHITE", 4);
        INACTIVE_PRIMARY_WHITE = aVar5;
        a aVar6 = new a("ACTIVE_SYSTEM_THEME", 5);
        ACTIVE_SYSTEM_THEME = aVar6;
        a aVar7 = new a("ACTIVE_CONTEXTUAL_THEME", 6);
        ACTIVE_CONTEXTUAL_THEME = aVar7;
        a aVar8 = new a("INACTIVE_CONTEXTUAL_THEME", 7);
        INACTIVE_CONTEXTUAL_THEME = aVar8;
        a aVar9 = new a("ACTIVE_NOT_CLICKABLE", 8);
        ACTIVE_NOT_CLICKABLE = aVar9;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
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
