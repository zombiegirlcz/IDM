package c1b;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ELLIOT_IMPULSE_WAVE;
    public static final e FIBONACCI_RETRACEMENT;
    public static final e HORIZONTAL_LINE;
    public static final e MEASURE;
    public static final e TRENDLINE;
    public static final e VERTICAL_LINE;

    @NotNull
    private final String value;

    static {
        e eVar = new e("MEASURE", 0, "measure");
        MEASURE = eVar;
        e eVar2 = new e("TRENDLINE", 1, "trend_line");
        TRENDLINE = eVar2;
        e eVar3 = new e("HORIZONTAL_LINE", 2, "horizontal_line");
        HORIZONTAL_LINE = eVar3;
        e eVar4 = new e("VERTICAL_LINE", 3, "vertical_line");
        VERTICAL_LINE = eVar4;
        e eVar5 = new e("FIBONACCI_RETRACEMENT", 4, "fib_retracement");
        FIBONACCI_RETRACEMENT = eVar5;
        e eVar6 = new e("ELLIOT_IMPULSE_WAVE", 5, "elliott_impulse_wave");
        ELLIOT_IMPULSE_WAVE = eVar6;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public e(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
