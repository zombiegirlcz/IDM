package ueg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class i0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public static final i0 COLLAPSED;
    public static final i0 DATES_GUESTS_EXPANDED;
    public static final i0 EMPTY;
    public static final i0 FILTERS_EXPANDED;
    public static final i0 SEARCH_AREA_BUTTON;

    static {
        i0 i0Var = new i0("COLLAPSED", 0);
        COLLAPSED = i0Var;
        i0 i0Var2 = new i0("FILTERS_EXPANDED", 1);
        FILTERS_EXPANDED = i0Var2;
        i0 i0Var3 = new i0("DATES_GUESTS_EXPANDED", 2);
        DATES_GUESTS_EXPANDED = i0Var3;
        i0 i0Var4 = new i0("SEARCH_AREA_BUTTON", 3);
        SEARCH_AREA_BUTTON = i0Var4;
        i0 i0Var5 = new i0("EMPTY", 4);
        EMPTY = i0Var5;
        i0[] i0VarArr = {i0Var, i0Var2, i0Var3, i0Var4, i0Var5};
        $VALUES = i0VarArr;
        $ENTRIES = vc.s.n(i0VarArr);
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }
}
