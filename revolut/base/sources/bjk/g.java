package bjk;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g ACTION_WIDGET;
    public static final g BANNER;
    public static final g BUTTON_PRIMARY;
    public static final g BUTTON_SECONDARY;
    public static final g CARD;
    public static final g CELL_BANNER;
    public static final g CELL_TUPLE;
    public static final g EXPANSION_AREA;
    public static final g FEATURED_ACTION_WIDGET;
    public static final g FOOTER;
    public static final g GRID;
    public static final g HERO_CARD;
    public static final g HORIZONTAL_BUTTONS;
    public static final g HORIZONTAL_SCROLLER;
    public static final g LARGE_CARD;
    public static final g LIST;
    public static final g MEDIA;
    public static final g PAGER;
    public static final g PLAIN_TEXT;
    public static final g TILE;
    public static final g TIMELINE;
    public static final g UNKNOWN;
    public static final g UNORDERED_LIST;

    static {
        g gVar = new g("LIST", 0);
        LIST = gVar;
        g gVar2 = new g("EXPANSION_AREA", 1);
        EXPANSION_AREA = gVar2;
        g gVar3 = new g("CELL_BANNER", 2);
        CELL_BANNER = gVar3;
        g gVar4 = new g("PLAIN_TEXT", 3);
        PLAIN_TEXT = gVar4;
        g gVar5 = new g("UNORDERED_LIST", 4);
        UNORDERED_LIST = gVar5;
        g gVar6 = new g("BANNER", 5);
        BANNER = gVar6;
        g gVar7 = new g("GRID", 6);
        GRID = gVar7;
        g gVar8 = new g("FOOTER", 7);
        FOOTER = gVar8;
        g gVar9 = new g("BUTTON_PRIMARY", 8);
        BUTTON_PRIMARY = gVar9;
        g gVar10 = new g("BUTTON_SECONDARY", 9);
        BUTTON_SECONDARY = gVar10;
        g gVar11 = new g("HORIZONTAL_BUTTONS", 10);
        HORIZONTAL_BUTTONS = gVar11;
        g gVar12 = new g("CELL_TUPLE", 11);
        CELL_TUPLE = gVar12;
        g gVar13 = new g("PAGER", 12);
        PAGER = gVar13;
        g gVar14 = new g("ACTION_WIDGET", 13);
        ACTION_WIDGET = gVar14;
        g gVar15 = new g("HORIZONTAL_SCROLLER", 14);
        HORIZONTAL_SCROLLER = gVar15;
        g gVar16 = new g("CARD", 15);
        CARD = gVar16;
        g gVar17 = new g("HERO_CARD", 16);
        HERO_CARD = gVar17;
        g gVar18 = new g("TILE", 17);
        TILE = gVar18;
        g gVar19 = new g("MEDIA", 18);
        MEDIA = gVar19;
        g gVar20 = new g("FEATURED_ACTION_WIDGET", 19);
        FEATURED_ACTION_WIDGET = gVar20;
        g gVar21 = new g("LARGE_CARD", 20);
        LARGE_CARD = gVar21;
        g gVar22 = new g("TIMELINE", 21);
        TIMELINE = gVar22;
        g gVar23 = new g("UNKNOWN", 22);
        UNKNOWN = gVar23;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12, gVar13, gVar14, gVar15, gVar16, gVar17, gVar18, gVar19, gVar20, gVar21, gVar22, gVar23};
        $VALUES = gVarArr;
        $ENTRIES = vc.s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
