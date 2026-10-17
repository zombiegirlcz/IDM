package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l COMPACT_FLEXBOX;
    public static final l DYNAMIC_CIRCLE_ACTIONS;
    public static final l DYNAMIC_MORE;
    public static final l FLEXBOX;
    public static final l HEADER_CIRCLE_ACTIONS;
    public static final l HEADER_STYLED_CIRCLE_ACTIONS;
    public static final l NON_SCROLLABLE;
    public static final l NON_SCROLLABLE_FILL;
    public static final l SCROLLABLE;
    public static final l SCROLLABLE_CENTERED;

    static {
        l lVar = new l("SCROLLABLE", 0);
        SCROLLABLE = lVar;
        l lVar2 = new l("SCROLLABLE_CENTERED", 1);
        SCROLLABLE_CENTERED = lVar2;
        l lVar3 = new l("NON_SCROLLABLE", 2);
        NON_SCROLLABLE = lVar3;
        l lVar4 = new l("NON_SCROLLABLE_FILL", 3);
        NON_SCROLLABLE_FILL = lVar4;
        l lVar5 = new l("FLEXBOX", 4);
        FLEXBOX = lVar5;
        l lVar6 = new l("COMPACT_FLEXBOX", 5);
        COMPACT_FLEXBOX = lVar6;
        l lVar7 = new l("DYNAMIC_MORE", 6);
        DYNAMIC_MORE = lVar7;
        l lVar8 = new l("DYNAMIC_CIRCLE_ACTIONS", 7);
        DYNAMIC_CIRCLE_ACTIONS = lVar8;
        l lVar9 = new l("HEADER_CIRCLE_ACTIONS", 8);
        HEADER_CIRCLE_ACTIONS = lVar9;
        l lVar10 = new l("HEADER_STYLED_CIRCLE_ACTIONS", 9);
        HEADER_STYLED_CIRCLE_ACTIONS = lVar10;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10};
        $VALUES = lVarArr;
        $ENTRIES = vc.s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
