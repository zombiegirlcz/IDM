package ut5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f EXPAND_COLLAPSE;
    public static final f OPEN_REV_X_DERIVATIVES_BALANCE;

    static {
        f fVar = new f("EXPAND_COLLAPSE", 0);
        EXPAND_COLLAPSE = fVar;
        f fVar2 = new f("OPEN_REV_X_DERIVATIVES_BALANCE", 1);
        OPEN_REV_X_DERIVATIVES_BALANCE = fVar2;
        f[] fVarArr = {fVar, fVar2};
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
