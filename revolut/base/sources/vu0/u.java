package vu0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class u {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u CLOSE;
    public static final u CLOSING;
    public static final u CLOSING_MANUALLY;
    public static final u DRAG_FULLY_OPENED;
    public static final u OPEN;
    public static final u OPENING;

    static {
        u uVar = new u("CLOSE", 0);
        CLOSE = uVar;
        u uVar2 = new u("CLOSING", 1);
        CLOSING = uVar2;
        u uVar3 = new u("CLOSING_MANUALLY", 2);
        CLOSING_MANUALLY = uVar3;
        u uVar4 = new u("OPEN", 3);
        OPEN = uVar4;
        u uVar5 = new u("OPENING", 4);
        OPENING = uVar5;
        u uVar6 = new u("DRAG_FULLY_OPENED", 5);
        DRAG_FULLY_OPENED = uVar6;
        u[] uVarArr = {uVar, uVar2, uVar3, uVar4, uVar5, uVar6};
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
