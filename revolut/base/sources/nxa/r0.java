package nxa;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class r0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r0[] $VALUES;
    public static final r0 DONE;
    public static final r0 EXPIRED;
    public static final r0 IN_PROGRESS;
    public static final r0 NOT_STARTED;

    static {
        r0 r0Var = new r0("NOT_STARTED", 0);
        NOT_STARTED = r0Var;
        r0 r0Var2 = new r0("IN_PROGRESS", 1);
        IN_PROGRESS = r0Var2;
        r0 r0Var3 = new r0("DONE", 2);
        DONE = r0Var3;
        r0 r0Var4 = new r0("EXPIRED", 3);
        EXPIRED = r0Var4;
        r0[] r0VarArr = {r0Var, r0Var2, r0Var3, r0Var4};
        $VALUES = r0VarArr;
        $ENTRIES = vc.s.n(r0VarArr);
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) $VALUES.clone();
    }
}
