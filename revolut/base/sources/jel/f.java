package jel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ANNUALY;
    public static final f MONTHLY;
    public static final f QUARTERLY;
    public static final f SEMI_ANNUAL;

    static {
        f fVar = new f("ANNUALY", 0);
        ANNUALY = fVar;
        f fVar2 = new f("SEMI_ANNUAL", 1);
        SEMI_ANNUAL = fVar2;
        f fVar3 = new f("QUARTERLY", 2);
        QUARTERLY = fVar3;
        f fVar4 = new f("MONTHLY", 3);
        MONTHLY = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
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
