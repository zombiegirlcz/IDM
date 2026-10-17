package gnh;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f CFDS_MOST_SHORTED;
    public static final f DEFAULT;
    public static final f DIVIDEND_LEADERS;
    public static final f PNL_DRIVERS;
    public static final f RECOMMENDED_BUYS;
    public static final f SCREENER;

    static {
        f fVar = new f("DEFAULT", 0);
        DEFAULT = fVar;
        f fVar2 = new f("PNL_DRIVERS", 1);
        PNL_DRIVERS = fVar2;
        f fVar3 = new f("DIVIDEND_LEADERS", 2);
        DIVIDEND_LEADERS = fVar3;
        f fVar4 = new f("RECOMMENDED_BUYS", 3);
        RECOMMENDED_BUYS = fVar4;
        f fVar5 = new f("SCREENER", 4);
        SCREENER = fVar5;
        f fVar6 = new f("CFDS_MOST_SHORTED", 5);
        CFDS_MOST_SHORTED = fVar6;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
