package w6c;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f FULL;
    public static final f ONLY_POCKETS_FILTERED_BY_BALANCE;
    public static final f SETUP_DEFAULT_PAYMENT_METHOD;

    static {
        f fVar = new f("FULL", 0);
        FULL = fVar;
        f fVar2 = new f("ONLY_POCKETS_FILTERED_BY_BALANCE", 1);
        ONLY_POCKETS_FILTERED_BY_BALANCE = fVar2;
        f fVar3 = new f("SETUP_DEFAULT_PAYMENT_METHOD", 2);
        SETUP_DEFAULT_PAYMENT_METHOD = fVar3;
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
