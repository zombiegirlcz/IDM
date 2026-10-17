package zh9;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w PAY_IN_12;
    public static final w PAY_IN_3;
    public static final w PAY_IN_30_DAYS;
    public static final w PAY_IN_6;
    private final int instalmentsNumber;

    static {
        w wVar = new w("PAY_IN_30_DAYS", 0, 0);
        PAY_IN_30_DAYS = wVar;
        w wVar2 = new w("PAY_IN_3", 1, 3);
        PAY_IN_3 = wVar2;
        w wVar3 = new w("PAY_IN_6", 2, 6);
        PAY_IN_6 = wVar3;
        w wVar4 = new w("PAY_IN_12", 3, 12);
        PAY_IN_12 = wVar4;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4};
        $VALUES = wVarArr;
        $ENTRIES = vc.s.n(wVarArr);
    }

    public w(String str, int i, int i2) {
        this.instalmentsNumber = i2;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }

    public final int a() {
        return this.instalmentsNumber;
    }
}
