package kl7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class u {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u ERROR;
    public static final u FAIL;
    public static final u IN_PROGRESS;
    public static final u SUCCESS;

    static {
        u uVar = new u("IN_PROGRESS", 0);
        IN_PROGRESS = uVar;
        u uVar2 = new u("SUCCESS", 1);
        SUCCESS = uVar2;
        u uVar3 = new u("FAIL", 2);
        FAIL = uVar3;
        u uVar4 = new u("ERROR", 3);
        ERROR = uVar4;
        u[] uVarArr = {uVar, uVar2, uVar3, uVar4};
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
