package us0;

import com.revolut.core.ui_kit.R$string;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BAR_CHART;
    public static final b CANDLE_CHART;
    public static final b LINE_CHART;
    private final int defaultDescriptionRes;

    static {
        b bVar = new b("BAR_CHART", 0, R$string.uikit_charts_bar_chart_default_description);
        BAR_CHART = bVar;
        b bVar2 = new b("LINE_CHART", 1, R$string.uikit_charts_line_chart_default_description);
        LINE_CHART = bVar2;
        b bVar3 = new b("CANDLE_CHART", 2, R$string.uikit_charts_candle_chart_default_description);
        CANDLE_CHART = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(String str, int i, int i2) {
        this.defaultDescriptionRes = i2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int a() {
        return this.defaultDescriptionRes;
    }
}
