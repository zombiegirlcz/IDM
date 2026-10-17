package a4h;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ANNUAL_REPORT;
    public static final f KID;
    public static final f MONTHLY_REPORT;
    public static final f PROSPECTUS;
    public static final f QUARTERLY_REPORT;
    public static final f SEMIANNUAL_REPORT;

    static {
        f fVar = new f("ANNUAL_REPORT", 0);
        ANNUAL_REPORT = fVar;
        f fVar2 = new f("SEMIANNUAL_REPORT", 1);
        SEMIANNUAL_REPORT = fVar2;
        f fVar3 = new f("QUARTERLY_REPORT", 2);
        QUARTERLY_REPORT = fVar3;
        f fVar4 = new f("MONTHLY_REPORT", 3);
        MONTHLY_REPORT = fVar4;
        f fVar5 = new f("KID", 4);
        KID = fVar5;
        f fVar6 = new f("PROSPECTUS", 5);
        PROSPECTUS = fVar6;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
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
