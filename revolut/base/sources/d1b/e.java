package d1b;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Ld1b/e;", "", "BARS", "CANDLES", "LINE", "AREA", "RENKO", "KAGI", "POINTANDFIGURE", "LINEBREAK", "HEIKENASHI", "HOLLOWCANDLES", "BASELINE", "HILO", "COLUMN", "LINEWITHMARKERS", "STEPLINE", "HLCAREA", "VOLCANDLE", "feature_retail_advanced_charts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @lg.b("AREA")
    public static final e AREA;

    @lg.b("BARS")
    public static final e BARS;

    @lg.b("BASELINE")
    public static final e BASELINE;

    @lg.b("CANDLES")
    public static final e CANDLES;

    @lg.b("COLUMN")
    public static final e COLUMN;

    @lg.b("HEIKENASHI")
    public static final e HEIKENASHI;

    @lg.b("HILO")
    public static final e HILO;

    @lg.b("HLCAREA")
    public static final e HLCAREA;

    @lg.b("HOLLOWCANDLES")
    public static final e HOLLOWCANDLES;

    @lg.b("KAGI")
    public static final e KAGI;

    @lg.b("LINE")
    public static final e LINE;

    @lg.b("LINEBREAK")
    public static final e LINEBREAK;

    @lg.b("LINEWITHMARKERS")
    public static final e LINEWITHMARKERS;

    @lg.b("POINTANDFIGURE")
    public static final e POINTANDFIGURE;

    @lg.b("RENKO")
    public static final e RENKO;

    @lg.b("STEPLINE")
    public static final e STEPLINE;

    @lg.b("VOLCANDLE")
    public static final e VOLCANDLE;

    static {
        e eVar = new e("BARS", 0);
        BARS = eVar;
        e eVar2 = new e("CANDLES", 1);
        CANDLES = eVar2;
        e eVar3 = new e("LINE", 2);
        LINE = eVar3;
        e eVar4 = new e("AREA", 3);
        AREA = eVar4;
        e eVar5 = new e("RENKO", 4);
        RENKO = eVar5;
        e eVar6 = new e("KAGI", 5);
        KAGI = eVar6;
        e eVar7 = new e("POINTANDFIGURE", 6);
        POINTANDFIGURE = eVar7;
        e eVar8 = new e("LINEBREAK", 7);
        LINEBREAK = eVar8;
        e eVar9 = new e("HEIKENASHI", 8);
        HEIKENASHI = eVar9;
        e eVar10 = new e("HOLLOWCANDLES", 9);
        HOLLOWCANDLES = eVar10;
        e eVar11 = new e("BASELINE", 10);
        BASELINE = eVar11;
        e eVar12 = new e("HILO", 11);
        HILO = eVar12;
        e eVar13 = new e("COLUMN", 12);
        COLUMN = eVar13;
        e eVar14 = new e("LINEWITHMARKERS", 13);
        LINEWITHMARKERS = eVar14;
        e eVar15 = new e("STEPLINE", 14);
        STEPLINE = eVar15;
        e eVar16 = new e("HLCAREA", 15);
        HLCAREA = eVar16;
        e eVar17 = new e("VOLCANDLE", 16);
        VOLCANDLE = eVar17;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
