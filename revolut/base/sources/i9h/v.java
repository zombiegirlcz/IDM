package i9h;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v ONE_DAY;
    public static final v ONE_MONTH;
    public static final v ONE_WEEK;
    public static final v ONE_YEAR;

    static {
        v vVar = new v("ONE_DAY", 0);
        ONE_DAY = vVar;
        v vVar2 = new v("ONE_WEEK", 1);
        ONE_WEEK = vVar2;
        v vVar3 = new v("ONE_MONTH", 2);
        ONE_MONTH = vVar3;
        v vVar4 = new v("ONE_YEAR", 3);
        ONE_YEAR = vVar4;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4};
        $VALUES = vVarArr;
        $ENTRIES = vc.s.n(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
