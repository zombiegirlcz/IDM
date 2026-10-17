package c6f;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f MAIN_AND_ADDITIONAL_CHARTS;
    public static final f MAIN_CHART_ONLY;

    static {
        f fVar = new f("MAIN_CHART_ONLY", 0);
        MAIN_CHART_ONLY = fVar;
        f fVar2 = new f("MAIN_AND_ADDITIONAL_CHARTS", 1);
        MAIN_AND_ADDITIONAL_CHARTS = fVar2;
        f[] fVarArr = {fVar, fVar2};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
