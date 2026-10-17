package aw0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ma {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ma[] $VALUES;
    public static final ma TIME_12H;
    public static final ma TIME_24H;

    static {
        ma maVar = new ma("TIME_12H", 0);
        TIME_12H = maVar;
        ma maVar2 = new ma("TIME_24H", 1);
        TIME_24H = maVar2;
        ma[] maVarArr = {maVar, maVar2};
        $VALUES = maVarArr;
        $ENTRIES = vc.s.n(maVarArr);
    }

    public static ma valueOf(String str) {
        return (ma) Enum.valueOf(ma.class, str);
    }

    public static ma[] values() {
        return (ma[]) $VALUES.clone();
    }
}
