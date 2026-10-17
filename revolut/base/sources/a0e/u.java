package a0e;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class u {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u EMPTY;
    public static final u PERIOD_UNAVAILABLE;
    public static final u READY;

    static {
        u uVar = new u("EMPTY", 0);
        EMPTY = uVar;
        u uVar2 = new u("PERIOD_UNAVAILABLE", 1);
        PERIOD_UNAVAILABLE = uVar2;
        u uVar3 = new u("READY", 2);
        READY = uVar3;
        u[] uVarArr = {uVar, uVar2, uVar3};
        $VALUES = uVarArr;
        $ENTRIES = vc.s.n(uVarArr);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
