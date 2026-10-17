package mzg;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f FIVE_YEARS;
    public static final f ONE_DAY;
    public static final f ONE_MONTH;
    public static final f ONE_WEEK;
    public static final f ONE_YEAR;

    static {
        f fVar = new f("ONE_DAY", 0);
        ONE_DAY = fVar;
        f fVar2 = new f("ONE_WEEK", 1);
        ONE_WEEK = fVar2;
        f fVar3 = new f("ONE_MONTH", 2);
        ONE_MONTH = fVar3;
        f fVar4 = new f("ONE_YEAR", 3);
        ONE_YEAR = fVar4;
        f fVar5 = new f("FIVE_YEARS", 4);
        FIVE_YEARS = fVar5;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
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
