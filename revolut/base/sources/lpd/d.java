package lpd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ON_THE_DAY;
    public static final d WEEK_DAY_AFTER;
    public static final d WEEK_DAY_BEFORE;

    static {
        d dVar = new d("ON_THE_DAY", 0);
        ON_THE_DAY = dVar;
        d dVar2 = new d("WEEK_DAY_BEFORE", 1);
        WEEK_DAY_BEFORE = dVar2;
        d dVar3 = new d("WEEK_DAY_AFTER", 2);
        WEEK_DAY_AFTER = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
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
