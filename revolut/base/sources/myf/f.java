package myf;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f AGE_BAND;
    public static final f COUNTRY;
    public static final f DATE;
    public static final f NUMBER;
    public static final f TEXT;
    public static final f TEXT_OR_LOCATION_REF;
    public static final f TIME;

    static {
        f fVar = new f("TEXT", 0);
        TEXT = fVar;
        f fVar2 = new f("TEXT_OR_LOCATION_REF", 1);
        TEXT_OR_LOCATION_REF = fVar2;
        f fVar3 = new f("AGE_BAND", 2);
        AGE_BAND = fVar3;
        f fVar4 = new f("NUMBER", 3);
        NUMBER = fVar4;
        f fVar5 = new f("DATE", 4);
        DATE = fVar5;
        f fVar6 = new f("TIME", 5);
        TIME = fVar6;
        f fVar7 = new f("COUNTRY", 6);
        COUNTRY = fVar7;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7};
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
