package k6d;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ANUPHAN;
    public static final b BALSAMIQ_SANS;
    public static final b BASIER_CIRCLE;
    public static final b COMFORTAA;
    public static final b DARUMADROP_ONE;
    public static final b IBM_PLEX_MONO;
    public static final b LATO;
    public static final b LOBSTER;
    public static final b MERRIWEATHER;
    public static final b MONTSERRAT;
    public static final b NOTO;
    public static final b PACIFICO;
    public static final b PASSION_ONE;
    public static final b PLAYFAIR_DISPLAY;
    public static final b ROBOTO;
    public static final b UNBOUNDED;

    static {
        b bVar = new b("BASIER_CIRCLE", 0);
        BASIER_CIRCLE = bVar;
        b bVar2 = new b("BALSAMIQ_SANS", 1);
        BALSAMIQ_SANS = bVar2;
        b bVar3 = new b("ANUPHAN", 2);
        ANUPHAN = bVar3;
        b bVar4 = new b("COMFORTAA", 3);
        COMFORTAA = bVar4;
        b bVar5 = new b("DARUMADROP_ONE", 4);
        DARUMADROP_ONE = bVar5;
        b bVar6 = new b("IBM_PLEX_MONO", 5);
        IBM_PLEX_MONO = bVar6;
        b bVar7 = new b("LATO", 6);
        LATO = bVar7;
        b bVar8 = new b("LOBSTER", 7);
        LOBSTER = bVar8;
        b bVar9 = new b("MERRIWEATHER", 8);
        MERRIWEATHER = bVar9;
        b bVar10 = new b("MONTSERRAT", 9);
        MONTSERRAT = bVar10;
        b bVar11 = new b("NOTO", 10);
        NOTO = bVar11;
        b bVar12 = new b("PACIFICO", 11);
        PACIFICO = bVar12;
        b bVar13 = new b("PASSION_ONE", 12);
        PASSION_ONE = bVar13;
        b bVar14 = new b("PLAYFAIR_DISPLAY", 13);
        PLAYFAIR_DISPLAY = bVar14;
        b bVar15 = new b("ROBOTO", 14);
        ROBOTO = bVar15;
        b bVar16 = new b("UNBOUNDED", 15);
        UNBOUNDED = bVar16;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16};
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
