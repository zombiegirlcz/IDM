package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class kf0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ kf0[] $VALUES;
    public static final kf0 REGULAR;
    public static final kf0 SMALL;

    static {
        kf0 kf0Var = new kf0("REGULAR", 0);
        REGULAR = kf0Var;
        kf0 kf0Var2 = new kf0("SMALL", 1);
        SMALL = kf0Var2;
        kf0[] kf0VarArr = {kf0Var, kf0Var2};
        $VALUES = kf0VarArr;
        $ENTRIES = vc.s.n(kf0VarArr);
    }

    public static kf0 valueOf(String str) {
        return (kf0) Enum.valueOf(kf0.class, str);
    }

    public static kf0[] values() {
        return (kf0[]) $VALUES.clone();
    }
}
