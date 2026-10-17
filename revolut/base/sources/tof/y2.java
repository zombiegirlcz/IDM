package tof;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class y2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y2[] $VALUES;
    public static final y2 ANDROID_PAY;
    public static final y2 APPLE_PAY;
    public static final y2 GOOGLE_PAY;
    public static final y2 UNKNOWN;

    static {
        y2 y2Var = new y2("GOOGLE_PAY", 0);
        GOOGLE_PAY = y2Var;
        y2 y2Var2 = new y2("APPLE_PAY", 1);
        APPLE_PAY = y2Var2;
        y2 y2Var3 = new y2("ANDROID_PAY", 2);
        ANDROID_PAY = y2Var3;
        y2 y2Var4 = new y2("UNKNOWN", 3);
        UNKNOWN = y2Var4;
        y2[] y2VarArr = {y2Var, y2Var2, y2Var3, y2Var4};
        $VALUES = y2VarArr;
        $ENTRIES = vc.s.n(y2VarArr);
    }

    public static y2 valueOf(String str) {
        return (y2) Enum.valueOf(y2.class, str);
    }

    public static y2[] values() {
        return (y2[]) $VALUES.clone();
    }
}
