package c1b;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ONLY_STYLE;
    public static final d SUPPORTED_IN_EMBEDDED_CHART;
    public static final d SUPPORTED_IN_FULLSCREEN_CHART;

    static {
        d dVar = new d("ONLY_STYLE", 0);
        ONLY_STYLE = dVar;
        d dVar2 = new d("SUPPORTED_IN_EMBEDDED_CHART", 1);
        SUPPORTED_IN_EMBEDDED_CHART = dVar2;
        d dVar3 = new d("SUPPORTED_IN_FULLSCREEN_CHART", 2);
        SUPPORTED_IN_FULLSCREEN_CHART = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
