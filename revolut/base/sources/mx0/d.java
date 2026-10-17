package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ACCENT;
    public static final d BLACK;
    public static final d CONTEXTUAL;
    public static final d CONTEXTUAL_SOLID;
    public static final d DARK_ON_ACCENT;
    public static final d FLAT;
    public static final d INVERTED_PRIMARY;
    public static final d LIGHT_ON_ACCENT;
    public static final d NEGATIVE;
    public static final d NEGATIVE_ACCENT;
    public static final d ON_MEDIA_STATIC;
    public static final d PRIMARY_NEUTRAL;
    public static final d SECONDARY_WHITE;
    public static final d SEMIACCENT;
    public static final d SEMIACCENT_BRIGHT_DARK;
    public static final d SEMIBLACK;
    public static final d SHIMMER;
    public static final d WHITE;
    public static final d WHITE_OR_BLACK;

    static {
        d dVar = new d("ACCENT", 0);
        ACCENT = dVar;
        d dVar2 = new d("NEGATIVE", 1);
        NEGATIVE = dVar2;
        d dVar3 = new d("NEGATIVE_ACCENT", 2);
        NEGATIVE_ACCENT = dVar3;
        d dVar4 = new d("SEMIACCENT", 3);
        SEMIACCENT = dVar4;
        d dVar5 = new d("PRIMARY_NEUTRAL", 4);
        PRIMARY_NEUTRAL = dVar5;
        d dVar6 = new d("SEMIBLACK", 5);
        SEMIBLACK = dVar6;
        d dVar7 = new d("SEMIACCENT_BRIGHT_DARK", 6);
        SEMIACCENT_BRIGHT_DARK = dVar7;
        d dVar8 = new d("LIGHT_ON_ACCENT", 7);
        LIGHT_ON_ACCENT = dVar8;
        d dVar9 = new d("DARK_ON_ACCENT", 8);
        DARK_ON_ACCENT = dVar9;
        d dVar10 = new d("BLACK", 9);
        BLACK = dVar10;
        d dVar11 = new d("WHITE", 10);
        WHITE = dVar11;
        d dVar12 = new d("SECONDARY_WHITE", 11);
        SECONDARY_WHITE = dVar12;
        d dVar13 = new d("WHITE_OR_BLACK", 12);
        WHITE_OR_BLACK = dVar13;
        d dVar14 = new d("CONTEXTUAL", 13);
        CONTEXTUAL = dVar14;
        d dVar15 = new d("CONTEXTUAL_SOLID", 14);
        CONTEXTUAL_SOLID = dVar15;
        d dVar16 = new d("FLAT", 15);
        FLAT = dVar16;
        d dVar17 = new d("INVERTED_PRIMARY", 16);
        INVERTED_PRIMARY = dVar17;
        d dVar18 = new d("ON_MEDIA_STATIC", 17);
        ON_MEDIA_STATIC = dVar18;
        d dVar19 = new d("SHIMMER", 18);
        SHIMMER = dVar19;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16, dVar17, dVar18, dVar19};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
