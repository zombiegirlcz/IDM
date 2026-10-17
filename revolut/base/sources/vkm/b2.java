package vkm;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class b2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b2[] $VALUES;
    public static final b2 START;
    public static final b2 STOP;
    public static final b2 STOP_AND_RESET_REPLAY_CACHE;

    static {
        b2 b2Var = new b2("START", 0);
        START = b2Var;
        b2 b2Var2 = new b2("STOP", 1);
        STOP = b2Var2;
        b2 b2Var3 = new b2("STOP_AND_RESET_REPLAY_CACHE", 2);
        STOP_AND_RESET_REPLAY_CACHE = b2Var3;
        b2[] b2VarArr = {b2Var, b2Var2, b2Var3};
        $VALUES = b2VarArr;
        $ENTRIES = vc.s.n(b2VarArr);
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) $VALUES.clone();
    }
}
