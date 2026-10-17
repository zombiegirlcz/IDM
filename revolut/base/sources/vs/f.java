package vs;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f DATE_OF_BIRTH;
    public static final f EXPIRY_YEAR;
    public static final f SECURITY_CODE;

    static {
        f fVar = new f("DATE_OF_BIRTH", 0);
        DATE_OF_BIRTH = fVar;
        f fVar2 = new f("EXPIRY_YEAR", 1);
        EXPIRY_YEAR = fVar2;
        f fVar3 = new f("SECURITY_CODE", 2);
        SECURITY_CODE = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
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
